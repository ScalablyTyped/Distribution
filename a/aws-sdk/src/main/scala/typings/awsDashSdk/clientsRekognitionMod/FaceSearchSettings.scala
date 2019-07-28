package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FaceSearchSettings extends js.Object {
  /**
    * The ID of a collection that contains faces that you want to search for.
    */
  var CollectionId: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.CollectionId] = js.undefined
  /**
    * Minimum face match confidence score that must be met to return a result for a recognized face. Default is 70. 0 is the lowest confidence. 100 is the highest confidence.
    */
  var FaceMatchThreshold: js.UndefOr[Percent] = js.undefined
}

object FaceSearchSettings {
  @scala.inline
  def apply(CollectionId: CollectionId = null, FaceMatchThreshold: js.UndefOr[Percent] = js.undefined): FaceSearchSettings = {
    val __obj = js.Dynamic.literal()
    if (CollectionId != null) __obj.updateDynamic("CollectionId")(CollectionId)
    if (!js.isUndefined(FaceMatchThreshold)) __obj.updateDynamic("FaceMatchThreshold")(FaceMatchThreshold)
    __obj.asInstanceOf[FaceSearchSettings]
  }
}

