package typings
package atAngularCompilerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SourceSpan extends js.Object {
  var sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan | scala.Null
}

object Anon_SourceSpan {
  @scala.inline
  def apply(sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan = null): Anon_SourceSpan = {
    val __obj = js.Dynamic.literal()
    if (sourceSpan != null) __obj.updateDynamic("sourceSpan")(sourceSpan)
    __obj.asInstanceOf[Anon_SourceSpan]
  }
}

