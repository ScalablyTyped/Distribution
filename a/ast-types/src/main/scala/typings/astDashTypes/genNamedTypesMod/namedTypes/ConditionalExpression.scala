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
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait ConditionalExpression
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  var alternate: ExpressionKind
  var consequent: ExpressionKind
  var test: ExpressionKind
  var `type`: typings.astDashTypes.astDashTypesStrings.ConditionalExpression
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ConditionalExpression")
@js.native
object ConditionalExpression extends TopLevel[Type[ConditionalExpression]]

