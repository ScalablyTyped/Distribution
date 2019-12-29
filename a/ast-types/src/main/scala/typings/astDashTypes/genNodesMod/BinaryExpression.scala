package typings.astDashTypes.genNodesMod

import typings.astDashTypes.astDashTypesStrings.Ampersand
import typings.astDashTypes.astDashTypesStrings.Asterisk
import typings.astDashTypes.astDashTypesStrings.AsteriskAsterisk
import typings.astDashTypes.astDashTypesStrings.EqualssignEqualssign
import typings.astDashTypes.astDashTypesStrings.EqualssignEqualssignEqualssign
import typings.astDashTypes.astDashTypesStrings.ExclamationmarkEqualssign
import typings.astDashTypes.astDashTypesStrings.ExclamationmarkEqualssignEqualssign
import typings.astDashTypes.astDashTypesStrings.Greaterthansign
import typings.astDashTypes.astDashTypesStrings.GreaterthansignEqualssign
import typings.astDashTypes.astDashTypesStrings.GreaterthansignGreaterthansign
import typings.astDashTypes.astDashTypesStrings.GreaterthansignGreaterthansignGreaterthansign
import typings.astDashTypes.astDashTypesStrings.Lessthansign
import typings.astDashTypes.astDashTypesStrings.LessthansignEqualssign
import typings.astDashTypes.astDashTypesStrings.LessthansignLessthansign
import typings.astDashTypes.astDashTypesStrings.Percentsign
import typings.astDashTypes.astDashTypesStrings.Plussign
import typings.astDashTypes.astDashTypesStrings.Slash
import typings.astDashTypes.astDashTypesStrings.Verticalline
import typings.astDashTypes.astDashTypesStrings.^
import typings.astDashTypes.astDashTypesStrings.`-_`
import typings.astDashTypes.astDashTypesStrings.in
import typings.astDashTypes.astDashTypesStrings.instanceof
import typings.astDashTypes.genKindsMod.ExpressionKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait BinaryExpression extends ASTNode {
  var left: ExpressionKind
  var operator: EqualssignEqualssign | ExclamationmarkEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssignEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign | LessthansignLessthansign | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | Plussign | `-_` | Asterisk | Slash | Percentsign | AsteriskAsterisk | Ampersand | Verticalline | ^  | in | instanceof
  var right: ExpressionKind
  var `type`: typings.astDashTypes.astDashTypesStrings.BinaryExpression
}

object BinaryExpression {
  @scala.inline
  def apply(
    left: ExpressionKind,
    operator: EqualssignEqualssign | ExclamationmarkEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssignEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign | LessthansignLessthansign | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | Plussign | `-_` | Asterisk | Slash | Percentsign | AsteriskAsterisk | Ampersand | Verticalline | ^  | in | instanceof,
    right: ExpressionKind,
    `type`: typings.astDashTypes.astDashTypesStrings.BinaryExpression
  ): BinaryExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinaryExpression]
  }
}

