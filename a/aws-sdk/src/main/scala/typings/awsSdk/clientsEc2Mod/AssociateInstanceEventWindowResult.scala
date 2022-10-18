package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateInstanceEventWindowResult extends StObject {
  
  /**
    * Information about the event window.
    */
  var InstanceEventWindow: js.UndefOr[typings.awsSdk.clientsEc2Mod.InstanceEventWindow] = js.undefined
}
object AssociateInstanceEventWindowResult {
  
  inline def apply(): AssociateInstanceEventWindowResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateInstanceEventWindowResult]
  }
  
  extension [Self <: AssociateInstanceEventWindowResult](x: Self) {
    
    inline def setInstanceEventWindow(value: InstanceEventWindow): Self = StObject.set(x, "InstanceEventWindow", value.asInstanceOf[js.Any])
    
    inline def setInstanceEventWindowUndefined: Self = StObject.set(x, "InstanceEventWindow", js.undefined)
  }
}
