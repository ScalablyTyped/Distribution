package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRepositoryTriggersInput extends StObject {
  
  /**
    * The name of the repository for which the trigger is configured.
    */
  var repositoryName: RepositoryName
}
object GetRepositoryTriggersInput {
  
  inline def apply(repositoryName: RepositoryName): GetRepositoryTriggersInput = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRepositoryTriggersInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetRepositoryTriggersInput] (val x: Self) extends AnyVal {
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}
