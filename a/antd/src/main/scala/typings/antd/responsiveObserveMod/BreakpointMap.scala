package typings.antd.responsiveObserveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<antd.antd/lib/_util/responsiveObserve.Breakpoint, string> */
@js.native
trait BreakpointMap extends js.Object {
  
  var lg: String = js.native
  
  var md: String = js.native
  
  var sm: String = js.native
  
  var xl: String = js.native
  
  var xs: String = js.native
  
  var xxl: String = js.native
}
object BreakpointMap {
  
  @scala.inline
  def apply(lg: String, md: String, sm: String, xl: String, xs: String, xxl: String): BreakpointMap = {
    val __obj = js.Dynamic.literal(lg = lg.asInstanceOf[js.Any], md = md.asInstanceOf[js.Any], sm = sm.asInstanceOf[js.Any], xl = xl.asInstanceOf[js.Any], xs = xs.asInstanceOf[js.Any], xxl = xxl.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreakpointMap]
  }
  
  @scala.inline
  implicit class BreakpointMapOps[Self <: BreakpointMap] (val x: Self) extends AnyVal {
    
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
    def setLg(value: String): Self = this.set("lg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMd(value: String): Self = this.set("md", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSm(value: String): Self = this.set("sm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXl(value: String): Self = this.set("xl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXs(value: String): Self = this.set("xs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXxl(value: String): Self = this.set("xxl", value.asInstanceOf[js.Any])
  }
}
