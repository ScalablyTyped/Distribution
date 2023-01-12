package typings.awsSdk.clientsEcrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRepositoryResponse extends StObject {
  
  /**
    * The repository that was deleted.
    */
  var repository: js.UndefOr[Repository] = js.undefined
}
object DeleteRepositoryResponse {
  
  inline def apply(): DeleteRepositoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteRepositoryResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteRepositoryResponse] (val x: Self) extends AnyVal {
    
    inline def setRepository(value: Repository): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
  }
}
