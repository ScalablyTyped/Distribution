package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.astDashTypesNumbers.`false`
import typings.astDashTypes.genKindsMod.BlockStatementKind
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.FunctionKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Function, 'type' | 'id' | 'body' | 'generator'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Function[P]}
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait ArrowFunctionExpression
  extends ASTNode
     with ExpressionKind
     with FunctionKind
     with NodeKind
     with PrintableKind {
  var body: BlockStatementKind | ExpressionKind
  var generator: js.UndefOr[`false`] = js.undefined
  var id: js.UndefOr[Null] = js.undefined
  var `type`: typings.astDashTypes.astDashTypesStrings.ArrowFunctionExpression
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ArrowFunctionExpression")
@js.native
object ArrowFunctionExpression extends TopLevel[Type[ArrowFunctionExpression]]

