package typings.androiduix.androidNs.widgetNs

import typings.androiduix.androidNs.databaseNs.DataSetObserver
import typings.androiduix.androidNs.viewNs.View
import typings.androiduix.androidNs.viewNs.ViewGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Adapter extends js.Object {
  def getCount(): Double
  def getItem(position: Double): js.Any
  def getItemId(position: Double): Double
  def getItemViewType(position: Double): Double
  def getView(position: Double, convertView: View, parent: ViewGroup): View
  def getViewTypeCount(): Double
  def hasStableIds(): Boolean
  def isEmpty(): Boolean
  def registerDataSetObserver(observer: DataSetObserver): Unit
  def unregisterDataSetObserver(observer: DataSetObserver): Unit
}

object Adapter {
  @scala.inline
  def apply(
    getCount: () => Double,
    getItem: Double => js.Any,
    getItemId: Double => Double,
    getItemViewType: Double => Double,
    getView: (Double, View, ViewGroup) => View,
    getViewTypeCount: () => Double,
    hasStableIds: () => Boolean,
    isEmpty: () => Boolean,
    registerDataSetObserver: DataSetObserver => Unit,
    unregisterDataSetObserver: DataSetObserver => Unit
  ): Adapter = {
    val __obj = js.Dynamic.literal(getCount = js.Any.fromFunction0(getCount), getItem = js.Any.fromFunction1(getItem), getItemId = js.Any.fromFunction1(getItemId), getItemViewType = js.Any.fromFunction1(getItemViewType), getView = js.Any.fromFunction3(getView), getViewTypeCount = js.Any.fromFunction0(getViewTypeCount), hasStableIds = js.Any.fromFunction0(hasStableIds), isEmpty = js.Any.fromFunction0(isEmpty), registerDataSetObserver = js.Any.fromFunction1(registerDataSetObserver), unregisterDataSetObserver = js.Any.fromFunction1(unregisterDataSetObserver))
  
    __obj.asInstanceOf[Adapter]
  }
}

