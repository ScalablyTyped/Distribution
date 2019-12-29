package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CommentsLeft
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
import typings.astDashTypes.genNamedTypesMod.namedTypes.AssignmentExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssignmentExpressionBuilder extends js.Object {
  def apply(
    operator: Equalssign | PlussignEqualssign | `-Equalssign` | AsteriskEqualssign | SlashEqualssign | PercentsignEqualssign | LessthansignLessthansignEqualssign | GreaterthansignGreaterthansignEqualssign | GreaterthansignGreaterthansignGreaterthansignEqualssign | VerticallineEqualssign | `^Equalssign` | AmpersandEqualssign,
    left: MemberExpressionKind,
    right: ExpressionKind
  ): AssignmentExpression = js.native
  def apply(
    operator: Equalssign | PlussignEqualssign | `-Equalssign` | AsteriskEqualssign | SlashEqualssign | PercentsignEqualssign | LessthansignLessthansignEqualssign | GreaterthansignGreaterthansignEqualssign | GreaterthansignGreaterthansignGreaterthansignEqualssign | VerticallineEqualssign | `^Equalssign` | AmpersandEqualssign,
    left: PatternKind,
    right: ExpressionKind
  ): AssignmentExpression = js.native
  def from(params: Anon_CommentsLeft): AssignmentExpression = js.native
}

