package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RendererResult
  extends stdLib.Object {
  /**
    * The ID of the basemap used to determine the optimal colors of the dots.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-dotDensity.html#RendererResult)
    */
  var basemapId: java.lang.String
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
    basemapId: java.lang.String,
    constructor: js.Function,
    dotDensityScheme: DotDensityScheme,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    renderer: DotDensityRenderer
  ): RendererResult = {
    val __obj = js.Dynamic.literal(basemapId = basemapId, constructor = constructor, dotDensityScheme = dotDensityScheme, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), renderer = renderer)
  
    __obj.asInstanceOf[RendererResult]
  }
}

