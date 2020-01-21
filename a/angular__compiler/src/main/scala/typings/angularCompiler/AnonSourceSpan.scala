package typings.angularCompiler

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSourceSpan extends js.Object {
  var sourceSpan: ParseSourceSpan | Null
}

object AnonSourceSpan {
  @scala.inline
  def apply(sourceSpan: ParseSourceSpan = null): AnonSourceSpan = {
    val __obj = js.Dynamic.literal()
    if (sourceSpan != null) __obj.updateDynamic("sourceSpan")(sourceSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSourceSpan]
  }
}

