package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.RestElementKind
import typings.astTypes.kindsMod.SpreadElementKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait ArrayExpression
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  var elements: js.Array[ExpressionKind | SpreadElementKind | RestElementKind | Null]
  var `type`: typings.astTypes.astTypesStrings.ArrayExpression
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ArrayExpression")
@js.native
object ArrayExpression extends TopLevel[Type[ArrayExpression]]

