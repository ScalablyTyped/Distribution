package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TriggerNodeDetails extends StObject {
  
  /**
    * The information of the trigger represented by the trigger node.
    */
  var Trigger: js.UndefOr[typings.awsSdk.clientsGlueMod.Trigger] = js.undefined
}
object TriggerNodeDetails {
  
  inline def apply(): TriggerNodeDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TriggerNodeDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TriggerNodeDetails] (val x: Self) extends AnyVal {
    
    inline def setTrigger(value: Trigger): Self = StObject.set(x, "Trigger", value.asInstanceOf[js.Any])
    
    inline def setTriggerUndefined: Self = StObject.set(x, "Trigger", js.undefined)
  }
}
