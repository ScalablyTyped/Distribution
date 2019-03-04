package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Symbol3DStyleOrigin
  extends stdLib.Object {
  /**
    * name of the symbol in the style referenced by styleName or styleUrl
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3D.html#styleOrigin)
    */
  var name: java.lang.String
  /**
    * a well-known esri-provided style, such as `EsriThematicShapesStyle`
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3D.html#styleOrigin)
    */
  var styleName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * url to a style definition
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3D.html#styleOrigin)
    */
  var styleUrl: js.UndefOr[java.lang.String] = js.undefined
}

object Symbol3DStyleOrigin {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    name: java.lang.String,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    styleName: java.lang.String = null,
    styleUrl: java.lang.String = null
  ): Symbol3DStyleOrigin = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, name = name, propertyIsEnumerable = propertyIsEnumerable)
    if (styleName != null) __obj.updateDynamic("styleName")(styleName)
    if (styleUrl != null) __obj.updateDynamic("styleUrl")(styleUrl)
    __obj.asInstanceOf[Symbol3DStyleOrigin]
  }
}

