package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.CallExpressionKind
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.SpreadElementKind
import typings.astDashTypes.genKindsMod.TypeParameterInstantiationKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait CallExpression
  extends ASTNode
     with CallExpressionKind
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  var arguments: js.Array[ExpressionKind | SpreadElementKind]
  var callee: ExpressionKind
  var `type`: typings.astDashTypes.astDashTypesStrings.CallExpression
  var typeArguments: js.UndefOr[Null | TypeParameterInstantiationKind] = js.undefined
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.CallExpression")
@js.native
object CallExpression extends TopLevel[Type[CallExpression]]

