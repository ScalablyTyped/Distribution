package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemediationActionWithOrder extends StObject {
  
  /**
    * The order of the remediation actions in the list.
    */
  var Order: js.UndefOr[BasicInteger] = js.undefined
  
  /**
    * Information about an action you can take to remediate a violation.
    */
  var RemediationAction: js.UndefOr[typings.awsSdk.clientsFmsMod.RemediationAction] = js.undefined
}
object RemediationActionWithOrder {
  
  inline def apply(): RemediationActionWithOrder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemediationActionWithOrder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemediationActionWithOrder] (val x: Self) extends AnyVal {
    
    inline def setOrder(value: BasicInteger): Self = StObject.set(x, "Order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "Order", js.undefined)
    
    inline def setRemediationAction(value: RemediationAction): Self = StObject.set(x, "RemediationAction", value.asInstanceOf[js.Any])
    
    inline def setRemediationActionUndefined: Self = StObject.set(x, "RemediationAction", js.undefined)
  }
}
