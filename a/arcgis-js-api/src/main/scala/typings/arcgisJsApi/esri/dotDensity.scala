package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This object contains a helper method for generating a [dot density visualization](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html). The [createRenderer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-dotDensity.html#createRenderer) method uses the input basemap to determine the most appropriate dot color for each attribute. It also queries the layer for spatial statistics to determine an appropriate [dot value](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#dotValue) for the given scale. The starting dot value isn't necessarily what will work best for your data. Rather, it is a suggestion that should give you a good starting point for authoring a dot density renderer.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-dotDensity.html)
  */
trait dotDensity extends js.Object {
  /**
    * Generates a [DotDensityRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html) based on one or more complementary numeric fields and/or Arcade expressions. This method will determine an appropriate [dotValue](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#dotValue) for the data at the scale of the provided view.  For example, suppose you have a layer of U.S. counties with fields containing the total sales of various crops: wheat, soybeans, corn, cotton, and vegetables. If a feature has the following values for each field:
    *
    * Field Name | Count | Color
    * -----------|-------|------
    * Wheat | 140 | purple
    * Soybeans | 2000 | blue
    * Corn | 0 | yellow
    * Cotton | 300 | green
    * Vegetables | 120 | red
    *
    * This method will generate a renderer that may determine the `dotValue` should be `20`. The feature with the data above will be rendered with a random placement of 6 purple dots, 100 blue dots, no yellow dots, 60 green dots, and 5 red dots.  The suggested value is calculated based on a sampling of features. So executing this method multiple times using the same parameters may yield varied results.  Other options are provided for convenience for more involved custom visualization authoring applications.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-dotDensity.html#createRenderer)
    *
    * @param params Input parameters for generating a dot density visualization based on a set of complementary numeric field(s). See the table below for details of each parameter.
    * @param params.layer The **polygon** layer for which the visualization is generated.
    * @param params.view The MapView instance in which the visualization will be rendered.
    * @param params.attributes A set of complementary numeric fields/expressions used as the basis of the dot density visualization. For example, if creating an election map, you would indicate the names of each field representing the candidate or political party where total votes are stored.
    * @param params.basemap The [named string](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) or basemap object of the Esri basemap that will be paired with the output visualization. Determines optimal colors for the output renderer.
    * @param params.dotValueOptimizationEnabled Indicates whether to vary the value of each dot by the view's scale. This will set the [referenceScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#referenceScale) of the output renderer.
    * @param params.dotBlendingEnabled Indicates whether to enable color blending of different colored dots rendered at the same pixel. This is only visible in highly dense and highly diverse features.
    * @param params.outlineOptimizationEnabled Indicates whether the polygon outline width should vary based on view scale. When false, no outline will be used in the output renderer.
    * @param params.legendOptions Provides options for modifying [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) properties describing the visualization.
    * @param params.dotDensityScheme In authoring apps, the user may select a pre-defined dot density scheme. Pass the scheme object to this property to avoid getting one based on the `basemap`.
    * @param params.signal Allows for cancelable requests. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    */
  def createRenderer(params: dotDensityCreateRendererParams): js.Promise[RendererResult]
}

object dotDensity {
  @scala.inline
  def apply(createRenderer: dotDensityCreateRendererParams => js.Promise[RendererResult]): dotDensity = {
    val __obj = js.Dynamic.literal(createRenderer = js.Any.fromFunction1(createRenderer))
    __obj.asInstanceOf[dotDensity]
  }
}

