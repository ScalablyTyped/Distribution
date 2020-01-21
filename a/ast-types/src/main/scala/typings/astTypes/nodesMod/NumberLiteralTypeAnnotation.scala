package typings.astTypes.nodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.FlowType, 'type'> ]: ast-types.ast-types/gen/nodes.FlowType[P]} */ trait NumberLiteralTypeAnnotation extends ASTNode {
  var raw: String
  var `type`: typings.astTypes.astTypesStrings.NumberLiteralTypeAnnotation
  var value: Double
}

object NumberLiteralTypeAnnotation {
  @scala.inline
  def apply(raw: String, `type`: typings.astTypes.astTypesStrings.NumberLiteralTypeAnnotation, value: Double): NumberLiteralTypeAnnotation = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberLiteralTypeAnnotation]
  }
}

