package typings.awsSdk.clientsEcrpublicMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeleteImageRequest extends StObject {
  
  /**
    * A list of image ID references that correspond to images to delete. The format of the imageIds reference is imageTag=tag or imageDigest=digest.
    */
  var imageIds: ImageIdentifierList
  
  /**
    * The Amazon Web Services account ID, or registry alias, that's associated with the registry that contains the image to delete. If you do not specify a registry, the default public registry is assumed.
    */
  var registryId: js.UndefOr[RegistryIdOrAlias] = js.undefined
  
  /**
    * The repository in a public registry that contains the image to delete.
    */
  var repositoryName: RepositoryName
}
object BatchDeleteImageRequest {
  
  inline def apply(imageIds: ImageIdentifierList, repositoryName: RepositoryName): BatchDeleteImageRequest = {
    val __obj = js.Dynamic.literal(imageIds = imageIds.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteImageRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchDeleteImageRequest] (val x: Self) extends AnyVal {
    
    inline def setImageIds(value: ImageIdentifierList): Self = StObject.set(x, "imageIds", value.asInstanceOf[js.Any])
    
    inline def setImageIdsVarargs(value: ImageIdentifier*): Self = StObject.set(x, "imageIds", js.Array(value*))
    
    inline def setRegistryId(value: RegistryIdOrAlias): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    inline def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}
