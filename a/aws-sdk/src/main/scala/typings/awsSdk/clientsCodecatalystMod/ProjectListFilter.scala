package typings.awsSdk.clientsCodecatalystMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectListFilter extends StObject {
  
  /**
    * The operator used to compare the fields.
    */
  var comparisonOperator: js.UndefOr[ComparisonOperator] = js.undefined
  
  /**
    * A key that can be used to sort results.
    */
  var key: FilterKey
  
  /**
    * The value of the key.
    */
  var values: StringList
}
object ProjectListFilter {
  
  inline def apply(key: FilterKey, values: StringList): ProjectListFilter = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectListFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProjectListFilter] (val x: Self) extends AnyVal {
    
    inline def setComparisonOperator(value: ComparisonOperator): Self = StObject.set(x, "comparisonOperator", value.asInstanceOf[js.Any])
    
    inline def setComparisonOperatorUndefined: Self = StObject.set(x, "comparisonOperator", js.undefined)
    
    inline def setKey(value: FilterKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValues(value: StringList): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
