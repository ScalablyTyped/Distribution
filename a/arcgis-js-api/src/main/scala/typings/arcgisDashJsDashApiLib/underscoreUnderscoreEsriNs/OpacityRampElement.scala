package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpacityRampElement
  extends stdLib.Object
     with LegendElement {
  /**
    * The color of the border surrounding the ramp. This corresponds with the outline color defined in the default symbol of the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#OpacityRampElement)
    */
  var borderColor: Color
  /**
    * The individual opacity stops rendered in the legend that correspond to the opacity visual variable in the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#OpacityRampElement)
    */
  var infos: js.Array[OpacityRampStop]
  /**
    * The overlay color of the color ramp. This is typically transparent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#OpacityRampElement)
    */
  var overlayColor: Color
  /**
    * The title of the opacity ramp as displayed in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#OpacityRampElement)
    */
  var title: js.UndefOr[java.lang.String | RampTitle] = js.undefined
  /**
    * The type of this element is always `opacity-ramp`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#OpacityRampElement)
    */
  var `type`: java.lang.String
}

object OpacityRampElement {
  @scala.inline
  def apply(
    borderColor: Color,
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    infos: js.Array[OpacityRampStop],
    overlayColor: Color,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    `type`: java.lang.String,
    title: java.lang.String | RampTitle = null
  ): OpacityRampElement = {
    val __obj = js.Dynamic.literal(borderColor = borderColor, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), infos = infos, overlayColor = overlayColor, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpacityRampElement]
  }
}

