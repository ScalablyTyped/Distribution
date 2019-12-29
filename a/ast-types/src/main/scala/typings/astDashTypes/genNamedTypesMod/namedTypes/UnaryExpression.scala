package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.astDashTypesStrings.Exclamationmark
import typings.astDashTypes.astDashTypesStrings.Plussign
import typings.astDashTypes.astDashTypesStrings.Tilde
import typings.astDashTypes.astDashTypesStrings.`-_`
import typings.astDashTypes.astDashTypesStrings.delete
import typings.astDashTypes.astDashTypesStrings.typeof
import typings.astDashTypes.astDashTypesStrings.void
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait UnaryExpression
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  var argument: ExpressionKind
  var operator: `-_` | Plussign | Exclamationmark | Tilde | typeof | void | delete
  var prefix: js.UndefOr[Boolean] = js.undefined
  var `type`: typings.astDashTypes.astDashTypesStrings.UnaryExpression
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.UnaryExpression")
@js.native
object UnaryExpression extends TopLevel[Type[UnaryExpression]]

