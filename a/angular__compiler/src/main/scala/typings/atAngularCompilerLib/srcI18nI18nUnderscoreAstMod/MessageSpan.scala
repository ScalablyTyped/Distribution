package typings
package atAngularCompilerLib.srcI18nI18nUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageSpan extends js.Object {
  var endCol: scala.Double
  var endLine: scala.Double
  var filePath: java.lang.String
  var startCol: scala.Double
  var startLine: scala.Double
}

object MessageSpan {
  @scala.inline
  def apply(
    endCol: scala.Double,
    endLine: scala.Double,
    filePath: java.lang.String,
    startCol: scala.Double,
    startLine: scala.Double
  ): MessageSpan = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("endCol")(endCol)
    __obj.updateDynamic("endLine")(endLine)
    __obj.updateDynamic("filePath")(filePath)
    __obj.updateDynamic("startCol")(startCol)
    __obj.updateDynamic("startLine")(startLine)
    __obj.asInstanceOf[MessageSpan]
  }
}

