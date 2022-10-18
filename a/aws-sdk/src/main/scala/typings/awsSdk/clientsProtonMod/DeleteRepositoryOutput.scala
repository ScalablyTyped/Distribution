package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRepositoryOutput extends StObject {
  
  /**
    * The deleted repository link's detail data that's returned by Proton.
    */
  var repository: js.UndefOr[Repository] = js.undefined
}
object DeleteRepositoryOutput {
  
  inline def apply(): DeleteRepositoryOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteRepositoryOutput]
  }
  
  extension [Self <: DeleteRepositoryOutput](x: Self) {
    
    inline def setRepository(value: Repository): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
  }
}
