package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRepositoryOutput extends StObject {
  
  /**
    * Information about the newly created repository.
    */
  var repositoryMetadata: js.UndefOr[RepositoryMetadata] = js.undefined
}
object CreateRepositoryOutput {
  
  inline def apply(): CreateRepositoryOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRepositoryOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateRepositoryOutput] (val x: Self) extends AnyVal {
    
    inline def setRepositoryMetadata(value: RepositoryMetadata): Self = StObject.set(x, "repositoryMetadata", value.asInstanceOf[js.Any])
    
    inline def setRepositoryMetadataUndefined: Self = StObject.set(x, "repositoryMetadata", js.undefined)
  }
}
