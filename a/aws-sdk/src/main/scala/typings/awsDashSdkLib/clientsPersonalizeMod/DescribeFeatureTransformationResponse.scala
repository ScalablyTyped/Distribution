package typings
package awsDashSdkLib.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeFeatureTransformationResponse extends js.Object {
  /**
    * A listing of the FeatureTransformation properties.
    */
  var featureTransformation: js.UndefOr[FeatureTransformation] = js.undefined
}

object DescribeFeatureTransformationResponse {
  @scala.inline
  def apply(featureTransformation: FeatureTransformation = null): DescribeFeatureTransformationResponse = {
    val __obj = js.Dynamic.literal()
    if (featureTransformation != null) __obj.updateDynamic("featureTransformation")(featureTransformation)
    __obj.asInstanceOf[DescribeFeatureTransformationResponse]
  }
}

