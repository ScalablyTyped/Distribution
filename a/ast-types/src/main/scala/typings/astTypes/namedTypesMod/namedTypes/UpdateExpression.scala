package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.astTypesStrings.PlussignPlussign
import typings.astTypes.astTypesStrings.`--`
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait UpdateExpression
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  var argument: ExpressionKind
  var operator: PlussignPlussign | `--`
  var prefix: Boolean
  var `type`: typings.astTypes.astTypesStrings.UpdateExpression
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.UpdateExpression")
@js.native
object UpdateExpression extends TopLevel[Type[UpdateExpression]]

