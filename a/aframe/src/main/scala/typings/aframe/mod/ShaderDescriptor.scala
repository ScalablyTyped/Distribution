package typings.aframe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShaderDescriptor[T /* <: Shader */] extends StObject {
  
  var Shader: ShaderConstructor[T]
  
  var schema: Schema_[js.Object]
}
object ShaderDescriptor {
  
  inline def apply[T /* <: Shader */](Shader: ShaderConstructor[T], schema: Schema_[js.Object]): ShaderDescriptor[T] = {
    val __obj = js.Dynamic.literal(Shader = Shader.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShaderDescriptor[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShaderDescriptor[?], T /* <: Shader */] (val x: Self & ShaderDescriptor[T]) extends AnyVal {
    
    inline def setSchema(value: Schema_[js.Object]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setShader(value: ShaderConstructor[T]): Self = StObject.set(x, "Shader", value.asInstanceOf[js.Any])
  }
}
