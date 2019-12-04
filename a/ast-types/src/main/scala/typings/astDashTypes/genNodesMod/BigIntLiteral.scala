package typings.astDashTypes.genNodesMod

import typings.astDashTypes.Anon_RawRawValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Literal, 'type' | 'value'> ]: ast-types.ast-types/gen/nodes.Literal[P]} */ trait BigIntLiteral extends ASTNode {
  var extra: Anon_RawRawValue
  var `type`: typings.astDashTypes.astDashTypesStrings.BigIntLiteral
  var value: String | Double
}

object BigIntLiteral {
  @scala.inline
  def apply(
    extra: Anon_RawRawValue,
    `type`: typings.astDashTypes.astDashTypesStrings.BigIntLiteral,
    value: String | Double
  ): BigIntLiteral = {
    val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BigIntLiteral]
  }
}

