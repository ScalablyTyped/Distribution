package typings.angularCompiler.i18nAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageSpan extends js.Object {
  var endCol: Double = js.native
  var endLine: Double = js.native
  var filePath: String = js.native
  var startCol: Double = js.native
  var startLine: Double = js.native
}

object MessageSpan {
  @scala.inline
  def apply(endCol: Double, endLine: Double, filePath: String, startCol: Double, startLine: Double): MessageSpan = {
    val __obj = js.Dynamic.literal(endCol = endCol.asInstanceOf[js.Any], endLine = endLine.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], startCol = startCol.asInstanceOf[js.Any], startLine = startLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageSpan]
  }
  @scala.inline
  implicit class MessageSpanOps[Self <: MessageSpan] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEndCol(value: Double): Self = this.set("endCol", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndLine(value: Double): Self = this.set("endLine", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilePath(value: String): Self = this.set("filePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartCol(value: Double): Self = this.set("startCol", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartLine(value: Double): Self = this.set("startLine", value.asInstanceOf[js.Any])
  }
  
}

