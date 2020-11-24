package typings.androiduix.android.support.v4.widget.DrawerLayout

import typings.androiduix.android.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawerListener extends js.Object {
  
  def onDrawerClosed(drawerView: View): Unit = js.native
  
  def onDrawerOpened(drawerView: View): Unit = js.native
  
  def onDrawerSlide(drawerView: View, slideOffset: Double): Unit = js.native
  
  def onDrawerStateChanged(newState: Double): Unit = js.native
}
object DrawerListener {
  
  @scala.inline
  def apply(
    onDrawerClosed: View => Unit,
    onDrawerOpened: View => Unit,
    onDrawerSlide: (View, Double) => Unit,
    onDrawerStateChanged: Double => Unit
  ): DrawerListener = {
    val __obj = js.Dynamic.literal(onDrawerClosed = js.Any.fromFunction1(onDrawerClosed), onDrawerOpened = js.Any.fromFunction1(onDrawerOpened), onDrawerSlide = js.Any.fromFunction2(onDrawerSlide), onDrawerStateChanged = js.Any.fromFunction1(onDrawerStateChanged))
    __obj.asInstanceOf[DrawerListener]
  }
  
  @scala.inline
  implicit class DrawerListenerOps[Self <: DrawerListener] (val x: Self) extends AnyVal {
    
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
    def setOnDrawerClosed(value: View => Unit): Self = this.set("onDrawerClosed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDrawerOpened(value: View => Unit): Self = this.set("onDrawerOpened", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDrawerSlide(value: (View, Double) => Unit): Self = this.set("onDrawerSlide", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnDrawerStateChanged(value: Double => Unit): Self = this.set("onDrawerStateChanged", js.Any.fromFunction1(value))
  }
}
