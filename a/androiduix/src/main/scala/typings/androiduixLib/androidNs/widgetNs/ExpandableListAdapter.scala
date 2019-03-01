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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("areAllItemsEnabled")(areAllItemsEnabled)
    __obj.updateDynamic("getChild")(getChild)
    __obj.updateDynamic("getChildId")(getChildId)
    __obj.updateDynamic("getChildView")(getChildView)
    __obj.updateDynamic("getChildrenCount")(getChildrenCount)
    __obj.updateDynamic("getCombinedChildId")(getCombinedChildId)
    __obj.updateDynamic("getCombinedGroupId")(getCombinedGroupId)
    __obj.updateDynamic("getGroup")(getGroup)
    __obj.updateDynamic("getGroupCount")(getGroupCount)
    __obj.updateDynamic("getGroupId")(getGroupId)
    __obj.updateDynamic("getGroupView")(getGroupView)
    __obj.updateDynamic("hasStableIds")(hasStableIds)
    __obj.updateDynamic("isChildSelectable")(isChildSelectable)
    __obj.updateDynamic("isEmpty")(isEmpty)
    __obj.updateDynamic("onGroupCollapsed")(onGroupCollapsed)
    __obj.updateDynamic("onGroupExpanded")(onGroupExpanded)
    __obj.updateDynamic("registerDataSetObserver")(registerDataSetObserver)
    __obj.updateDynamic("unregisterDataSetObserver")(unregisterDataSetObserver)
    __obj.asInstanceOf[ExpandableListAdapter]
  }
}

