package typings.astTypes.nodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.FlowType, 'type'> ]: ast-types.ast-types/gen/nodes.FlowType[P]} */ trait StringLiteralTypeAnnotation extends ASTNode {
  var raw: String
  var `type`: typings.astTypes.astTypesStrings.StringLiteralTypeAnnotation
  var value: String
}

object StringLiteralTypeAnnotation {
  @scala.inline
  def apply(raw: String, `type`: typings.astTypes.astTypesStrings.StringLiteralTypeAnnotation, value: String): StringLiteralTypeAnnotation = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringLiteralTypeAnnotation]
  }
}

