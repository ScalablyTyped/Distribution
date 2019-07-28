package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SslPolicy extends js.Object {
  /**
    * The ciphers.
    */
  var Ciphers: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.Ciphers] = js.undefined
  /**
    * The name of the policy.
    */
  var Name: js.UndefOr[SslPolicyName] = js.undefined
  /**
    * The protocols.
    */
  var SslProtocols: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.SslProtocols] = js.undefined
}

object SslPolicy {
  @scala.inline
  def apply(Ciphers: Ciphers = null, Name: SslPolicyName = null, SslProtocols: SslProtocols = null): SslPolicy = {
    val __obj = js.Dynamic.literal()
    if (Ciphers != null) __obj.updateDynamic("Ciphers")(Ciphers)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (SslProtocols != null) __obj.updateDynamic("SslProtocols")(SslProtocols)
    __obj.asInstanceOf[SslPolicy]
  }
}

