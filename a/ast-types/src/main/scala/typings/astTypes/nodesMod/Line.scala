package typings.astTypes.nodesMod

import typings.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Line
  extends Comment
     with ASTNode {
  var `type`: typings.astTypes.astTypesStrings.Line
}

object Line {
  @scala.inline
  def apply(
    leading: Boolean,
    trailing: Boolean,
    `type`: typings.astTypes.astTypesStrings.Line,
    value: String,
    loc: SourceLocationKind = null
  ): Line = {
    val __obj = js.Dynamic.literal(leading = leading.asInstanceOf[js.Any], trailing = trailing.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Line]
  }
}

