package typings.androiduix.android.widget

import typings.androiduix.android.database.DataSetObserver
import typings.androiduix.android.view.View
import typings.androiduix.android.view.ViewGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseAdapter
  extends ListAdapter
     with SpinnerAdapter {
  var mDataSetObservable: js.Any = js.native
  def notifyDataSetChanged(): Unit = js.native
  def notifyDataSetInvalidated(): Unit = js.native
}

object BaseAdapter {
  @scala.inline
  def apply(
    areAllItemsEnabled: () => Boolean,
    getCount: () => Double,
    getDropDownView: (Double, View, ViewGroup) => View,
    getItem: Double => js.Any,
    getItemId: Double => Double,
    getItemViewType: Double => Double,
    getView: (Double, View, ViewGroup) => View,
    getViewTypeCount: () => Double,
    hasStableIds: () => Boolean,
    isEmpty: () => Boolean,
    isEnabled: Double => Boolean,
    mDataSetObservable: js.Any,
    notifyDataSetChanged: () => Unit,
    notifyDataSetInvalidated: () => Unit,
    registerDataSetObserver: DataSetObserver => Unit,
    unregisterDataSetObserver: DataSetObserver => Unit
  ): BaseAdapter = {
    val __obj = js.Dynamic.literal(areAllItemsEnabled = js.Any.fromFunction0(areAllItemsEnabled), getCount = js.Any.fromFunction0(getCount), getDropDownView = js.Any.fromFunction3(getDropDownView), getItem = js.Any.fromFunction1(getItem), getItemId = js.Any.fromFunction1(getItemId), getItemViewType = js.Any.fromFunction1(getItemViewType), getView = js.Any.fromFunction3(getView), getViewTypeCount = js.Any.fromFunction0(getViewTypeCount), hasStableIds = js.Any.fromFunction0(hasStableIds), isEmpty = js.Any.fromFunction0(isEmpty), isEnabled = js.Any.fromFunction1(isEnabled), mDataSetObservable = mDataSetObservable.asInstanceOf[js.Any], notifyDataSetChanged = js.Any.fromFunction0(notifyDataSetChanged), notifyDataSetInvalidated = js.Any.fromFunction0(notifyDataSetInvalidated), registerDataSetObserver = js.Any.fromFunction1(registerDataSetObserver), unregisterDataSetObserver = js.Any.fromFunction1(unregisterDataSetObserver))
    __obj.asInstanceOf[BaseAdapter]
  }
  @scala.inline
  implicit class BaseAdapterOps[Self <: BaseAdapter] (val x: Self) extends AnyVal {
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
    def setMDataSetObservable(value: js.Any): Self = this.set("mDataSetObservable", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotifyDataSetChanged(value: () => Unit): Self = this.set("notifyDataSetChanged", js.Any.fromFunction0(value))
    @scala.inline
    def setNotifyDataSetInvalidated(value: () => Unit): Self = this.set("notifyDataSetInvalidated", js.Any.fromFunction0(value))
  }
  
}

