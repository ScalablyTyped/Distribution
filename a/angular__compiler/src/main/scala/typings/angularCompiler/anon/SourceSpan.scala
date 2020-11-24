package typings.angularCompiler.anon

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceSpan extends js.Object {
  
  var sourceSpan: ParseSourceSpan | Null = js.native
}
object SourceSpan {
  
  @scala.inline
  def apply(): SourceSpan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceSpan]
  }
  
  @scala.inline
  implicit class SourceSpanOps[Self <: SourceSpan] (val x: Self) extends AnyVal {
    
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
    def setSourceSpan(value: ParseSourceSpan): Self = this.set("sourceSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceSpanNull: Self = this.set("sourceSpan", null)
  }
}
