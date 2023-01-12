package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRepositoryOutput extends StObject {
  
  /**
    * The ID of the repository that was deleted.
    */
  var repositoryId: js.UndefOr[RepositoryId] = js.undefined
}
object DeleteRepositoryOutput {
  
  inline def apply(): DeleteRepositoryOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteRepositoryOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteRepositoryOutput] (val x: Self) extends AnyVal {
    
    inline def setRepositoryId(value: RepositoryId): Self = StObject.set(x, "repositoryId", value.asInstanceOf[js.Any])
    
    inline def setRepositoryIdUndefined: Self = StObject.set(x, "repositoryId", js.undefined)
  }
}
