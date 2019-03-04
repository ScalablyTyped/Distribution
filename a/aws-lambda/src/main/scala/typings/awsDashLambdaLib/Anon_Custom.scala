package typings
package awsDashLambdaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Custom
  extends awsDashLambdaLib.awsDashLambdaMod.CloudFrontOrigin {
  var custom: js.UndefOr[scala.Nothing] = js.undefined
  var s3: awsDashLambdaLib.awsDashLambdaMod.CloudFrontS3Origin
}

object Anon_Custom {
  @scala.inline
  def apply(
    s3: awsDashLambdaLib.awsDashLambdaMod.CloudFrontS3Origin,
    custom: js.UndefOr[scala.Nothing] = js.undefined
  ): Anon_Custom = {
    val __obj = js.Dynamic.literal(s3 = s3)
    if (!js.isUndefined(custom)) __obj.updateDynamic("custom")(custom)
    __obj.asInstanceOf[Anon_Custom]
  }
}

