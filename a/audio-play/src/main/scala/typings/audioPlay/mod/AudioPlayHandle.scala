package typings.audioPlay.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioPlayHandle extends js.Object {
  
  def pause(): js.Any = js.native
  
  def play(): js.Any = js.native
}
object AudioPlayHandle {
  
  @scala.inline
  def apply(pause: () => js.Any, play: () => js.Any): AudioPlayHandle = {
    val __obj = js.Dynamic.literal(pause = js.Any.fromFunction0(pause), play = js.Any.fromFunction0(play))
    __obj.asInstanceOf[AudioPlayHandle]
  }
  
  @scala.inline
  implicit class AudioPlayHandleOps[Self <: AudioPlayHandle] (val x: Self) extends AnyVal {
    
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
    def setPause(value: () => js.Any): Self = this.set("pause", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPlay(value: () => js.Any): Self = this.set("play", js.Any.fromFunction0(value))
  }
}
