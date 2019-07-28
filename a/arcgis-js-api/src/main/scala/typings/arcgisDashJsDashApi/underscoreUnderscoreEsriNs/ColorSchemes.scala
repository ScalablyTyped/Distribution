package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorSchemes extends Object {
  /**
    * The ID of the basemap associated with the given schemes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-color.html#ColorSchemes)
    */
  var basemapId: String
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
    basemapId: String,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    primaryScheme: ColorScheme,
    propertyIsEnumerable: PropertyKey => Boolean,
    secondarySchemes: js.Array[ColorScheme]
  ): ColorSchemes = {
    val __obj = js.Dynamic.literal(basemapId = basemapId, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), primaryScheme = primaryScheme, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), secondarySchemes = secondarySchemes)
  
    __obj.asInstanceOf[ColorSchemes]
  }
}

