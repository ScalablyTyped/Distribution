package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompileIdentifierMetadata extends StObject {
  
  var reference: Any
}
object CompileIdentifierMetadata {
  
  inline def apply(reference: Any): CompileIdentifierMetadata = {
    val __obj = js.Dynamic.literal(reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileIdentifierMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompileIdentifierMetadata] (val x: Self) extends AnyVal {
    
    inline def setReference(value: Any): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
  }
}
