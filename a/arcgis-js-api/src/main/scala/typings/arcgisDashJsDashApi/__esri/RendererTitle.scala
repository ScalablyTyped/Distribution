package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RendererTitle extends Object {
  /**
    * The field name used in the renderer. This is used in the generated title of the renderer in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RendererTitle)
    */
  var field: String
  /**
    * Indicates if a percentage is used in the normalization of the renderer. This is used to create a more readable legend for that scenario.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RendererTitle)
    */
  var normByPct: Boolean
  /**
    * If a normalization field is provided to the renderer, this field is also used in the generated title for the renderer in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RendererTitle)
    */
  var normField: String
  /**
    * The title of the renderer as displayed in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RendererTitle)
    */
  var title: js.UndefOr[String] = js.undefined
}

object RendererTitle {
  @scala.inline
  def apply(
    constructor: js.Function,
    field: String,
    hasOwnProperty: PropertyKey => Boolean,
    normByPct: Boolean,
    normField: String,
    propertyIsEnumerable: PropertyKey => Boolean,
    title: String = null
  ): RendererTitle = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), normByPct = normByPct.asInstanceOf[js.Any], normField = normField.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[RendererTitle]
  }
}

