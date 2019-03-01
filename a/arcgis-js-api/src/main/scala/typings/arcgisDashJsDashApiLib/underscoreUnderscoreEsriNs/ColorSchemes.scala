package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorSchemes
  extends stdLib.Object {
  /**
    * The ID of the basemap associated with the given schemes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-color.html#ColorSchemes)
    */
  var basemapId: java.lang.String
  /**
    * The color scheme best suited for the given basemap and geometry type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-color.html#ColorSchemes)
    */
  var primaryScheme: ColorScheme
  /**
    * Additional color schemes that may be used to visualize data of the given geometry type overlaid on the given basemap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-color.html#ColorSchemes)
    */
  var secondarySchemes: js.Array[ColorScheme]
}

object ColorSchemes {
  @scala.inline
  def apply(
    basemapId: java.lang.String,
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    primaryScheme: ColorScheme,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    secondarySchemes: js.Array[ColorScheme]
  ): ColorSchemes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("basemapId")(basemapId)
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("primaryScheme")(primaryScheme)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.updateDynamic("secondarySchemes")(secondarySchemes)
    __obj.asInstanceOf[ColorSchemes]
  }
}

