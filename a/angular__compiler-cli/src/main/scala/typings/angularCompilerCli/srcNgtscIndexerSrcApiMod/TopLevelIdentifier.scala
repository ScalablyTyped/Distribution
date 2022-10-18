package typings.angularCompilerCli.srcNgtscIndexerSrcApiMod

import typings.angularCompilerCli.srcNgtscIndexerSrcApiMod.IdentifierKind.Element
import typings.angularCompilerCli.srcNgtscIndexerSrcApiMod.IdentifierKind.Method
import typings.angularCompilerCli.srcNgtscIndexerSrcApiMod.IdentifierKind.Property
import typings.angularCompilerCli.srcNgtscIndexerSrcApiMod.IdentifierKind.Reference
import typings.angularCompilerCli.srcNgtscIndexerSrcApiMod.IdentifierKind.Template
import typings.angularCompilerCli.srcNgtscIndexerSrcApiMod.IdentifierKind.Variable
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.angularCompilerCli.srcNgtscIndexerSrcApiMod.PropertyIdentifier
  - typings.angularCompilerCli.srcNgtscIndexerSrcApiMod.ElementIdentifier
  - typings.angularCompilerCli.srcNgtscIndexerSrcApiMod.TemplateNodeIdentifier
  - typings.angularCompilerCli.srcNgtscIndexerSrcApiMod.ReferenceIdentifier
  - typings.angularCompilerCli.srcNgtscIndexerSrcApiMod.VariableIdentifier
  - typings.angularCompilerCli.srcNgtscIndexerSrcApiMod.MethodIdentifier
*/
trait TopLevelIdentifier extends StObject
object TopLevelIdentifier {
  
  inline def ElementIdentifier(
    attributes: Set[AttributeIdentifier],
    kind: Element,
    name: String,
    span: AbsoluteSourceSpan,
    usedDirectives: Set[DirectiveReference]
  ): typings.angularCompilerCli.srcNgtscIndexerSrcApiMod.ElementIdentifier = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], usedDirectives = usedDirectives.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCompilerCli.srcNgtscIndexerSrcApiMod.ElementIdentifier]
  }
  
  inline def MethodIdentifier(kind: Method, name: String, span: AbsoluteSourceSpan): typings.angularCompilerCli.srcNgtscIndexerSrcApiMod.MethodIdentifier = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], target = null)
    __obj.asInstanceOf[typings.angularCompilerCli.srcNgtscIndexerSrcApiMod.MethodIdentifier]
  }
  
  inline def PropertyIdentifier(kind: Property, name: String, span: AbsoluteSourceSpan): typings.angularCompilerCli.srcNgtscIndexerSrcApiMod.PropertyIdentifier = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], target = null)
    __obj.asInstanceOf[typings.angularCompilerCli.srcNgtscIndexerSrcApiMod.PropertyIdentifier]
  }
  
  inline def ReferenceIdentifier(kind: Reference, name: String, span: AbsoluteSourceSpan): typings.angularCompilerCli.srcNgtscIndexerSrcApiMod.ReferenceIdentifier = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], target = null)
    __obj.asInstanceOf[typings.angularCompilerCli.srcNgtscIndexerSrcApiMod.ReferenceIdentifier]
  }
  
  inline def TemplateNodeIdentifier(
    attributes: Set[AttributeIdentifier],
    kind: Template,
    name: String,
    span: AbsoluteSourceSpan,
    usedDirectives: Set[DirectiveReference]
  ): typings.angularCompilerCli.srcNgtscIndexerSrcApiMod.TemplateNodeIdentifier = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], usedDirectives = usedDirectives.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCompilerCli.srcNgtscIndexerSrcApiMod.TemplateNodeIdentifier]
  }
  
  inline def VariableIdentifier(kind: Variable, name: String, span: AbsoluteSourceSpan): typings.angularCompilerCli.srcNgtscIndexerSrcApiMod.VariableIdentifier = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCompilerCli.srcNgtscIndexerSrcApiMod.VariableIdentifier]
  }
}
