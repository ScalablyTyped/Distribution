package typings.astTypes.nodesMod

import typings.astTypes.AnonRawRawValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Literal, 'type' | 'value'> ]: ast-types.ast-types/gen/nodes.Literal[P]} */ trait BigIntLiteral extends ASTNode {
  var extra: AnonRawRawValue
  var `type`: typings.astTypes.astTypesStrings.BigIntLiteral
  var value: String | Double
}

object BigIntLiteral {
  @scala.inline
  def apply(
    extra: AnonRawRawValue,
    `type`: typings.astTypes.astTypesStrings.BigIntLiteral,
    value: String | Double
  ): BigIntLiteral = {
    val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BigIntLiteral]
  }
}

