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
    val __obj = js.Dynamic.literal(attributes = attributes, awsRegion = awsRegion, body = body, eventSource = eventSource, eventSourceARN = eventSourceARN, md5OfBody = md5OfBody, messageAttributes = messageAttributes, messageId = messageId, receiptHandle = receiptHandle)
  
    __obj.asInstanceOf[SQSRecord]
  }
}

