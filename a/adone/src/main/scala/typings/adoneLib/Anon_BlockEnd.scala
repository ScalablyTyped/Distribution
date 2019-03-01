package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlockEnd extends js.Object {
  var blockEnd: js.UndefOr[java.lang.String] = js.undefined
  var blockStart: js.UndefOr[java.lang.String] = js.undefined
  var commentEnd: js.UndefOr[java.lang.String] = js.undefined
  var commentStart: js.UndefOr[java.lang.String] = js.undefined
  var variableEnd: js.UndefOr[java.lang.String] = js.undefined
  var variableStart: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_BlockEnd {
  @scala.inline
  def apply(
    blockEnd: java.lang.String = null,
    blockStart: java.lang.String = null,
    commentEnd: java.lang.String = null,
    commentStart: java.lang.String = null,
    variableEnd: java.lang.String = null,
    variableStart: java.lang.String = null
  ): Anon_BlockEnd = {
    val __obj = js.Dynamic.literal()
    if (blockEnd != null) __obj.updateDynamic("blockEnd")(blockEnd)
    if (blockStart != null) __obj.updateDynamic("blockStart")(blockStart)
    if (commentEnd != null) __obj.updateDynamic("commentEnd")(commentEnd)
    if (commentStart != null) __obj.updateDynamic("commentStart")(commentStart)
    if (variableEnd != null) __obj.updateDynamic("variableEnd")(variableEnd)
    if (variableStart != null) __obj.updateDynamic("variableStart")(variableStart)
    __obj.asInstanceOf[Anon_BlockEnd]
  }
}

