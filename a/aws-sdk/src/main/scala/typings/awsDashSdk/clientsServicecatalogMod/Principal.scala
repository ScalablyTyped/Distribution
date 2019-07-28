package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Principal extends js.Object {
  /**
    * The ARN of the principal (IAM user, role, or group).
    */
  var PrincipalARN: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.PrincipalARN] = js.undefined
  /**
    * The principal type. The supported value is IAM.
    */
  var PrincipalType: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.PrincipalType] = js.undefined
}

object Principal {
  @scala.inline
  def apply(PrincipalARN: PrincipalARN = null, PrincipalType: PrincipalType = null): Principal = {
    val __obj = js.Dynamic.literal()
    if (PrincipalARN != null) __obj.updateDynamic("PrincipalARN")(PrincipalARN)
    if (PrincipalType != null) __obj.updateDynamic("PrincipalType")(PrincipalType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Principal]
  }
}

