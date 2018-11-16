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

