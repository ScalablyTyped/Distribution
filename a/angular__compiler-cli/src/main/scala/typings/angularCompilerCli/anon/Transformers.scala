package typings.angularCompilerCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transformers extends StObject {
  
  var transformers: typings.typescript.mod.CustomTransformers
}
object Transformers {
  
  inline def apply(transformers: typings.typescript.mod.CustomTransformers): Transformers = {
    val __obj = js.Dynamic.literal(transformers = transformers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transformers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Transformers] (val x: Self) extends AnyVal {
    
    inline def setTransformers(value: typings.typescript.mod.CustomTransformers): Self = StObject.set(x, "transformers", value.asInstanceOf[js.Any])
  }
}
