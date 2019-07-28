package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTransformJobRequest extends js.Object {
  /**
    * The name of the transform job that you want to view details of.
    */
  var TransformJobName: typings.awsDashSdk.clientsSagemakerMod.TransformJobName
}

object DescribeTransformJobRequest {
  @scala.inline
  def apply(TransformJobName: TransformJobName): DescribeTransformJobRequest = {
    val __obj = js.Dynamic.literal(TransformJobName = TransformJobName)
  
    __obj.asInstanceOf[DescribeTransformJobRequest]
  }
}

