package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PoolOriginationIdentitiesFilter extends StObject {
  
  /**
    * The name of the attribute to filter on.
    */
  var Name: PoolOriginationIdentitiesFilterName
  
  /**
    * An array values to filter for.
    */
  var Values: FilterValueList
}
object PoolOriginationIdentitiesFilter {
  
  inline def apply(Name: PoolOriginationIdentitiesFilterName, Values: FilterValueList): PoolOriginationIdentitiesFilter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[PoolOriginationIdentitiesFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PoolOriginationIdentitiesFilter] (val x: Self) extends AnyVal {
    
    inline def setName(value: PoolOriginationIdentitiesFilterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValues(value: FilterValueList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: FilterValue*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
