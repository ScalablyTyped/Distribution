package typings
package awsDashSdkLib.clientsS3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3InitiateRestoreObjectOperation extends js.Object {
  /**
    * 
    */
  var ExpirationInDays: js.UndefOr[S3ExpirationInDays] = js.undefined
  /**
    * 
    */
  var GlacierJobTier: js.UndefOr[S3GlacierJobTier] = js.undefined
}

object S3InitiateRestoreObjectOperation {
  @scala.inline
  def apply(
    ExpirationInDays: js.UndefOr[S3ExpirationInDays] = js.undefined,
    GlacierJobTier: S3GlacierJobTier = null
  ): S3InitiateRestoreObjectOperation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ExpirationInDays)) __obj.updateDynamic("ExpirationInDays")(ExpirationInDays)
    if (GlacierJobTier != null) __obj.updateDynamic("GlacierJobTier")(GlacierJobTier.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3InitiateRestoreObjectOperation]
  }
}

