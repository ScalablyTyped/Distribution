package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostLaunchActions extends StObject {
  
  /**
    * AWS Systems Manager Command's CloudWatch log group name.
    */
  var cloudWatchLogGroupName: js.UndefOr[CloudWatchLogGroupName] = js.undefined
  
  /**
    * Deployment type in which AWS Systems Manager Documents will be executed.
    */
  var deployment: js.UndefOr[PostLaunchActionsDeploymentType] = js.undefined
  
  /**
    * AWS Systems Manager Command's logs S3 log bucket.
    */
  var s3LogBucket: js.UndefOr[S3LogBucketName] = js.undefined
  
  /**
    * AWS Systems Manager Command's logs S3 output key prefix.
    */
  var s3OutputKeyPrefix: js.UndefOr[BoundedString] = js.undefined
  
  /**
    * AWS Systems Manager Documents.
    */
  var ssmDocuments: js.UndefOr[SsmDocuments] = js.undefined
}
object PostLaunchActions {
  
  inline def apply(): PostLaunchActions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostLaunchActions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostLaunchActions] (val x: Self) extends AnyVal {
    
    inline def setCloudWatchLogGroupName(value: CloudWatchLogGroupName): Self = StObject.set(x, "cloudWatchLogGroupName", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLogGroupNameUndefined: Self = StObject.set(x, "cloudWatchLogGroupName", js.undefined)
    
    inline def setDeployment(value: PostLaunchActionsDeploymentType): Self = StObject.set(x, "deployment", value.asInstanceOf[js.Any])
    
    inline def setDeploymentUndefined: Self = StObject.set(x, "deployment", js.undefined)
    
    inline def setS3LogBucket(value: S3LogBucketName): Self = StObject.set(x, "s3LogBucket", value.asInstanceOf[js.Any])
    
    inline def setS3LogBucketUndefined: Self = StObject.set(x, "s3LogBucket", js.undefined)
    
    inline def setS3OutputKeyPrefix(value: BoundedString): Self = StObject.set(x, "s3OutputKeyPrefix", value.asInstanceOf[js.Any])
    
    inline def setS3OutputKeyPrefixUndefined: Self = StObject.set(x, "s3OutputKeyPrefix", js.undefined)
    
    inline def setSsmDocuments(value: SsmDocuments): Self = StObject.set(x, "ssmDocuments", value.asInstanceOf[js.Any])
    
    inline def setSsmDocumentsUndefined: Self = StObject.set(x, "ssmDocuments", js.undefined)
    
    inline def setSsmDocumentsVarargs(value: SsmDocument*): Self = StObject.set(x, "ssmDocuments", js.Array(value*))
  }
}
