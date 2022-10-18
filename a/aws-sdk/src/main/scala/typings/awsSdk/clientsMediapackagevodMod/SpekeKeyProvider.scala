package typings.awsSdk.clientsMediapackagevodMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpekeKeyProvider extends StObject {
  
  var EncryptionContractConfiguration: js.UndefOr[typings.awsSdk.clientsMediapackagevodMod.EncryptionContractConfiguration] = js.undefined
  
  /**
    * An Amazon Resource Name (ARN) of an IAM role that AWS Elemental
  MediaPackage will assume when accessing the key provider service.
    */
  var RoleArn: string
  
  /**
    * The system IDs to include in key requests.
    */
  var SystemIds: listOfString
  
  /**
    * The URL of the external key provider service.
    */
  var Url: string
}
object SpekeKeyProvider {
  
  inline def apply(RoleArn: string, SystemIds: listOfString, Url: string): SpekeKeyProvider = {
    val __obj = js.Dynamic.literal(RoleArn = RoleArn.asInstanceOf[js.Any], SystemIds = SystemIds.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpekeKeyProvider]
  }
  
  extension [Self <: SpekeKeyProvider](x: Self) {
    
    inline def setEncryptionContractConfiguration(value: EncryptionContractConfiguration): Self = StObject.set(x, "EncryptionContractConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEncryptionContractConfigurationUndefined: Self = StObject.set(x, "EncryptionContractConfiguration", js.undefined)
    
    inline def setRoleArn(value: string): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setSystemIds(value: listOfString): Self = StObject.set(x, "SystemIds", value.asInstanceOf[js.Any])
    
    inline def setSystemIdsVarargs(value: string*): Self = StObject.set(x, "SystemIds", js.Array(value*))
    
    inline def setUrl(value: string): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
  }
}
