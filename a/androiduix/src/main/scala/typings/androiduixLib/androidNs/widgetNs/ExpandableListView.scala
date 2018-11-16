package typings
package androiduixLib.androidNs.widgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.ExpandableListView")
@js.native
class ExpandableListView protected () extends ListView {
  def this(context: androiduixLib.androidNs.contentNs.Context) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, attrs: stdLib.HTMLElement) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, attrs: stdLib.HTMLElement, defStyle: stdLib.Map[java.lang.String, java.lang.String]) = this()
  var mChildDivider: js.Any = js.native
  var mChildIndicator: js.Any = js.native
  var mChildIndicatorEnd: js.Any = js.native
  var mChildIndicatorLeft: js.Any = js.native
  var mChildIndicatorRight: js.Any = js.native
  var mChildIndicatorStart: js.Any = js.native
  var mConnector: js.Any = js.native
  var mExpandAdapter: js.Any = js.native
  var mGroupIndicator: js.Any = js.native
  var mIndicatorEnd: js.Any = js.native
  var mIndicatorLeft: js.Any = js.native
  var mIndicatorRect: js.Any = js.native
  var mIndicatorRight: js.Any = js.native
  var mIndicatorStart: js.Any = js.native
  var mOnChildClickListener: js.Any = js.native
  var mOnGroupClickListener: js.Any = js.native
  var mOnGroupCollapseListener: js.Any = js.native
  var mOnGroupExpandListener: js.Any = js.native
  def collapseGroup(groupPos: scala.Double): scala.Boolean = js.native
  def expandGroup(groupPos: scala.Double): scala.Boolean = js.native
  def expandGroup(groupPos: scala.Double, animate: scala.Boolean): scala.Boolean = js.native
  /* private */ def getAbsoluteFlatPosition(flatListPosition: js.Any): js.Any = js.native
  /* private */ def getChildOrGroupId(position: js.Any): js.Any = js.native
  def getExpandableListAdapter(): ExpandableListAdapter = js.native
  def getExpandableListPosition(flatListPosition: scala.Double): scala.Double = js.native
  def getFlatListPosition(packedPosition: scala.Double): scala.Double = js.native
  /* private */ def getFlatPositionForConnector(flatListPosition: js.Any): js.Any = js.native
  /* private */ def getIndicator(pos: js.Any): js.Any = js.native
  def getSelectedId(): scala.Double = js.native
  def getSelectedPosition(): scala.Double = js.native
  def handleItemClick(v: androiduixLib.androidNs.viewNs.View, position: scala.Double, id: scala.Double): scala.Boolean = js.native
  /* private */ def hasRtlSupport(): js.Any = js.native
  def isGroupExpanded(groupPosition: scala.Double): scala.Boolean = js.native
  /* private */ def isHeaderOrFooterPosition(position: js.Any): js.Any = js.native
  /* private */ def isRtlCompatibilityMode(): js.Any = js.native
  def onRtlPropertiesChanged(layoutDirection: scala.Double): scala.Unit = js.native
  /* private */ def resolveChildIndicator(): js.Any = js.native
  /* private */ def resolveIndicator(): js.Any = js.native
  def setChildDivider(childDivider: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable): scala.Unit = js.native
  def setChildIndicator(childIndicator: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable): scala.Unit = js.native
  def setChildIndicatorBounds(left: scala.Double, right: scala.Double): scala.Unit = js.native
  def setChildIndicatorBoundsRelative(start: scala.Double, end: scala.Double): scala.Unit = js.native
  def setExpandableAdapter(adapter: ExpandableListAdapter): scala.Unit = js.native
  def setGroupIndicator(groupIndicator: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable): scala.Unit = js.native
  def setIndicatorBounds(left: scala.Double, right: scala.Double): scala.Unit = js.native
  def setIndicatorBoundsRelative(start: scala.Double, end: scala.Double): scala.Unit = js.native
  def setOnChildClickListener(onChildClickListener: androiduixLib.androidNs.widgetNs.ExpandableListViewNs.OnChildClickListener): scala.Unit = js.native
  def setOnGroupClickListener(onGroupClickListener: androiduixLib.androidNs.widgetNs.ExpandableListViewNs.OnGroupClickListener): scala.Unit = js.native
  def setOnGroupCollapseListener(
    onGroupCollapseListener: androiduixLib.androidNs.widgetNs.ExpandableListViewNs.OnGroupCollapseListener
  ): scala.Unit = js.native
  def setOnGroupExpandListener(onGroupExpandListener: androiduixLib.androidNs.widgetNs.ExpandableListViewNs.OnGroupExpandListener): scala.Unit = js.native
  def setSelectedChild(groupPosition: scala.Double, childPosition: scala.Double, shouldExpandGroup: scala.Boolean): scala.Boolean = js.native
  def setSelectedGroup(groupPosition: scala.Double): scala.Unit = js.native
}

@JSGlobal("android.widget.ExpandableListView")
@js.native
object ExpandableListView extends js.Object {
  var CHILD_INDICATOR_INHERIT: scala.Double = js.native
  var CHILD_LAST_STATE_SET: js.Any = js.native
  var GROUP_EMPTY_STATE_SET: js.Any = js.native
  var GROUP_EXPANDED_EMPTY_STATE_SET: js.Any = js.native
  var GROUP_EXPANDED_STATE_SET: js.Any = js.native
  var GROUP_STATE_SETS: js.Any = js.native
  var INDICATOR_UNDEFINED: js.Any = js.native
  var PACKED_POSITION_INT_MASK_CHILD: js.Any = js.native
  var PACKED_POSITION_INT_MASK_GROUP: js.Any = js.native
  var PACKED_POSITION_MASK_CHILD: js.Any = js.native
  var PACKED_POSITION_MASK_GROUP: js.Any = js.native
  var PACKED_POSITION_MASK_TYPE: js.Any = js.native
  var PACKED_POSITION_SHIFT_GROUP: js.Any = js.native
  var PACKED_POSITION_SHIFT_TYPE: js.Any = js.native
  var PACKED_POSITION_TYPE_CHILD: scala.Double = js.native
  var PACKED_POSITION_TYPE_GROUP: scala.Double = js.native
  var PACKED_POSITION_TYPE_NULL: scala.Double = js.native
  var PACKED_POSITION_VALUE_NULL: scala.Double = js.native
  def getPackedPositionChild(packedPosition: scala.Double): scala.Double = js.native
  def getPackedPositionForChild(groupPosition: scala.Double, childPosition: scala.Double): scala.Double = js.native
  def getPackedPositionForGroup(groupPosition: scala.Double): scala.Double = js.native
  def getPackedPositionGroup(packedPosition: scala.Double): scala.Double = js.native
  def getPackedPositionType(packedPosition: scala.Double): scala.Double = js.native
}

