package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirehoseTransformationEventRecord extends js.Object {
  var approximateArrivalTimestamp: scala.Double
  /** Base64 encoded */
  var data: java.lang.String
  var kinesisRecordMetadata: js.UndefOr[FirehoseRecordMetadata] = js.undefined
  var recordId: java.lang.String
}

