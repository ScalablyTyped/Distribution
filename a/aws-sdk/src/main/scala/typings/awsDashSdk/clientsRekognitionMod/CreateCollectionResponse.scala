package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateCollectionResponse extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the collection. You can use this to manage permissions on your resources. 
    */
  var CollectionArn: js.UndefOr[String] = js.undefined
  /**
    * Version number of the face detection model associated with the collection you are creating.
    */
  var FaceModelVersion: js.UndefOr[String] = js.undefined
  /**
    * HTTP status code indicating the result of the operation.
    */
  var StatusCode: js.UndefOr[UInteger] = js.undefined
}

object CreateCollectionResponse {
  @scala.inline
  def apply(
    CollectionArn: String = null,
    FaceModelVersion: String = null,
    StatusCode: js.UndefOr[UInteger] = js.undefined
  ): CreateCollectionResponse = {
    val __obj = js.Dynamic.literal()
    if (CollectionArn != null) __obj.updateDynamic("CollectionArn")(CollectionArn)
    if (FaceModelVersion != null) __obj.updateDynamic("FaceModelVersion")(FaceModelVersion)
    if (!js.isUndefined(StatusCode)) __obj.updateDynamic("StatusCode")(StatusCode)
    __obj.asInstanceOf[CreateCollectionResponse]
  }
}

