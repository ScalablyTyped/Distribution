package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SQSRecord extends js.Object {
  var attributes: SQSRecordAttributes
  var awsRegion: java.lang.String
  var body: java.lang.String
  var eventSource: java.lang.String
  var eventSourceARN: java.lang.String
  var md5OfBody: java.lang.String
  var messageAttributes: SQSMessageAttributes
  var messageId: java.lang.String
  var receiptHandle: java.lang.String
}

object SQSRecord {
  @scala.inline
  def apply(
    attributes: SQSRecordAttributes,
    awsRegion: java.lang.String,
    body: java.lang.String,
    eventSource: java.lang.String,
    eventSourceARN: java.lang.String,
    md5OfBody: java.lang.String,
    messageAttributes: SQSMessageAttributes,
    messageId: java.lang.String,
    receiptHandle: java.lang.String
  ): SQSRecord = {
    val __obj = js.Dynamic.literal(attributes = attributes, awsRegion = awsRegion, body = body, eventSource = eventSource, eventSourceARN = eventSourceARN, md5OfBody = md5OfBody, messageAttributes = messageAttributes, messageId = messageId, receiptHandle = receiptHandle)
  
    __obj.asInstanceOf[SQSRecord]
  }
}

