package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Symbol3DStyleOrigin extends Object {
  /**
    * name of the symbol in the style referenced by styleName or styleUrl
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3D.html#styleOrigin)
    */
  var name: String
  /**
    * a well-known esri-provided style, such as `EsriThematicShapesStyle`
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3D.html#styleOrigin)
    */
  var styleName: js.UndefOr[String] = js.undefined
  /**
    * url to a style definition
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3D.html#styleOrigin)
    */
  var styleUrl: js.UndefOr[String] = js.undefined
}

object Symbol3DStyleOrigin {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    name: String,
    propertyIsEnumerable: PropertyKey => Boolean,
    styleName: String = null,
    styleUrl: String = null
  ): Symbol3DStyleOrigin = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), name = name, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (styleName != null) __obj.updateDynamic("styleName")(styleName)
    if (styleUrl != null) __obj.updateDynamic("styleUrl")(styleUrl)
    __obj.asInstanceOf[Symbol3DStyleOrigin]
  }
}

