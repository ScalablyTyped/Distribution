package typings.astDashTypes.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait JSXEmptyExpression extends ASTNode {
  var `type`: typings.astDashTypes.astDashTypesStrings.JSXEmptyExpression
}

object JSXEmptyExpression {
  @scala.inline
  def apply(`type`: typings.astDashTypes.astDashTypesStrings.JSXEmptyExpression): JSXEmptyExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXEmptyExpression]
  }
}

