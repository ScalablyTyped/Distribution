package typings.awsSdk.clientsLicensemanagerlinuxsubscriptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filter extends StObject {
  
  /**
    * The type of name to filter by.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * An operator for filtering results.
    */
  var Operator: js.UndefOr[typings.awsSdk.clientsLicensemanagerlinuxsubscriptionsMod.Operator] = js.undefined
  
  /**
    * One or more values for the name to filter by.
    */
  var Values: js.UndefOr[StringList] = js.undefined
}
object Filter {
  
  inline def apply(): Filter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Filter] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOperator(value: Operator): Self = StObject.set(x, "Operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "Operator", js.undefined)
    
    inline def setValues(value: StringList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    inline def setValuesVarargs(value: StringListMemberString*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
