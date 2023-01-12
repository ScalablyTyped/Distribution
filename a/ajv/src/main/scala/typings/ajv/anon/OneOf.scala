package typings.ajv.anon

import typings.ajv.distTypesJsonSchemaMod.UncheckedJSONSchemaType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OneOf[T, IsPartial /* <: Boolean */] extends StObject {
  
  var oneOf: js.Array[UncheckedJSONSchemaType[T, IsPartial]]
}
object OneOf {
  
  inline def apply[T, IsPartial /* <: Boolean */](oneOf: js.Array[UncheckedJSONSchemaType[T, IsPartial]]): OneOf[T, IsPartial] = {
    val __obj = js.Dynamic.literal(oneOf = oneOf.asInstanceOf[js.Any])
    __obj.asInstanceOf[OneOf[T, IsPartial]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OneOf[?, ?], T, IsPartial /* <: Boolean */] (val x: Self & (OneOf[T, IsPartial])) extends AnyVal {
    
    inline def setOneOf(value: js.Array[UncheckedJSONSchemaType[T, IsPartial]]): Self = StObject.set(x, "oneOf", value.asInstanceOf[js.Any])
    
    inline def setOneOfVarargs(value: (UncheckedJSONSchemaType[T, IsPartial])*): Self = StObject.set(x, "oneOf", js.Array(value*))
  }
}
