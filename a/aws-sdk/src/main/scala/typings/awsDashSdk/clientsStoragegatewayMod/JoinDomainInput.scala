package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JoinDomainInput extends js.Object {
  /**
    * List of IPv4 addresses, NetBIOS names, or host names of your domain server. If you need to specify the port number include it after the colon (“:”). For example, mydc.mydomain.com:389.
    */
  var DomainControllers: js.UndefOr[Hosts] = js.native
  /**
    * The name of the domain that you want the gateway to join.
    */
  var DomainName: typings.awsDashSdk.clientsStoragegatewayMod.DomainName = js.native
  /**
    * The Amazon Resource Name (ARN) of the gateway. Use the ListGateways operation to return a list of gateways for your account and AWS Region.
    */
  var GatewayARN: typings.awsDashSdk.clientsStoragegatewayMod.GatewayARN = js.native
  /**
    * The organizational unit (OU) is a container in an Active Directory that can hold users, groups, computers, and other OUs and this parameter specifies the OU that the gateway will join within the AD domain.
    */
  var OrganizationalUnit: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.OrganizationalUnit] = js.native
  /**
    * Sets the password of the user who has permission to add the gateway to the Active Directory domain.
    */
  var Password: DomainUserPassword = js.native
  /**
    * Specifies the time in seconds, in which the JoinDomain operation must complete. The default is 20 seconds.
    */
  var TimeoutInSeconds: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.TimeoutInSeconds] = js.native
  /**
    * Sets the user name of user who has permission to add the gateway to the Active Directory domain. The domain user account should be enabled to join computers to the domain. For example, you can use the domain administrator account or an account with delegated permissions to join computers to the domain.
    */
  var UserName: DomainUserName = js.native
}

object JoinDomainInput {
  @scala.inline
  def apply(
    DomainName: DomainName,
    GatewayARN: GatewayARN,
    Password: DomainUserPassword,
    UserName: DomainUserName,
    DomainControllers: Hosts = null,
    OrganizationalUnit: OrganizationalUnit = null,
    TimeoutInSeconds: Int | Double = null
  ): JoinDomainInput = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], GatewayARN = GatewayARN.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    if (DomainControllers != null) __obj.updateDynamic("DomainControllers")(DomainControllers.asInstanceOf[js.Any])
    if (OrganizationalUnit != null) __obj.updateDynamic("OrganizationalUnit")(OrganizationalUnit.asInstanceOf[js.Any])
    if (TimeoutInSeconds != null) __obj.updateDynamic("TimeoutInSeconds")(TimeoutInSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[JoinDomainInput]
  }
}

