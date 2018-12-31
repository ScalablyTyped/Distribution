package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KinesisStreamRecord extends js.Object {
  var awsRegion: java.lang.String
  var eventID: java.lang.String
  var eventName: java.lang.String
  var eventSource: java.lang.String
  var eventSourceARN: java.lang.String
  var eventVersion: java.lang.String
  var invokeIdentityArn: java.lang.String
  var kinesis: KinesisStreamRecordPayload
}

