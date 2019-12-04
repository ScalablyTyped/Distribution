package typings.astDashTypes.genNodesMod

import typings.astDashTypes.genKindsMod.ComprehensionBlockKind
import typings.astDashTypes.genKindsMod.ExpressionKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait ComprehensionExpression extends ASTNode {
  var blocks: js.Array[ComprehensionBlockKind]
  var body: ExpressionKind
  var filter: ExpressionKind | Null
  var `type`: typings.astDashTypes.astDashTypesStrings.ComprehensionExpression
}

object ComprehensionExpression {
  @scala.inline
  def apply(
    blocks: js.Array[ComprehensionBlockKind],
    body: ExpressionKind,
    `type`: typings.astDashTypes.astDashTypesStrings.ComprehensionExpression,
    filter: ExpressionKind = null
  ): ComprehensionExpression = {
    val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComprehensionExpression]
  }
}

