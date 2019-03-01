package typings
package androiduixLib.androidNs.widgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpinnerAdapter extends Adapter {
  def getDropDownView(
    position: scala.Double,
    convertView: androiduixLib.androidNs.viewNs.View,
    parent: androiduixLib.androidNs.viewNs.ViewGroup
  ): androiduixLib.androidNs.viewNs.View
}

object SpinnerAdapter {
  @scala.inline
  def apply(
    getCount: js.Function0[scala.Double],
    getDropDownView: js.Function3[
      scala.Double, 
      androiduixLib.androidNs.viewNs.View, 
      androiduixLib.androidNs.viewNs.ViewGroup, 
      androiduixLib.androidNs.viewNs.View
    ],
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
    registerDataSetObserver: js.Function1[androiduixLib.androidNs.databaseNs.DataSetObserver, scala.Unit],
    unregisterDataSetObserver: js.Function1[androiduixLib.androidNs.databaseNs.DataSetObserver, scala.Unit]
  ): SpinnerAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCount")(getCount)
    __obj.updateDynamic("getDropDownView")(getDropDownView)
    __obj.updateDynamic("getItem")(getItem)
    __obj.updateDynamic("getItemId")(getItemId)
    __obj.updateDynamic("getItemViewType")(getItemViewType)
    __obj.updateDynamic("getView")(getView)
    __obj.updateDynamic("getViewTypeCount")(getViewTypeCount)
    __obj.updateDynamic("hasStableIds")(hasStableIds)
    __obj.updateDynamic("isEmpty")(isEmpty)
    __obj.updateDynamic("registerDataSetObserver")(registerDataSetObserver)
    __obj.updateDynamic("unregisterDataSetObserver")(unregisterDataSetObserver)
    __obj.asInstanceOf[SpinnerAdapter]
  }
}

