package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCatalogImportStatusResponse extends StObject {
  
  /**
    * The status of the specified catalog migration.
    */
  var ImportStatus: js.UndefOr[CatalogImportStatus] = js.undefined
}
object GetCatalogImportStatusResponse {
  
  inline def apply(): GetCatalogImportStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCatalogImportStatusResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCatalogImportStatusResponse] (val x: Self) extends AnyVal {
    
    inline def setImportStatus(value: CatalogImportStatus): Self = StObject.set(x, "ImportStatus", value.asInstanceOf[js.Any])
    
    inline def setImportStatusUndefined: Self = StObject.set(x, "ImportStatus", js.undefined)
  }
}
