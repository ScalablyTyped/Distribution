package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRepositoryOutput extends StObject {
  
  /**
    * The repository link's detail data that's returned by Proton.
    */
  var repository: Repository
}
object GetRepositoryOutput {
  
  inline def apply(repository: Repository): GetRepositoryOutput = {
    val __obj = js.Dynamic.literal(repository = repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRepositoryOutput]
  }
  
  extension [Self <: GetRepositoryOutput](x: Self) {
    
    inline def setRepository(value: Repository): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
  }
}
