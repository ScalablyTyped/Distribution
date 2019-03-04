package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsLeft extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var left: astDashTypesLib.genKindsMod.PatternKind
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var operator: astDashTypesLib.astDashTypesLibStrings.`=` | astDashTypesLib.astDashTypesLibStrings.`+=` | astDashTypesLib.astDashTypesLibStrings.`-=` | astDashTypesLib.astDashTypesLibStrings.`*=` | astDashTypesLib.astDashTypesLibStrings.`/=` | astDashTypesLib.astDashTypesLibStrings.`%=` | astDashTypesLib.astDashTypesLibStrings.`<<=` | astDashTypesLib.astDashTypesLibStrings.`>>=` | astDashTypesLib.astDashTypesLibStrings.`>>>=` | astDashTypesLib.astDashTypesLibStrings.`|=` | astDashTypesLib.astDashTypesLibStrings.`^=` | astDashTypesLib.astDashTypesLibStrings.`&=`
  var right: astDashTypesLib.genKindsMod.ExpressionKind
}

object Anon_CommentsLeft {
  @scala.inline
  def apply(
    left: astDashTypesLib.genKindsMod.PatternKind,
    operator: astDashTypesLib.astDashTypesLibStrings.`=` | astDashTypesLib.astDashTypesLibStrings.`+=` | astDashTypesLib.astDashTypesLibStrings.`-=` | astDashTypesLib.astDashTypesLibStrings.`*=` | astDashTypesLib.astDashTypesLibStrings.`/=` | astDashTypesLib.astDashTypesLibStrings.`%=` | astDashTypesLib.astDashTypesLibStrings.`<<=` | astDashTypesLib.astDashTypesLibStrings.`>>=` | astDashTypesLib.astDashTypesLibStrings.`>>>=` | astDashTypesLib.astDashTypesLibStrings.`|=` | astDashTypesLib.astDashTypesLibStrings.`^=` | astDashTypesLib.astDashTypesLibStrings.`&=`,
    right: astDashTypesLib.genKindsMod.ExpressionKind,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null
  ): Anon_CommentsLeft = {
    val __obj = js.Dynamic.literal(left = left, operator = operator.asInstanceOf[js.Any], right = right)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_CommentsLeft]
  }
}

