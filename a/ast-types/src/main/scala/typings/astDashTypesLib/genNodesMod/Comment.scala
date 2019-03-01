package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment extends Printable {
  var leading: scala.Boolean
  var trailing: scala.Boolean
  var value: java.lang.String
}

object Comment {
  @scala.inline
  def apply(
    leading: scala.Boolean,
    trailing: scala.Boolean,
    value: java.lang.String,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null
  ): Comment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("leading")(leading)
    __obj.updateDynamic("trailing")(trailing)
    __obj.updateDynamic("value")(value)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Comment]
  }
}

