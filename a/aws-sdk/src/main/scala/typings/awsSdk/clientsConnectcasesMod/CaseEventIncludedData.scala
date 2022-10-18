package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaseEventIncludedData extends StObject {
  
  /**
    * List of field identifiers.
    */
  var fields: CaseEventIncludedDataFieldsList
}
object CaseEventIncludedData {
  
  inline def apply(fields: CaseEventIncludedDataFieldsList): CaseEventIncludedData = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaseEventIncludedData]
  }
  
  extension [Self <: CaseEventIncludedData](x: Self) {
    
    inline def setFields(value: CaseEventIncludedDataFieldsList): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: FieldIdentifier*): Self = StObject.set(x, "fields", js.Array(value*))
  }
}
