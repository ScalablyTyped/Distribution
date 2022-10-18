package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateInstanceEventWindowResult extends StObject {
  
  /**
    * Information about the event window.
    */
  var InstanceEventWindow: js.UndefOr[typings.awsSdk.clientsEc2Mod.InstanceEventWindow] = js.undefined
}
object DisassociateInstanceEventWindowResult {
  
  inline def apply(): DisassociateInstanceEventWindowResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateInstanceEventWindowResult]
  }
  
  extension [Self <: DisassociateInstanceEventWindowResult](x: Self) {
    
    inline def setInstanceEventWindow(value: InstanceEventWindow): Self = StObject.set(x, "InstanceEventWindow", value.asInstanceOf[js.Any])
    
    inline def setInstanceEventWindowUndefined: Self = StObject.set(x, "InstanceEventWindow", js.undefined)
  }
}
