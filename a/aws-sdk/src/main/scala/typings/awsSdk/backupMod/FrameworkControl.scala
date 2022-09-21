package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FrameworkControl extends StObject {
  
  /**
    * A list of ParameterName and ParameterValue pairs.
    */
  var ControlInputParameters: js.UndefOr[typings.awsSdk.backupMod.ControlInputParameters] = js.undefined
  
  /**
    * The name of a control. This name is between 1 and 256 characters.
    */
  var ControlName: typings.awsSdk.backupMod.ControlName
  
  /**
    * The scope of a control. The control scope defines what the control will evaluate. Three examples of control scopes are: a specific backup plan, all backup plans with a specific tag, or all backup plans. For more information, see  ControlScope. 
    */
  var ControlScope: js.UndefOr[typings.awsSdk.backupMod.ControlScope] = js.undefined
}
object FrameworkControl {
  
  inline def apply(ControlName: ControlName): FrameworkControl = {
    val __obj = js.Dynamic.literal(ControlName = ControlName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameworkControl]
  }
  
  extension [Self <: FrameworkControl](x: Self) {
    
    inline def setControlInputParameters(value: ControlInputParameters): Self = StObject.set(x, "ControlInputParameters", value.asInstanceOf[js.Any])
    
    inline def setControlInputParametersUndefined: Self = StObject.set(x, "ControlInputParameters", js.undefined)
    
    inline def setControlInputParametersVarargs(value: ControlInputParameter*): Self = StObject.set(x, "ControlInputParameters", js.Array(value*))
    
    inline def setControlName(value: ControlName): Self = StObject.set(x, "ControlName", value.asInstanceOf[js.Any])
    
    inline def setControlScope(value: ControlScope): Self = StObject.set(x, "ControlScope", value.asInstanceOf[js.Any])
    
    inline def setControlScopeUndefined: Self = StObject.set(x, "ControlScope", js.undefined)
  }
}
