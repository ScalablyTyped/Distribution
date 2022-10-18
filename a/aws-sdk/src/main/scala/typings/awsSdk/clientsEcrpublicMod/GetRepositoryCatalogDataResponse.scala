package typings.awsSdk.clientsEcrpublicMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRepositoryCatalogDataResponse extends StObject {
  
  /**
    * The catalog metadata for the repository.
    */
  var catalogData: js.UndefOr[RepositoryCatalogData] = js.undefined
}
object GetRepositoryCatalogDataResponse {
  
  inline def apply(): GetRepositoryCatalogDataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRepositoryCatalogDataResponse]
  }
  
  extension [Self <: GetRepositoryCatalogDataResponse](x: Self) {
    
    inline def setCatalogData(value: RepositoryCatalogData): Self = StObject.set(x, "catalogData", value.asInstanceOf[js.Any])
    
    inline def setCatalogDataUndefined: Self = StObject.set(x, "catalogData", js.undefined)
  }
}
