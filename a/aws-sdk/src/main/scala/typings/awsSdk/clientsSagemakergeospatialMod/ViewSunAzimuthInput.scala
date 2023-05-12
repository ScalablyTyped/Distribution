package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewSunAzimuthInput extends StObject {
  
  /**
    * The minimum value for ViewSunAzimuth property filter. This filters items having ViewSunAzimuth greater than or equal to this value.
    */
  var LowerBound: Float
  
  /**
    * The maximum value for ViewSunAzimuth property filter. This filters items having ViewSunAzimuth lesser than or equal to this value.
    */
  var UpperBound: Float
}
object ViewSunAzimuthInput {
  
  inline def apply(LowerBound: Float, UpperBound: Float): ViewSunAzimuthInput = {
    val __obj = js.Dynamic.literal(LowerBound = LowerBound.asInstanceOf[js.Any], UpperBound = UpperBound.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewSunAzimuthInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ViewSunAzimuthInput] (val x: Self) extends AnyVal {
    
    inline def setLowerBound(value: Float): Self = StObject.set(x, "LowerBound", value.asInstanceOf[js.Any])
    
    inline def setUpperBound(value: Float): Self = StObject.set(x, "UpperBound", value.asInstanceOf[js.Any])
  }
}
