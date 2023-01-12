package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDataCatalogEncryptionSettingsResponse extends StObject {
  
  /**
    * The requested security configuration.
    */
  var DataCatalogEncryptionSettings: js.UndefOr[typings.awsSdk.clientsGlueMod.DataCatalogEncryptionSettings] = js.undefined
}
object GetDataCatalogEncryptionSettingsResponse {
  
  inline def apply(): GetDataCatalogEncryptionSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDataCatalogEncryptionSettingsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDataCatalogEncryptionSettingsResponse] (val x: Self) extends AnyVal {
    
    inline def setDataCatalogEncryptionSettings(value: DataCatalogEncryptionSettings): Self = StObject.set(x, "DataCatalogEncryptionSettings", value.asInstanceOf[js.Any])
    
    inline def setDataCatalogEncryptionSettingsUndefined: Self = StObject.set(x, "DataCatalogEncryptionSettings", js.undefined)
  }
}
