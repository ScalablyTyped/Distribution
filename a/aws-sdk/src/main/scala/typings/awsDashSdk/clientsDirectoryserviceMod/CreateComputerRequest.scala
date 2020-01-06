package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateComputerRequest extends js.Object {
  /**
    * An array of Attribute objects that contain any LDAP attributes to apply to the computer account.
    */
  var ComputerAttributes: js.UndefOr[Attributes] = js.native
  /**
    * The name of the computer account.
    */
  var ComputerName: typings.awsDashSdk.clientsDirectoryserviceMod.ComputerName = js.native
  /**
    * The identifier of the directory in which to create the computer account.
    */
  var DirectoryId: typings.awsDashSdk.clientsDirectoryserviceMod.DirectoryId = js.native
  /**
    * The fully-qualified distinguished name of the organizational unit to place the computer account in.
    */
  var OrganizationalUnitDistinguishedName: js.UndefOr[OrganizationalUnitDN] = js.native
  /**
    * A one-time password that is used to join the computer to the directory. You should generate a random, strong password to use for this parameter.
    */
  var Password: ComputerPassword = js.native
}

object CreateComputerRequest {
  @scala.inline
  def apply(
    ComputerName: ComputerName,
    DirectoryId: DirectoryId,
    Password: ComputerPassword,
    ComputerAttributes: Attributes = null,
    OrganizationalUnitDistinguishedName: OrganizationalUnitDN = null
  ): CreateComputerRequest = {
    val __obj = js.Dynamic.literal(ComputerName = ComputerName.asInstanceOf[js.Any], DirectoryId = DirectoryId.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any])
    if (ComputerAttributes != null) __obj.updateDynamic("ComputerAttributes")(ComputerAttributes.asInstanceOf[js.Any])
    if (OrganizationalUnitDistinguishedName != null) __obj.updateDynamic("OrganizationalUnitDistinguishedName")(OrganizationalUnitDistinguishedName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateComputerRequest]
  }
}

