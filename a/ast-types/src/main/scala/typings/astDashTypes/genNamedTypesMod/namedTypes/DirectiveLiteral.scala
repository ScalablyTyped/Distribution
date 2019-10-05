package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]}
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait DirectiveLiteral
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  var `type`: typings.astDashTypes.astDashTypesStrings.DirectiveLiteral
  var value: js.UndefOr[String] = js.undefined
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.DirectiveLiteral")
@js.native
object DirectiveLiteral extends TopLevel[Type[DirectiveLiteral]]

