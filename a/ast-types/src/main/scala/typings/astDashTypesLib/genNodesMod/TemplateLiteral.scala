package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait TemplateLiteral
  extends ASTNode
     with astDashTypesLib.genKindsMod.ExpressionKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PatternKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var expressions: js.Array[astDashTypesLib.genKindsMod.ExpressionKind]
  var quasis: js.Array[astDashTypesLib.genKindsMod.TemplateElementKind]
  var `type`: astDashTypesLib.astDashTypesLibStrings.TemplateLiteral
}

object TemplateLiteral {
  @scala.inline
  def apply(
    expressions: js.Array[astDashTypesLib.genKindsMod.ExpressionKind],
    quasis: js.Array[astDashTypesLib.genKindsMod.TemplateElementKind],
    `type`: astDashTypesLib.astDashTypesLibStrings.TemplateLiteral
  ): TemplateLiteral = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("expressions")(expressions)
    __obj.updateDynamic("quasis")(quasis)
    __obj.asInstanceOf[TemplateLiteral]
  }
}

