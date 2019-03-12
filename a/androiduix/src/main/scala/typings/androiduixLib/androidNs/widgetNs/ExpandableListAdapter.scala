package typings
package androiduixLib.androidNs.widgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpandableListAdapter extends js.Object {
  def areAllItemsEnabled(): scala.Boolean
  def getChild(groupPosition: scala.Double, childPosition: scala.Double): js.Any
  def getChildId(groupPosition: scala.Double, childPosition: scala.Double): scala.Double
  def getChildView(
    groupPosition: scala.Double,
    childPosition: scala.Double,
    isLastChild: scala.Boolean,
    convertView: androiduixLib.androidNs.viewNs.View,
    parent: androiduixLib.androidNs.viewNs.ViewGroup
  ): androiduixLib.androidNs.viewNs.View
  def getChildrenCount(groupPosition: scala.Double): scala.Double
  def getCombinedChildId(groupId: scala.Double, childId: scala.Double): scala.Double
  def getCombinedGroupId(groupId: scala.Double): scala.Double
  def getGroup(groupPosition: scala.Double): js.Any
  def getGroupCount(): scala.Double
  def getGroupId(groupPosition: scala.Double): scala.Double
  def getGroupView(
    groupPosition: scala.Double,
    isExpanded: scala.Boolean,
    convertView: androiduixLib.androidNs.viewNs.View,
    parent: androiduixLib.androidNs.viewNs.ViewGroup
  ): androiduixLib.androidNs.viewNs.View
  def hasStableIds(): scala.Boolean
  def isChildSelectable(groupPosition: scala.Double, childPosition: scala.Double): scala.Boolean
  def isEmpty(): scala.Boolean
  def onGroupCollapsed(groupPosition: scala.Double): scala.Unit
  def onGroupExpanded(groupPosition: scala.Double): scala.Unit
  def registerDataSetObserver(observer: androiduixLib.androidNs.databaseNs.DataSetObserver): scala.Unit
  def unregisterDataSetObserver(observer: androiduixLib.androidNs.databaseNs.DataSetObserver): scala.Unit
}

object ExpandableListAdapter {
  @scala.inline
  def apply(
    areAllItemsEnabled: () => scala.Boolean,
    getChild: (scala.Double, scala.Double) => js.Any,
    getChildId: (scala.Double, scala.Double) => scala.Double,
    getChildView: (scala.Double, scala.Double, scala.Boolean, androiduixLib.androidNs.viewNs.View, androiduixLib.androidNs.viewNs.ViewGroup) => androiduixLib.androidNs.viewNs.View,
    getChildrenCount: scala.Double => scala.Double,
    getCombinedChildId: (scala.Double, scala.Double) => scala.Double,
    getCombinedGroupId: scala.Double => scala.Double,
    getGroup: scala.Double => js.Any,
    getGroupCount: () => scala.Double,
    getGroupId: scala.Double => scala.Double,
    getGroupView: (scala.Double, scala.Boolean, androiduixLib.androidNs.viewNs.View, androiduixLib.androidNs.viewNs.ViewGroup) => androiduixLib.androidNs.viewNs.View,
    hasStableIds: () => scala.Boolean,
    isChildSelectable: (scala.Double, scala.Double) => scala.Boolean,
    isEmpty: () => scala.Boolean,
    onGroupCollapsed: scala.Double => scala.Unit,
    onGroupExpanded: scala.Double => scala.Unit,
    registerDataSetObserver: androiduixLib.androidNs.databaseNs.DataSetObserver => scala.Unit,
    unregisterDataSetObserver: androiduixLib.androidNs.databaseNs.DataSetObserver => scala.Unit
  ): ExpandableListAdapter = {
    val __obj = js.Dynamic.literal(areAllItemsEnabled = js.Any.fromFunction0(areAllItemsEnabled), getChild = js.Any.fromFunction2(getChild), getChildId = js.Any.fromFunction2(getChildId), getChildView = js.Any.fromFunction5(getChildView), getChildrenCount = js.Any.fromFunction1(getChildrenCount), getCombinedChildId = js.Any.fromFunction2(getCombinedChildId), getCombinedGroupId = js.Any.fromFunction1(getCombinedGroupId), getGroup = js.Any.fromFunction1(getGroup), getGroupCount = js.Any.fromFunction0(getGroupCount), getGroupId = js.Any.fromFunction1(getGroupId), getGroupView = js.Any.fromFunction4(getGroupView), hasStableIds = js.Any.fromFunction0(hasStableIds), isChildSelectable = js.Any.fromFunction2(isChildSelectable), isEmpty = js.Any.fromFunction0(isEmpty), onGroupCollapsed = js.Any.fromFunction1(onGroupCollapsed), onGroupExpanded = js.Any.fromFunction1(onGroupExpanded), registerDataSetObserver = js.Any.fromFunction1(registerDataSetObserver), unregisterDataSetObserver = js.Any.fromFunction1(unregisterDataSetObserver))
  
    __obj.asInstanceOf[ExpandableListAdapter]
  }
}

