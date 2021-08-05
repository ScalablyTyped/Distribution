package typings.apolloReportingProtobuf.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IType extends StObject {
  
  /** Type field */
  var field: js.UndefOr[js.Array[IField] | Null] = js.undefined
  
  /** Type name */
  var name: js.UndefOr[String | Null] = js.undefined
}
object IType {
  
  inline def apply(): IType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IType]
  }
  
  extension [Self <: IType](x: Self) {
    
    inline def setField(value: js.Array[IField]): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldNull: Self = StObject.set(x, "field", null)
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setFieldVarargs(value: IField*): Self = StObject.set(x, "field", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
