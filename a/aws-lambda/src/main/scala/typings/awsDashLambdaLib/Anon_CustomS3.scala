package typings
package awsDashLambdaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CustomS3
  extends awsDashLambdaLib.awsDashLambdaMod.CloudFrontOrigin {
  var custom: awsDashLambdaLib.awsDashLambdaMod.CloudFrontCustomOrigin
  var s3: js.UndefOr[scala.Nothing] = js.undefined
}

object Anon_CustomS3 {
  @scala.inline
  def apply(
    custom: awsDashLambdaLib.awsDashLambdaMod.CloudFrontCustomOrigin,
    s3: js.UndefOr[scala.Nothing] = js.undefined
  ): Anon_CustomS3 = {
    val __obj = js.Dynamic.literal(custom = custom)
    if (!js.isUndefined(s3)) __obj.updateDynamic("s3")(s3)
    __obj.asInstanceOf[Anon_CustomS3]
  }
}

