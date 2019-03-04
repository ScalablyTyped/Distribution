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
    areAllItemsEnabled: js.Function0[scala.Boolean],
    getChild: js.Function2[scala.Double, scala.Double, js.Any],
    getChildId: js.Function2[scala.Double, scala.Double, scala.Double],
    getChildView: js.Function5[
      scala.Double, 
      scala.Double, 
      scala.Boolean, 
      androiduixLib.androidNs.viewNs.View, 
      androiduixLib.androidNs.viewNs.ViewGroup, 
      androiduixLib.androidNs.viewNs.View
    ],
    getChildrenCount: js.Function1[scala.Double, scala.Double],
    getCombinedChildId: js.Function2[scala.Double, scala.Double, scala.Double],
    getCombinedGroupId: js.Function1[scala.Double, scala.Double],
    getGroup: js.Function1[scala.Double, js.Any],
    getGroupCount: js.Function0[scala.Double],
    getGroupId: js.Function1[scala.Double, scala.Double],
    getGroupView: js.Function4[
      scala.Double, 
      scala.Boolean, 
      androiduixLib.androidNs.viewNs.View, 
      androiduixLib.androidNs.viewNs.ViewGroup, 
      androiduixLib.androidNs.viewNs.View
    ],
    hasStableIds: js.Function0[scala.Boolean],
    isChildSelectable: js.Function2[scala.Double, scala.Double, scala.Boolean],
    isEmpty: js.Function0[scala.Boolean],
    onGroupCollapsed: js.Function1[scala.Double, scala.Unit],
    onGroupExpanded: js.Function1[scala.Double, scala.Unit],
    registerDataSetObserver: js.Function1[androiduixLib.androidNs.databaseNs.DataSetObserver, scala.Unit],
    unregisterDataSetObserver: js.Function1[androiduixLib.androidNs.databaseNs.DataSetObserver, scala.Unit]
  ): ExpandableListAdapter = {
    val __obj = js.Dynamic.literal(areAllItemsEnabled = areAllItemsEnabled, getChild = getChild, getChildId = getChildId, getChildView = getChildView, getChildrenCount = getChildrenCount, getCombinedChildId = getCombinedChildId, getCombinedGroupId = getCombinedGroupId, getGroup = getGroup, getGroupCount = getGroupCount, getGroupId = getGroupId, getGroupView = getGroupView, hasStableIds = hasStableIds, isChildSelectable = isChildSelectable, isEmpty = isEmpty, onGroupCollapsed = onGroupCollapsed, onGroupExpanded = onGroupExpanded, registerDataSetObserver = registerDataSetObserver, unregisterDataSetObserver = unregisterDataSetObserver)
  
    __obj.asInstanceOf[ExpandableListAdapter]
  }
}

