package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InventoryFilter extends StObject {
  
  /**
    * Condition of the filter.
    */
  var Condition: InventoryFilterCondition
  
  /**
    * Name of the filter.
    */
  var Name: String
  
  /**
    * Value of the filter.
    */
  var Value: js.UndefOr[String] = js.undefined
}
object InventoryFilter {
  
  inline def apply(Condition: InventoryFilterCondition, Name: String): InventoryFilter = {
    val __obj = js.Dynamic.literal(Condition = Condition.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryFilter]
  }
  
  extension [Self <: InventoryFilter](x: Self) {
    
    inline def setCondition(value: InventoryFilterCondition): Self = StObject.set(x, "Condition", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
