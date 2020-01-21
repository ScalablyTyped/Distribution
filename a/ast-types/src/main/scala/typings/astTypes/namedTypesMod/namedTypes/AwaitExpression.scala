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
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait AwaitExpression
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  var all: js.UndefOr[Boolean] = js.undefined
  var argument: ExpressionKind | Null
  var `type`: typings.astTypes.astTypesStrings.AwaitExpression
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.AwaitExpression")
@js.native
object AwaitExpression extends TopLevel[Type[AwaitExpression]]

