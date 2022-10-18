package typings.awsSdk.clientsCodeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateExternalConnectionResult extends StObject {
  
  /**
    *  Information about the connected repository after processing the request. 
    */
  var repository: js.UndefOr[RepositoryDescription] = js.undefined
}
object AssociateExternalConnectionResult {
  
  inline def apply(): AssociateExternalConnectionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateExternalConnectionResult]
  }
  
  extension [Self <: AssociateExternalConnectionResult](x: Self) {
    
    inline def setRepository(value: RepositoryDescription): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
  }
}
