package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRepositoryOutput extends StObject {
  
  /**
    * Information about the repository.
    */
  var repositoryMetadata: js.UndefOr[RepositoryMetadata] = js.undefined
}
object GetRepositoryOutput {
  
  inline def apply(): GetRepositoryOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRepositoryOutput]
  }
  
  extension [Self <: GetRepositoryOutput](x: Self) {
    
    inline def setRepositoryMetadata(value: RepositoryMetadata): Self = StObject.set(x, "repositoryMetadata", value.asInstanceOf[js.Any])
    
    inline def setRepositoryMetadataUndefined: Self = StObject.set(x, "repositoryMetadata", js.undefined)
  }
}
