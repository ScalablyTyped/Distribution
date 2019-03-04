package typings
package androiduixLib.androidNs.widgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrapperListAdapter extends ListAdapter {
  def getWrappedAdapter(): ListAdapter
}

object WrapperListAdapter {
  @scala.inline
  def apply(
    areAllItemsEnabled: js.Function0[scala.Boolean],
    getCount: js.Function0[scala.Double],
    getItem: js.Function1[scala.Double, js.Any],
    getItemId: js.Function1[scala.Double, scala.Double],
    getItemViewType: js.Function1[scala.Double, scala.Double],
    getView: js.Function3[
      scala.Double, 
      androiduixLib.androidNs.viewNs.View, 
      androiduixLib.androidNs.viewNs.ViewGroup, 
      androiduixLib.androidNs.viewNs.View
    ],
    getViewTypeCount: js.Function0[scala.Double],
    getWrappedAdapter: js.Function0[ListAdapter],
    hasStableIds: js.Function0[scala.Boolean],
    isEmpty: js.Function0[scala.Boolean],
    isEnabled: js.Function1[scala.Double, scala.Boolean],
    registerDataSetObserver: js.Function1[androiduixLib.androidNs.databaseNs.DataSetObserver, scala.Unit],
    unregisterDataSetObserver: js.Function1[androiduixLib.androidNs.databaseNs.DataSetObserver, scala.Unit]
  ): WrapperListAdapter = {
    val __obj = js.Dynamic.literal(areAllItemsEnabled = areAllItemsEnabled, getCount = getCount, getItem = getItem, getItemId = getItemId, getItemViewType = getItemViewType, getView = getView, getViewTypeCount = getViewTypeCount, getWrappedAdapter = getWrappedAdapter, hasStableIds = hasStableIds, isEmpty = isEmpty, isEnabled = isEnabled, registerDataSetObserver = registerDataSetObserver, unregisterDataSetObserver = unregisterDataSetObserver)
  
    __obj.asInstanceOf[WrapperListAdapter]
  }
}

