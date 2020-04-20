package typings.androiduix.android.widget

import typings.androiduix.android.database.DataSetObserver
import typings.androiduix.android.view.View
import typings.androiduix.android.view.ViewGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpandableListAdapter extends js.Object {
  def areAllItemsEnabled(): Boolean
  def getChild(groupPosition: Double, childPosition: Double): js.Any
  def getChildId(groupPosition: Double, childPosition: Double): Double
  def getChildView(
    groupPosition: Double,
    childPosition: Double,
    isLastChild: Boolean,
    convertView: View,
    parent: ViewGroup
  ): View
  def getChildrenCount(groupPosition: Double): Double
  def getCombinedChildId(groupId: Double, childId: Double): Double
  def getCombinedGroupId(groupId: Double): Double
  def getGroup(groupPosition: Double): js.Any
  def getGroupCount(): Double
  def getGroupId(groupPosition: Double): Double
  def getGroupView(groupPosition: Double, isExpanded: Boolean, convertView: View, parent: ViewGroup): View
  def hasStableIds(): Boolean
  def isChildSelectable(groupPosition: Double, childPosition: Double): Boolean
  def isEmpty(): Boolean
  def onGroupCollapsed(groupPosition: Double): Unit
  def onGroupExpanded(groupPosition: Double): Unit
  def registerDataSetObserver(observer: DataSetObserver): Unit
  def unregisterDataSetObserver(observer: DataSetObserver): Unit
}

object ExpandableListAdapter {
  @scala.inline
  def apply(
    areAllItemsEnabled: () => Boolean,
    getChild: (Double, Double) => js.Any,
    getChildId: (Double, Double) => Double,
    getChildView: (Double, Double, Boolean, View, ViewGroup) => View,
    getChildrenCount: Double => Double,
    getCombinedChildId: (Double, Double) => Double,
    getCombinedGroupId: Double => Double,
    getGroup: Double => js.Any,
    getGroupCount: () => Double,
    getGroupId: Double => Double,
    getGroupView: (Double, Boolean, View, ViewGroup) => View,
    hasStableIds: () => Boolean,
    isChildSelectable: (Double, Double) => Boolean,
    isEmpty: () => Boolean,
    onGroupCollapsed: Double => Unit,
    onGroupExpanded: Double => Unit,
    registerDataSetObserver: DataSetObserver => Unit,
    unregisterDataSetObserver: DataSetObserver => Unit
  ): ExpandableListAdapter = {
    val __obj = js.Dynamic.literal(areAllItemsEnabled = js.Any.fromFunction0(areAllItemsEnabled), getChild = js.Any.fromFunction2(getChild), getChildId = js.Any.fromFunction2(getChildId), getChildView = js.Any.fromFunction5(getChildView), getChildrenCount = js.Any.fromFunction1(getChildrenCount), getCombinedChildId = js.Any.fromFunction2(getCombinedChildId), getCombinedGroupId = js.Any.fromFunction1(getCombinedGroupId), getGroup = js.Any.fromFunction1(getGroup), getGroupCount = js.Any.fromFunction0(getGroupCount), getGroupId = js.Any.fromFunction1(getGroupId), getGroupView = js.Any.fromFunction4(getGroupView), hasStableIds = js.Any.fromFunction0(hasStableIds), isChildSelectable = js.Any.fromFunction2(isChildSelectable), isEmpty = js.Any.fromFunction0(isEmpty), onGroupCollapsed = js.Any.fromFunction1(onGroupCollapsed), onGroupExpanded = js.Any.fromFunction1(onGroupExpanded), registerDataSetObserver = js.Any.fromFunction1(registerDataSetObserver), unregisterDataSetObserver = js.Any.fromFunction1(unregisterDataSetObserver))
    __obj.asInstanceOf[ExpandableListAdapter]
  }
}

