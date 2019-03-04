package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait TaggedTemplateExpression
  extends ASTNode
     with astDashTypesLib.genKindsMod.ExpressionKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PatternKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var quasi: astDashTypesLib.genKindsMod.TemplateLiteralKind
  var tag: astDashTypesLib.genKindsMod.ExpressionKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.TaggedTemplateExpression
}

object TaggedTemplateExpression {
  @scala.inline
  def apply(
    quasi: astDashTypesLib.genKindsMod.TemplateLiteralKind,
    tag: astDashTypesLib.genKindsMod.ExpressionKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.TaggedTemplateExpression
  ): TaggedTemplateExpression = {
    val __obj = js.Dynamic.literal(quasi = quasi, tag = tag)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TaggedTemplateExpression]
  }
}

