package typings.androiduix.android.view.menu.MenuPopupHelper

import typings.androiduix.android.database.DataSetObserver
import typings.androiduix.android.view.View
import typings.androiduix.android.view.ViewGroup
import typings.androiduix.android.widget.BaseAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuAdapter extends BaseAdapter {
  var _MenuPopupHelper_this: typings.androiduix.android.view.menu.MenuPopupHelper = js.native
  var mAdapterMenu: js.Any = js.native
}

object MenuAdapter {
  @scala.inline
  def apply(
    _MenuPopupHelper_this: typings.androiduix.android.view.menu.MenuPopupHelper,
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
    mAdapterMenu: js.Any,
    mDataSetObservable: js.Any,
    notifyDataSetChanged: () => Unit,
    notifyDataSetInvalidated: () => Unit,
    registerDataSetObserver: DataSetObserver => Unit,
    unregisterDataSetObserver: DataSetObserver => Unit
  ): MenuAdapter = {
    val __obj = js.Dynamic.literal(_MenuPopupHelper_this = _MenuPopupHelper_this.asInstanceOf[js.Any], areAllItemsEnabled = js.Any.fromFunction0(areAllItemsEnabled), getCount = js.Any.fromFunction0(getCount), getDropDownView = js.Any.fromFunction3(getDropDownView), getItem = js.Any.fromFunction1(getItem), getItemId = js.Any.fromFunction1(getItemId), getItemViewType = js.Any.fromFunction1(getItemViewType), getView = js.Any.fromFunction3(getView), getViewTypeCount = js.Any.fromFunction0(getViewTypeCount), hasStableIds = js.Any.fromFunction0(hasStableIds), isEmpty = js.Any.fromFunction0(isEmpty), isEnabled = js.Any.fromFunction1(isEnabled), mAdapterMenu = mAdapterMenu.asInstanceOf[js.Any], mDataSetObservable = mDataSetObservable.asInstanceOf[js.Any], notifyDataSetChanged = js.Any.fromFunction0(notifyDataSetChanged), notifyDataSetInvalidated = js.Any.fromFunction0(notifyDataSetInvalidated), registerDataSetObserver = js.Any.fromFunction1(registerDataSetObserver), unregisterDataSetObserver = js.Any.fromFunction1(unregisterDataSetObserver))
    __obj.asInstanceOf[MenuAdapter]
  }
  @scala.inline
  implicit class MenuAdapterOps[Self <: MenuAdapter] (val x: Self) extends AnyVal {
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
    def set_MenuPopupHelper_this(value: typings.androiduix.android.view.menu.MenuPopupHelper): Self = this.set("_MenuPopupHelper_this", value.asInstanceOf[js.Any])
    @scala.inline
    def setMAdapterMenu(value: js.Any): Self = this.set("mAdapterMenu", value.asInstanceOf[js.Any])
  }
  
}

