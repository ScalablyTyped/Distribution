package typings.astDashTypes

import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import typings.astDashTypes.genKindsMod.TSTypeKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CheckType extends js.Object {
  var checkType: TSTypeKind
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var extendsType: TSTypeKind
  var falseType: TSTypeKind
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var trueType: TSTypeKind
}

object Anon_CheckType {
  @scala.inline
  def apply(
    checkType: TSTypeKind,
    extendsType: TSTypeKind,
    falseType: TSTypeKind,
    trueType: TSTypeKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): Anon_CheckType = {
    val __obj = js.Dynamic.literal(checkType = checkType, extendsType = extendsType, falseType = falseType, trueType = trueType)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_CheckType]
  }
}

