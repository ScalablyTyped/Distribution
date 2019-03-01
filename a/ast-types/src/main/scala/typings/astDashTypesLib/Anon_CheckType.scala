package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CheckType extends js.Object {
  var checkType: astDashTypesLib.genKindsMod.TSTypeKind
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var extendsType: astDashTypesLib.genKindsMod.TSTypeKind
  var falseType: astDashTypesLib.genKindsMod.TSTypeKind
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var trueType: astDashTypesLib.genKindsMod.TSTypeKind
}

object Anon_CheckType {
  @scala.inline
  def apply(
    checkType: astDashTypesLib.genKindsMod.TSTypeKind,
    extendsType: astDashTypesLib.genKindsMod.TSTypeKind,
    falseType: astDashTypesLib.genKindsMod.TSTypeKind,
    trueType: astDashTypesLib.genKindsMod.TSTypeKind,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null
  ): Anon_CheckType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("checkType")(checkType)
    __obj.updateDynamic("extendsType")(extendsType)
    __obj.updateDynamic("falseType")(falseType)
    __obj.updateDynamic("trueType")(trueType)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_CheckType]
  }
}

