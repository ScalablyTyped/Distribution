package typings.asynciterator.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaxBufferSize extends js.Object {
  
  var autoStart: js.UndefOr[Boolean] = js.native
  
  var maxBufferSize: js.UndefOr[Double] = js.native
}
object MaxBufferSize {
  
  @scala.inline
  def apply(): MaxBufferSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxBufferSize]
  }
  
  @scala.inline
  implicit class MaxBufferSizeOps[Self <: MaxBufferSize] (val x: Self) extends AnyVal {
    
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
    def setAutoStart(value: Boolean): Self = this.set("autoStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoStart: Self = this.set("autoStart", js.undefined)
    
    @scala.inline
    def setMaxBufferSize(value: Double): Self = this.set("maxBufferSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxBufferSize: Self = this.set("maxBufferSize", js.undefined)
  }
}
