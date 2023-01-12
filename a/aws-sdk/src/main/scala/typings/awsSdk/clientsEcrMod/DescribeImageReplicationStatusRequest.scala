package typings.awsSdk.clientsEcrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeImageReplicationStatusRequest extends StObject {
  
  var imageId: ImageIdentifier
  
  /**
    * The Amazon Web Services account ID associated with the registry. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  
  /**
    * The name of the repository that the image is in.
    */
  var repositoryName: RepositoryName
}
object DescribeImageReplicationStatusRequest {
  
  inline def apply(imageId: ImageIdentifier, repositoryName: RepositoryName): DescribeImageReplicationStatusRequest = {
    val __obj = js.Dynamic.literal(imageId = imageId.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeImageReplicationStatusRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeImageReplicationStatusRequest] (val x: Self) extends AnyVal {
    
    inline def setImageId(value: ImageIdentifier): Self = StObject.set(x, "imageId", value.asInstanceOf[js.Any])
    
    inline def setRegistryId(value: RegistryId): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    inline def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}
