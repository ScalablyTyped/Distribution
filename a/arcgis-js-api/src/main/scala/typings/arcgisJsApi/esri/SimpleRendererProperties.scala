package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleRendererProperties
  extends RendererProperties
     with VisualVariablesMixinProperties {
  /**
    * The label for the renderer. This describes what features with the given [symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-SimpleRenderer.html#symbol) represent in the real world. This will display next to the layer's [symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-SimpleRenderer.html#symbol) inside the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widget.  This text is not displayed in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) when [visualVariables](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-SimpleRenderer.html#visualVariables) are used. When the renderer contains [visualVariables](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-SimpleRenderer.html#visualVariables), you should set the `title` property in `legendOptions` on each visual variable to describe the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-SimpleRenderer.html#label)
    */
  var label: js.UndefOr[String] = js.native
  /**
    * The symbol used by the renderer to visualize all features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-SimpleRenderer.html#symbol)
    */
  var symbol: js.UndefOr[SymbolProperties] = js.native
}

object SimpleRendererProperties {
  @scala.inline
  def apply(): SimpleRendererProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimpleRendererProperties]
  }
  @scala.inline
  implicit class SimpleRendererPropertiesOps[Self <: SimpleRendererProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setSymbol(value: SymbolProperties): Self = this.set("symbol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbol: Self = this.set("symbol", js.undefined)
  }
  
}

