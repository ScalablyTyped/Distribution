package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDataCatalogEncryptionSettingsRequest extends StObject {
  
  /**
    * The ID of the Data Catalog to retrieve the security configuration for. If none is provided, the Amazon Web Services account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
}
object GetDataCatalogEncryptionSettingsRequest {
  
  inline def apply(): GetDataCatalogEncryptionSettingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDataCatalogEncryptionSettingsRequest]
  }
  
  extension [Self <: GetDataCatalogEncryptionSettingsRequest](x: Self) {
    
    inline def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
  }
}
