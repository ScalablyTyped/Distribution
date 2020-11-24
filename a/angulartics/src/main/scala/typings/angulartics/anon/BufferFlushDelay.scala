package typings.angulartics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BufferFlushDelay extends js.Object {
  
  var bufferFlushDelay: Double = js.native
  
  var developerMode: Boolean = js.native
  
  var optOut: Boolean = js.native
  
  var pageTracking: AutoBasePath = js.native
  
  var trackExceptions: Boolean = js.native
}
object BufferFlushDelay {
  
  @scala.inline
  def apply(
    bufferFlushDelay: Double,
    developerMode: Boolean,
    optOut: Boolean,
    pageTracking: AutoBasePath,
    trackExceptions: Boolean
  ): BufferFlushDelay = {
    val __obj = js.Dynamic.literal(bufferFlushDelay = bufferFlushDelay.asInstanceOf[js.Any], developerMode = developerMode.asInstanceOf[js.Any], optOut = optOut.asInstanceOf[js.Any], pageTracking = pageTracking.asInstanceOf[js.Any], trackExceptions = trackExceptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferFlushDelay]
  }
  
  @scala.inline
  implicit class BufferFlushDelayOps[Self <: BufferFlushDelay] (val x: Self) extends AnyVal {
    
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
    def setBufferFlushDelay(value: Double): Self = this.set("bufferFlushDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeveloperMode(value: Boolean): Self = this.set("developerMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptOut(value: Boolean): Self = this.set("optOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTracking(value: AutoBasePath): Self = this.set("pageTracking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackExceptions(value: Boolean): Self = this.set("trackExceptions", value.asInstanceOf[js.Any])
  }
}
