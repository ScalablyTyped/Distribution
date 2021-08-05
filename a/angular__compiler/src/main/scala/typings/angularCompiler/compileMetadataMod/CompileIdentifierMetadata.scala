package typings.angularCompiler.compileMetadataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompileIdentifierMetadata extends StObject {
  
  var reference: js.Any
}
object CompileIdentifierMetadata {
  
  inline def apply(reference: js.Any): CompileIdentifierMetadata = {
    val __obj = js.Dynamic.literal(reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileIdentifierMetadata]
  }
  
  extension [Self <: CompileIdentifierMetadata](x: Self) {
    
    inline def setReference(value: js.Any): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
  }
}
