package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FirehoseTransformationEvent extends js.Object {
  var deliveryStreamArn: java.lang.String
  var invocationId: java.lang.String
  var records: js.Array[FirehoseTransformationEventRecord]
  var region: java.lang.String
}

