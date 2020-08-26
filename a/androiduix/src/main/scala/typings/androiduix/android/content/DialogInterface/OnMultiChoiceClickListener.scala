package typings.androiduix.android.content.DialogInterface

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnMultiChoiceClickListener extends js.Object {
  def onClick(dialog: typings.androiduix.android.content.DialogInterface, which: Double, isChecked: Boolean): Unit = js.native
}

object OnMultiChoiceClickListener {
  @scala.inline
  def apply(onClick: (typings.androiduix.android.content.DialogInterface, Double, Boolean) => Unit): OnMultiChoiceClickListener = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction3(onClick))
    __obj.asInstanceOf[OnMultiChoiceClickListener]
  }
  @scala.inline
  implicit class OnMultiChoiceClickListenerOps[Self <: OnMultiChoiceClickListener] (val x: Self) extends AnyVal {
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
    def setOnClick(value: (typings.androiduix.android.content.DialogInterface, Double, Boolean) => Unit): Self = this.set("onClick", js.Any.fromFunction3(value))
  }
  
}

