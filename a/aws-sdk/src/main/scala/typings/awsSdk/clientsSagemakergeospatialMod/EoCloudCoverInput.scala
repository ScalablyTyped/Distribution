package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EoCloudCoverInput extends StObject {
  
  /**
    * Lower bound for EoCloudCover.
    */
  var LowerBound: Float
  
  /**
    * Upper bound for EoCloudCover.
    */
  var UpperBound: Float
}
object EoCloudCoverInput {
  
  inline def apply(LowerBound: Float, UpperBound: Float): EoCloudCoverInput = {
    val __obj = js.Dynamic.literal(LowerBound = LowerBound.asInstanceOf[js.Any], UpperBound = UpperBound.asInstanceOf[js.Any])
    __obj.asInstanceOf[EoCloudCoverInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EoCloudCoverInput] (val x: Self) extends AnyVal {
    
    inline def setLowerBound(value: Float): Self = StObject.set(x, "LowerBound", value.asInstanceOf[js.Any])
    
    inline def setUpperBound(value: Float): Self = StObject.set(x, "UpperBound", value.asInstanceOf[js.Any])
  }
}
