package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeSchemes extends Object {
  /**
    * The ID of the basemap associated with the given schemes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-type.html#TypeSchemes)
    */
  var basemapId: String
  /**
    * The type scheme best suited for the given basemap and geometry type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-type.html#TypeSchemes)
    */
  var primaryScheme: TypeScheme
  /**
    * Additional type schemes that may be used to visualize data of the given geometry type overlaid on the given basemap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-type.html#TypeSchemes)
    */
  var secondarySchemes: js.Array[TypeScheme]
}

object TypeSchemes {
  @scala.inline
  def apply(
    basemapId: String,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    primaryScheme: TypeScheme,
    propertyIsEnumerable: PropertyKey => Boolean,
    secondarySchemes: js.Array[TypeScheme]
  ): TypeSchemes = {
    val __obj = js.Dynamic.literal(basemapId = basemapId, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), primaryScheme = primaryScheme, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), secondarySchemes = secondarySchemes)
  
    __obj.asInstanceOf[TypeSchemes]
  }
}

