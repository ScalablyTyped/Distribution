package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Core extends js.Object {
  /**
    * The ARN of the certificate associated with the core.
    */
  var CertificateArn: __string
  /**
    * A descriptive or arbitrary ID for the core. This value must be unique within the core definition version. Max length is 128 characters with pattern ''[a-zA-Z0-9:_-]+''.
    */
  var Id: __string
  /**
    * If true, the core's local shadow is automatically synced with the cloud.
    */
  var SyncShadow: js.UndefOr[__boolean] = js.undefined
  /**
    * The ARN of the thing which is the core.
    */
  var ThingArn: __string
}

object Core {
  @scala.inline
  def apply(
    CertificateArn: __string,
    Id: __string,
    ThingArn: __string,
    SyncShadow: js.UndefOr[__boolean] = js.undefined
  ): Core = {
    val __obj = js.Dynamic.literal(CertificateArn = CertificateArn, Id = Id, ThingArn = ThingArn)
    if (!js.isUndefined(SyncShadow)) __obj.updateDynamic("SyncShadow")(SyncShadow)
    __obj.asInstanceOf[Core]
  }
}

