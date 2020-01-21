package typings.astTypes.nodesMod

import typings.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment extends Printable {
  var leading: Boolean
  var trailing: Boolean
  var value: String
}

object Comment {
  @scala.inline
  def apply(leading: Boolean, trailing: Boolean, value: String, loc: SourceLocationKind = null): Comment = {
    val __obj = js.Dynamic.literal(leading = leading.asInstanceOf[js.Any], trailing = trailing.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
}

