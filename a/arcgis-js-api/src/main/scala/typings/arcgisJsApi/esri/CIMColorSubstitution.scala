package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMColorSubstitution
  extends StObject
     with Object {
  
  /**
    * The new color that will replace the old color.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMColorSubstitution)
    */
  var newColor: js.Array[Double]
  
  /**
    * The old color (the color that will be substituted).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMColorSubstitution)
    */
  var oldColor: js.Array[Double]
}
object CIMColorSubstitution {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    newColor: js.Array[Double],
    oldColor: js.Array[Double],
    propertyIsEnumerable: PropertyKey => Boolean
  ): CIMColorSubstitution = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), newColor = newColor.asInstanceOf[js.Any], oldColor = oldColor.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[CIMColorSubstitution]
  }
  
  extension [Self <: CIMColorSubstitution](x: Self) {
    
    inline def setNewColor(value: js.Array[Double]): Self = StObject.set(x, "newColor", value.asInstanceOf[js.Any])
    
    inline def setNewColorVarargs(value: Double*): Self = StObject.set(x, "newColor", js.Array(value*))
    
    inline def setOldColor(value: js.Array[Double]): Self = StObject.set(x, "oldColor", value.asInstanceOf[js.Any])
    
    inline def setOldColorVarargs(value: Double*): Self = StObject.set(x, "oldColor", js.Array(value*))
  }
}
