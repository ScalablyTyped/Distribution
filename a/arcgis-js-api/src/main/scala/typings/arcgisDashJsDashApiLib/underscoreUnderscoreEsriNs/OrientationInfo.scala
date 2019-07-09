package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrientationInfo
  extends stdLib.Object {
  /**
    * The identifer for the orientation info.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#OrientationInfo)
    */
  var id: js.UndefOr[scala.Double] = js.undefined
  /**
    * Indicates whether the image displays mirrored.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#OrientationInfo)
    */
  var mirrored: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The rotation value for the attached image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#OrientationInfo)
    */
  var rotation: js.UndefOr[scala.Double] = js.undefined
}

object OrientationInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    id: scala.Int | scala.Double = null,
    mirrored: js.UndefOr[scala.Boolean] = js.undefined,
    rotation: scala.Int | scala.Double = null
  ): OrientationInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(mirrored)) __obj.updateDynamic("mirrored")(mirrored)
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrientationInfo]
  }
}

