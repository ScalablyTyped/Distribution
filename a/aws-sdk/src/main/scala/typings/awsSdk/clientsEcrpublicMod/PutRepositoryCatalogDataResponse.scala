package typings.awsSdk.clientsEcrpublicMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutRepositoryCatalogDataResponse extends StObject {
  
  /**
    * The catalog data for the repository.
    */
  var catalogData: js.UndefOr[RepositoryCatalogData] = js.undefined
}
object PutRepositoryCatalogDataResponse {
  
  inline def apply(): PutRepositoryCatalogDataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutRepositoryCatalogDataResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutRepositoryCatalogDataResponse] (val x: Self) extends AnyVal {
    
    inline def setCatalogData(value: RepositoryCatalogData): Self = StObject.set(x, "catalogData", value.asInstanceOf[js.Any])
    
    inline def setCatalogDataUndefined: Self = StObject.set(x, "catalogData", js.undefined)
  }
}
