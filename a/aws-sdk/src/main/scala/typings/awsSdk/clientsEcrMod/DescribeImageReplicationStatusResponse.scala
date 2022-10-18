package typings.awsSdk.clientsEcrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeImageReplicationStatusResponse extends StObject {
  
  var imageId: js.UndefOr[ImageIdentifier] = js.undefined
  
  /**
    * The replication status details for the images in the specified repository.
    */
  var replicationStatuses: js.UndefOr[ImageReplicationStatusList] = js.undefined
  
  /**
    * The repository name associated with the request.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.undefined
}
object DescribeImageReplicationStatusResponse {
  
  inline def apply(): DescribeImageReplicationStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeImageReplicationStatusResponse]
  }
  
  extension [Self <: DescribeImageReplicationStatusResponse](x: Self) {
    
    inline def setImageId(value: ImageIdentifier): Self = StObject.set(x, "imageId", value.asInstanceOf[js.Any])
    
    inline def setImageIdUndefined: Self = StObject.set(x, "imageId", js.undefined)
    
    inline def setReplicationStatuses(value: ImageReplicationStatusList): Self = StObject.set(x, "replicationStatuses", value.asInstanceOf[js.Any])
    
    inline def setReplicationStatusesUndefined: Self = StObject.set(x, "replicationStatuses", js.undefined)
    
    inline def setReplicationStatusesVarargs(value: ImageReplicationStatus*): Self = StObject.set(x, "replicationStatuses", js.Array(value*))
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    inline def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
  }
}
