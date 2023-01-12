package typings.awsSdk.clientsBackupgatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportHypervisorConfigurationInput extends StObject {
  
  /**
    * The server host of the hypervisor. This can be either an IP address or a fully-qualified domain name (FQDN).
    */
  var Host: typings.awsSdk.clientsBackupgatewayMod.Host
  
  /**
    * The Key Management Service for the hypervisor.
    */
  var KmsKeyArn: js.UndefOr[typings.awsSdk.clientsBackupgatewayMod.KmsKeyArn] = js.undefined
  
  /**
    * The name of the hypervisor.
    */
  var Name: typings.awsSdk.clientsBackupgatewayMod.Name
  
  /**
    * The password for the hypervisor.
    */
  var Password: js.UndefOr[typings.awsSdk.clientsBackupgatewayMod.Password] = js.undefined
  
  /**
    * The tags of the hypervisor configuration to import.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsBackupgatewayMod.Tags] = js.undefined
  
  /**
    * The username for the hypervisor.
    */
  var Username: js.UndefOr[typings.awsSdk.clientsBackupgatewayMod.Username] = js.undefined
}
object ImportHypervisorConfigurationInput {
  
  inline def apply(Host: Host, Name: Name): ImportHypervisorConfigurationInput = {
    val __obj = js.Dynamic.literal(Host = Host.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportHypervisorConfigurationInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportHypervisorConfigurationInput] (val x: Self) extends AnyVal {
    
    inline def setHost(value: Host): Self = StObject.set(x, "Host", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyArn(value: KmsKeyArn): Self = StObject.set(x, "KmsKeyArn", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyArnUndefined: Self = StObject.set(x, "KmsKeyArn", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: Password): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "Password", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setUsername(value: Username): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "Username", js.undefined)
  }
}
