package typings.androiduix.android.support.v4.view.ViewPager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnPageChangeListener extends js.Object {
  
  def onPageScrollStateChanged(state: Double): Unit = js.native
  
  def onPageScrolled(position: Double, positionOffset: Double, positionOffsetPixels: Double): Unit = js.native
  
  def onPageSelected(position: Double): Unit = js.native
}
object OnPageChangeListener {
  
  @scala.inline
  def apply(
    onPageScrollStateChanged: Double => Unit,
    onPageScrolled: (Double, Double, Double) => Unit,
    onPageSelected: Double => Unit
  ): OnPageChangeListener = {
    val __obj = js.Dynamic.literal(onPageScrollStateChanged = js.Any.fromFunction1(onPageScrollStateChanged), onPageScrolled = js.Any.fromFunction3(onPageScrolled), onPageSelected = js.Any.fromFunction1(onPageSelected))
    __obj.asInstanceOf[OnPageChangeListener]
  }
  
  @scala.inline
  implicit class OnPageChangeListenerOps[Self <: OnPageChangeListener] (val x: Self) extends AnyVal {
    
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
    def setOnPageScrollStateChanged(value: Double => Unit): Self = this.set("onPageScrollStateChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPageScrolled(value: (Double, Double, Double) => Unit): Self = this.set("onPageScrolled", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnPageSelected(value: Double => Unit): Self = this.set("onPageSelected", js.Any.fromFunction1(value))
  }
}
