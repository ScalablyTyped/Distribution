package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputGroup extends StObject {
  
  /**
    * Custom output group name optionally defined by the user.
    */
  var Name: js.UndefOr[stringMax32] = js.undefined
  
  /**
    * Settings associated with the output group.
    */
  var OutputGroupSettings: typings.awsSdk.clientsMedialiveMod.OutputGroupSettings
  
  var Outputs: listOfOutput
}
object OutputGroup {
  
  inline def apply(OutputGroupSettings: OutputGroupSettings, Outputs: listOfOutput): OutputGroup = {
    val __obj = js.Dynamic.literal(OutputGroupSettings = OutputGroupSettings.asInstanceOf[js.Any], Outputs = Outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputGroup]
  }
  
  extension [Self <: OutputGroup](x: Self) {
    
    inline def setName(value: stringMax32): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOutputGroupSettings(value: OutputGroupSettings): Self = StObject.set(x, "OutputGroupSettings", value.asInstanceOf[js.Any])
    
    inline def setOutputs(value: listOfOutput): Self = StObject.set(x, "Outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsVarargs(value: Output*): Self = StObject.set(x, "Outputs", js.Array(value*))
  }
}
