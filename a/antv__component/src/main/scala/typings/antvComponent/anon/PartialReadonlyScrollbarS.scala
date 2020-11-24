package typings.antvComponent.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Readonly<@antv/component.@antv/component/lib/scrollbar/scrollbar.ScrollbarStyle>> */
@js.native
trait PartialReadonlyScrollbarS extends js.Object {
  
  var lineCap: js.UndefOr[String] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var thumbColor: js.UndefOr[String] = js.native
  
  var trackColor: js.UndefOr[String] = js.native
}
object PartialReadonlyScrollbarS {
  
  @scala.inline
  def apply(): PartialReadonlyScrollbarS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialReadonlyScrollbarS]
  }
  
  @scala.inline
  implicit class PartialReadonlyScrollbarSOps[Self <: PartialReadonlyScrollbarS] (val x: Self) extends AnyVal {
    
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
    def setLineCap(value: String): Self = this.set("lineCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineCap: Self = this.set("lineCap", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setThumbColor(value: String): Self = this.set("thumbColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbColor: Self = this.set("thumbColor", js.undefined)
    
    @scala.inline
    def setTrackColor(value: String): Self = this.set("trackColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackColor: Self = this.set("trackColor", js.undefined)
  }
}
