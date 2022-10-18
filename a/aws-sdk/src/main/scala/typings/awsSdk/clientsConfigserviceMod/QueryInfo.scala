package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryInfo extends StObject {
  
  /**
    * Returns a FieldInfo object.
    */
  var SelectFields: js.UndefOr[FieldInfoList] = js.undefined
}
object QueryInfo {
  
  inline def apply(): QueryInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryInfo]
  }
  
  extension [Self <: QueryInfo](x: Self) {
    
    inline def setSelectFields(value: FieldInfoList): Self = StObject.set(x, "SelectFields", value.asInstanceOf[js.Any])
    
    inline def setSelectFieldsUndefined: Self = StObject.set(x, "SelectFields", js.undefined)
    
    inline def setSelectFieldsVarargs(value: FieldInfo*): Self = StObject.set(x, "SelectFields", js.Array(value*))
  }
}
