package typings.awsSdk.clientsBackupgatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hypervisor extends StObject {
  
  /**
    * The server host of the hypervisor. This can be either an IP address or a fully-qualified domain name (FQDN).
    */
  var Host: js.UndefOr[typings.awsSdk.clientsBackupgatewayMod.Host] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the hypervisor.
    */
  var HypervisorArn: js.UndefOr[ServerArn] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Key Management Service used to encrypt the hypervisor.
    */
  var KmsKeyArn: js.UndefOr[typings.awsSdk.clientsBackupgatewayMod.KmsKeyArn] = js.undefined
  
  /**
    * The name of the hypervisor.
    */
  var Name: js.UndefOr[typings.awsSdk.clientsBackupgatewayMod.Name] = js.undefined
  
  /**
    * The state of the hypervisor.
    */
  var State: js.UndefOr[HypervisorState] = js.undefined
}
object Hypervisor {
  
  inline def apply(): Hypervisor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hypervisor]
  }
  
  extension [Self <: Hypervisor](x: Self) {
    
    inline def setHost(value: Host): Self = StObject.set(x, "Host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "Host", js.undefined)
    
    inline def setHypervisorArn(value: ServerArn): Self = StObject.set(x, "HypervisorArn", value.asInstanceOf[js.Any])
    
    inline def setHypervisorArnUndefined: Self = StObject.set(x, "HypervisorArn", js.undefined)
    
    inline def setKmsKeyArn(value: KmsKeyArn): Self = StObject.set(x, "KmsKeyArn", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyArnUndefined: Self = StObject.set(x, "KmsKeyArn", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setState(value: HypervisorState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
