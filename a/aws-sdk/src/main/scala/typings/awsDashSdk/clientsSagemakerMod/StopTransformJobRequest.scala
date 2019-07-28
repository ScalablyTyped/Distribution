package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopTransformJobRequest extends js.Object {
  /**
    * The name of the transform job to stop.
    */
  var TransformJobName: typings.awsDashSdk.clientsSagemakerMod.TransformJobName
}

object StopTransformJobRequest {
  @scala.inline
  def apply(TransformJobName: TransformJobName): StopTransformJobRequest = {
    val __obj = js.Dynamic.literal(TransformJobName = TransformJobName)
  
    __obj.asInstanceOf[StopTransformJobRequest]
  }
}

