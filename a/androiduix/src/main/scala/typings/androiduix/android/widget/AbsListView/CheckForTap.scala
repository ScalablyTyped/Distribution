package typings.androiduix.android.widget.AbsListView

import typings.androiduix.java_.lang.Runnable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckForTap extends Runnable {
  var _AbsListView_this: typings.androiduix.android.widget.AbsListView = js.native
}

object CheckForTap {
  @scala.inline
  def apply(_AbsListView_this: typings.androiduix.android.widget.AbsListView, run: () => js.Any): CheckForTap = {
    val __obj = js.Dynamic.literal(_AbsListView_this = _AbsListView_this.asInstanceOf[js.Any], run = js.Any.fromFunction0(run))
    __obj.asInstanceOf[CheckForTap]
  }
  @scala.inline
  implicit class CheckForTapOps[Self <: CheckForTap] (val x: Self) extends AnyVal {
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
    def set_AbsListView_this(value: typings.androiduix.android.widget.AbsListView): Self = this.set("_AbsListView_this", value.asInstanceOf[js.Any])
  }
  
}

