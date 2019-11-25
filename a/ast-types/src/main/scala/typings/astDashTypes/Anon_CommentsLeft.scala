package typings.astDashTypes

import typings.astDashTypes.astDashTypesStrings.`%=`
import typings.astDashTypes.astDashTypesStrings.`&=`
import typings.astDashTypes.astDashTypesStrings.`*=`
import typings.astDashTypes.astDashTypesStrings.`+=`
import typings.astDashTypes.astDashTypesStrings.`-=`
import typings.astDashTypes.astDashTypesStrings.`/=`
import typings.astDashTypes.astDashTypesStrings.`<<=`
import typings.astDashTypes.astDashTypesStrings.`=`
import typings.astDashTypes.astDashTypesStrings.`>>=`
import typings.astDashTypes.astDashTypesStrings.`>>>=`
import typings.astDashTypes.astDashTypesStrings.`^=`
import typings.astDashTypes.astDashTypesStrings.`|=`
import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.MemberExpressionKind
import typings.astDashTypes.genKindsMod.PatternKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsLeft extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var left: PatternKind | MemberExpressionKind
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var operator: `=` | `+=` | `-=` | `*=` | `/=` | `%=` | `<<=` | `>>=` | `>>>=` | `|=` | `^=` | `&=`
  var right: ExpressionKind
}

object Anon_CommentsLeft {
  @scala.inline
  def apply(
    left: PatternKind | MemberExpressionKind,
    operator: `=` | `+=` | `-=` | `*=` | `/=` | `%=` | `<<=` | `>>=` | `>>>=` | `|=` | `^=` | `&=`,
    right: ExpressionKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): Anon_CommentsLeft = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CommentsLeft]
  }
}

