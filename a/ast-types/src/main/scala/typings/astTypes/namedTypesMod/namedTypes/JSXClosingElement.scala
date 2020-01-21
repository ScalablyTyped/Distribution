package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.kindsMod.JSXIdentifierKind
import typings.astTypes.kindsMod.JSXMemberExpressionKind
import typings.astTypes.kindsMod.JSXNamespacedNameKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait JSXClosingElement
  extends ASTNode
     with NodeKind
     with PrintableKind {
  var name: JSXIdentifierKind | JSXNamespacedNameKind | JSXMemberExpressionKind
  var `type`: typings.astTypes.astTypesStrings.JSXClosingElement
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.JSXClosingElement")
@js.native
object JSXClosingElement extends TopLevel[Type[JSXClosingElement]]

