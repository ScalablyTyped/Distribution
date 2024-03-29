package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartitionValueList extends StObject {
  
  /**
    * The list of values.
    */
  var Values: ValueStringList
}
object PartitionValueList {
  
  inline def apply(Values: ValueStringList): PartitionValueList = {
    val __obj = js.Dynamic.literal(Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartitionValueList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartitionValueList] (val x: Self) extends AnyVal {
    
    inline def setValues(value: ValueStringList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: ValueString*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
