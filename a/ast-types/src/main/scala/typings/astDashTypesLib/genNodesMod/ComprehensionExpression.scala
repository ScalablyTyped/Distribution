package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait ComprehensionExpression
  extends ASTNode
     with astDashTypesLib.genKindsMod.ExpressionKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PatternKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var blocks: js.Array[astDashTypesLib.genKindsMod.ComprehensionBlockKind]
  var body: astDashTypesLib.genKindsMod.ExpressionKind
  var filter: astDashTypesLib.genKindsMod.ExpressionKind | scala.Null
  var `type`: astDashTypesLib.astDashTypesLibStrings.ComprehensionExpression
}

object ComprehensionExpression {
  @scala.inline
  def apply(
    blocks: js.Array[astDashTypesLib.genKindsMod.ComprehensionBlockKind],
    body: astDashTypesLib.genKindsMod.ExpressionKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.ComprehensionExpression,
    filter: astDashTypesLib.genKindsMod.ExpressionKind = null
  ): ComprehensionExpression = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("blocks")(blocks)
    __obj.updateDynamic("body")(body)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    __obj.asInstanceOf[ComprehensionExpression]
  }
}

