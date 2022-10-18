package typings.awsSdk.clientsEcrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRepositoryRequest extends StObject {
  
  /**
    *  If a repository contains images, forces the deletion.
    */
  var force: js.UndefOr[ForceFlag] = js.undefined
  
  /**
    * The Amazon Web Services account ID associated with the registry that contains the repository to delete. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  
  /**
    * The name of the repository to delete.
    */
  var repositoryName: RepositoryName
}
object DeleteRepositoryRequest {
  
  inline def apply(repositoryName: RepositoryName): DeleteRepositoryRequest = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRepositoryRequest]
  }
  
  extension [Self <: DeleteRepositoryRequest](x: Self) {
    
    inline def setForce(value: ForceFlag): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setRegistryId(value: RegistryId): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    inline def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}
