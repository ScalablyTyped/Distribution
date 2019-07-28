package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.arcgisDashJsDashApi.IPromise
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait symbolUtils extends js.Object {
  /**
    * Returns a symbol representing the input [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html). This method is useful when you need to know the exact visual properties of a [Graphic's symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#symbol), particularly when the graphic comes from the result of a [hitTest()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#hitTest) and its symbol properties may be empty. A symbol's properties won't be populated when a [Renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html) defines the visualization of a layer rather than symbols set individually on each graphic of a layer. This is the case for [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), and any other layer that has a `renderer` property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolUtils.html#getDisplayedSymbol)
    *
    * @param graphic The graphic from which to retrieve the displayed symbol. This commonly comes from a [hitTest()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#hitTest) operation.
    * @param options Options for generating the display symbol of the input graphic. These must be specified if the input graphic comes from a layer with a renderer that has [visual variables](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-SimpleRenderer.html#visualVariables) applied. See the object specification below.
    * @param options.scale The [view scale](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#scale) at which the symbol is displayed.
    * @param options.viewingMode The [viewingMode](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#viewingMode) of the view, if the symbol is displayed in a SceneView.
    * @param options.spatialReference The spatial reference of the view in which the symbol is displayed.
    * @param options.resolution The [resolution](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#resolution) of the view at which the symbol is displayed.
    *
    */
  def getDisplayedSymbol(graphic: Graphic): IPromise[Symbol] = js.native
  def getDisplayedSymbol(graphic: Graphic, options: symbolUtilsGetDisplayedSymbolOptions): IPromise[Symbol] = js.native
  /**
    * Generates a preview image of a given symbol that can be displayed in a custom widget or other DOM element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolUtils.html#renderPreviewHTML)
    *
    * @param symbol The symbol for which to generate a preview image.
    * @param options Formatting options for the symbol preview image.
    * @param options.node The parent node to append to the symbol.
    * @param options.size The size of the symbol preview in points.
    * @param options.maxSize The maximum size of the symbol preview in points.
    * @param options.opacity The opacity of the layer represented by the `symbol`.
    * @param options.scale Indicates whether to scale the symbol preview.
    * @param options.disableUpsampling Indicates whether to disable upsampling for raster images.
    * @param options.symbolConfig For "tall" symbols in portrait view, then the `tall` value should be used here.
    * @param options.rotation The rotation of the symbol.
    *
    */
  def renderPreviewHTML(symbol: Symbol): IPromise[HTMLElement] = js.native
  def renderPreviewHTML(symbol: Symbol, options: symbolUtilsRenderPreviewHTMLOptions): IPromise[HTMLElement] = js.native
}

