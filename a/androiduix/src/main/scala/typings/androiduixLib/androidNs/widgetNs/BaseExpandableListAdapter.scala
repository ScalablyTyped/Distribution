package typings
package androiduixLib.androidNs.widgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.BaseExpandableListAdapter")
@js.native
abstract class BaseExpandableListAdapter ()
  extends ExpandableListAdapter
     with HeterogeneousExpandableList {
  var mDataSetObservable: js.Any = js.native
  /* CompleteClass */
  override def areAllItemsEnabled(): scala.Boolean = js.native
  /* CompleteClass */
  override def getChild(groupPosition: scala.Double, childPosition: scala.Double): js.Any = js.native
  /* CompleteClass */
  override def getChildId(groupPosition: scala.Double, childPosition: scala.Double): scala.Double = js.native
  /* CompleteClass */
  override def getChildType(groupPosition: scala.Double, childPosition: scala.Double): scala.Double = js.native
  /* CompleteClass */
  override def getChildTypeCount(): scala.Double = js.native
  /* CompleteClass */
  override def getChildView(
    groupPosition: scala.Double,
    childPosition: scala.Double,
    isLastChild: scala.Boolean,
    convertView: androiduixLib.androidNs.viewNs.View,
    parent: androiduixLib.androidNs.viewNs.ViewGroup
  ): androiduixLib.androidNs.viewNs.View = js.native
  /* CompleteClass */
  override def getChildrenCount(groupPosition: scala.Double): scala.Double = js.native
  /* CompleteClass */
  override def getCombinedChildId(groupId: scala.Double, childId: scala.Double): scala.Double = js.native
  /* CompleteClass */
  override def getCombinedGroupId(groupId: scala.Double): scala.Double = js.native
  /* CompleteClass */
  override def getGroup(groupPosition: scala.Double): js.Any = js.native
  /* CompleteClass */
  override def getGroupCount(): scala.Double = js.native
  /* CompleteClass */
  override def getGroupId(groupPosition: scala.Double): scala.Double = js.native
  /* CompleteClass */
  override def getGroupType(groupPosition: scala.Double): scala.Double = js.native
  /* CompleteClass */
  override def getGroupTypeCount(): scala.Double = js.native
  /* CompleteClass */
  override def getGroupView(
    groupPosition: scala.Double,
    isExpanded: scala.Boolean,
    convertView: androiduixLib.androidNs.viewNs.View,
    parent: androiduixLib.androidNs.viewNs.ViewGroup
  ): androiduixLib.androidNs.viewNs.View = js.native
  /* CompleteClass */
  override def hasStableIds(): scala.Boolean = js.native
  /* CompleteClass */
  override def isChildSelectable(groupPosition: scala.Double, childPosition: scala.Double): scala.Boolean = js.native
  /* CompleteClass */
  override def isEmpty(): scala.Boolean = js.native
  def notifyDataSetChanged(): scala.Unit = js.native
  def notifyDataSetInvalidated(): scala.Unit = js.native
  /* CompleteClass */
  override def onGroupCollapsed(groupPosition: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def onGroupExpanded(groupPosition: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def registerDataSetObserver(observer: androiduixLib.androidNs.databaseNs.DataSetObserver): scala.Unit = js.native
  /* CompleteClass */
  override def unregisterDataSetObserver(observer: androiduixLib.androidNs.databaseNs.DataSetObserver): scala.Unit = js.native
}

