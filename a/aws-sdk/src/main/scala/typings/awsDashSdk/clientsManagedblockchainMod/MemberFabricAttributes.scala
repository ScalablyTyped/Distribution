package typings.awsDashSdk.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemberFabricAttributes extends js.Object {
  /**
    * The user name for the initial administrator user for the member.
    */
  var AdminUsername: js.UndefOr[UsernameString] = js.undefined
  /**
    * The endpoint used to access the member's certificate authority.
    */
  var CaEndpoint: js.UndefOr[String] = js.undefined
}

object MemberFabricAttributes {
  @scala.inline
  def apply(AdminUsername: UsernameString = null, CaEndpoint: String = null): MemberFabricAttributes = {
    val __obj = js.Dynamic.literal()
    if (AdminUsername != null) __obj.updateDynamic("AdminUsername")(AdminUsername)
    if (CaEndpoint != null) __obj.updateDynamic("CaEndpoint")(CaEndpoint)
    __obj.asInstanceOf[MemberFabricAttributes]
  }
}

