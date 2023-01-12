package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PossibleRemediationAction extends StObject {
  
  /**
    * A description of the list of remediation actions.
    */
  var Description: js.UndefOr[LengthBoundedString] = js.undefined
  
  /**
    * Information about whether an action is taken by default.
    */
  var IsDefaultAction: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ordered list of remediation actions.
    */
  var OrderedRemediationActions: typings.awsSdk.clientsFmsMod.OrderedRemediationActions
}
object PossibleRemediationAction {
  
  inline def apply(OrderedRemediationActions: OrderedRemediationActions): PossibleRemediationAction = {
    val __obj = js.Dynamic.literal(OrderedRemediationActions = OrderedRemediationActions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PossibleRemediationAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PossibleRemediationAction] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: LengthBoundedString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setIsDefaultAction(value: Boolean): Self = StObject.set(x, "IsDefaultAction", value.asInstanceOf[js.Any])
    
    inline def setIsDefaultActionUndefined: Self = StObject.set(x, "IsDefaultAction", js.undefined)
    
    inline def setOrderedRemediationActions(value: OrderedRemediationActions): Self = StObject.set(x, "OrderedRemediationActions", value.asInstanceOf[js.Any])
    
    inline def setOrderedRemediationActionsVarargs(value: RemediationActionWithOrder*): Self = StObject.set(x, "OrderedRemediationActions", js.Array(value*))
  }
}
