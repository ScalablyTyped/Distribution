package typings.angularCompiler.anon

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceSpan extends js.Object {
  var sourceSpan: ParseSourceSpan | Null
}

object SourceSpan {
  @scala.inline
  def apply(sourceSpan: ParseSourceSpan = null): SourceSpan = {
    val __obj = js.Dynamic.literal(sourceSpan = sourceSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceSpan]
  }
}

