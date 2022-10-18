package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetTriggersRequest extends StObject {
  
  /**
    * A list of trigger names, which may be the names returned from the ListTriggers operation.
    */
  var TriggerNames: TriggerNameList
}
object BatchGetTriggersRequest {
  
  inline def apply(TriggerNames: TriggerNameList): BatchGetTriggersRequest = {
    val __obj = js.Dynamic.literal(TriggerNames = TriggerNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetTriggersRequest]
  }
  
  extension [Self <: BatchGetTriggersRequest](x: Self) {
    
    inline def setTriggerNames(value: TriggerNameList): Self = StObject.set(x, "TriggerNames", value.asInstanceOf[js.Any])
    
    inline def setTriggerNamesVarargs(value: NameString*): Self = StObject.set(x, "TriggerNames", js.Array(value*))
  }
}
