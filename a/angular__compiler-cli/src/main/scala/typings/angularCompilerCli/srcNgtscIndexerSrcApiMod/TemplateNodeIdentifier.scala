package typings.angularCompilerCli.srcNgtscIndexerSrcApiMod

import typings.angularCompilerCli.srcNgtscIndexerSrcApiMod.IdentifierKind.Template
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateNodeIdentifier
  extends StObject
     with BaseElementOrTemplateIdentifier
     with TopLevelIdentifier {
  
  @JSName("kind")
  var kind_TemplateNodeIdentifier: Template
}
object TemplateNodeIdentifier {
  
  inline def apply(
    attributes: Set[AttributeIdentifier],
    kind: Template,
    name: String,
    span: AbsoluteSourceSpan,
    usedDirectives: Set[DirectiveReference]
  ): TemplateNodeIdentifier = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], usedDirectives = usedDirectives.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateNodeIdentifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TemplateNodeIdentifier] (val x: Self) extends AnyVal {
    
    inline def setKind(value: Template): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
