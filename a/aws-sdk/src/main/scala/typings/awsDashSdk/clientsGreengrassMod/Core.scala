package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Core extends js.Object {
  /**
    * The ARN of the certificate associated with the core.
    */
  var CertificateArn: __string = js.native
  /**
    * A descriptive or arbitrary ID for the core. This value must be unique within the core definition version. Max length is 128 characters with pattern ''[a-zA-Z0-9:_-]+''.
    */
  var Id: __string = js.native
  /**
    * If true, the core's local shadow is automatically synced with the cloud.
    */
  var SyncShadow: js.UndefOr[__boolean] = js.native
  /**
    * The ARN of the thing which is the core.
    */
  var ThingArn: __string = js.native
}

object Core {
  @scala.inline
  def apply(
    CertificateArn: __string,
    Id: __string,
    ThingArn: __string,
    SyncShadow: js.UndefOr[Boolean] = js.undefined
  ): Core = {
    val __obj = js.Dynamic.literal(CertificateArn = CertificateArn.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], ThingArn = ThingArn.asInstanceOf[js.Any])
    if (!js.isUndefined(SyncShadow)) __obj.updateDynamic("SyncShadow")(SyncShadow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Core]
  }
}

