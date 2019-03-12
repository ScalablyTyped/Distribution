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
    getCount: () => scala.Double,
    getDropDownView: (scala.Double, androiduixLib.androidNs.viewNs.View, androiduixLib.androidNs.viewNs.ViewGroup) => androiduixLib.androidNs.viewNs.View,
    getItem: scala.Double => js.Any,
    getItemId: scala.Double => scala.Double,
    getItemViewType: scala.Double => scala.Double,
    getView: (scala.Double, androiduixLib.androidNs.viewNs.View, androiduixLib.androidNs.viewNs.ViewGroup) => androiduixLib.androidNs.viewNs.View,
    getViewTypeCount: () => scala.Double,
    hasStableIds: () => scala.Boolean,
    isEmpty: () => scala.Boolean,
    registerDataSetObserver: androiduixLib.androidNs.databaseNs.DataSetObserver => scala.Unit,
    unregisterDataSetObserver: androiduixLib.androidNs.databaseNs.DataSetObserver => scala.Unit
  ): SpinnerAdapter = {
    val __obj = js.Dynamic.literal(getCount = js.Any.fromFunction0(getCount), getDropDownView = js.Any.fromFunction3(getDropDownView), getItem = js.Any.fromFunction1(getItem), getItemId = js.Any.fromFunction1(getItemId), getItemViewType = js.Any.fromFunction1(getItemViewType), getView = js.Any.fromFunction3(getView), getViewTypeCount = js.Any.fromFunction0(getViewTypeCount), hasStableIds = js.Any.fromFunction0(hasStableIds), isEmpty = js.Any.fromFunction0(isEmpty), registerDataSetObserver = js.Any.fromFunction1(registerDataSetObserver), unregisterDataSetObserver = js.Any.fromFunction1(unregisterDataSetObserver))
  
    __obj.asInstanceOf[SpinnerAdapter]
  }
}

