package typings.amapJsSdk.AMap

import typings.amapJsSdk.anon.Lat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToolBar
  extends EventBindable
     with MapControl {
  
  def doLocation(): Unit = js.native
  
  def getLocation(): Lat = js.native
  
  def getOffset(): Pixel = js.native
  
  def hideDirection(): Unit = js.native
  
  def hideLocation(): Unit = js.native
  
  def hideRuler(): Unit = js.native
  
  def setOffset(offset: Pixel): Unit = js.native
  
  def showDirection(): Unit = js.native
  
  def showLocation(): Unit = js.native
  
  def showRuler(): Unit = js.native
}
object ToolBar {
  
  @scala.inline
  def apply(
    doLocation: () => Unit,
    getLocation: () => Lat,
    getOffset: () => Pixel,
    hide: () => Unit,
    hideDirection: () => Unit,
    hideLocation: () => Unit,
    hideRuler: () => Unit,
    off: (String, EventCallback) => Unit,
    on: (String, EventCallback) => Unit,
    setOffset: Pixel => Unit,
    show: () => Unit,
    showDirection: () => Unit,
    showLocation: () => Unit,
    showRuler: () => Unit
  ): ToolBar = {
    val __obj = js.Dynamic.literal(doLocation = js.Any.fromFunction0(doLocation), getLocation = js.Any.fromFunction0(getLocation), getOffset = js.Any.fromFunction0(getOffset), hide = js.Any.fromFunction0(hide), hideDirection = js.Any.fromFunction0(hideDirection), hideLocation = js.Any.fromFunction0(hideLocation), hideRuler = js.Any.fromFunction0(hideRuler), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), setOffset = js.Any.fromFunction1(setOffset), show = js.Any.fromFunction0(show), showDirection = js.Any.fromFunction0(showDirection), showLocation = js.Any.fromFunction0(showLocation), showRuler = js.Any.fromFunction0(showRuler))
    __obj.asInstanceOf[ToolBar]
  }
  
  @scala.inline
  implicit class ToolBarOps[Self <: ToolBar] (val x: Self) extends AnyVal {
    
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
    def setDoLocation(value: () => Unit): Self = this.set("doLocation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLocation(value: () => Lat): Self = this.set("getLocation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOffset(value: () => Pixel): Self = this.set("getOffset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHideDirection(value: () => Unit): Self = this.set("hideDirection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHideLocation(value: () => Unit): Self = this.set("hideLocation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHideRuler(value: () => Unit): Self = this.set("hideRuler", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetOffset(value: Pixel => Unit): Self = this.set("setOffset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowDirection(value: () => Unit): Self = this.set("showDirection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowLocation(value: () => Unit): Self = this.set("showLocation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowRuler(value: () => Unit): Self = this.set("showRuler", js.Any.fromFunction0(value))
  }
}
