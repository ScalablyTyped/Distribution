package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateComputerRequest extends js.Object {
  /**
    * An array of Attribute objects that contain any LDAP attributes to apply to the computer account.
    */
  var ComputerAttributes: js.UndefOr[Attributes] = js.undefined
  /**
    * The name of the computer account.
    */
  var ComputerName: typings.awsDashSdk.clientsDirectoryserviceMod.ComputerName
  /**
    * The identifier of the directory in which to create the computer account.
    */
  var DirectoryId: typings.awsDashSdk.clientsDirectoryserviceMod.DirectoryId
  /**
    * The fully-qualified distinguished name of the organizational unit to place the computer account in.
    */
  var OrganizationalUnitDistinguishedName: js.UndefOr[OrganizationalUnitDN] = js.undefined
  /**
    * A one-time password that is used to join the computer to the directory. You should generate a random, strong password to use for this parameter.
    */
  var Password: ComputerPassword
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
    val __obj = js.Dynamic.literal(ComputerName = ComputerName, DirectoryId = DirectoryId, Password = Password)
    if (ComputerAttributes != null) __obj.updateDynamic("ComputerAttributes")(ComputerAttributes)
    if (OrganizationalUnitDistinguishedName != null) __obj.updateDynamic("OrganizationalUnitDistinguishedName")(OrganizationalUnitDistinguishedName)
    __obj.asInstanceOf[CreateComputerRequest]
  }
}

