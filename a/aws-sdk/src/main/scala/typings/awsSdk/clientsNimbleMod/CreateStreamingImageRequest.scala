package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStreamingImageRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don’t specify a client token, the Amazon Web Services SDK automatically generates a client token and uses it for the request to ensure idempotency.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * A human-readable description of the streaming image.
    */
  var description: js.UndefOr[StreamingImageDescription] = js.undefined
  
  /**
    * The ID of an EC2 machine image with which to create this streaming image.
    */
  var ec2ImageId: EC2ImageId
  
  /**
    * A friendly name for a streaming image resource.
    */
  var name: StreamingImageName
  
  /**
    * The studio ID. 
    */
  var studioId: String
  
  /**
    * A collection of labels, in the form of key-value pairs, that apply to this resource.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}
object CreateStreamingImageRequest {
  
  inline def apply(ec2ImageId: EC2ImageId, name: StreamingImageName, studioId: String): CreateStreamingImageRequest = {
    val __obj = js.Dynamic.literal(ec2ImageId = ec2ImageId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], studioId = studioId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStreamingImageRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateStreamingImageRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setDescription(value: StreamingImageDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEc2ImageId(value: EC2ImageId): Self = StObject.set(x, "ec2ImageId", value.asInstanceOf[js.Any])
    
    inline def setName(value: StreamingImageName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStudioId(value: String): Self = StObject.set(x, "studioId", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
