package typings.angularCompiler.compilerFacadeInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParseSourceSpan extends js.Object {
  var details: js.Any = js.native
  var end: js.Any = js.native
  var start: js.Any = js.native
}

object ParseSourceSpan {
  @scala.inline
  def apply(details: js.Any, end: js.Any, start: js.Any): ParseSourceSpan = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseSourceSpan]
  }
  @scala.inline
  implicit class ParseSourceSpanOps[Self <: ParseSourceSpan] (val x: Self) extends AnyVal {
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
    def setDetails(value: js.Any): Self = this.set("details", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnd(value: js.Any): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: js.Any): Self = this.set("start", value.asInstanceOf[js.Any])
  }
  
}

