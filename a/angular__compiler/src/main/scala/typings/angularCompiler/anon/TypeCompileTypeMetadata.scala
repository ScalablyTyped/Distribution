package typings.angularCompiler.anon

import typings.angularCompiler.compileMetadataMod.CompileTypeMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeCompileTypeMetadata extends StObject {
  
  var `type`: CompileTypeMetadata
}
object TypeCompileTypeMetadata {
  
  inline def apply(`type`: CompileTypeMetadata): TypeCompileTypeMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeCompileTypeMetadata]
  }
  
  extension [Self <: TypeCompileTypeMetadata](x: Self) {
    
    inline def setType(value: CompileTypeMetadata): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
