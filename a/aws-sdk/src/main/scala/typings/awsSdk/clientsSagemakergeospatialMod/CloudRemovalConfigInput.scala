package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudRemovalConfigInput extends StObject {
  
  /**
    * The name of the algorithm used for cloud removal.
    */
  var AlgorithmName: js.UndefOr[AlgorithmNameCloudRemoval] = js.undefined
  
  /**
    * The interpolation value you provide for cloud removal.
    */
  var InterpolationValue: js.UndefOr[String] = js.undefined
  
  /**
    * TargetBands to be returned in the output of CloudRemoval operation.
    */
  var TargetBands: js.UndefOr[StringListInput] = js.undefined
}
object CloudRemovalConfigInput {
  
  inline def apply(): CloudRemovalConfigInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudRemovalConfigInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloudRemovalConfigInput] (val x: Self) extends AnyVal {
    
    inline def setAlgorithmName(value: AlgorithmNameCloudRemoval): Self = StObject.set(x, "AlgorithmName", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmNameUndefined: Self = StObject.set(x, "AlgorithmName", js.undefined)
    
    inline def setInterpolationValue(value: String): Self = StObject.set(x, "InterpolationValue", value.asInstanceOf[js.Any])
    
    inline def setInterpolationValueUndefined: Self = StObject.set(x, "InterpolationValue", js.undefined)
    
    inline def setTargetBands(value: StringListInput): Self = StObject.set(x, "TargetBands", value.asInstanceOf[js.Any])
    
    inline def setTargetBandsUndefined: Self = StObject.set(x, "TargetBands", js.undefined)
    
    inline def setTargetBandsVarargs(value: String*): Self = StObject.set(x, "TargetBands", js.Array(value*))
  }
}
