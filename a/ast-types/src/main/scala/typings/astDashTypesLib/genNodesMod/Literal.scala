package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]}
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait Literal
  extends ASTNode
     with astDashTypesLib.genKindsMod.ExpressionKind
     with astDashTypesLib.genKindsMod.LiteralKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PatternKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var regex: astDashTypesLib.Anon_Flags | scala.Null
  var `type`: astDashTypesLib.astDashTypesLibStrings.Literal
  var value: java.lang.String | scala.Boolean | scala.Null | scala.Double | stdLib.RegExp
}

object Literal {
  @scala.inline
  def apply(
    `type`: astDashTypesLib.astDashTypesLibStrings.Literal,
    regex: astDashTypesLib.Anon_Flags = null,
    value: java.lang.String | scala.Boolean | scala.Double | stdLib.RegExp = null
  ): Literal = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (regex != null) __obj.updateDynamic("regex")(regex)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Literal]
  }
}

