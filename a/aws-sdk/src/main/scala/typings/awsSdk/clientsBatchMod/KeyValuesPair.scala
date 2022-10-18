package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyValuesPair extends StObject {
  
  /**
    * The name of the filter. Filter names are case sensitive.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The filter values.
    */
  var values: js.UndefOr[StringList] = js.undefined
}
object KeyValuesPair {
  
  inline def apply(): KeyValuesPair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyValuesPair]
  }
  
  extension [Self <: KeyValuesPair](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValues(value: StringList): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
