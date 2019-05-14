package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudFrontOrigin extends js.Object {
  var custom: js.UndefOr[CloudFrontCustomOrigin | scala.Nothing] = js.undefined
  var s3: js.UndefOr[CloudFrontS3Origin | scala.Nothing] = js.undefined
}

object CloudFrontOrigin {
  @scala.inline
  def apply(custom: js.UndefOr[scala.Nothing] = js.undefined, s3: CloudFrontS3Origin = null): CloudFrontOrigin = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(custom)) __obj.updateDynamic("custom")(custom)
    if (s3 != null) __obj.updateDynamic("s3")(s3)
    __obj.asInstanceOf[CloudFrontOrigin]
  }
}

