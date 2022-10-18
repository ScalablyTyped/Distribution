package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutDataCatalogEncryptionSettingsRequest extends StObject {
  
  /**
    * The ID of the Data Catalog to set the security configuration for. If none is provided, the Amazon Web Services account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  
  /**
    * The security configuration to set.
    */
  var DataCatalogEncryptionSettings: typings.awsSdk.clientsGlueMod.DataCatalogEncryptionSettings
}
object PutDataCatalogEncryptionSettingsRequest {
  
  inline def apply(DataCatalogEncryptionSettings: DataCatalogEncryptionSettings): PutDataCatalogEncryptionSettingsRequest = {
    val __obj = js.Dynamic.literal(DataCatalogEncryptionSettings = DataCatalogEncryptionSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutDataCatalogEncryptionSettingsRequest]
  }
  
  extension [Self <: PutDataCatalogEncryptionSettingsRequest](x: Self) {
    
    inline def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    inline def setDataCatalogEncryptionSettings(value: DataCatalogEncryptionSettings): Self = StObject.set(x, "DataCatalogEncryptionSettings", value.asInstanceOf[js.Any])
  }
}
