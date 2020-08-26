package typings.androiduix.android.widget.AbsListView

import typings.androiduix.android.widget.AdapterView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdapterDataSetObserver
  extends typings.androiduix.android.widget.AdapterView.AdapterDataSetObserver {
  var _AbsListView_this: typings.androiduix.android.widget.AbsListView = js.native
}

object AdapterDataSetObserver {
  @scala.inline
  def apply(
    AdapterView_this: AdapterView[_],
    _AbsListView_this: typings.androiduix.android.widget.AbsListView,
    clearSavedState: () => Unit,
    onChanged: () => Unit,
    onInvalidated: () => Unit
  ): AdapterDataSetObserver = {
    val __obj = js.Dynamic.literal(AdapterView_this = AdapterView_this.asInstanceOf[js.Any], _AbsListView_this = _AbsListView_this.asInstanceOf[js.Any], clearSavedState = js.Any.fromFunction0(clearSavedState), onChanged = js.Any.fromFunction0(onChanged), onInvalidated = js.Any.fromFunction0(onInvalidated))
    __obj.asInstanceOf[AdapterDataSetObserver]
  }
  @scala.inline
  implicit class AdapterDataSetObserverOps[Self <: AdapterDataSetObserver] (val x: Self) extends AnyVal {
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

