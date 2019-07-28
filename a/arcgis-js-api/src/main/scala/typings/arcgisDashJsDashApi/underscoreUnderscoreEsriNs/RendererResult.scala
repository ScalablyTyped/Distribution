package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RendererResult extends Object {
  /**
    * The ID of the basemap used to determine the optimal colors of the dots.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-dotDensity.html#RendererResult)
    */
  var basemapId: String
  /**
    * The dot density scheme used by the renderer based on the given basemap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-dotDensity.html#RendererResult)
    */
  var dotDensityScheme: DotDensityScheme
  /**
    * The object representing the dot density visualization. Set this on a layer's `renderer` property to update its visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-dotDensity.html#RendererResult)
    */
  var renderer: DotDensityRenderer
}

object RendererResult {
  @scala.inline
  def apply(
    basemapId: String,
    constructor: js.Function,
    dotDensityScheme: DotDensityScheme,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    renderer: DotDensityRenderer
  ): RendererResult = {
    val __obj = js.Dynamic.literal(basemapId = basemapId, constructor = constructor, dotDensityScheme = dotDensityScheme, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), renderer = renderer)
  
    __obj.asInstanceOf[RendererResult]
  }
}

