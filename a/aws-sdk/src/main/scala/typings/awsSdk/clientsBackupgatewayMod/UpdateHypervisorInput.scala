package typings.awsSdk.clientsBackupgatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateHypervisorInput extends StObject {
  
  /**
    * The updated host of the hypervisor. This can be either an IP address or a fully-qualified domain name (FQDN).
    */
  var Host: js.UndefOr[typings.awsSdk.clientsBackupgatewayMod.Host] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the hypervisor to update.
    */
  var HypervisorArn: ServerArn
  
  /**
    * The updated name for the hypervisor
    */
  var Name: js.UndefOr[typings.awsSdk.clientsBackupgatewayMod.Name] = js.undefined
  
  /**
    * The updated password for the hypervisor.
    */
  var Password: js.UndefOr[typings.awsSdk.clientsBackupgatewayMod.Password] = js.undefined
  
  /**
    * The updated username for the hypervisor.
    */
  var Username: js.UndefOr[typings.awsSdk.clientsBackupgatewayMod.Username] = js.undefined
}
object UpdateHypervisorInput {
  
  inline def apply(HypervisorArn: ServerArn): UpdateHypervisorInput = {
    val __obj = js.Dynamic.literal(HypervisorArn = HypervisorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateHypervisorInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateHypervisorInput] (val x: Self) extends AnyVal {
    
    inline def setHost(value: Host): Self = StObject.set(x, "Host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "Host", js.undefined)
    
    inline def setHypervisorArn(value: ServerArn): Self = StObject.set(x, "HypervisorArn", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPassword(value: Password): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "Password", js.undefined)
    
    inline def setUsername(value: Username): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "Username", js.undefined)
  }
}
