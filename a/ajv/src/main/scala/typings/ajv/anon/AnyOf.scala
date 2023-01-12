package typings.ajv.anon

import typings.ajv.distTypesJsonSchemaMod.UncheckedJSONSchemaType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// these two unions allow arbitrary unions of types
trait AnyOf[T, IsPartial /* <: Boolean */] extends StObject {
  
  var anyOf: js.Array[UncheckedJSONSchemaType[T, IsPartial]]
}
object AnyOf {
  
  inline def apply[T, IsPartial /* <: Boolean */](anyOf: js.Array[UncheckedJSONSchemaType[T, IsPartial]]): AnyOf[T, IsPartial] = {
    val __obj = js.Dynamic.literal(anyOf = anyOf.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyOf[T, IsPartial]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnyOf[?, ?], T, IsPartial /* <: Boolean */] (val x: Self & (AnyOf[T, IsPartial])) extends AnyVal {
    
    inline def setAnyOf(value: js.Array[UncheckedJSONSchemaType[T, IsPartial]]): Self = StObject.set(x, "anyOf", value.asInstanceOf[js.Any])
    
    inline def setAnyOfVarargs(value: (UncheckedJSONSchemaType[T, IsPartial])*): Self = StObject.set(x, "anyOf", js.Array(value*))
  }
}
