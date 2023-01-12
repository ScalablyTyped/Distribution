package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataCatalogEncryptionSettings extends StObject {
  
  /**
    * When connection password protection is enabled, the Data Catalog uses a customer-provided key to encrypt the password as part of CreateConnection or UpdateConnection and store it in the ENCRYPTED_PASSWORD field in the connection properties. You can enable catalog encryption or only password encryption.
    */
  var ConnectionPasswordEncryption: js.UndefOr[typings.awsSdk.clientsGlueMod.ConnectionPasswordEncryption] = js.undefined
  
  /**
    * Specifies the encryption-at-rest configuration for the Data Catalog.
    */
  var EncryptionAtRest: js.UndefOr[typings.awsSdk.clientsGlueMod.EncryptionAtRest] = js.undefined
}
object DataCatalogEncryptionSettings {
  
  inline def apply(): DataCatalogEncryptionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataCatalogEncryptionSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataCatalogEncryptionSettings] (val x: Self) extends AnyVal {
    
    inline def setConnectionPasswordEncryption(value: ConnectionPasswordEncryption): Self = StObject.set(x, "ConnectionPasswordEncryption", value.asInstanceOf[js.Any])
    
    inline def setConnectionPasswordEncryptionUndefined: Self = StObject.set(x, "ConnectionPasswordEncryption", js.undefined)
    
    inline def setEncryptionAtRest(value: EncryptionAtRest): Self = StObject.set(x, "EncryptionAtRest", value.asInstanceOf[js.Any])
    
    inline def setEncryptionAtRestUndefined: Self = StObject.set(x, "EncryptionAtRest", js.undefined)
  }
}
