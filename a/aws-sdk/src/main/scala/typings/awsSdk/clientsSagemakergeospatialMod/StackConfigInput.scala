package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackConfigInput extends StObject {
  
  /**
    * The structure representing output resolution (in target georeferenced units) of the result of stacking operation.
    */
  var OutputResolution: js.UndefOr[OutputResolutionStackInput] = js.undefined
  
  /**
    * A list of bands to be stacked in the specified order. When the parameter is not provided, all the available bands in the data collection are stacked in the alphabetical order of their asset names.
    */
  var TargetBands: js.UndefOr[StringListInput] = js.undefined
}
object StackConfigInput {
  
  inline def apply(): StackConfigInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackConfigInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StackConfigInput] (val x: Self) extends AnyVal {
    
    inline def setOutputResolution(value: OutputResolutionStackInput): Self = StObject.set(x, "OutputResolution", value.asInstanceOf[js.Any])
    
    inline def setOutputResolutionUndefined: Self = StObject.set(x, "OutputResolution", js.undefined)
    
    inline def setTargetBands(value: StringListInput): Self = StObject.set(x, "TargetBands", value.asInstanceOf[js.Any])
    
    inline def setTargetBandsUndefined: Self = StObject.set(x, "TargetBands", js.undefined)
    
    inline def setTargetBandsVarargs(value: String*): Self = StObject.set(x, "TargetBands", js.Array(value*))
  }
}
