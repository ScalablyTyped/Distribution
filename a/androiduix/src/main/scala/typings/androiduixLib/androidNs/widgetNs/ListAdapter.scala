package typings
package androiduixLib.androidNs.widgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAdapter extends Adapter {
  def areAllItemsEnabled(): scala.Boolean
  def isEnabled(position: scala.Double): scala.Boolean
}

object ListAdapter {
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
    hasStableIds: js.Function0[scala.Boolean],
    isEmpty: js.Function0[scala.Boolean],
    isEnabled: js.Function1[scala.Double, scala.Boolean],
    registerDataSetObserver: js.Function1[androiduixLib.androidNs.databaseNs.DataSetObserver, scala.Unit],
    unregisterDataSetObserver: js.Function1[androiduixLib.androidNs.databaseNs.DataSetObserver, scala.Unit]
  ): ListAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("areAllItemsEnabled")(areAllItemsEnabled)
    __obj.updateDynamic("getCount")(getCount)
    __obj.updateDynamic("getItem")(getItem)
    __obj.updateDynamic("getItemId")(getItemId)
    __obj.updateDynamic("getItemViewType")(getItemViewType)
    __obj.updateDynamic("getView")(getView)
    __obj.updateDynamic("getViewTypeCount")(getViewTypeCount)
    __obj.updateDynamic("hasStableIds")(hasStableIds)
    __obj.updateDynamic("isEmpty")(isEmpty)
    __obj.updateDynamic("isEnabled")(isEnabled)
    __obj.updateDynamic("registerDataSetObserver")(registerDataSetObserver)
    __obj.updateDynamic("unregisterDataSetObserver")(unregisterDataSetObserver)
    __obj.asInstanceOf[ListAdapter]
  }
}

