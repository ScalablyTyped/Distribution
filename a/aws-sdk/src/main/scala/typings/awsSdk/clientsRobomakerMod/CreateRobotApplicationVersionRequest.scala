package typings.awsSdk.clientsRobomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRobotApplicationVersionRequest extends StObject {
  
  /**
    * The application information for the robot application.
    */
  var application: Arn
  
  /**
    * The current revision id for the robot application. If you provide a value and it matches the latest revision ID, a new version will be created.
    */
  var currentRevisionId: js.UndefOr[RevisionId] = js.undefined
  
  /**
    * A SHA256 identifier for the Docker image that you use for your robot application.
    */
  var imageDigest: js.UndefOr[ImageDigest] = js.undefined
  
  /**
    * The Amazon S3 identifier for the zip file bundle that you use for your robot application.
    */
  var s3Etags: js.UndefOr[S3Etags] = js.undefined
}
object CreateRobotApplicationVersionRequest {
  
  inline def apply(application: Arn): CreateRobotApplicationVersionRequest = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRobotApplicationVersionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateRobotApplicationVersionRequest] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Arn): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    inline def setCurrentRevisionId(value: RevisionId): Self = StObject.set(x, "currentRevisionId", value.asInstanceOf[js.Any])
    
    inline def setCurrentRevisionIdUndefined: Self = StObject.set(x, "currentRevisionId", js.undefined)
    
    inline def setImageDigest(value: ImageDigest): Self = StObject.set(x, "imageDigest", value.asInstanceOf[js.Any])
    
    inline def setImageDigestUndefined: Self = StObject.set(x, "imageDigest", js.undefined)
    
    inline def setS3Etags(value: S3Etags): Self = StObject.set(x, "s3Etags", value.asInstanceOf[js.Any])
    
    inline def setS3EtagsUndefined: Self = StObject.set(x, "s3Etags", js.undefined)
    
    inline def setS3EtagsVarargs(value: S3Etag*): Self = StObject.set(x, "s3Etags", js.Array(value*))
  }
}
