package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.JSXExpressionContainerKind
import typings.astDashTypes.genKindsMod.JSXIdentifierKind
import typings.astDashTypes.genKindsMod.JSXNamespacedNameKind
import typings.astDashTypes.genKindsMod.LiteralKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait JSXAttribute
  extends ASTNode
     with NodeKind
     with PrintableKind {
  var name: JSXIdentifierKind | JSXNamespacedNameKind
  var `type`: typings.astDashTypes.astDashTypesStrings.JSXAttribute
  var value: js.UndefOr[LiteralKind | JSXExpressionContainerKind | Null] = js.undefined
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.JSXAttribute")
@js.native
object JSXAttribute extends TopLevel[Type[JSXAttribute]]

