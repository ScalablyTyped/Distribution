package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndexFacesRequest extends js.Object {
  /**
    * The ID of an existing collection to which you want to add the faces that are detected in the input images.
    */
  var CollectionId: typings.awsDashSdk.clientsRekognitionMod.CollectionId = js.native
  /**
    * An array of facial attributes that you want to be returned. This can be the default list of attributes or all attributes. If you don't specify a value for Attributes or if you specify ["DEFAULT"], the API returns the following subset of facial attributes: BoundingBox, Confidence, Pose, Quality, and Landmarks. If you provide ["ALL"], all facial attributes are returned, but the operation takes longer to complete. If you provide both, ["ALL", "DEFAULT"], the service uses a logical AND operator to determine which attributes to return (in this case, all attributes). 
    */
  var DetectionAttributes: js.UndefOr[Attributes] = js.native
  /**
    * The ID you want to assign to all the faces detected in the image.
    */
  var ExternalImageId: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.ExternalImageId] = js.native
  /**
    * The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition operations, passing base64-encoded image bytes isn't supported.  If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes passed using the Bytes field. For more information, see Images in the Amazon Rekognition developer guide.
    */
  var Image: typings.awsDashSdk.clientsRekognitionMod.Image = js.native
  /**
    * The maximum number of faces to index. The value of MaxFaces must be greater than or equal to 1. IndexFaces returns no more than 100 detected faces in an image, even if you specify a larger value for MaxFaces. If IndexFaces detects more faces than the value of MaxFaces, the faces with the lowest quality are filtered out first. If there are still more faces than the value of MaxFaces, the faces with the smallest bounding boxes are filtered out (up to the number that's needed to satisfy the value of MaxFaces). Information about the unindexed faces is available in the UnindexedFaces array.  The faces that are returned by IndexFaces are sorted by the largest face bounding box size to the smallest size, in descending order.  MaxFaces can be used with a collection associated with any version of the face model.
    */
  var MaxFaces: js.UndefOr[MaxFacesToIndex] = js.native
  /**
    * A filter that specifies a quality bar for how much filtering is done to identify faces. Filtered faces aren't indexed. If you specify AUTO, Amazon Rekognition chooses the quality bar. If you specify LOW, MEDIUM, or HIGH, filtering removes all faces that don’t meet the chosen quality bar. The default value is AUTO. The quality bar is based on a variety of common use cases. Low-quality detections can occur for a number of reasons. Some examples are an object that's misidentified as a face, a face that's too blurry, or a face with a pose that's too extreme to use. If you specify NONE, no filtering is performed.  To use quality filtering, the collection you are using must be associated with version 3 of the face model or higher.
    */
  var QualityFilter: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.QualityFilter] = js.native
}

object IndexFacesRequest {
  @scala.inline
  def apply(
    CollectionId: CollectionId,
    Image: Image,
    DetectionAttributes: Attributes = null,
    ExternalImageId: ExternalImageId = null,
    MaxFaces: Int | Double = null,
    QualityFilter: QualityFilter = null
  ): IndexFacesRequest = {
    val __obj = js.Dynamic.literal(CollectionId = CollectionId.asInstanceOf[js.Any], Image = Image.asInstanceOf[js.Any])
    if (DetectionAttributes != null) __obj.updateDynamic("DetectionAttributes")(DetectionAttributes.asInstanceOf[js.Any])
    if (ExternalImageId != null) __obj.updateDynamic("ExternalImageId")(ExternalImageId.asInstanceOf[js.Any])
    if (MaxFaces != null) __obj.updateDynamic("MaxFaces")(MaxFaces.asInstanceOf[js.Any])
    if (QualityFilter != null) __obj.updateDynamic("QualityFilter")(QualityFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexFacesRequest]
  }
}

