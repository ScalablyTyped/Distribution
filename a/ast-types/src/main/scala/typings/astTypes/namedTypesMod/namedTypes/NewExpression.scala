package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.SpreadElementKind
import typings.astTypes.kindsMod.TypeParameterInstantiationKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait NewExpression
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  var arguments: js.Array[ExpressionKind | SpreadElementKind]
  var callee: ExpressionKind
  var `type`: typings.astTypes.astTypesStrings.NewExpression
  var typeArguments: js.UndefOr[Null | TypeParameterInstantiationKind] = js.undefined
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.NewExpression")
@js.native
object NewExpression extends TopLevel[Type[NewExpression]]

