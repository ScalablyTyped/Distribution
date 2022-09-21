package typings.angularCompiler.mod

import typings.angularCompiler.angularCompilerStrings.pipe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R3DeclarePipeDependencyMetadata
  extends StObject
     with R3DeclareTemplateDependencyMetadata {
  
  var kind: pipe
  
  var name: String
  
  /**
    * Reference to the pipe class (possibly a forward reference wrapped in a `forwardRef`
    * invocation).
    */
  var `type`: Expression | js.Function0[Expression]
}
object R3DeclarePipeDependencyMetadata {
  
  inline def apply(name: String, `type`: Expression | js.Function0[Expression]): R3DeclarePipeDependencyMetadata = {
    val __obj = js.Dynamic.literal(kind = "pipe", name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3DeclarePipeDependencyMetadata]
  }
  
  extension [Self <: R3DeclarePipeDependencyMetadata](x: Self) {
    
    inline def setKind(value: pipe): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: Expression | js.Function0[Expression]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeFunction0(value: () => Expression): Self = StObject.set(x, "type", js.Any.fromFunction0(value))
  }
}
