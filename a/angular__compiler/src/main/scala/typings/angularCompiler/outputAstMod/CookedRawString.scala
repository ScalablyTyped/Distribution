package typings.angularCompiler.outputAstMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CookedRawString extends js.Object {
  
  var cooked: String = js.native
  
  var range: ParseSourceSpan | Null = js.native
  
  var raw: String = js.native
}
object CookedRawString {
  
  @scala.inline
  def apply(cooked: String, raw: String): CookedRawString = {
    val __obj = js.Dynamic.literal(cooked = cooked.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookedRawString]
  }
  
  @scala.inline
  implicit class CookedRawStringOps[Self <: CookedRawString] (val x: Self) extends AnyVal {
    
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
    def setCooked(value: String): Self = this.set("cooked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw(value: String): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: ParseSourceSpan): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeNull: Self = this.set("range", null)
  }
}
