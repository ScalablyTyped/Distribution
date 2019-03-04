package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait GeneratorExpression
  extends ASTNode
     with astDashTypesLib.genKindsMod.ExpressionKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PatternKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var blocks: js.Array[astDashTypesLib.genKindsMod.ComprehensionBlockKind]
  var body: astDashTypesLib.genKindsMod.ExpressionKind
  var filter: astDashTypesLib.genKindsMod.ExpressionKind | scala.Null
  var `type`: astDashTypesLib.astDashTypesLibStrings.GeneratorExpression
}

object GeneratorExpression {
  @scala.inline
  def apply(
    blocks: js.Array[astDashTypesLib.genKindsMod.ComprehensionBlockKind],
    body: astDashTypesLib.genKindsMod.ExpressionKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.GeneratorExpression,
    filter: astDashTypesLib.genKindsMod.ExpressionKind = null
  ): GeneratorExpression = {
    val __obj = js.Dynamic.literal(blocks = blocks, body = body)
    __obj.updateDynamic("type")(`type`)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    __obj.asInstanceOf[GeneratorExpression]
  }
}

