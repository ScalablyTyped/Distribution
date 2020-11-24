package typings.angularCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnableLongStackTrace extends js.Object {
  
  var enableLongStackTrace: js.UndefOr[Boolean] = js.native
  
  var shouldCoalesceEventChangeDetection: js.UndefOr[Boolean] = js.native
}
object EnableLongStackTrace {
  
  @scala.inline
  def apply(): EnableLongStackTrace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableLongStackTrace]
  }
  
  @scala.inline
  implicit class EnableLongStackTraceOps[Self <: EnableLongStackTrace] (val x: Self) extends AnyVal {
    
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
    def setEnableLongStackTrace(value: Boolean): Self = this.set("enableLongStackTrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableLongStackTrace: Self = this.set("enableLongStackTrace", js.undefined)
    
    @scala.inline
    def setShouldCoalesceEventChangeDetection(value: Boolean): Self = this.set("shouldCoalesceEventChangeDetection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldCoalesceEventChangeDetection: Self = this.set("shouldCoalesceEventChangeDetection", js.undefined)
  }
}
