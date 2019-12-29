package typings.astDashTypes.genNodesMod

import typings.astDashTypes.astDashTypesStrings.AmpersandEqualssign
import typings.astDashTypes.astDashTypesStrings.AsteriskEqualssign
import typings.astDashTypes.astDashTypesStrings.Equalssign
import typings.astDashTypes.astDashTypesStrings.GreaterthansignGreaterthansignEqualssign
import typings.astDashTypes.astDashTypesStrings.GreaterthansignGreaterthansignGreaterthansignEqualssign
import typings.astDashTypes.astDashTypesStrings.LessthansignLessthansignEqualssign
import typings.astDashTypes.astDashTypesStrings.PercentsignEqualssign
import typings.astDashTypes.astDashTypesStrings.PlussignEqualssign
import typings.astDashTypes.astDashTypesStrings.SlashEqualssign
import typings.astDashTypes.astDashTypesStrings.VerticallineEqualssign
import typings.astDashTypes.astDashTypesStrings.`-Equalssign`
import typings.astDashTypes.astDashTypesStrings.`^Equalssign`
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.MemberExpressionKind
import typings.astDashTypes.genKindsMod.PatternKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait AssignmentExpression extends ASTNode {
  var left: PatternKind | MemberExpressionKind
  var operator: Equalssign | PlussignEqualssign | `-Equalssign` | AsteriskEqualssign | SlashEqualssign | PercentsignEqualssign | LessthansignLessthansignEqualssign | GreaterthansignGreaterthansignEqualssign | GreaterthansignGreaterthansignGreaterthansignEqualssign | VerticallineEqualssign | `^Equalssign` | AmpersandEqualssign
  var right: ExpressionKind
  var `type`: typings.astDashTypes.astDashTypesStrings.AssignmentExpression
}

object AssignmentExpression {
  @scala.inline
  def apply(
    left: PatternKind | MemberExpressionKind,
    operator: Equalssign | PlussignEqualssign | `-Equalssign` | AsteriskEqualssign | SlashEqualssign | PercentsignEqualssign | LessthansignLessthansignEqualssign | GreaterthansignGreaterthansignEqualssign | GreaterthansignGreaterthansignGreaterthansignEqualssign | VerticallineEqualssign | `^Equalssign` | AmpersandEqualssign,
    right: ExpressionKind,
    `type`: typings.astDashTypes.astDashTypesStrings.AssignmentExpression
  ): AssignmentExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignmentExpression]
  }
}

