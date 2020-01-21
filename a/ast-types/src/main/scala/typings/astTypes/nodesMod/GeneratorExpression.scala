package typings.astTypes.nodesMod

import typings.astTypes.kindsMod.ComprehensionBlockKind
import typings.astTypes.kindsMod.ExpressionKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait GeneratorExpression extends ASTNode {
  var blocks: js.Array[ComprehensionBlockKind]
  var body: ExpressionKind
  var filter: ExpressionKind | Null
  var `type`: typings.astTypes.astTypesStrings.GeneratorExpression
}

object GeneratorExpression {
  @scala.inline
  def apply(
    blocks: js.Array[ComprehensionBlockKind],
    body: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.GeneratorExpression,
    filter: ExpressionKind = null
  ): GeneratorExpression = {
    val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneratorExpression]
  }
}

