package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LandsatCloudCoverLandInput extends StObject {
  
  /**
    * The minimum value for Land Cloud Cover property filter. This will filter items having Land Cloud Cover greater than or equal to this value.
    */
  var LowerBound: Float
  
  /**
    * The maximum value for Land Cloud Cover property filter. This will filter items having Land Cloud Cover less than or equal to this value.
    */
  var UpperBound: Float
}
object LandsatCloudCoverLandInput {
  
  inline def apply(LowerBound: Float, UpperBound: Float): LandsatCloudCoverLandInput = {
    val __obj = js.Dynamic.literal(LowerBound = LowerBound.asInstanceOf[js.Any], UpperBound = UpperBound.asInstanceOf[js.Any])
    __obj.asInstanceOf[LandsatCloudCoverLandInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LandsatCloudCoverLandInput] (val x: Self) extends AnyVal {
    
    inline def setLowerBound(value: Float): Self = StObject.set(x, "LowerBound", value.asInstanceOf[js.Any])
    
    inline def setUpperBound(value: Float): Self = StObject.set(x, "UpperBound", value.asInstanceOf[js.Any])
  }
}
