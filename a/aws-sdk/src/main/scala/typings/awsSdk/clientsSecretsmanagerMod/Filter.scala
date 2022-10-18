package typings.awsSdk.clientsSecretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filter extends StObject {
  
  /**
    * The following are keys you can use:    description: Prefix match, not case-sensitive.    name: Prefix match, case-sensitive.    tag-key: Prefix match, case-sensitive.    tag-value: Prefix match, case-sensitive.    primary-region: Prefix match, case-sensitive.    all: Breaks the filter value string into words and then searches all attributes for matches. Not case-sensitive.  
    */
  var Key: js.UndefOr[FilterNameStringType] = js.undefined
  
  /**
    * The keyword to filter for. You can prefix your search value with an exclamation mark (!) in order to perform negation filters. 
    */
  var Values: js.UndefOr[FilterValuesStringList] = js.undefined
}
object Filter {
  
  inline def apply(): Filter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filter]
  }
  
  extension [Self <: Filter](x: Self) {
    
    inline def setKey(value: FilterNameStringType): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setValues(value: FilterValuesStringList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    inline def setValuesVarargs(value: FilterValueStringType*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
