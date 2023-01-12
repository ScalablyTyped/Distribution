package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMGradientFill
  extends StObject
     with CIMSymbolLayerBase
     with CIMSymbolLayerType {
  
  /**
    * The angle of the gradient when the GradientMethod is set to Linear or Rectangular.
    */
  var angle: js.UndefOr[Double] = js.undefined
  
  /**
    * The color scheme that is applied to the fill.
    */
  var colorRamp: js.UndefOr[Any] = js.undefined
  
  /**
    * A value which specifies how the gradient is applied within the fill.
    */
  var gradientMethod: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GradientFillMethod * / any */ String
  ] = js.undefined
  
  /**
    * A value which determines how much of the feature is covered by the color scheme. This is either a percentage of the total area which the color scheme spans or the number of page units from the starting point at which the gradient displays.
    */
  var gradientSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A value which specifies whether GradientSize is applied with an absolute distance or a relative percentage.
    */
  var gradientSizeUnits: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SymbolUnits * / any */ String
  ] = js.undefined
  
  /**
    * A value which specifies if the gradient is applied with discrete intervals or if it is continuous.
    */
  var gradientType: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GradientStrokeType * / any */ String
  ] = js.undefined
  
  /**
    * How many bands draw when the GradientType is set to Discrete.
    */
  var interval: js.UndefOr[Double] = js.undefined
  
  @JSName("type")
  var type_CIMGradientFill: typings.arcgisJsApi.arcgisJsApiStrings.CIMGradientFill
}
object CIMGradientFill {
  
  inline def apply(): CIMGradientFill = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMGradientFill")
    __obj.asInstanceOf[CIMGradientFill]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CIMGradientFill] (val x: Self) extends AnyVal {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    inline def setColorRamp(value: Any): Self = StObject.set(x, "colorRamp", value.asInstanceOf[js.Any])
    
    inline def setColorRampUndefined: Self = StObject.set(x, "colorRamp", js.undefined)
    
    inline def setGradientMethod(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GradientFillMethod * / any */ String
    ): Self = StObject.set(x, "gradientMethod", value.asInstanceOf[js.Any])
    
    inline def setGradientMethodUndefined: Self = StObject.set(x, "gradientMethod", js.undefined)
    
    inline def setGradientSize(value: Double): Self = StObject.set(x, "gradientSize", value.asInstanceOf[js.Any])
    
    inline def setGradientSizeUndefined: Self = StObject.set(x, "gradientSize", js.undefined)
    
    inline def setGradientSizeUnits(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SymbolUnits * / any */ String
    ): Self = StObject.set(x, "gradientSizeUnits", value.asInstanceOf[js.Any])
    
    inline def setGradientSizeUnitsUndefined: Self = StObject.set(x, "gradientSizeUnits", js.undefined)
    
    inline def setGradientType(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GradientStrokeType * / any */ String
    ): Self = StObject.set(x, "gradientType", value.asInstanceOf[js.Any])
    
    inline def setGradientTypeUndefined: Self = StObject.set(x, "gradientType", js.undefined)
    
    inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMGradientFill): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
