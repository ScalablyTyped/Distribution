package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RendererTitle
  extends stdLib.Object {
  /**
    * The field name used in the renderer. This is used in the generated title of the renderer in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RendererTitle)
    */
  var field: java.lang.String
  /**
    * Indicates if a percentage is used in the normalization of the renderer. This is used to create a more readable legend for that scenario.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RendererTitle)
    */
  var normByPct: scala.Boolean
  /**
    * If a normalization field is provided to the renderer, this field is also used in the generated title for the renderer in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RendererTitle)
    */
  var normField: java.lang.String
  /**
    * The title of the renderer as displayed in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RendererTitle)
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object RendererTitle {
  @scala.inline
  def apply(
    constructor: js.Function,
    field: java.lang.String,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    normByPct: scala.Boolean,
    normField: java.lang.String,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    title: java.lang.String = null
  ): RendererTitle = {
    val __obj = js.Dynamic.literal(constructor = constructor, field = field, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), normByPct = normByPct, normField = normField, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[RendererTitle]
  }
}

