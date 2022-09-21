package typings.angularCompiler.mod

import typings.angularCompiler.mod.R3TemplateDependencyKind.Pipe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R3PipeDependencyMetadata
  extends StObject
     with R3TemplateDependency
     with R3TemplateDependencyMetadata {
  
  @JSName("kind")
  var kind_R3PipeDependencyMetadata: Pipe
  
  var name: String
}
object R3PipeDependencyMetadata {
  
  inline def apply(kind: Pipe, name: String, `type`: Expression): R3PipeDependencyMetadata = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3PipeDependencyMetadata]
  }
  
  extension [Self <: R3PipeDependencyMetadata](x: Self) {
    
    inline def setKind(value: Pipe): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
