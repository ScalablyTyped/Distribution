package typings.angularCompilerCli.srcNgtscIndexerSrcApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes a template expression, which may have a template reference or variable target. */
trait ExpressionIdentifier
  extends StObject
     with TemplateIdentifier {
  
  /**
    * ReferenceIdentifier or VariableIdentifier in the template that this identifier targets, if
    * any. If the target is `null`, it points to a declaration on the component class.
    * */
  var target: ReferenceIdentifier | VariableIdentifier | Null
}
object ExpressionIdentifier {
  
  inline def apply(kind: IdentifierKind, name: String, span: AbsoluteSourceSpan): ExpressionIdentifier = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], target = null)
    __obj.asInstanceOf[ExpressionIdentifier]
  }
  
  extension [Self <: ExpressionIdentifier](x: Self) {
    
    inline def setTarget(value: ReferenceIdentifier | VariableIdentifier): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
  }
}
