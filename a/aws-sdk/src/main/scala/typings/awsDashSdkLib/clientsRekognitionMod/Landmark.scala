package typings
package awsDashSdkLib.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Landmark extends js.Object {
  /**
    * Type of landmark.
    */
  var Type: js.UndefOr[LandmarkType] = js.undefined
  /**
    * The x-coordinate from the top left of the landmark expressed as the ratio of the width of the image. For example, if the image is 700 x 200 and the x-coordinate of the landmark is at 350 pixels, this value is 0.5. 
    */
  var X: js.UndefOr[Float] = js.undefined
  /**
    * The y-coordinate from the top left of the landmark expressed as the ratio of the height of the image. For example, if the image is 700 x 200 and the y-coordinate of the landmark is at 100 pixels, this value is 0.5.
    */
  var Y: js.UndefOr[Float] = js.undefined
}

object Landmark {
  @scala.inline
  def apply(
    Type: LandmarkType = null,
    X: js.UndefOr[Float] = js.undefined,
    Y: js.UndefOr[Float] = js.undefined
  ): Landmark = {
    val __obj = js.Dynamic.literal()
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (!js.isUndefined(X)) __obj.updateDynamic("X")(X)
    if (!js.isUndefined(Y)) __obj.updateDynamic("Y")(Y)
    __obj.asInstanceOf[Landmark]
  }
}

