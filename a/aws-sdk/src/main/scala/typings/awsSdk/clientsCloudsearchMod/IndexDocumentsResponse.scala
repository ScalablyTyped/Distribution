package typings.awsSdk.clientsCloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexDocumentsResponse extends StObject {
  
  /**
    * The names of the fields that are currently being indexed.
    */
  var FieldNames: js.UndefOr[FieldNameList] = js.undefined
}
object IndexDocumentsResponse {
  
  inline def apply(): IndexDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndexDocumentsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndexDocumentsResponse] (val x: Self) extends AnyVal {
    
    inline def setFieldNames(value: FieldNameList): Self = StObject.set(x, "FieldNames", value.asInstanceOf[js.Any])
    
    inline def setFieldNamesUndefined: Self = StObject.set(x, "FieldNames", js.undefined)
    
    inline def setFieldNamesVarargs(value: FieldName*): Self = StObject.set(x, "FieldNames", js.Array(value*))
  }
}
