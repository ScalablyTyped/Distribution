package typings.awsSdk.clientsComprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnmappedAttribute extends StObject {
  
  /**
    *  The specific attribute that has been extracted but not mapped to an entity. 
    */
  var Attribute: js.UndefOr[typings.awsSdk.clientsComprehendmedicalMod.Attribute] = js.undefined
  
  /**
    *  The type of the unmapped attribute, could be one of the following values: "MEDICATION", "MEDICAL_CONDITION", "ANATOMY", "TEST_AND_TREATMENT_PROCEDURE" or "PROTECTED_HEALTH_INFORMATION". 
    */
  var Type: js.UndefOr[EntityType] = js.undefined
}
object UnmappedAttribute {
  
  inline def apply(): UnmappedAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmappedAttribute]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnmappedAttribute] (val x: Self) extends AnyVal {
    
    inline def setAttribute(value: Attribute): Self = StObject.set(x, "Attribute", value.asInstanceOf[js.Any])
    
    inline def setAttributeUndefined: Self = StObject.set(x, "Attribute", js.undefined)
    
    inline def setType(value: EntityType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
