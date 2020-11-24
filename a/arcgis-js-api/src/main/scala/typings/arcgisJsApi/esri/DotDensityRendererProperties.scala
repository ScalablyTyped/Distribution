package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DotDensityRendererProperties extends RendererProperties {
  
  /**
    * Defines the variable(s) used to visualize density.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#attributes)
    */
  var attributes: js.UndefOr[js.Array[AttributeColorInfoProperties]] = js.native
  
  /**
    * The color used to shade the polygon fill behind the dots.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#backgroundColor)
    */
  var backgroundColor: js.UndefOr[Color_ | js.Array[Double] | String] = js.native
  
  /**
    * Only applicable when two or more [attributes](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#attributes) are specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#dotBlendingEnabled)
    */
  var dotBlendingEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Defines the initial dot value used for visualizing density.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#dotValue)
    */
  var dotValue: js.UndefOr[Double] = js.native
  
  /**
    * An object providing options for configuring the renderer in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#legendOptions)
    */
  var legendOptions: js.UndefOr[DotDensityRendererLegendOptions] = js.native
  
  /**
    * The outline of the polygon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#outline)
    */
  var outline: js.UndefOr[SimpleLineSymbolProperties] = js.native
  
  /**
    * When defined, the renderer will recalculate the dot value linearly based on the change in the view's scale using the [calculateDotValue()](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#calculateDotValue) method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#referenceScale)
    */
  var referenceScale: js.UndefOr[Double] = js.native
  
  /**
    * When set to a consistent value, dot placements will be preserved for the same scale given all parameters are the same in the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#seed)
    */
  var seed: js.UndefOr[Double] = js.native
  
  /**
    * An array of [Size Visual Variable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html) objects.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#visualVariables)
    */
  var visualVariables: js.UndefOr[js.Array[VisualVariableProperties]] = js.native
}
object DotDensityRendererProperties {
  
  @scala.inline
  def apply(): DotDensityRendererProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DotDensityRendererProperties]
  }
  
  @scala.inline
  implicit class DotDensityRendererPropertiesOps[Self <: DotDensityRendererProperties] (val x: Self) extends AnyVal {
    
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
    def setAttributesVarargs(value: AttributeColorInfoProperties*): Self = this.set("attributes", js.Array(value :_*))
    
    @scala.inline
    def setAttributes(value: js.Array[AttributeColorInfoProperties]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setBackgroundColorVarargs(value: Double*): Self = this.set("backgroundColor", js.Array(value :_*))
    
    @scala.inline
    def setBackgroundColor(value: Color_ | js.Array[Double] | String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setDotBlendingEnabled(value: Boolean): Self = this.set("dotBlendingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDotBlendingEnabled: Self = this.set("dotBlendingEnabled", js.undefined)
    
    @scala.inline
    def setDotValue(value: Double): Self = this.set("dotValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDotValue: Self = this.set("dotValue", js.undefined)
    
    @scala.inline
    def setLegendOptions(value: DotDensityRendererLegendOptions): Self = this.set("legendOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegendOptions: Self = this.set("legendOptions", js.undefined)
    
    @scala.inline
    def setOutline(value: SimpleLineSymbolProperties): Self = this.set("outline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutline: Self = this.set("outline", js.undefined)
    
    @scala.inline
    def setReferenceScale(value: Double): Self = this.set("referenceScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferenceScale: Self = this.set("referenceScale", js.undefined)
    
    @scala.inline
    def setSeed(value: Double): Self = this.set("seed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeed: Self = this.set("seed", js.undefined)
    
    @scala.inline
    def setVisualVariablesVarargs(value: VisualVariableProperties*): Self = this.set("visualVariables", js.Array(value :_*))
    
    @scala.inline
    def setVisualVariables(value: js.Array[VisualVariableProperties]): Self = this.set("visualVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisualVariables: Self = this.set("visualVariables", js.undefined)
  }
}
