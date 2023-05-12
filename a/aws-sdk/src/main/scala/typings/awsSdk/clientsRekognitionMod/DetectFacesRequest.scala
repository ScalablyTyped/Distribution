package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectFacesRequest extends StObject {
  
  /**
    * An array of facial attributes you want to be returned. A DEFAULT subset of facial attributes - BoundingBox, Confidence, Pose, Quality, and Landmarks - will always be returned. You can request for specific facial attributes (in addition to the default list) - by using ["DEFAULT", "FACE_OCCLUDED"] or just ["FACE_OCCLUDED"]. You can request for all facial attributes by using ["ALL"]. Requesting more attributes may increase response time. If you provide both, ["ALL", "DEFAULT"], the service uses a logical "AND" operator to determine which attributes to return (in this case, all attributes). 
    */
  var Attributes: js.UndefOr[typings.awsSdk.clientsRekognitionMod.Attributes] = js.undefined
  
  /**
    * The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition operations, passing base64-encoded image bytes is not supported.  If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes passed using the Bytes field. For more information, see Images in the Amazon Rekognition developer guide.
    */
  var Image: typings.awsSdk.clientsRekognitionMod.Image
}
object DetectFacesRequest {
  
  inline def apply(Image: Image): DetectFacesRequest = {
    val __obj = js.Dynamic.literal(Image = Image.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectFacesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DetectFacesRequest] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: Attributes): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setAttributesVarargs(value: Attribute*): Self = StObject.set(x, "Attributes", js.Array(value*))
    
    inline def setImage(value: Image): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
  }
}
