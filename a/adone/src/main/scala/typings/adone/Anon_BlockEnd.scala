package typings.adone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlockEnd extends js.Object {
  var blockEnd: js.UndefOr[String] = js.undefined
  var blockStart: js.UndefOr[String] = js.undefined
  var commentEnd: js.UndefOr[String] = js.undefined
  var commentStart: js.UndefOr[String] = js.undefined
  var variableEnd: js.UndefOr[String] = js.undefined
  var variableStart: js.UndefOr[String] = js.undefined
}

object Anon_BlockEnd {
  @scala.inline
  def apply(
    blockEnd: String = null,
    blockStart: String = null,
    commentEnd: String = null,
    commentStart: String = null,
    variableEnd: String = null,
    variableStart: String = null
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

