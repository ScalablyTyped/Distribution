package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ControlSet extends StObject {
  
  /**
    *  The list of controls within the control set. 
    */
  var controls: js.UndefOr[Controls] = js.undefined
  
  /**
    *  The identifier of the control set in the assessment. This is the control set name in a plain string format. 
    */
  var id: js.UndefOr[UUID] = js.undefined
  
  /**
    *  The name of the control set. 
    */
  var name: js.UndefOr[ControlSetName] = js.undefined
}
object ControlSet {
  
  inline def apply(): ControlSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ControlSet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ControlSet] (val x: Self) extends AnyVal {
    
    inline def setControls(value: Controls): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    
    inline def setControlsVarargs(value: Control*): Self = StObject.set(x, "controls", js.Array(value*))
    
    inline def setId(value: UUID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: ControlSetName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
