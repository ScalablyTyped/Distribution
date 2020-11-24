package typings.athenajs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimOptions extends js.Object {
  
  var frameDuration: Double = js.native
  
  var frameHeight: Double = js.native
  
  var frameSpacing: js.UndefOr[Double] = js.native
  
  var frameWidth: Double = js.native
  
  var numFrames: Double = js.native
  
  var offsetX: js.UndefOr[Double] = js.native
  
  var offsetY: js.UndefOr[Double] = js.native
}
object AnimOptions {
  
  @scala.inline
  def apply(frameDuration: Double, frameHeight: Double, frameWidth: Double, numFrames: Double): AnimOptions = {
    val __obj = js.Dynamic.literal(frameDuration = frameDuration.asInstanceOf[js.Any], frameHeight = frameHeight.asInstanceOf[js.Any], frameWidth = frameWidth.asInstanceOf[js.Any], numFrames = numFrames.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimOptions]
  }
  
  @scala.inline
  implicit class AnimOptionsOps[Self <: AnimOptions] (val x: Self) extends AnyVal {
    
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
    def setFrameDuration(value: Double): Self = this.set("frameDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameHeight(value: Double): Self = this.set("frameHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameWidth(value: Double): Self = this.set("frameWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumFrames(value: Double): Self = this.set("numFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameSpacing(value: Double): Self = this.set("frameSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrameSpacing: Self = this.set("frameSpacing", js.undefined)
    
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetX: Self = this.set("offsetX", js.undefined)
    
    @scala.inline
    def setOffsetY(value: Double): Self = this.set("offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetY: Self = this.set("offsetY", js.undefined)
  }
}
