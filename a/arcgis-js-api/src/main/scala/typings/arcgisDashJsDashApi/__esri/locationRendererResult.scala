package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait locationRendererResult extends Object {
  /**
    * The ID of the basemap used to determine the optimal fill color of the features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-location.html#RendererResult)
    */
  var basemapId: String
  /**
    * The location scheme used by the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-location.html#RendererResult)
    */
  var locationScheme: LocationScheme
  /**
    * A simple renderer configured with a single color best suited to match the given basemap. Set this to a layer's `renderer` property to update its visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-location.html#RendererResult)
    */
  var renderer: SimpleRenderer
}

object locationRendererResult {
  @scala.inline
  def apply(
    basemapId: String,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    locationScheme: LocationScheme,
    propertyIsEnumerable: PropertyKey => Boolean,
    renderer: SimpleRenderer
  ): locationRendererResult = {
    val __obj = js.Dynamic.literal(basemapId = basemapId, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), locationScheme = locationScheme, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), renderer = renderer)
  
    __obj.asInstanceOf[locationRendererResult]
  }
}

