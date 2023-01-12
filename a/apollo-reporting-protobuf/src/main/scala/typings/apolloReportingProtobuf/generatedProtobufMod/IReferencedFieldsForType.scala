package typings.apolloReportingProtobuf.generatedProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IReferencedFieldsForType extends StObject {
  
  /** ReferencedFieldsForType fieldNames */
  var fieldNames: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** ReferencedFieldsForType isInterface */
  var isInterface: js.UndefOr[Boolean | Null] = js.undefined
}
object IReferencedFieldsForType {
  
  inline def apply(): IReferencedFieldsForType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IReferencedFieldsForType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IReferencedFieldsForType] (val x: Self) extends AnyVal {
    
    inline def setFieldNames(value: js.Array[String]): Self = StObject.set(x, "fieldNames", value.asInstanceOf[js.Any])
    
    inline def setFieldNamesNull: Self = StObject.set(x, "fieldNames", null)
    
    inline def setFieldNamesUndefined: Self = StObject.set(x, "fieldNames", js.undefined)
    
    inline def setFieldNamesVarargs(value: String*): Self = StObject.set(x, "fieldNames", js.Array(value*))
    
    inline def setIsInterface(value: Boolean): Self = StObject.set(x, "isInterface", value.asInstanceOf[js.Any])
    
    inline def setIsInterfaceNull: Self = StObject.set(x, "isInterface", null)
    
    inline def setIsInterfaceUndefined: Self = StObject.set(x, "isInterface", js.undefined)
  }
}
