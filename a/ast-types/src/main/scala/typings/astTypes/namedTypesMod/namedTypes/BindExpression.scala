package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait BindExpression
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  var callee: ExpressionKind
  var `object`: ExpressionKind | Null
  var `type`: typings.astTypes.astTypesStrings.BindExpression
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.BindExpression")
@js.native
object BindExpression extends TopLevel[Type[BindExpression]]

