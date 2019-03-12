package typings
package androiduixLib.androidNs.widgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Adapter extends js.Object {
  def getCount(): scala.Double
  def getItem(position: scala.Double): js.Any
  def getItemId(position: scala.Double): scala.Double
  def getItemViewType(position: scala.Double): scala.Double
  def getView(
    position: scala.Double,
    convertView: androiduixLib.androidNs.viewNs.View,
    parent: androiduixLib.androidNs.viewNs.ViewGroup
  ): androiduixLib.androidNs.viewNs.View
  def getViewTypeCount(): scala.Double
  def hasStableIds(): scala.Boolean
  def isEmpty(): scala.Boolean
  def registerDataSetObserver(observer: androiduixLib.androidNs.databaseNs.DataSetObserver): scala.Unit
  def unregisterDataSetObserver(observer: androiduixLib.androidNs.databaseNs.DataSetObserver): scala.Unit
}

object Adapter {
  @scala.inline
  def apply(
    getCount: () => scala.Double,
    getItem: scala.Double => js.Any,
    getItemId: scala.Double => scala.Double,
    getItemViewType: scala.Double => scala.Double,
    getView: (scala.Double, androiduixLib.androidNs.viewNs.View, androiduixLib.androidNs.viewNs.ViewGroup) => androiduixLib.androidNs.viewNs.View,
    getViewTypeCount: () => scala.Double,
    hasStableIds: () => scala.Boolean,
    isEmpty: () => scala.Boolean,
    registerDataSetObserver: androiduixLib.androidNs.databaseNs.DataSetObserver => scala.Unit,
    unregisterDataSetObserver: androiduixLib.androidNs.databaseNs.DataSetObserver => scala.Unit
  ): Adapter = {
    val __obj = js.Dynamic.literal(getCount = js.Any.fromFunction0(getCount), getItem = js.Any.fromFunction1(getItem), getItemId = js.Any.fromFunction1(getItemId), getItemViewType = js.Any.fromFunction1(getItemViewType), getView = js.Any.fromFunction3(getView), getViewTypeCount = js.Any.fromFunction0(getViewTypeCount), hasStableIds = js.Any.fromFunction0(hasStableIds), isEmpty = js.Any.fromFunction0(isEmpty), registerDataSetObserver = js.Any.fromFunction1(registerDataSetObserver), unregisterDataSetObserver = js.Any.fromFunction1(unregisterDataSetObserver))
  
    __obj.asInstanceOf[Adapter]
  }
}

