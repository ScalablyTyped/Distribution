package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAssessmentFrameworkControlSet extends StObject {
  
  /**
    *  The list of controls within the control set. This doesn't contain the control set ID. 
    */
  var controls: js.UndefOr[CreateAssessmentFrameworkControls] = js.undefined
  
  /**
    *  The name of the control set. 
    */
  var name: ControlSetName
}
object CreateAssessmentFrameworkControlSet {
  
  inline def apply(name: ControlSetName): CreateAssessmentFrameworkControlSet = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAssessmentFrameworkControlSet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAssessmentFrameworkControlSet] (val x: Self) extends AnyVal {
    
    inline def setControls(value: CreateAssessmentFrameworkControls): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    
    inline def setControlsVarargs(value: CreateAssessmentFrameworkControl*): Self = StObject.set(x, "controls", js.Array(value*))
    
    inline def setName(value: ControlSetName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
