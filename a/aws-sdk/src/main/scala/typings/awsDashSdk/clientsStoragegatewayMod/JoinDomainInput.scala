package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JoinDomainInput extends js.Object {
  /**
    * List of IPv4 addresses, NetBIOS names, or host names of your domain server. If you need to specify the port number include it after the colon (“:”). For example, mydc.mydomain.com:389.
    */
  var DomainControllers: js.UndefOr[Hosts] = js.undefined
  /**
    * The name of the domain that you want the gateway to join.
    */
  var DomainName: typings.awsDashSdk.clientsStoragegatewayMod.DomainName
  /**
    * The Amazon Resource Name (ARN) of the gateway. Use the ListGateways operation to return a list of gateways for your account and AWS Region.
    */
  var GatewayARN: typings.awsDashSdk.clientsStoragegatewayMod.GatewayARN
  /**
    * The organizational unit (OU) is a container in an Active Directory that can hold users, groups, computers, and other OUs and this parameter specifies the OU that the gateway will join within the AD domain.
    */
  var OrganizationalUnit: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.OrganizationalUnit] = js.undefined
  /**
    * Sets the password of the user who has permission to add the gateway to the Active Directory domain.
    */
  var Password: DomainUserPassword
  /**
    * Sets the user name of user who has permission to add the gateway to the Active Directory domain.
    */
  var UserName: DomainUserName
}

object JoinDomainInput {
  @scala.inline
  def apply(
    DomainName: DomainName,
    GatewayARN: GatewayARN,
    Password: DomainUserPassword,
    UserName: DomainUserName,
    DomainControllers: Hosts = null,
    OrganizationalUnit: OrganizationalUnit = null
  ): JoinDomainInput = {
    val __obj = js.Dynamic.literal(DomainName = DomainName, GatewayARN = GatewayARN, Password = Password, UserName = UserName)
    if (DomainControllers != null) __obj.updateDynamic("DomainControllers")(DomainControllers)
    if (OrganizationalUnit != null) __obj.updateDynamic("OrganizationalUnit")(OrganizationalUnit)
    __obj.asInstanceOf[JoinDomainInput]
  }
}

