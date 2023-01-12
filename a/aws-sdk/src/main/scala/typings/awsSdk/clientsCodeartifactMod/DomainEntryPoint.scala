package typings.awsSdk.clientsCodeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainEntryPoint extends StObject {
  
  /**
    * The name of the external connection that a package was ingested from.
    */
  var externalConnectionName: js.UndefOr[ExternalConnectionName] = js.undefined
  
  /**
    * The name of the repository that a package was originally published to.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.undefined
}
object DomainEntryPoint {
  
  inline def apply(): DomainEntryPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainEntryPoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DomainEntryPoint] (val x: Self) extends AnyVal {
    
    inline def setExternalConnectionName(value: ExternalConnectionName): Self = StObject.set(x, "externalConnectionName", value.asInstanceOf[js.Any])
    
    inline def setExternalConnectionNameUndefined: Self = StObject.set(x, "externalConnectionName", js.undefined)
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    inline def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
  }
}
