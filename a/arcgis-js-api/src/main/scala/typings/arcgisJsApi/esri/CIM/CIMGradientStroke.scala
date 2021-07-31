package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMGradientStroke
  extends StObject
     with CIMStroke
     with CIMSymbolLayerType {
  
  /**
    * The color scheme that is applied to the stroke.
    */
  var colorRamp: js.UndefOr[js.Any] = js.undefined
  
  /**
    * How the gradient is applied along the stroke.
    */
  var gradientMethod: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GradientStrokeMethod * / any */ String
  ] = js.undefined
  
  /**
    * How much of the feature is covered by the color scheme. This is either a percentage of the total area which the color scheme spans or the number of page units from the starting point at which the gradient displays.
    */
  var gradientSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether GradientSize is applied with an absolute distance or a relative percentage.
    */
  var gradientSizeUnits: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SymbolUnits * / any */ String
  ] = js.undefined
  
  /**
    * Whether the gradient is applied with discrete or continuous intervals.
    */
  var gradientType: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GradientStrokeType * / any */ String
  ] = js.undefined
  
  /**
    * How many bands draw when the GradientType is set to Discrete.
    */
  var interval: js.UndefOr[Double] = js.undefined
  
  @JSName("type")
  var type_CIMGradientStroke: typings.arcgisJsApi.arcgisJsApiStrings.CIMGradientStroke
}
object CIMGradientStroke {
  
  @scala.inline
  def apply(): CIMGradientStroke = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMGradientStroke")
    __obj.asInstanceOf[CIMGradientStroke]
  }
  
  @scala.inline
  implicit class CIMGradientStrokeMutableBuilder[Self <: CIMGradientStroke] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColorRamp(value: js.Any): Self = StObject.set(x, "colorRamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorRampUndefined: Self = StObject.set(x, "colorRamp", js.undefined)
    
    @scala.inline
    def setGradientMethod(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GradientStrokeMethod * / any */ String
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
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMGradientStroke): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
