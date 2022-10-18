package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportCatalogToGlueRequest extends StObject {
  
  /**
    * The ID of the catalog to import. Currently, this should be the Amazon Web Services account ID.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
}
object ImportCatalogToGlueRequest {
  
  inline def apply(): ImportCatalogToGlueRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportCatalogToGlueRequest]
  }
  
  extension [Self <: ImportCatalogToGlueRequest](x: Self) {
    
    inline def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
  }
}
