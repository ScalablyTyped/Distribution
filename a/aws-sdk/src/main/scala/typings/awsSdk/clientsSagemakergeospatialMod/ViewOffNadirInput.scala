package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewOffNadirInput extends StObject {
  
  /**
    * The minimum value for ViewOffNadir property filter. This filters items having ViewOffNadir greater than or equal to this value. 
    */
  var LowerBound: Float
  
  /**
    * The maximum value for ViewOffNadir property filter. This filters items having ViewOffNadir lesser than or equal to this value.
    */
  var UpperBound: Float
}
object ViewOffNadirInput {
  
  inline def apply(LowerBound: Float, UpperBound: Float): ViewOffNadirInput = {
    val __obj = js.Dynamic.literal(LowerBound = LowerBound.asInstanceOf[js.Any], UpperBound = UpperBound.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewOffNadirInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ViewOffNadirInput] (val x: Self) extends AnyVal {
    
    inline def setLowerBound(value: Float): Self = StObject.set(x, "LowerBound", value.asInstanceOf[js.Any])
    
    inline def setUpperBound(value: Float): Self = StObject.set(x, "UpperBound", value.asInstanceOf[js.Any])
  }
}
