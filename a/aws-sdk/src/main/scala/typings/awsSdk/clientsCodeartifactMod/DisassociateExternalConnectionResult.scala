package typings.awsSdk.clientsCodeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateExternalConnectionResult extends StObject {
  
  /**
    *  The repository associated with the removed external connection. 
    */
  var repository: js.UndefOr[RepositoryDescription] = js.undefined
}
object DisassociateExternalConnectionResult {
  
  inline def apply(): DisassociateExternalConnectionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateExternalConnectionResult]
  }
  
  extension [Self <: DisassociateExternalConnectionResult](x: Self) {
    
    inline def setRepository(value: RepositoryDescription): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
  }
}
