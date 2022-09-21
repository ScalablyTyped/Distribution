package typings.awsSdk.auditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAssessmentFrameworkControlSet extends StObject {
  
  /**
    *  The list of controls that are contained within the control set. 
    */
  var controls: CreateAssessmentFrameworkControls
  
  /**
    *  The unique identifier for the control set. 
    */
  var id: js.UndefOr[ControlSetName] = js.undefined
  
  /**
    *  The name of the control set. 
    */
  var name: ControlSetName
}
object UpdateAssessmentFrameworkControlSet {
  
  inline def apply(controls: CreateAssessmentFrameworkControls, name: ControlSetName): UpdateAssessmentFrameworkControlSet = {
    val __obj = js.Dynamic.literal(controls = controls.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAssessmentFrameworkControlSet]
  }
  
  extension [Self <: UpdateAssessmentFrameworkControlSet](x: Self) {
    
    inline def setControls(value: CreateAssessmentFrameworkControls): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    inline def setControlsVarargs(value: CreateAssessmentFrameworkControl*): Self = StObject.set(x, "controls", js.Array(value*))
    
    inline def setId(value: ControlSetName): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: ControlSetName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
