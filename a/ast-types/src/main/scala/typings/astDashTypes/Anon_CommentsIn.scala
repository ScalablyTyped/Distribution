package typings.astDashTypes

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
import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsIn extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var left: ExpressionKind
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var operator: EqualssignEqualssign | ExclamationmarkEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssignEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign | LessthansignLessthansign | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | Plussign | `-_` | Asterisk | Slash | Percentsign | AsteriskAsterisk | Ampersand | Verticalline | ^  | in | instanceof
  var right: ExpressionKind
}

object Anon_CommentsIn {
  @scala.inline
  def apply(
    left: ExpressionKind,
    operator: EqualssignEqualssign | ExclamationmarkEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssignEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign | LessthansignLessthansign | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | Plussign | `-_` | Asterisk | Slash | Percentsign | AsteriskAsterisk | Ampersand | Verticalline | ^  | in | instanceof,
    right: ExpressionKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): Anon_CommentsIn = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CommentsIn]
  }
}

