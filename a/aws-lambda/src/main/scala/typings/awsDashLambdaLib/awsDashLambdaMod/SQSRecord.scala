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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attributes")(attributes)
    __obj.updateDynamic("awsRegion")(awsRegion)
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("eventSource")(eventSource)
    __obj.updateDynamic("eventSourceARN")(eventSourceARN)
    __obj.updateDynamic("md5OfBody")(md5OfBody)
    __obj.updateDynamic("messageAttributes")(messageAttributes)
    __obj.updateDynamic("messageId")(messageId)
    __obj.updateDynamic("receiptHandle")(receiptHandle)
    __obj.asInstanceOf[SQSRecord]
  }
}

