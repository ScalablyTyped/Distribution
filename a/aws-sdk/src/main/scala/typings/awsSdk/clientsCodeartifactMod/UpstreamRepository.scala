package typings.awsSdk.clientsCodeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpstreamRepository extends StObject {
  
  /**
    *  The name of an upstream repository. 
    */
  var repositoryName: RepositoryName
}
object UpstreamRepository {
  
  inline def apply(repositoryName: RepositoryName): UpstreamRepository = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpstreamRepository]
  }
  
  extension [Self <: UpstreamRepository](x: Self) {
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}
