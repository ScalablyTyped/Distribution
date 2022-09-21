package typings.angularCompilerCli.indexerSrcApiMod

import typings.angularCompilerCli.indexerSrcApiMod.IdentifierKind.Method
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MethodIdentifier
  extends StObject
     with ExpressionIdentifier
     with TopLevelIdentifier {
  
  @JSName("kind")
  var kind_MethodIdentifier: Method
}
object MethodIdentifier {
  
  inline def apply(kind: Method, name: String, span: AbsoluteSourceSpan): MethodIdentifier = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], target = null)
    __obj.asInstanceOf[MethodIdentifier]
  }
  
  extension [Self <: MethodIdentifier](x: Self) {
    
    inline def setKind(value: Method): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
