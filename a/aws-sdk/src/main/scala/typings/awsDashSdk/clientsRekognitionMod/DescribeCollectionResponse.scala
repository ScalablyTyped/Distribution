package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeCollectionResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the collection.
    */
  var CollectionARN: js.UndefOr[String] = js.undefined
  /**
    * The number of milliseconds since the Unix epoch time until the creation of the collection. The Unix epoch time is 00:00:00 Coordinated Universal Time (UTC), Thursday, 1 January 1970.
    */
  var CreationTimestamp: js.UndefOr[DateTime] = js.undefined
  /**
    * The number of faces that are indexed into the collection. To index faces into a collection, use IndexFaces.
    */
  var FaceCount: js.UndefOr[ULong] = js.undefined
  /**
    * The version of the face model that's used by the collection for face detection. For more information, see Model Versioning in the Amazon Rekognition Developer Guide.
    */
  var FaceModelVersion: js.UndefOr[String] = js.undefined
}

object DescribeCollectionResponse {
  @scala.inline
  def apply(
    CollectionARN: String = null,
    CreationTimestamp: DateTime = null,
    FaceCount: js.UndefOr[ULong] = js.undefined,
    FaceModelVersion: String = null
  ): DescribeCollectionResponse = {
    val __obj = js.Dynamic.literal()
    if (CollectionARN != null) __obj.updateDynamic("CollectionARN")(CollectionARN)
    if (CreationTimestamp != null) __obj.updateDynamic("CreationTimestamp")(CreationTimestamp)
    if (!js.isUndefined(FaceCount)) __obj.updateDynamic("FaceCount")(FaceCount)
    if (FaceModelVersion != null) __obj.updateDynamic("FaceModelVersion")(FaceModelVersion)
    __obj.asInstanceOf[DescribeCollectionResponse]
  }
}

