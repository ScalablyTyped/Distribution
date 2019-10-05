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
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait AwaitExpression
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  var all: js.UndefOr[Boolean] = js.undefined
  var argument: ExpressionKind | Null
  var `type`: typings.astDashTypes.astDashTypesStrings.AwaitExpression
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.AwaitExpression")
@js.native
object AwaitExpression extends TopLevel[Type[AwaitExpression]]

