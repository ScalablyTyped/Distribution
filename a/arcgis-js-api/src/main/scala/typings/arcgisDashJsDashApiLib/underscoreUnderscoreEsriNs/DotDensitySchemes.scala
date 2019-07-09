package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DotDensitySchemes
  extends stdLib.Object {
  /**
    * The ID of the basemap associated with the given schemes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-dotDensity.html#DotDensitySchemes)
    */
  var basemapId: java.lang.String
  /**
    * The dot density scheme best suited for the given basemap and geometry type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-dotDensity.html#DotDensitySchemes)
    */
  var primaryScheme: DotDensityScheme
  /**
    * Additional dot density schemes that may be used to visualize data of the given geometry type overlaid on the given basemap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-dotDensity.html#DotDensitySchemes)
    */
  var secondarySchemes: js.Array[DotDensityScheme]
}

object DotDensitySchemes {
  @scala.inline
  def apply(
    basemapId: java.lang.String,
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    primaryScheme: DotDensityScheme,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    secondarySchemes: js.Array[DotDensityScheme]
  ): DotDensitySchemes = {
    val __obj = js.Dynamic.literal(basemapId = basemapId, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), primaryScheme = primaryScheme, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), secondarySchemes = secondarySchemes)
  
    __obj.asInstanceOf[DotDensitySchemes]
  }
}

