package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewSunElevationInput extends StObject {
  
  /**
    * The lower bound to view the sun elevation.
    */
  var LowerBound: Float
  
  /**
    * The upper bound to view the sun elevation.
    */
  var UpperBound: Float
}
object ViewSunElevationInput {
  
  inline def apply(LowerBound: Float, UpperBound: Float): ViewSunElevationInput = {
    val __obj = js.Dynamic.literal(LowerBound = LowerBound.asInstanceOf[js.Any], UpperBound = UpperBound.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewSunElevationInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ViewSunElevationInput] (val x: Self) extends AnyVal {
    
    inline def setLowerBound(value: Float): Self = StObject.set(x, "LowerBound", value.asInstanceOf[js.Any])
    
    inline def setUpperBound(value: Float): Self = StObject.set(x, "UpperBound", value.asInstanceOf[js.Any])
  }
}
