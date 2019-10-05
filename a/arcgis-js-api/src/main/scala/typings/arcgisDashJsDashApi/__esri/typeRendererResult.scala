package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait typeRendererResult extends Object {
  /**
    * The ID of the basemap used to determine the optimal color scheme to represent the categorical variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-type.html#RendererResult)
    */
  var basemapId: String
  /**
    * An array of objects describing the values or categories excluded from consideration in visualizing data from the given field. The specification of each object matches that of the objects specified in the `uniqueValueInfos` property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-type.html#RendererResult)
    */
  var excludedUniqueValueInfos: js.Array[_]
  /**
    * The renderer object configured to best match the given basemap. Set this on a layer's `renderer` property to update its visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-type.html#RendererResult)
    */
  var renderer: UniqueValueRenderer
  /**
    * The scheme used to represent each category within the `uniqueValueInfos`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-type.html#RendererResult)
    */
  var typeScheme: TypeScheme
  /**
    * An array of objects describing the value, symbol, and count of each unique type or category represented in the renderer. See the table below describing each property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-type.html#RendererResult)
    */
  var uniqueValueInfos: js.Array[typeUniqueValueInfo]
}

object typeRendererResult {
  @scala.inline
  def apply(
    basemapId: String,
    constructor: js.Function,
    excludedUniqueValueInfos: js.Array[_],
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    renderer: UniqueValueRenderer,
    typeScheme: TypeScheme,
    uniqueValueInfos: js.Array[typeUniqueValueInfo]
  ): typeRendererResult = {
    val __obj = js.Dynamic.literal(basemapId = basemapId, constructor = constructor, excludedUniqueValueInfos = excludedUniqueValueInfos, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), renderer = renderer, typeScheme = typeScheme, uniqueValueInfos = uniqueValueInfos)
  
    __obj.asInstanceOf[typeRendererResult]
  }
}

