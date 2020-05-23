package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientPolicyTls extends js.Object {
  /**
    * Whether the policy is enforced. The default is True, if a value isn't
    specified.
    */
  var enforce: js.UndefOr[Boolean] = js.native
  /**
    * One or more ports that the policy is enforced for.
    */
  var ports: js.UndefOr[PortSet] = js.native
  /**
    * A reference to an object that represents a TLS validation context.
    */
  var validation: TlsValidationContext = js.native
}

object ClientPolicyTls {
  @scala.inline
  def apply(
    validation: TlsValidationContext,
    enforce: js.UndefOr[Boolean] = js.undefined,
    ports: PortSet = null
  ): ClientPolicyTls = {
    val __obj = js.Dynamic.literal(validation = validation.asInstanceOf[js.Any])
    if (!js.isUndefined(enforce)) __obj.updateDynamic("enforce")(enforce.get.asInstanceOf[js.Any])
    if (ports != null) __obj.updateDynamic("ports")(ports.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientPolicyTls]
  }
}

