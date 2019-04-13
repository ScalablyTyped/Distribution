package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Core extends js.Object {
  /**
    * The ARN of the certificate associated with the core.
    */
  var CertificateArn: js.UndefOr[__string] = js.undefined
  /**
    * A descriptive or arbitrary ID for the core. This value must be unique within the core definition version. Max length is 128 characters with pattern ''[a-zA-Z0-9:_-]+''.
    */
  var Id: js.UndefOr[__string] = js.undefined
  /**
    * If true, the core's local shadow is automatically synced with the cloud.
    */
  var SyncShadow: js.UndefOr[__boolean] = js.undefined
  /**
    * The ARN of the thing which is the core.
    */
  var ThingArn: js.UndefOr[__string] = js.undefined
}

object Core {
  @scala.inline
  def apply(
    CertificateArn: __string = null,
    Id: __string = null,
    SyncShadow: js.UndefOr[__boolean] = js.undefined,
    ThingArn: __string = null
  ): Core = {
    val __obj = js.Dynamic.literal()
    if (CertificateArn != null) __obj.updateDynamic("CertificateArn")(CertificateArn)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (!js.isUndefined(SyncShadow)) __obj.updateDynamic("SyncShadow")(SyncShadow)
    if (ThingArn != null) __obj.updateDynamic("ThingArn")(ThingArn)
    __obj.asInstanceOf[Core]
  }
}

