package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Literal, 'type' | 'value'> ]: ast-types.ast-types/gen/nodes.Literal[P]} */ trait RegExpLiteral
  extends ASTNode
     with astDashTypesLib.genKindsMod.ExpressionKind
     with astDashTypesLib.genKindsMod.LiteralKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PatternKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var flags: java.lang.String
  var pattern: java.lang.String
  var `type`: astDashTypesLib.astDashTypesLibStrings.RegExpLiteral
  var value: stdLib.RegExp
}

object RegExpLiteral {
  @scala.inline
  def apply(
    flags: java.lang.String,
    pattern: java.lang.String,
    `type`: astDashTypesLib.astDashTypesLibStrings.RegExpLiteral,
    value: stdLib.RegExp
  ): RegExpLiteral = {
    val __obj = js.Dynamic.literal(flags = flags, pattern = pattern, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RegExpLiteral]
  }
}

