package typings.astDashTypes.genNodesMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Literal, 'type' | 'value'> ]: ast-types.ast-types/gen/nodes.Literal[P]} */ trait RegExpLiteral extends ASTNode {
  var flags: String
  var pattern: String
  var `type`: typings.astDashTypes.astDashTypesStrings.RegExpLiteral
  var value: RegExp
}

object RegExpLiteral {
  @scala.inline
  def apply(
    flags: String,
    pattern: String,
    `type`: typings.astDashTypes.astDashTypesStrings.RegExpLiteral,
    value: RegExp
  ): RegExpLiteral = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegExpLiteral]
  }
}

