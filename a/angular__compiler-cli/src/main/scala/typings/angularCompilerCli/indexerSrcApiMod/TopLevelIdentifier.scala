package typings.angularCompilerCli.indexerSrcApiMod

import typings.angularCompilerCli.indexerSrcApiMod.IdentifierKind.Element
import typings.angularCompilerCli.indexerSrcApiMod.IdentifierKind.Method
import typings.angularCompilerCli.indexerSrcApiMod.IdentifierKind.Property
import typings.angularCompilerCli.indexerSrcApiMod.IdentifierKind.Reference
import typings.angularCompilerCli.indexerSrcApiMod.IdentifierKind.Template
import typings.angularCompilerCli.indexerSrcApiMod.IdentifierKind.Variable
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.angularCompilerCli.indexerSrcApiMod.PropertyIdentifier
  - typings.angularCompilerCli.indexerSrcApiMod.ElementIdentifier
  - typings.angularCompilerCli.indexerSrcApiMod.TemplateNodeIdentifier
  - typings.angularCompilerCli.indexerSrcApiMod.ReferenceIdentifier
  - typings.angularCompilerCli.indexerSrcApiMod.VariableIdentifier
  - typings.angularCompilerCli.indexerSrcApiMod.MethodIdentifier
*/
trait TopLevelIdentifier extends StObject
object TopLevelIdentifier {
  
  inline def ElementIdentifier(
    attributes: Set[AttributeIdentifier],
    kind: Element,
    name: String,
    span: AbsoluteSourceSpan,
    usedDirectives: Set[DirectiveReference]
  ): typings.angularCompilerCli.indexerSrcApiMod.ElementIdentifier = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], usedDirectives = usedDirectives.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCompilerCli.indexerSrcApiMod.ElementIdentifier]
  }
  
  inline def MethodIdentifier(kind: Method, name: String, span: AbsoluteSourceSpan): typings.angularCompilerCli.indexerSrcApiMod.MethodIdentifier = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], target = null)
    __obj.asInstanceOf[typings.angularCompilerCli.indexerSrcApiMod.MethodIdentifier]
  }
  
  inline def PropertyIdentifier(kind: Property, name: String, span: AbsoluteSourceSpan): typings.angularCompilerCli.indexerSrcApiMod.PropertyIdentifier = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], target = null)
    __obj.asInstanceOf[typings.angularCompilerCli.indexerSrcApiMod.PropertyIdentifier]
  }
  
  inline def ReferenceIdentifier(kind: Reference, name: String, span: AbsoluteSourceSpan): typings.angularCompilerCli.indexerSrcApiMod.ReferenceIdentifier = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], target = null)
    __obj.asInstanceOf[typings.angularCompilerCli.indexerSrcApiMod.ReferenceIdentifier]
  }
  
  inline def TemplateNodeIdentifier(
    attributes: Set[AttributeIdentifier],
    kind: Template,
    name: String,
    span: AbsoluteSourceSpan,
    usedDirectives: Set[DirectiveReference]
  ): typings.angularCompilerCli.indexerSrcApiMod.TemplateNodeIdentifier = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], usedDirectives = usedDirectives.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCompilerCli.indexerSrcApiMod.TemplateNodeIdentifier]
  }
  
  inline def VariableIdentifier(kind: Variable, name: String, span: AbsoluteSourceSpan): typings.angularCompilerCli.indexerSrcApiMod.VariableIdentifier = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCompilerCli.indexerSrcApiMod.VariableIdentifier]
  }
}
