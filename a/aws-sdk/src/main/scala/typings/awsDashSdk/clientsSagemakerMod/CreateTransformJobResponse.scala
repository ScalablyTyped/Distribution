package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTransformJobResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the transform job.
    */
  var TransformJobArn: typings.awsDashSdk.clientsSagemakerMod.TransformJobArn
}

object CreateTransformJobResponse {
  @scala.inline
  def apply(TransformJobArn: TransformJobArn): CreateTransformJobResponse = {
    val __obj = js.Dynamic.literal(TransformJobArn = TransformJobArn)
  
    __obj.asInstanceOf[CreateTransformJobResponse]
  }
}

