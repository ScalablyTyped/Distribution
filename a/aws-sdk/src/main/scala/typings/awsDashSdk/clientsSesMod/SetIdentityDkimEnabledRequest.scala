package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetIdentityDkimEnabledRequest extends js.Object {
  /**
    * Sets whether DKIM signing is enabled for an identity. Set to true to enable DKIM signing for this identity; false to disable it. 
    */
  var DkimEnabled: Enabled
  /**
    * The identity for which DKIM signing should be enabled or disabled.
    */
  var Identity: typings.awsDashSdk.clientsSesMod.Identity
}

object SetIdentityDkimEnabledRequest {
  @scala.inline
  def apply(DkimEnabled: Enabled, Identity: Identity): SetIdentityDkimEnabledRequest = {
    val __obj = js.Dynamic.literal(DkimEnabled = DkimEnabled, Identity = Identity)
  
    __obj.asInstanceOf[SetIdentityDkimEnabledRequest]
  }
}

