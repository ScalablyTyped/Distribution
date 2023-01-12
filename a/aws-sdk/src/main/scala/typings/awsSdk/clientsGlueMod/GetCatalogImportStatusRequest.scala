package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCatalogImportStatusRequest extends StObject {
  
  /**
    * The ID of the catalog to migrate. Currently, this should be the Amazon Web Services account ID.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
}
object GetCatalogImportStatusRequest {
  
  inline def apply(): GetCatalogImportStatusRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCatalogImportStatusRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCatalogImportStatusRequest] (val x: Self) extends AnyVal {
    
    inline def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
  }
}
