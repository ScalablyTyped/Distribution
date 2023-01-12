package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaseFilter extends StObject {
  
  /**
    * Provides "and all" filtering.
    */
  var andAll: js.UndefOr[CaseFilterAndAllList] = js.undefined
  
  /**
    * A list of fields to filter on.
    */
  var field: js.UndefOr[FieldFilter] = js.undefined
  
  var not: js.UndefOr[CaseFilter] = js.undefined
}
object CaseFilter {
  
  inline def apply(): CaseFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaseFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CaseFilter] (val x: Self) extends AnyVal {
    
    inline def setAndAll(value: CaseFilterAndAllList): Self = StObject.set(x, "andAll", value.asInstanceOf[js.Any])
    
    inline def setAndAllUndefined: Self = StObject.set(x, "andAll", js.undefined)
    
    inline def setAndAllVarargs(value: CaseFilter*): Self = StObject.set(x, "andAll", js.Array(value*))
    
    inline def setField(value: FieldFilter): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setNot(value: CaseFilter): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
    
    inline def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
  }
}
