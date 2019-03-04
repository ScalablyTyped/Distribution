package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Literal, 'type' | 'value'> ]: ast-types.ast-types/gen/nodes.Literal[P]} */ trait NumericLiteral
  extends ASTNode
     with astDashTypesLib.genKindsMod.ExpressionKind
     with astDashTypesLib.genKindsMod.LiteralKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PatternKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var extra: astDashTypesLib.Anon_Raw
  var raw: java.lang.String | scala.Null
  var `type`: astDashTypesLib.astDashTypesLibStrings.NumericLiteral
  var value: scala.Double
}

object NumericLiteral {
  @scala.inline
  def apply(
    extra: astDashTypesLib.Anon_Raw,
    `type`: astDashTypesLib.astDashTypesLibStrings.NumericLiteral,
    value: scala.Double,
    raw: java.lang.String = null
  ): NumericLiteral = {
    val __obj = js.Dynamic.literal(extra = extra, value = value)
    __obj.updateDynamic("type")(`type`)
    if (raw != null) __obj.updateDynamic("raw")(raw)
    __obj.asInstanceOf[NumericLiteral]
  }
}

