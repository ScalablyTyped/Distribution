package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetHealth extends StObject {
  
  /**
    * A description of the health of the RDS Proxy target. If the State is AVAILABLE, a description is not included.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The reason for the current health State of the RDS Proxy target.
    */
  var Reason: js.UndefOr[TargetHealthReason] = js.undefined
  
  /**
    * The current state of the connection health lifecycle for the RDS Proxy target. The following is a typical lifecycle example for the states of an RDS Proxy target:  registering &gt; unavailable &gt; available &gt; unavailable &gt; available 
    */
  var State: js.UndefOr[TargetState] = js.undefined
}
object TargetHealth {
  
  inline def apply(): TargetHealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetHealth]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TargetHealth] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setReason(value: TargetHealthReason): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "Reason", js.undefined)
    
    inline def setState(value: TargetState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
