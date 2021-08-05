package typings.apolloReportingProtobuf.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IField extends StObject {
  
  /** Field name */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /** Field returnType */
  var returnType: js.UndefOr[String | Null] = js.undefined
}
object IField {
  
  inline def apply(): IField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IField]
  }
  
  extension [Self <: IField](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReturnType(value: String): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
    
    inline def setReturnTypeNull: Self = StObject.set(x, "returnType", null)
    
    inline def setReturnTypeUndefined: Self = StObject.set(x, "returnType", js.undefined)
  }
}
