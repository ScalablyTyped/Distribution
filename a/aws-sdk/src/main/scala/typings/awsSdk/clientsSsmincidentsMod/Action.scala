package typings.awsSdk.clientsSsmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action extends StObject {
  
  /**
    * The Systems Manager automation document to start as the runbook at the beginning of the incident.
    */
  var ssmAutomation: js.UndefOr[SsmAutomation] = js.undefined
}
object Action {
  
  inline def apply(): Action = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Action]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
    
    inline def setSsmAutomation(value: SsmAutomation): Self = StObject.set(x, "ssmAutomation", value.asInstanceOf[js.Any])
    
    inline def setSsmAutomationUndefined: Self = StObject.set(x, "ssmAutomation", js.undefined)
  }
}
