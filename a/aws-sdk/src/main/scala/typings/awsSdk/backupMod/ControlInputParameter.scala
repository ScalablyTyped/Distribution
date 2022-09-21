package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ControlInputParameter extends StObject {
  
  /**
    * The name of a parameter, for example, BackupPlanFrequency.
    */
  var ParameterName: js.UndefOr[typings.awsSdk.backupMod.ParameterName] = js.undefined
  
  /**
    * The value of parameter, for example, hourly.
    */
  var ParameterValue: js.UndefOr[typings.awsSdk.backupMod.ParameterValue] = js.undefined
}
object ControlInputParameter {
  
  inline def apply(): ControlInputParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ControlInputParameter]
  }
  
  extension [Self <: ControlInputParameter](x: Self) {
    
    inline def setParameterName(value: ParameterName): Self = StObject.set(x, "ParameterName", value.asInstanceOf[js.Any])
    
    inline def setParameterNameUndefined: Self = StObject.set(x, "ParameterName", js.undefined)
    
    inline def setParameterValue(value: ParameterValue): Self = StObject.set(x, "ParameterValue", value.asInstanceOf[js.Any])
    
    inline def setParameterValueUndefined: Self = StObject.set(x, "ParameterValue", js.undefined)
  }
}
