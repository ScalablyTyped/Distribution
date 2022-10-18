package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TriggerDetails extends StObject {
  
  /**
    * The description of the scan trigger.
    */
  var Description: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The ID of the GuardDuty finding that triggered the BirdDog scan.
    */
  var GuardDutyFindingId: js.UndefOr[NonEmptyString] = js.undefined
}
object TriggerDetails {
  
  inline def apply(): TriggerDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TriggerDetails]
  }
  
  extension [Self <: TriggerDetails](x: Self) {
    
    inline def setDescription(value: NonEmptyString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setGuardDutyFindingId(value: NonEmptyString): Self = StObject.set(x, "GuardDutyFindingId", value.asInstanceOf[js.Any])
    
    inline def setGuardDutyFindingIdUndefined: Self = StObject.set(x, "GuardDutyFindingId", js.undefined)
  }
}
