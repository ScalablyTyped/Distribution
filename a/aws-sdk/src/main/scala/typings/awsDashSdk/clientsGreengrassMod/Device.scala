package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Device extends js.Object {
  /**
    * The ARN of the certificate associated with the device.
    */
  var CertificateArn: __string
  /**
    * A descriptive or arbitrary ID for the device. This value must be unique within the device definition version. Max length is 128 characters with pattern ''[a-zA-Z0-9:_-]+''.
    */
  var Id: __string
  /**
    * If true, the device's local shadow will be automatically synced with the cloud.
    */
  var SyncShadow: js.UndefOr[__boolean] = js.undefined
  /**
    * The thing ARN of the device.
    */
  var ThingArn: __string
}

object Device {
  @scala.inline
  def apply(
    CertificateArn: __string,
    Id: __string,
    ThingArn: __string,
    SyncShadow: js.UndefOr[Boolean] = js.undefined
  ): Device = {
    val __obj = js.Dynamic.literal(CertificateArn = CertificateArn, Id = Id, ThingArn = ThingArn)
    if (!js.isUndefined(SyncShadow)) __obj.updateDynamic("SyncShadow")(SyncShadow)
    __obj.asInstanceOf[Device]
  }
}

