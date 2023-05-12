package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamingImage extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that is assigned to a studio resource and uniquely identifies it. ARNs are unique across all Regions.
    */
  var arn: js.UndefOr[String] = js.undefined
  
  /**
    * A human-readable description of the streaming image.
    */
  var description: js.UndefOr[StreamingImageDescription] = js.undefined
  
  /**
    * The ID of an EC2 machine image with which to create the streaming image.
    */
  var ec2ImageId: js.UndefOr[EC2ImageId] = js.undefined
  
  /**
    * The encryption configuration.
    */
  var encryptionConfiguration: js.UndefOr[StreamingImageEncryptionConfiguration] = js.undefined
  
  /**
    * The list of EULAs that must be accepted before a Streaming Session can be started using this streaming image.
    */
  var eulaIds: js.UndefOr[EulaIdList] = js.undefined
  
  /**
    * A friendly name for a streaming image resource.
    */
  var name: js.UndefOr[StreamingImageName] = js.undefined
  
  /**
    * The owner of the streaming image, either the studioId that contains the streaming image, or amazon for images that are provided by Amazon Nimble Studio.
    */
  var owner: js.UndefOr[StreamingImageOwner] = js.undefined
  
  /**
    * The platform of the streaming image, either Windows or Linux.
    */
  var platform: js.UndefOr[StreamingImagePlatform] = js.undefined
  
  /**
    * The current state.
    */
  var state: js.UndefOr[StreamingImageState] = js.undefined
  
  /**
    * The status code.
    */
  var statusCode: js.UndefOr[StreamingImageStatusCode] = js.undefined
  
  /**
    * The status message for the streaming image.
    */
  var statusMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the streaming image.
    */
  var streamingImageId: js.UndefOr[StreamingImageId] = js.undefined
  
  /**
    * A collection of labels, in the form of key-value pairs, that apply to this resource.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}
object StreamingImage {
  
  inline def apply(): StreamingImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamingImage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StreamingImage] (val x: Self) extends AnyVal {
    
    inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setDescription(value: StreamingImageDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEc2ImageId(value: EC2ImageId): Self = StObject.set(x, "ec2ImageId", value.asInstanceOf[js.Any])
    
    inline def setEc2ImageIdUndefined: Self = StObject.set(x, "ec2ImageId", js.undefined)
    
    inline def setEncryptionConfiguration(value: StreamingImageEncryptionConfiguration): Self = StObject.set(x, "encryptionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfigurationUndefined: Self = StObject.set(x, "encryptionConfiguration", js.undefined)
    
    inline def setEulaIds(value: EulaIdList): Self = StObject.set(x, "eulaIds", value.asInstanceOf[js.Any])
    
    inline def setEulaIdsUndefined: Self = StObject.set(x, "eulaIds", js.undefined)
    
    inline def setEulaIdsVarargs(value: String*): Self = StObject.set(x, "eulaIds", js.Array(value*))
    
    inline def setName(value: StreamingImageName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOwner(value: StreamingImageOwner): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setPlatform(value: StreamingImagePlatform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setState(value: StreamingImageState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStatusCode(value: StreamingImageStatusCode): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setStreamingImageId(value: StreamingImageId): Self = StObject.set(x, "streamingImageId", value.asInstanceOf[js.Any])
    
    inline def setStreamingImageIdUndefined: Self = StObject.set(x, "streamingImageId", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
