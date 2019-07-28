package typings.astDashTypes

import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.ProgramKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Comments extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var name: js.UndefOr[String | Null] = js.undefined
  var program: ProgramKind
}

object Anon_Comments {
  @scala.inline
  def apply(
    program: ProgramKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    name: String = null
  ): Anon_Comments = {
    val __obj = js.Dynamic.literal(program = program)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_Comments]
  }
}

