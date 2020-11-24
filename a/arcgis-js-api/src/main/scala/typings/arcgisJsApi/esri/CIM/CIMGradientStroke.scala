package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMGradientStroke
  extends CIMStroke
     with CIMSymbolLayerType {
  
  /**
    * The color scheme that is applied to the stroke.
    */
  var colorRamp: js.UndefOr[js.Any] = js.native
  
  /**
    * How the gradient is applied along the stroke.
    */
  var gradientMethod: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GradientStrokeMethod * / any */ String
  ] = js.native
  
  /**
    * How much of the feature is covered by the color scheme. This is either a percentage of the total area which the color scheme spans or the number of page units from the starting point at which the gradient displays.
    */
  var gradientSize: js.UndefOr[Double] = js.native
  
  /**
    * Whether GradientSize is applied with an absolute distance or a relative percentage.
    */
  var gradientSizeUnits: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SymbolUnits * / any */ String
  ] = js.native
  
  /**
    * Whether the gradient is applied with discrete or continuous intervals.
    */
  var gradientType: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GradientStrokeType * / any */ String
  ] = js.native
  
  /**
    * How many bands draw when the GradientType is set to Discrete.
    */
  var interval: js.UndefOr[Double] = js.native
  
  @JSName("type")
  var type_CIMGradientStroke: typings.arcgisJsApi.arcgisJsApiStrings.CIMGradientStroke = js.native
}
object CIMGradientStroke {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMGradientStroke): CIMGradientStroke = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMGradientStroke]
  }
  
  @scala.inline
  implicit class CIMGradientStrokeOps[Self <: CIMGradientStroke] (val x: Self) extends AnyVal {
    
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
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMGradientStroke): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorRamp(value: js.Any): Self = this.set("colorRamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorRamp: Self = this.set("colorRamp", js.undefined)
    
    @scala.inline
    def setGradientMethod(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GradientStrokeMethod * / any */ String
    ): Self = this.set("gradientMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGradientMethod: Self = this.set("gradientMethod", js.undefined)
    
    @scala.inline
    def setGradientSize(value: Double): Self = this.set("gradientSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGradientSize: Self = this.set("gradientSize", js.undefined)
    
    @scala.inline
    def setGradientSizeUnits(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SymbolUnits * / any */ String
    ): Self = this.set("gradientSizeUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGradientSizeUnits: Self = this.set("gradientSizeUnits", js.undefined)
    
    @scala.inline
    def setGradientType(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GradientStrokeType * / any */ String
    ): Self = this.set("gradientType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGradientType: Self = this.set("gradientType", js.undefined)
    
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
  }
}
