package typings.awsSdk.clientsKinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaSourceConfig extends StObject {
  
  /**
    * The AWS Secrets Manager ARN for the username and password of the camera, or a local media file location.
    */
  var MediaUriSecretArn: typings.awsSdk.clientsKinesisvideoMod.MediaUriSecretArn
  
  /**
    * The Uniform Resource Identifier (URI) type. The FILE_URI value can be used to stream local media files.  Preview only supports the RTSP_URI media source URI format . 
    */
  var MediaUriType: typings.awsSdk.clientsKinesisvideoMod.MediaUriType
}
object MediaSourceConfig {
  
  inline def apply(MediaUriSecretArn: MediaUriSecretArn, MediaUriType: MediaUriType): MediaSourceConfig = {
    val __obj = js.Dynamic.literal(MediaUriSecretArn = MediaUriSecretArn.asInstanceOf[js.Any], MediaUriType = MediaUriType.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaSourceConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaSourceConfig] (val x: Self) extends AnyVal {
    
    inline def setMediaUriSecretArn(value: MediaUriSecretArn): Self = StObject.set(x, "MediaUriSecretArn", value.asInstanceOf[js.Any])
    
    inline def setMediaUriType(value: MediaUriType): Self = StObject.set(x, "MediaUriType", value.asInstanceOf[js.Any])
  }
}
