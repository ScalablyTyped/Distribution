package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsElementsLoc extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var elements: js.Array[
    astDashTypesLib.genKindsMod.PatternKind | astDashTypesLib.genKindsMod.SpreadElementKind | scala.Null
  ]
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
}

object Anon_CommentsElementsLoc {
  @scala.inline
  def apply(
    elements: js.Array[
      astDashTypesLib.genKindsMod.PatternKind | astDashTypesLib.genKindsMod.SpreadElementKind | scala.Null
    ],
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null
  ): Anon_CommentsElementsLoc = {
    val __obj = js.Dynamic.literal(elements = elements)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_CommentsElementsLoc]
  }
}

