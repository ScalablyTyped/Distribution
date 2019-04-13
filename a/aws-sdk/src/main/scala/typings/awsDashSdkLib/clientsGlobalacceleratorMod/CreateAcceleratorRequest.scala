package typings
package awsDashSdkLib.clientsGlobalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAcceleratorRequest extends js.Object {
  /**
    * Indicates whether an accelerator is enabled. The value is true or false. The default value is true.  If the value is set to true, an accelerator cannot be deleted. If set to false, the accelerator can be deleted.
    */
  var Enabled: js.UndefOr[GenericBoolean] = js.undefined
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency—that is, the uniqueness—of an accelerator.
    */
  var IdempotencyToken: awsDashSdkLib.clientsGlobalacceleratorMod.IdempotencyToken
  /**
    * The value for the address type must be IPv4. 
    */
  var IpAddressType: js.UndefOr[IpAddressType] = js.undefined
  /**
    * The name of an accelerator. The name can have a maximum of 32 characters, must contain only alphanumeric characters or hyphens (-), and must not begin or end with a hyphen.
    */
  var Name: GenericString
}

object CreateAcceleratorRequest {
  @scala.inline
  def apply(
    IdempotencyToken: IdempotencyToken,
    Name: GenericString,
    Enabled: js.UndefOr[GenericBoolean] = js.undefined,
    IpAddressType: IpAddressType = null
  ): CreateAcceleratorRequest = {
    val __obj = js.Dynamic.literal(IdempotencyToken = IdempotencyToken, Name = Name)
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    if (IpAddressType != null) __obj.updateDynamic("IpAddressType")(IpAddressType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAcceleratorRequest]
  }
}

