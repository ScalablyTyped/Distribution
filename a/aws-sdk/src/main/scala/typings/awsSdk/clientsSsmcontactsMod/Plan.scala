package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Plan extends StObject {
  
  /**
    * The Amazon Resource Names (ARNs) of the on-call rotations associated with the plan. 
    */
  var RotationIds: js.UndefOr[SsmContactsArnList] = js.undefined
  
  /**
    * A list of stages that the escalation plan or engagement plan uses to engage contacts and contact methods.
    */
  var Stages: js.UndefOr[StagesList] = js.undefined
}
object Plan {
  
  inline def apply(): Plan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Plan]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Plan] (val x: Self) extends AnyVal {
    
    inline def setRotationIds(value: SsmContactsArnList): Self = StObject.set(x, "RotationIds", value.asInstanceOf[js.Any])
    
    inline def setRotationIdsUndefined: Self = StObject.set(x, "RotationIds", js.undefined)
    
    inline def setRotationIdsVarargs(value: SsmContactsArn*): Self = StObject.set(x, "RotationIds", js.Array(value*))
    
    inline def setStages(value: StagesList): Self = StObject.set(x, "Stages", value.asInstanceOf[js.Any])
    
    inline def setStagesUndefined: Self = StObject.set(x, "Stages", js.undefined)
    
    inline def setStagesVarargs(value: Stage*): Self = StObject.set(x, "Stages", js.Array(value*))
  }
}
