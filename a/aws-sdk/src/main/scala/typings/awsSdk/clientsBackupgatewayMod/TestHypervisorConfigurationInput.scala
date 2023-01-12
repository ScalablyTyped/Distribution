package typings.awsSdk.clientsBackupgatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestHypervisorConfigurationInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the gateway to the hypervisor to test.
    */
  var GatewayArn: typings.awsSdk.clientsBackupgatewayMod.GatewayArn
  
  /**
    * The server host of the hypervisor. This can be either an IP address or a fully-qualified domain name (FQDN).
    */
  var Host: typings.awsSdk.clientsBackupgatewayMod.Host
  
  /**
    * The password for the hypervisor.
    */
  var Password: js.UndefOr[typings.awsSdk.clientsBackupgatewayMod.Password] = js.undefined
  
  /**
    * The username for the hypervisor.
    */
  var Username: js.UndefOr[typings.awsSdk.clientsBackupgatewayMod.Username] = js.undefined
}
object TestHypervisorConfigurationInput {
  
  inline def apply(GatewayArn: GatewayArn, Host: Host): TestHypervisorConfigurationInput = {
    val __obj = js.Dynamic.literal(GatewayArn = GatewayArn.asInstanceOf[js.Any], Host = Host.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestHypervisorConfigurationInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestHypervisorConfigurationInput] (val x: Self) extends AnyVal {
    
    inline def setGatewayArn(value: GatewayArn): Self = StObject.set(x, "GatewayArn", value.asInstanceOf[js.Any])
    
    inline def setHost(value: Host): Self = StObject.set(x, "Host", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: Password): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "Password", js.undefined)
    
    inline def setUsername(value: Username): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "Username", js.undefined)
  }
}
