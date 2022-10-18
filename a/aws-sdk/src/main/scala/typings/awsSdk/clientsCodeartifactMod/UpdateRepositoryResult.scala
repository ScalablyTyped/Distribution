package typings.awsSdk.clientsCodeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRepositoryResult extends StObject {
  
  /**
    *  The updated repository. 
    */
  var repository: js.UndefOr[RepositoryDescription] = js.undefined
}
object UpdateRepositoryResult {
  
  inline def apply(): UpdateRepositoryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRepositoryResult]
  }
  
  extension [Self <: UpdateRepositoryResult](x: Self) {
    
    inline def setRepository(value: RepositoryDescription): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
  }
}
