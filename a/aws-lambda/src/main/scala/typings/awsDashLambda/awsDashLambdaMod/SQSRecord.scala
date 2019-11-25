package typings.awsDashLambda.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SQSRecord extends js.Object {
  var attributes: SQSRecordAttributes
  var awsRegion: String
  var body: String
  var eventSource: String
  var eventSourceARN: String
  var md5OfBody: String
  var messageAttributes: SQSMessageAttributes
  var messageId: String
  var receiptHandle: String
}

object SQSRecord {
  @scala.inline
  def apply(
    attributes: SQSRecordAttributes,
    awsRegion: String,
    body: String,
    eventSource: String,
    eventSourceARN: String,
    md5OfBody: String,
    messageAttributes: SQSMessageAttributes,
    messageId: String,
    receiptHandle: String
  ): SQSRecord = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], awsRegion = awsRegion.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any], eventSourceARN = eventSourceARN.asInstanceOf[js.Any], md5OfBody = md5OfBody.asInstanceOf[js.Any], messageAttributes = messageAttributes.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any], receiptHandle = receiptHandle.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SQSRecord]
  }
}

