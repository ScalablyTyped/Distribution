package typings.astTypes.nodesMod

import typings.astTypes.AnonRaw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Literal, 'type' | 'value'> ]: ast-types.ast-types/gen/nodes.Literal[P]} */ trait NumericLiteral extends ASTNode {
  var extra: AnonRaw
  var raw: String | Null
  var `type`: typings.astTypes.astTypesStrings.NumericLiteral
  var value: Double
}

object NumericLiteral {
  @scala.inline
  def apply(
    extra: AnonRaw,
    `type`: typings.astTypes.astTypesStrings.NumericLiteral,
    value: Double,
    raw: String = null
  ): NumericLiteral = {
    val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (raw != null) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumericLiteral]
  }
}

