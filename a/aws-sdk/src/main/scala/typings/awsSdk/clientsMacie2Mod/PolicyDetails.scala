package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyDetails extends StObject {
  
  /**
    * The action that produced the finding.
    */
  var action: js.UndefOr[FindingAction] = js.undefined
  
  /**
    * The entity that performed the action that produced the finding.
    */
  var actor: js.UndefOr[FindingActor] = js.undefined
}
object PolicyDetails {
  
  inline def apply(): PolicyDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PolicyDetails] (val x: Self) extends AnyVal {
    
    inline def setAction(value: FindingAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setActor(value: FindingActor): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setActorUndefined: Self = StObject.set(x, "actor", js.undefined)
  }
}
