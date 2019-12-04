package typings.astDashTypes.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.FlowType, 'type'> ]: ast-types.ast-types/gen/nodes.FlowType[P]} */ trait BooleanLiteralTypeAnnotation extends ASTNode {
  var raw: String
  var `type`: typings.astDashTypes.astDashTypesStrings.BooleanLiteralTypeAnnotation
  var value: Boolean
}

object BooleanLiteralTypeAnnotation {
  @scala.inline
  def apply(
    raw: String,
    `type`: typings.astDashTypes.astDashTypesStrings.BooleanLiteralTypeAnnotation,
    value: Boolean
  ): BooleanLiteralTypeAnnotation = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BooleanLiteralTypeAnnotation]
  }
}

