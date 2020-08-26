package typings.androiduix.android.widget.Spinner

import typings.androiduix.android.content.DialogInterface
import typings.androiduix.android.content.DialogInterface.OnClickListener
import typings.androiduix.android.graphics.drawable.Drawable
import typings.androiduix.android.widget.ListAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogPopup
  extends SpinnerPopup
     with OnClickListener {
  var _Spinner_this: typings.androiduix.android.widget.Spinner = js.native
  var mListAdapter: js.Any = js.native
  var mPopup: js.Any = js.native
  var mPrompt: js.Any = js.native
}

object DialogPopup {
  @scala.inline
  def apply(
    _Spinner_this: typings.androiduix.android.widget.Spinner,
    dismiss: () => Unit,
    getBackground: () => Drawable,
    getHintText: () => String,
    getHorizontalOffset: () => Double,
    getVerticalOffset: () => Double,
    isShowing: () => Boolean,
    mListAdapter: js.Any,
    mPopup: js.Any,
    mPrompt: js.Any,
    onClick: (DialogInterface, Double) => Unit,
    setAdapter: ListAdapter => Unit,
    setBackgroundDrawable: Drawable => Unit,
    setHorizontalOffset: Double => Unit,
    setPromptText: String => Unit,
    setVerticalOffset: Double => Unit,
    showPopup: (Double, Double) => Unit
  ): DialogPopup = {
    val __obj = js.Dynamic.literal(_Spinner_this = _Spinner_this.asInstanceOf[js.Any], dismiss = js.Any.fromFunction0(dismiss), getBackground = js.Any.fromFunction0(getBackground), getHintText = js.Any.fromFunction0(getHintText), getHorizontalOffset = js.Any.fromFunction0(getHorizontalOffset), getVerticalOffset = js.Any.fromFunction0(getVerticalOffset), isShowing = js.Any.fromFunction0(isShowing), mListAdapter = mListAdapter.asInstanceOf[js.Any], mPopup = mPopup.asInstanceOf[js.Any], mPrompt = mPrompt.asInstanceOf[js.Any], onClick = js.Any.fromFunction2(onClick), setAdapter = js.Any.fromFunction1(setAdapter), setBackgroundDrawable = js.Any.fromFunction1(setBackgroundDrawable), setHorizontalOffset = js.Any.fromFunction1(setHorizontalOffset), setPromptText = js.Any.fromFunction1(setPromptText), setVerticalOffset = js.Any.fromFunction1(setVerticalOffset), showPopup = js.Any.fromFunction2(showPopup))
    __obj.asInstanceOf[DialogPopup]
  }
  @scala.inline
  implicit class DialogPopupOps[Self <: DialogPopup] (val x: Self) extends AnyVal {
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
    def set_Spinner_this(value: typings.androiduix.android.widget.Spinner): Self = this.set("_Spinner_this", value.asInstanceOf[js.Any])
    @scala.inline
    def setMListAdapter(value: js.Any): Self = this.set("mListAdapter", value.asInstanceOf[js.Any])
    @scala.inline
    def setMPopup(value: js.Any): Self = this.set("mPopup", value.asInstanceOf[js.Any])
    @scala.inline
    def setMPrompt(value: js.Any): Self = this.set("mPrompt", value.asInstanceOf[js.Any])
  }
  
}

