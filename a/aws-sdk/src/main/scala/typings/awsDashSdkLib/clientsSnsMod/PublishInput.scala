package typings
package awsDashSdkLib.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishInput extends js.Object {
  /**
    * The message you want to send.  The Message parameter is always a string. If you set MessageStructure to json, you must string-encode the Message parameter.  If you are publishing to a topic and you want to send the same message to all transport protocols, include the text of the message as a String value. If you want to send different messages for each transport protocol, set the value of the MessageStructure parameter to json and use a JSON object for the Message parameter.   Constraints:   With the exception of SMS, messages must be UTF-8 encoded strings and at most 256 KB in size (262,144 bytes, not 262,144 characters).   For SMS, each message can contain up to 140 characters. This character limit depends on the encoding schema. For example, an SMS message can contain 160 GSM characters, 140 ASCII characters, or 70 UCS-2 characters. If you publish a message that exceeds this size limit, Amazon SNS sends the message as multiple messages, each fitting within the size limit. Messages aren't truncated mid-word but are cut off at whole-word boundaries. The total size limit for a single SMS Publish action is 1,600 characters.   JSON-specific constraints:   Keys in the JSON object that correspond to supported transport protocols must have simple JSON string values.   The values will be parsed (unescaped) before they are used in outgoing messages.   Outbound notifications are JSON encoded (meaning that the characters will be reescaped for sending).   Values have a minimum length of 0 (the empty string, "", is allowed).   Values have a maximum length bounded by the overall message size (so, including multiple protocols may limit message sizes).   Non-string values will cause the key to be ignored.   Keys that do not correspond to supported transport protocols are ignored.   Duplicate keys are not allowed.   Failure to parse or validate any key or value in the message will cause the Publish call to return an error (no partial delivery).  
    */
  var Message: message
  /**
    * Message attributes for Publish action.
    */
  var MessageAttributes: js.UndefOr[MessageAttributeMap] = js.undefined
  /**
    * Set MessageStructure to json if you want to send a different message for each protocol. For example, using one publish action, you can send a short message to your SMS subscribers and a longer message to your email subscribers. If you set MessageStructure to json, the value of the Message parameter must:    be a syntactically valid JSON object; and   contain at least a top-level JSON key of "default" with a value that is a string.   You can define other top-level keys that define the message you want to send to a specific transport protocol (e.g., "http"). For information about sending different messages for each protocol using the AWS Management Console, go to Create Different Messages for Each Protocol in the Amazon Simple Notification Service Getting Started Guide.  Valid value: json 
    */
  var MessageStructure: js.UndefOr[messageStructure] = js.undefined
  /**
    * The phone number to which you want to deliver an SMS message. Use E.164 format. If you don't specify a value for the PhoneNumber parameter, you must specify a value for the TargetArn or TopicArn parameters.
    */
  var PhoneNumber: js.UndefOr[String] = js.undefined
  /**
    * Optional parameter to be used as the "Subject" line when the message is delivered to email endpoints. This field will also be included, if present, in the standard JSON messages delivered to other endpoints. Constraints: Subjects must be ASCII text that begins with a letter, number, or punctuation mark; must not include line breaks or control characters; and must be less than 100 characters long.
    */
  var Subject: js.UndefOr[subject] = js.undefined
  /**
    * If you don't specify a value for the TargetArn parameter, you must specify a value for the PhoneNumber or TopicArn parameters.
    */
  var TargetArn: js.UndefOr[String] = js.undefined
  /**
    * The topic you want to publish to. If you don't specify a value for the TopicArn parameter, you must specify a value for the PhoneNumber or TargetArn parameters.
    */
  var TopicArn: js.UndefOr[topicARN] = js.undefined
}

object PublishInput {
  @scala.inline
  def apply(
    Message: message,
    MessageAttributes: MessageAttributeMap = null,
    MessageStructure: messageStructure = null,
    PhoneNumber: String = null,
    Subject: subject = null,
    TargetArn: String = null,
    TopicArn: topicARN = null
  ): PublishInput = {
    val __obj = js.Dynamic.literal(Message = Message)
    if (MessageAttributes != null) __obj.updateDynamic("MessageAttributes")(MessageAttributes)
    if (MessageStructure != null) __obj.updateDynamic("MessageStructure")(MessageStructure)
    if (PhoneNumber != null) __obj.updateDynamic("PhoneNumber")(PhoneNumber)
    if (Subject != null) __obj.updateDynamic("Subject")(Subject)
    if (TargetArn != null) __obj.updateDynamic("TargetArn")(TargetArn)
    if (TopicArn != null) __obj.updateDynamic("TopicArn")(TopicArn)
    __obj.asInstanceOf[PublishInput]
  }
}

