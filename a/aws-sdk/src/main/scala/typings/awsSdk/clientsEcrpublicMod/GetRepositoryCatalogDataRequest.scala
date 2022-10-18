package typings.awsSdk.clientsEcrpublicMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRepositoryCatalogDataRequest extends StObject {
  
  /**
    * The AWS account ID associated with the registry that contains the repositories to be described. If you do not specify a registry, the default public registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  
  /**
    * The name of the repository to retrieve the catalog metadata for.
    */
  var repositoryName: RepositoryName
}
object GetRepositoryCatalogDataRequest {
  
  inline def apply(repositoryName: RepositoryName): GetRepositoryCatalogDataRequest = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRepositoryCatalogDataRequest]
  }
  
  extension [Self <: GetRepositoryCatalogDataRequest](x: Self) {
    
    inline def setRegistryId(value: RegistryId): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    inline def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}
