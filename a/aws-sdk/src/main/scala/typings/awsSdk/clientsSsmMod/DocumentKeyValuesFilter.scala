package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentKeyValuesFilter extends StObject {
  
  /**
    * The name of the filter key.
    */
  var Key: js.UndefOr[DocumentKeyValuesFilterKey] = js.undefined
  
  /**
    * The value for the filter key.
    */
  var Values: js.UndefOr[DocumentKeyValuesFilterValues] = js.undefined
}
object DocumentKeyValuesFilter {
  
  inline def apply(): DocumentKeyValuesFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentKeyValuesFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentKeyValuesFilter] (val x: Self) extends AnyVal {
    
    inline def setKey(value: DocumentKeyValuesFilterKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setValues(value: DocumentKeyValuesFilterValues): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    inline def setValuesVarargs(value: DocumentKeyValuesFilterValue*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
