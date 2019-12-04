package typings.astDashTypes.genNodesMod

import typings.astDashTypes.Anon_Raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Literal, 'type' | 'value'> ]: ast-types.ast-types/gen/nodes.Literal[P]} */ trait NumericLiteral extends ASTNode {
  var extra: Anon_Raw
  var raw: String | Null
  var `type`: typings.astDashTypes.astDashTypesStrings.NumericLiteral
  var value: Double
}

object NumericLiteral {
  @scala.inline
  def apply(
    extra: Anon_Raw,
    `type`: typings.astDashTypes.astDashTypesStrings.NumericLiteral,
    value: Double,
    raw: String = null
  ): NumericLiteral = {
    val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (raw != null) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumericLiteral]
  }
}

