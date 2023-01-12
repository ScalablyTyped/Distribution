package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PossibleRemediationActions extends StObject {
  
  /**
    * Information about the actions.
    */
  var Actions: js.UndefOr[PossibleRemediationActionList] = js.undefined
  
  /**
    * A description of the possible remediation actions list.
    */
  var Description: js.UndefOr[LengthBoundedString] = js.undefined
}
object PossibleRemediationActions {
  
  inline def apply(): PossibleRemediationActions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PossibleRemediationActions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PossibleRemediationActions] (val x: Self) extends AnyVal {
    
    inline def setActions(value: PossibleRemediationActionList): Self = StObject.set(x, "Actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "Actions", js.undefined)
    
    inline def setActionsVarargs(value: PossibleRemediationAction*): Self = StObject.set(x, "Actions", js.Array(value*))
    
    inline def setDescription(value: LengthBoundedString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
  }
}
