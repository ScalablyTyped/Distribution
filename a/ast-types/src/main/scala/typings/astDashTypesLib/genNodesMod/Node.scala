package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends Printable {
  var comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null
  var `type`: java.lang.String
}

object Node {
  @scala.inline
  def apply(
    `type`: java.lang.String,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null
  ): Node = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Node]
  }
}

