package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProtectiveEquipmentSummary extends StObject {
  
  /**
    * An array of IDs for persons where it was not possible to determine if they are wearing personal protective equipment. 
    */
  var PersonsIndeterminate: js.UndefOr[ProtectiveEquipmentPersonIds] = js.undefined
  
  /**
    * An array of IDs for persons who are wearing detected personal protective equipment. 
    */
  var PersonsWithRequiredEquipment: js.UndefOr[ProtectiveEquipmentPersonIds] = js.undefined
  
  /**
    * An array of IDs for persons who are not wearing all of the types of PPE specified in the RequiredEquipmentTypes field of the detected personal protective equipment. 
    */
  var PersonsWithoutRequiredEquipment: js.UndefOr[ProtectiveEquipmentPersonIds] = js.undefined
}
object ProtectiveEquipmentSummary {
  
  inline def apply(): ProtectiveEquipmentSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProtectiveEquipmentSummary]
  }
  
  extension [Self <: ProtectiveEquipmentSummary](x: Self) {
    
    inline def setPersonsIndeterminate(value: ProtectiveEquipmentPersonIds): Self = StObject.set(x, "PersonsIndeterminate", value.asInstanceOf[js.Any])
    
    inline def setPersonsIndeterminateUndefined: Self = StObject.set(x, "PersonsIndeterminate", js.undefined)
    
    inline def setPersonsIndeterminateVarargs(value: UInteger*): Self = StObject.set(x, "PersonsIndeterminate", js.Array(value*))
    
    inline def setPersonsWithRequiredEquipment(value: ProtectiveEquipmentPersonIds): Self = StObject.set(x, "PersonsWithRequiredEquipment", value.asInstanceOf[js.Any])
    
    inline def setPersonsWithRequiredEquipmentUndefined: Self = StObject.set(x, "PersonsWithRequiredEquipment", js.undefined)
    
    inline def setPersonsWithRequiredEquipmentVarargs(value: UInteger*): Self = StObject.set(x, "PersonsWithRequiredEquipment", js.Array(value*))
    
    inline def setPersonsWithoutRequiredEquipment(value: ProtectiveEquipmentPersonIds): Self = StObject.set(x, "PersonsWithoutRequiredEquipment", value.asInstanceOf[js.Any])
    
    inline def setPersonsWithoutRequiredEquipmentUndefined: Self = StObject.set(x, "PersonsWithoutRequiredEquipment", js.undefined)
    
    inline def setPersonsWithoutRequiredEquipmentVarargs(value: UInteger*): Self = StObject.set(x, "PersonsWithoutRequiredEquipment", js.Array(value*))
  }
}
