package typings.awsSdk.clientsEcrpublicMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitiateLayerUploadRequest extends StObject {
  
  /**
    * The AWS account ID associated with the registry to which you intend to upload layers. If you do not specify a registry, the default public registry is assumed.
    */
  var registryId: js.UndefOr[RegistryIdOrAlias] = js.undefined
  
  /**
    * The name of the repository to which you intend to upload layers.
    */
  var repositoryName: RepositoryName
}
object InitiateLayerUploadRequest {
  
  inline def apply(repositoryName: RepositoryName): InitiateLayerUploadRequest = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitiateLayerUploadRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InitiateLayerUploadRequest] (val x: Self) extends AnyVal {
    
    inline def setRegistryId(value: RegistryIdOrAlias): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    inline def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}
