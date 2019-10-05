package typings.androiduix.android.widget

import typings.androiduix.android.database.DataSetObserver
import typings.androiduix.android.view.View
import typings.androiduix.android.view.ViewGroup
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
  override def areAllItemsEnabled(): Boolean = js.native
  /* CompleteClass */
  override def getChild(groupPosition: Double, childPosition: Double): js.Any = js.native
  /* CompleteClass */
  override def getChildId(groupPosition: Double, childPosition: Double): Double = js.native
  /* CompleteClass */
  override def getChildType(groupPosition: Double, childPosition: Double): Double = js.native
  /* CompleteClass */
  override def getChildTypeCount(): Double = js.native
  /* CompleteClass */
  override def getChildView(
    groupPosition: Double,
    childPosition: Double,
    isLastChild: Boolean,
    convertView: View,
    parent: ViewGroup
  ): View = js.native
  /* CompleteClass */
  override def getChildrenCount(groupPosition: Double): Double = js.native
  /* CompleteClass */
  override def getCombinedChildId(groupId: Double, childId: Double): Double = js.native
  /* CompleteClass */
  override def getCombinedGroupId(groupId: Double): Double = js.native
  /* CompleteClass */
  override def getGroup(groupPosition: Double): js.Any = js.native
  /* CompleteClass */
  override def getGroupCount(): Double = js.native
  /* CompleteClass */
  override def getGroupId(groupPosition: Double): Double = js.native
  /* CompleteClass */
  override def getGroupType(groupPosition: Double): Double = js.native
  /* CompleteClass */
  override def getGroupTypeCount(): Double = js.native
  /* CompleteClass */
  override def getGroupView(groupPosition: Double, isExpanded: Boolean, convertView: View, parent: ViewGroup): View = js.native
  /* CompleteClass */
  override def hasStableIds(): Boolean = js.native
  /* CompleteClass */
  override def isChildSelectable(groupPosition: Double, childPosition: Double): Boolean = js.native
  /* CompleteClass */
  override def isEmpty(): Boolean = js.native
  def notifyDataSetChanged(): Unit = js.native
  def notifyDataSetInvalidated(): Unit = js.native
  /* CompleteClass */
  override def onGroupCollapsed(groupPosition: Double): Unit = js.native
  /* CompleteClass */
  override def onGroupExpanded(groupPosition: Double): Unit = js.native
  /* CompleteClass */
  override def registerDataSetObserver(observer: DataSetObserver): Unit = js.native
  /* CompleteClass */
  override def unregisterDataSetObserver(observer: DataSetObserver): Unit = js.native
}

