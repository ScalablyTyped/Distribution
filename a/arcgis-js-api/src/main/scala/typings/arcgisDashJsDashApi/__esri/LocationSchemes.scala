package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationSchemes extends Object {
  /**
    * The ID of the basemap associated with the given schemes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-location.html#LocationSchemes)
    */
  var basemapId: String
  /**
    * The location scheme best suited for the given basemap and geometry type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-location.html#LocationSchemes)
    */
  var primaryScheme: LocationScheme
  /**
    * Additional location schemes that may be used to visualize data of the given geometry type overlaid on the given basemap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-location.html#LocationSchemes)
    */
  var secondarySchemes: js.Array[LocationScheme]
}

object LocationSchemes {
  @scala.inline
  def apply(
    basemapId: String,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    primaryScheme: LocationScheme,
    propertyIsEnumerable: PropertyKey => Boolean,
    secondarySchemes: js.Array[LocationScheme]
  ): LocationSchemes = {
    val __obj = js.Dynamic.literal(basemapId = basemapId, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), primaryScheme = primaryScheme, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), secondarySchemes = secondarySchemes)
  
    __obj.asInstanceOf[LocationSchemes]
  }
}

