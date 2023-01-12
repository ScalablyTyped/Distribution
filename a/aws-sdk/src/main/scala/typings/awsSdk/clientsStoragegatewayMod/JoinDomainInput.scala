package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JoinDomainInput extends StObject {
  
  /**
    * List of IPv4 addresses, NetBIOS names, or host names of your domain server. If you need to specify the port number include it after the colon (“:”). For example, mydc.mydomain.com:389.
    */
  var DomainControllers: js.UndefOr[Hosts] = js.undefined
  
  /**
    * The name of the domain that you want the gateway to join.
    */
  var DomainName: typings.awsSdk.clientsStoragegatewayMod.DomainName
  
  /**
    * The Amazon Resource Name (ARN) of the gateway. Use the ListGateways operation to return a list of gateways for your account and Amazon Web Services Region.
    */
  var GatewayARN: typings.awsSdk.clientsStoragegatewayMod.GatewayARN
  
  /**
    * The organizational unit (OU) is a container in an Active Directory that can hold users, groups, computers, and other OUs and this parameter specifies the OU that the gateway will join within the AD domain.
    */
  var OrganizationalUnit: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.OrganizationalUnit] = js.undefined
  
  /**
    * Sets the password of the user who has permission to add the gateway to the Active Directory domain.
    */
  var Password: DomainUserPassword
  
  /**
    * Specifies the time in seconds, in which the JoinDomain operation must complete. The default is 20 seconds.
    */
  var TimeoutInSeconds: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.TimeoutInSeconds] = js.undefined
  
  /**
    * Sets the user name of user who has permission to add the gateway to the Active Directory domain. The domain user account should be enabled to join computers to the domain. For example, you can use the domain administrator account or an account with delegated permissions to join computers to the domain.
    */
  var UserName: DomainUserName
}
object JoinDomainInput {
  
  inline def apply(
    DomainName: DomainName,
    GatewayARN: GatewayARN,
    Password: DomainUserPassword,
    UserName: DomainUserName
  ): JoinDomainInput = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], GatewayARN = GatewayARN.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[JoinDomainInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JoinDomainInput] (val x: Self) extends AnyVal {
    
    inline def setDomainControllers(value: Hosts): Self = StObject.set(x, "DomainControllers", value.asInstanceOf[js.Any])
    
    inline def setDomainControllersUndefined: Self = StObject.set(x, "DomainControllers", js.undefined)
    
    inline def setDomainControllersVarargs(value: Host*): Self = StObject.set(x, "DomainControllers", js.Array(value*))
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    inline def setOrganizationalUnit(value: OrganizationalUnit): Self = StObject.set(x, "OrganizationalUnit", value.asInstanceOf[js.Any])
    
    inline def setOrganizationalUnitUndefined: Self = StObject.set(x, "OrganizationalUnit", js.undefined)
    
    inline def setPassword(value: DomainUserPassword): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    inline def setTimeoutInSeconds(value: TimeoutInSeconds): Self = StObject.set(x, "TimeoutInSeconds", value.asInstanceOf[js.Any])
    
    inline def setTimeoutInSecondsUndefined: Self = StObject.set(x, "TimeoutInSeconds", js.undefined)
    
    inline def setUserName(value: DomainUserName): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
