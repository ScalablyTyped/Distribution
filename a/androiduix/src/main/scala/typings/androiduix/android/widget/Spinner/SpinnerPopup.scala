package typings.androiduix.android.widget.Spinner

import typings.androiduix.android.graphics.drawable.Drawable
import typings.androiduix.android.widget.ListAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpinnerPopup extends js.Object {
  
  def dismiss(): Unit = js.native
  
  def getBackground(): Drawable = js.native
  
  def getHintText(): String = js.native
  
  def getHorizontalOffset(): Double = js.native
  
  def getVerticalOffset(): Double = js.native
  
  def isShowing(): Boolean = js.native
  
  def setAdapter(adapter: ListAdapter): Unit = js.native
  
  def setBackgroundDrawable(bg: Drawable): Unit = js.native
  
  def setHorizontalOffset(px: Double): Unit = js.native
  
  def setPromptText(hintText: String): Unit = js.native
  
  def setVerticalOffset(px: Double): Unit = js.native
  
  def showPopup(textDirection: Double, textAlignment: Double): Unit = js.native
}
object SpinnerPopup {
  
  @scala.inline
  def apply(
    dismiss: () => Unit,
    getBackground: () => Drawable,
    getHintText: () => String,
    getHorizontalOffset: () => Double,
    getVerticalOffset: () => Double,
    isShowing: () => Boolean,
    setAdapter: ListAdapter => Unit,
    setBackgroundDrawable: Drawable => Unit,
    setHorizontalOffset: Double => Unit,
    setPromptText: String => Unit,
    setVerticalOffset: Double => Unit,
    showPopup: (Double, Double) => Unit
  ): SpinnerPopup = {
    val __obj = js.Dynamic.literal(dismiss = js.Any.fromFunction0(dismiss), getBackground = js.Any.fromFunction0(getBackground), getHintText = js.Any.fromFunction0(getHintText), getHorizontalOffset = js.Any.fromFunction0(getHorizontalOffset), getVerticalOffset = js.Any.fromFunction0(getVerticalOffset), isShowing = js.Any.fromFunction0(isShowing), setAdapter = js.Any.fromFunction1(setAdapter), setBackgroundDrawable = js.Any.fromFunction1(setBackgroundDrawable), setHorizontalOffset = js.Any.fromFunction1(setHorizontalOffset), setPromptText = js.Any.fromFunction1(setPromptText), setVerticalOffset = js.Any.fromFunction1(setVerticalOffset), showPopup = js.Any.fromFunction2(showPopup))
    __obj.asInstanceOf[SpinnerPopup]
  }
  
  @scala.inline
  implicit class SpinnerPopupOps[Self <: SpinnerPopup] (val x: Self) extends AnyVal {
    
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
    def setDismiss(value: () => Unit): Self = this.set("dismiss", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBackground(value: () => Drawable): Self = this.set("getBackground", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHintText(value: () => String): Self = this.set("getHintText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHorizontalOffset(value: () => Double): Self = this.set("getHorizontalOffset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVerticalOffset(value: () => Double): Self = this.set("getVerticalOffset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsShowing(value: () => Boolean): Self = this.set("isShowing", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetAdapter(value: ListAdapter => Unit): Self = this.set("setAdapter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetBackgroundDrawable(value: Drawable => Unit): Self = this.set("setBackgroundDrawable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHorizontalOffset(value: Double => Unit): Self = this.set("setHorizontalOffset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPromptText(value: String => Unit): Self = this.set("setPromptText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetVerticalOffset(value: Double => Unit): Self = this.set("setVerticalOffset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowPopup(value: (Double, Double) => Unit): Self = this.set("showPopup", js.Any.fromFunction2(value))
  }
}
