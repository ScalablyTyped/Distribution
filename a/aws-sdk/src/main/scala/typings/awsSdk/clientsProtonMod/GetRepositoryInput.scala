package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRepositoryInput extends StObject {
  
  /**
    * The repository name, for example myrepos/myrepo.
    */
  var name: RepositoryName
  
  /**
    * The repository provider.
    */
  var provider: RepositoryProvider
}
object GetRepositoryInput {
  
  inline def apply(name: RepositoryName, provider: RepositoryProvider): GetRepositoryInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRepositoryInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetRepositoryInput] (val x: Self) extends AnyVal {
    
    inline def setName(value: RepositoryName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProvider(value: RepositoryProvider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
  }
}
