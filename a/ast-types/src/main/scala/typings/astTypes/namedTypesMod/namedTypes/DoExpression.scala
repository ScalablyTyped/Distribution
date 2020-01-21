package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.StatementKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait DoExpression
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  var body: js.Array[StatementKind]
  var `type`: typings.astTypes.astTypesStrings.DoExpression
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.DoExpression")
@js.native
object DoExpression extends TopLevel[Type[DoExpression]]

