package typings.astTypes.nodesMod

import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.PatternKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait VariableDeclarator extends ASTNode {
  var id: PatternKind
  var init: ExpressionKind | Null
  var `type`: typings.astTypes.astTypesStrings.VariableDeclarator
}

object VariableDeclarator {
  @scala.inline
  def apply(
    id: PatternKind,
    `type`: typings.astTypes.astTypesStrings.VariableDeclarator,
    init: ExpressionKind = null
  ): VariableDeclarator = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(init.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableDeclarator]
  }
}

