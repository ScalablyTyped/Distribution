package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScaleDependentStops extends StObject {
  
  /**
  		 * An array of objects that define the size of the icon (or alternatively the width of the polygon outline) at the given scale `value`.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#ScaleDependentStops)
  		 */
  var stops: js.Array[SizeStop]
  
  /**
  		 * This value must be `outline` when scaling polygon outline widths based on the view scale.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#ScaleDependentStops)
  		 */
  var target: js.UndefOr[String] = js.undefined
  
  /**
  		 * Value must be `size`.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#ScaleDependentStops)
  		 */
  var `type`: String
  
  /**
  		 * This value must be `$view.scale`.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#ScaleDependentStops)
  		 */
  var valueExpression: String
}
object ScaleDependentStops {
  
  inline def apply(stops: js.Array[SizeStop], `type`: String, valueExpression: String): ScaleDependentStops = {
    val __obj = js.Dynamic.literal(stops = stops.asInstanceOf[js.Any], valueExpression = valueExpression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleDependentStops]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScaleDependentStops] (val x: Self) extends AnyVal {
    
    inline def setStops(value: js.Array[SizeStop]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    inline def setStopsVarargs(value: SizeStop*): Self = StObject.set(x, "stops", js.Array(value*))
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValueExpression(value: String): Self = StObject.set(x, "valueExpression", value.asInstanceOf[js.Any])
  }
}
