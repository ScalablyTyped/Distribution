package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Comments extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var name: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var program: astDashTypesLib.genKindsMod.ProgramKind
}

object Anon_Comments {
  @scala.inline
  def apply(
    program: astDashTypesLib.genKindsMod.ProgramKind,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null,
    name: java.lang.String = null
  ): Anon_Comments = {
    val __obj = js.Dynamic.literal(program = program)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_Comments]
  }
}

