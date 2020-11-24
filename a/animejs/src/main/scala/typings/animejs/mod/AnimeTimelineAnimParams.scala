package typings.animejs.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimeTimelineAnimParams extends AnimeAnimParams {
  
  var timelineOffset: Double | String | FunctionBasedParameter = js.native
}
object AnimeTimelineAnimParams {
  
  @scala.inline
  def apply(timelineOffset: Double | String | FunctionBasedParameter): AnimeTimelineAnimParams = {
    val __obj = js.Dynamic.literal(timelineOffset = timelineOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimeTimelineAnimParams]
  }
  
  @scala.inline
  implicit class AnimeTimelineAnimParamsOps[Self <: AnimeTimelineAnimParams] (val x: Self) extends AnyVal {
    
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
    def setTimelineOffsetFunction3(value: (/* element */ HTMLElement, /* index */ Double, /* length */ Double) => Double): Self = this.set("timelineOffset", js.Any.fromFunction3(value))
    
    @scala.inline
    def setTimelineOffset(value: Double | String | FunctionBasedParameter): Self = this.set("timelineOffset", value.asInstanceOf[js.Any])
  }
}
