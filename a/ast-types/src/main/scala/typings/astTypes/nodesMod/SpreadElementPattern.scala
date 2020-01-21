package typings.astTypes.nodesMod

import typings.astTypes.kindsMod.PatternKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Pattern, 'type'> ]: ast-types.ast-types/gen/nodes.Pattern[P]} */ trait SpreadElementPattern extends ASTNode {
  var argument: PatternKind
  var `type`: typings.astTypes.astTypesStrings.SpreadElementPattern
}

object SpreadElementPattern {
  @scala.inline
  def apply(argument: PatternKind, `type`: typings.astTypes.astTypesStrings.SpreadElementPattern): SpreadElementPattern = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpreadElementPattern]
  }
}

