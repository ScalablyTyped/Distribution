package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexFacesRequest extends StObject {
  
  /**
    * The ID of an existing collection to which you want to add the faces that are detected in the input images.
    */
  var CollectionId: typings.awsSdk.clientsRekognitionMod.CollectionId
  
  /**
    * An array of facial attributes you want to be returned. A DEFAULT subset of facial attributes - BoundingBox, Confidence, Pose, Quality, and Landmarks - will always be returned. You can request for specific facial attributes (in addition to the default list) - by using ["DEFAULT", "FACE_OCCLUDED"] or just ["FACE_OCCLUDED"]. You can request for all facial attributes by using ["ALL"]. Requesting more attributes may increase response time. If you provide both, ["ALL", "DEFAULT"], the service uses a logical AND operator to determine which attributes to return (in this case, all attributes). 
    */
  var DetectionAttributes: js.UndefOr[Attributes] = js.undefined
  
  /**
    * The ID you want to assign to all the faces detected in the image.
    */
  var ExternalImageId: js.UndefOr[typings.awsSdk.clientsRekognitionMod.ExternalImageId] = js.undefined
  
  /**
    * The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition operations, passing base64-encoded image bytes isn't supported.  If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes passed using the Bytes field. For more information, see Images in the Amazon Rekognition developer guide.
    */
  var Image: typings.awsSdk.clientsRekognitionMod.Image
  
  /**
    * The maximum number of faces to index. The value of MaxFaces must be greater than or equal to 1. IndexFaces returns no more than 100 detected faces in an image, even if you specify a larger value for MaxFaces. If IndexFaces detects more faces than the value of MaxFaces, the faces with the lowest quality are filtered out first. If there are still more faces than the value of MaxFaces, the faces with the smallest bounding boxes are filtered out (up to the number that's needed to satisfy the value of MaxFaces). Information about the unindexed faces is available in the UnindexedFaces array.  The faces that are returned by IndexFaces are sorted by the largest face bounding box size to the smallest size, in descending order.  MaxFaces can be used with a collection associated with any version of the face model.
    */
  var MaxFaces: js.UndefOr[MaxFacesToIndex] = js.undefined
  
  /**
    * A filter that specifies a quality bar for how much filtering is done to identify faces. Filtered faces aren't indexed. If you specify AUTO, Amazon Rekognition chooses the quality bar. If you specify LOW, MEDIUM, or HIGH, filtering removes all faces that don’t meet the chosen quality bar. The default value is AUTO. The quality bar is based on a variety of common use cases. Low-quality detections can occur for a number of reasons. Some examples are an object that's misidentified as a face, a face that's too blurry, or a face with a pose that's too extreme to use. If you specify NONE, no filtering is performed.  To use quality filtering, the collection you are using must be associated with version 3 of the face model or higher.
    */
  var QualityFilter: js.UndefOr[typings.awsSdk.clientsRekognitionMod.QualityFilter] = js.undefined
}
object IndexFacesRequest {
  
  inline def apply(CollectionId: CollectionId, Image: Image): IndexFacesRequest = {
    val __obj = js.Dynamic.literal(CollectionId = CollectionId.asInstanceOf[js.Any], Image = Image.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexFacesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndexFacesRequest] (val x: Self) extends AnyVal {
    
    inline def setCollectionId(value: CollectionId): Self = StObject.set(x, "CollectionId", value.asInstanceOf[js.Any])
    
    inline def setDetectionAttributes(value: Attributes): Self = StObject.set(x, "DetectionAttributes", value.asInstanceOf[js.Any])
    
    inline def setDetectionAttributesUndefined: Self = StObject.set(x, "DetectionAttributes", js.undefined)
    
    inline def setDetectionAttributesVarargs(value: Attribute*): Self = StObject.set(x, "DetectionAttributes", js.Array(value*))
    
    inline def setExternalImageId(value: ExternalImageId): Self = StObject.set(x, "ExternalImageId", value.asInstanceOf[js.Any])
    
    inline def setExternalImageIdUndefined: Self = StObject.set(x, "ExternalImageId", js.undefined)
    
    inline def setImage(value: Image): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
    
    inline def setMaxFaces(value: MaxFacesToIndex): Self = StObject.set(x, "MaxFaces", value.asInstanceOf[js.Any])
    
    inline def setMaxFacesUndefined: Self = StObject.set(x, "MaxFaces", js.undefined)
    
    inline def setQualityFilter(value: QualityFilter): Self = StObject.set(x, "QualityFilter", value.asInstanceOf[js.Any])
    
    inline def setQualityFilterUndefined: Self = StObject.set(x, "QualityFilter", js.undefined)
  }
}
