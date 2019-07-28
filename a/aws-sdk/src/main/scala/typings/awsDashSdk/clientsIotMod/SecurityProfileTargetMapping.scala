package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityProfileTargetMapping extends js.Object {
  /**
    * Information that identifies the security profile.
    */
  var securityProfileIdentifier: js.UndefOr[SecurityProfileIdentifier] = js.undefined
  /**
    * Information about the target (thing group) associated with the security profile.
    */
  var target: js.UndefOr[SecurityProfileTarget] = js.undefined
}

object SecurityProfileTargetMapping {
  @scala.inline
  def apply(securityProfileIdentifier: SecurityProfileIdentifier = null, target: SecurityProfileTarget = null): SecurityProfileTargetMapping = {
    val __obj = js.Dynamic.literal()
    if (securityProfileIdentifier != null) __obj.updateDynamic("securityProfileIdentifier")(securityProfileIdentifier)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[SecurityProfileTargetMapping]
  }
}

