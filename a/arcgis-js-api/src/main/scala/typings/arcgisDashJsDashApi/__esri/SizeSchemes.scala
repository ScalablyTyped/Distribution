package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeSchemes extends Object {
  /**
    * The ID of the basemap associated with the given schemes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-size.html#SizeSchemes)
    */
  var basemapId: String
  /**
    * The size scheme best suited for the given basemap and geometry type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-size.html#SizeSchemes)
    */
  var primaryScheme: SizeScheme
  /**
    * Additional size schemes that may be used to visualize data of the given geometry type overlaid on the given basemap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-size.html#SizeSchemes)
    */
  var secondarySchemes: js.Array[SizeScheme]
}

object SizeSchemes {
  @scala.inline
  def apply(
    basemapId: String,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    primaryScheme: SizeScheme,
    propertyIsEnumerable: PropertyKey => Boolean,
    secondarySchemes: js.Array[SizeScheme]
  ): SizeSchemes = {
    val __obj = js.Dynamic.literal(basemapId = basemapId, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), primaryScheme = primaryScheme, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), secondarySchemes = secondarySchemes)
  
    __obj.asInstanceOf[SizeSchemes]
  }
}

