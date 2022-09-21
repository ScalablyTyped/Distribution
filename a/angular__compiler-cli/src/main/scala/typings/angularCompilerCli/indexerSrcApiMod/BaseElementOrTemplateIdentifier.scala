package typings.angularCompilerCli.indexerSrcApiMod

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A base interface for element and template identifiers. */
trait BaseElementOrTemplateIdentifier
  extends StObject
     with TemplateIdentifier {
  
  /** Attributes on an element or template. */
  var attributes: Set[AttributeIdentifier]
  
  /** Directives applied to an element or template. */
  var usedDirectives: Set[DirectiveReference]
}
object BaseElementOrTemplateIdentifier {
  
  inline def apply(
    attributes: Set[AttributeIdentifier],
    kind: IdentifierKind,
    name: String,
    span: AbsoluteSourceSpan,
    usedDirectives: Set[DirectiveReference]
  ): BaseElementOrTemplateIdentifier = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], usedDirectives = usedDirectives.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseElementOrTemplateIdentifier]
  }
  
  extension [Self <: BaseElementOrTemplateIdentifier](x: Self) {
    
    inline def setAttributes(value: Set[AttributeIdentifier]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setUsedDirectives(value: Set[DirectiveReference]): Self = StObject.set(x, "usedDirectives", value.asInstanceOf[js.Any])
  }
}
