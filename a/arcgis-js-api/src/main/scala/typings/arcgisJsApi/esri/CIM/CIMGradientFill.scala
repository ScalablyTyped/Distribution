package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMGradientFill
  extends CIMSymbolLayerBase
     with CIMSymbolLayerType {
  
  /**
    * The angle of the gradient when the GradientMethod is set to Linear or Rectangular.
    */
  var angle: js.UndefOr[Double] = js.native
  
  /**
    * The color scheme that is applied to the fill.
    */
  var colorRamp: js.UndefOr[js.Any] = js.native
  
  /**
    * A value which specifies how the gradient is applied within the fill.
    */
  var gradientMethod: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GradientFillMethod * / any */ String
  ] = js.native
  
  /**
    * A value which determines how much of the feature is covered by the color scheme. This is either a percentage of the total area which the color scheme spans or the number of page units from the starting point at which the gradient displays.
    */
  var gradientSize: js.UndefOr[Double] = js.native
  
  /**
    * A value which specifies whether GradientSize is applied with an absolute distance or a relative percentage.
    */
  var gradientSizeUnits: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SymbolUnits * / any */ String
  ] = js.native
  
  /**
    * A value which specifies if the gradient is applied with discrete intervals or if it is continuous.
    */
  var gradientType: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GradientStrokeType * / any */ String
  ] = js.native
  
  /**
    * How many bands draw when the GradientType is set to Discrete.
    */
  var interval: js.UndefOr[Double] = js.native
  
  @JSName("type")
  var type_CIMGradientFill: typings.arcgisJsApi.arcgisJsApiStrings.CIMGradientFill = js.native
}
object CIMGradientFill {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMGradientFill): CIMGradientFill = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMGradientFill]
  }
  
  @scala.inline
  implicit class CIMGradientFillMutableBuilder[Self <: CIMGradientFill] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    @scala.inline
    def setColorRamp(value: js.Any): Self = StObject.set(x, "colorRamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorRampUndefined: Self = StObject.set(x, "colorRamp", js.undefined)
    
    @scala.inline
    def setGradientMethod(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GradientFillMethod * / any */ String
    ): Self = StObject.set(x, "gradientMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientMethodUndefined: Self = StObject.set(x, "gradientMethod", js.undefined)
    
    @scala.inline
    def setGradientSize(value: Double): Self = StObject.set(x, "gradientSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientSizeUndefined: Self = StObject.set(x, "gradientSize", js.undefined)
    
    @scala.inline
    def setGradientSizeUnits(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SymbolUnits * / any */ String
    ): Self = StObject.set(x, "gradientSizeUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientSizeUnitsUndefined: Self = StObject.set(x, "gradientSizeUnits", js.undefined)
    
    @scala.inline
    def setGradientType(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GradientStrokeType * / any */ String
    ): Self = StObject.set(x, "gradientType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientTypeUndefined: Self = StObject.set(x, "gradientType", js.undefined)
    
    @scala.inline
    def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    @scala.inline
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMGradientFill): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
