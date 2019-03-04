package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationSchemes
  extends stdLib.Object {
  /**
    * The ID of the basemap associated with the given schemes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-location.html#LocationSchemes)
    */
  var basemapId: java.lang.String
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
    basemapId: java.lang.String,
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    primaryScheme: LocationScheme,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    secondarySchemes: js.Array[LocationScheme]
  ): LocationSchemes = {
    val __obj = js.Dynamic.literal(basemapId = basemapId, constructor = constructor, hasOwnProperty = hasOwnProperty, primaryScheme = primaryScheme, propertyIsEnumerable = propertyIsEnumerable, secondarySchemes = secondarySchemes)
  
    __obj.asInstanceOf[LocationSchemes]
  }
}

