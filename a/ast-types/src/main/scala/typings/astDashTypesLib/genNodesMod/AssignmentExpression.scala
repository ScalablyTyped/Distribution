package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait AssignmentExpression
  extends ASTNode
     with astDashTypesLib.genKindsMod.ExpressionKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PatternKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var left: astDashTypesLib.genKindsMod.PatternKind
  var operator: astDashTypesLib.astDashTypesLibStrings.`=` | astDashTypesLib.astDashTypesLibStrings.`+=` | astDashTypesLib.astDashTypesLibStrings.`-=` | astDashTypesLib.astDashTypesLibStrings.`*=` | astDashTypesLib.astDashTypesLibStrings.`/=` | astDashTypesLib.astDashTypesLibStrings.`%=` | astDashTypesLib.astDashTypesLibStrings.`<<=` | astDashTypesLib.astDashTypesLibStrings.`>>=` | astDashTypesLib.astDashTypesLibStrings.`>>>=` | astDashTypesLib.astDashTypesLibStrings.`|=` | astDashTypesLib.astDashTypesLibStrings.`^=` | astDashTypesLib.astDashTypesLibStrings.`&=`
  var right: astDashTypesLib.genKindsMod.ExpressionKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.AssignmentExpression
}

object AssignmentExpression {
  @scala.inline
  def apply(
    left: astDashTypesLib.genKindsMod.PatternKind,
    operator: astDashTypesLib.astDashTypesLibStrings.`=` | astDashTypesLib.astDashTypesLibStrings.`+=` | astDashTypesLib.astDashTypesLibStrings.`-=` | astDashTypesLib.astDashTypesLibStrings.`*=` | astDashTypesLib.astDashTypesLibStrings.`/=` | astDashTypesLib.astDashTypesLibStrings.`%=` | astDashTypesLib.astDashTypesLibStrings.`<<=` | astDashTypesLib.astDashTypesLibStrings.`>>=` | astDashTypesLib.astDashTypesLibStrings.`>>>=` | astDashTypesLib.astDashTypesLibStrings.`|=` | astDashTypesLib.astDashTypesLibStrings.`^=` | astDashTypesLib.astDashTypesLibStrings.`&=`,
    right: astDashTypesLib.genKindsMod.ExpressionKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.AssignmentExpression
  ): AssignmentExpression = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    __obj.updateDynamic("right")(right)
    __obj.asInstanceOf[AssignmentExpression]
  }
}

