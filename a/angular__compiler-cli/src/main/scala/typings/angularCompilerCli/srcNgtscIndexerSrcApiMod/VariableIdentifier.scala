package typings.angularCompilerCli.srcNgtscIndexerSrcApiMod

import typings.angularCompilerCli.srcNgtscIndexerSrcApiMod.IdentifierKind.Variable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VariableIdentifier
  extends StObject
     with TemplateIdentifier {
  
  @JSName("kind")
  var kind_VariableIdentifier: Variable
}
object VariableIdentifier {
  
  inline def apply(kind: Variable, name: String, span: AbsoluteSourceSpan): VariableIdentifier = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableIdentifier]
  }
  
  extension [Self <: VariableIdentifier](x: Self) {
    
    inline def setKind(value: Variable): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
