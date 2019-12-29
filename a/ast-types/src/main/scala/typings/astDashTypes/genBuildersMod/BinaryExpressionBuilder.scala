package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CommentsIn
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
import typings.astDashTypes.genNamedTypesMod.namedTypes.BinaryExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BinaryExpressionBuilder extends js.Object {
  def apply(
    operator: EqualssignEqualssign | ExclamationmarkEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssignEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign | LessthansignLessthansign | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | Plussign | `-_` | Asterisk | Slash | Percentsign | AsteriskAsterisk | Ampersand | Verticalline | ^  | in | instanceof,
    left: ExpressionKind,
    right: ExpressionKind
  ): BinaryExpression = js.native
  def from(params: Anon_CommentsIn): BinaryExpression = js.native
}

