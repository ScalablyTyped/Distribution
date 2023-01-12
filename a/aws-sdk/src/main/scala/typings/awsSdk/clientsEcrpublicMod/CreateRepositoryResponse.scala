package typings.awsSdk.clientsEcrpublicMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRepositoryResponse extends StObject {
  
  var catalogData: js.UndefOr[RepositoryCatalogData] = js.undefined
  
  /**
    * The repository that was created.
    */
  var repository: js.UndefOr[Repository] = js.undefined
}
object CreateRepositoryResponse {
  
  inline def apply(): CreateRepositoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRepositoryResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateRepositoryResponse] (val x: Self) extends AnyVal {
    
    inline def setCatalogData(value: RepositoryCatalogData): Self = StObject.set(x, "catalogData", value.asInstanceOf[js.Any])
    
    inline def setCatalogDataUndefined: Self = StObject.set(x, "catalogData", js.undefined)
    
    inline def setRepository(value: Repository): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
  }
}
