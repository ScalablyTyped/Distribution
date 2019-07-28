package typings.androiduix.androidNs.widgetNs

import typings.androiduix.androidNs.contentNs.Context
import typings.androiduix.androidNs.graphicsNs.drawableNs.Drawable
import typings.androiduix.androidNs.viewNs.View
import typings.androiduix.androidNs.widgetNs.ExpandableListViewNs.OnChildClickListener
import typings.androiduix.androidNs.widgetNs.ExpandableListViewNs.OnGroupClickListener
import typings.androiduix.androidNs.widgetNs.ExpandableListViewNs.OnGroupCollapseListener
import typings.androiduix.androidNs.widgetNs.ExpandableListViewNs.OnGroupExpandListener
import typings.std.HTMLElement
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.ExpandableListView")
@js.native
class ExpandableListView protected () extends ListView {
  def this(context: Context) = this()
  def this(context: Context, attrs: HTMLElement) = this()
  def this(context: Context, attrs: HTMLElement, defStyle: Map[String, String]) = this()
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
  def collapseGroup(groupPos: Double): Boolean = js.native
  def expandGroup(groupPos: Double): Boolean = js.native
  def expandGroup(groupPos: Double, animate: Boolean): Boolean = js.native
  /* private */ def getAbsoluteFlatPosition(flatListPosition: js.Any): js.Any = js.native
  /* private */ def getChildOrGroupId(position: js.Any): js.Any = js.native
  def getExpandableListAdapter(): ExpandableListAdapter = js.native
  def getExpandableListPosition(flatListPosition: Double): Double = js.native
  def getFlatListPosition(packedPosition: Double): Double = js.native
  /* private */ def getFlatPositionForConnector(flatListPosition: js.Any): js.Any = js.native
  /* private */ def getIndicator(pos: js.Any): js.Any = js.native
  def getSelectedId(): Double = js.native
  def getSelectedPosition(): Double = js.native
  def handleItemClick(v: View, position: Double, id: Double): Boolean = js.native
  /* private */ def hasRtlSupport(): js.Any = js.native
  def isGroupExpanded(groupPosition: Double): Boolean = js.native
  /* private */ def isHeaderOrFooterPosition(position: js.Any): js.Any = js.native
  /* private */ def isRtlCompatibilityMode(): js.Any = js.native
  def onRtlPropertiesChanged(layoutDirection: Double): Unit = js.native
  /* private */ def resolveChildIndicator(): js.Any = js.native
  /* private */ def resolveIndicator(): js.Any = js.native
  def setChildDivider(childDivider: Drawable): Unit = js.native
  def setChildIndicator(childIndicator: Drawable): Unit = js.native
  def setChildIndicatorBounds(left: Double, right: Double): Unit = js.native
  def setChildIndicatorBoundsRelative(start: Double, end: Double): Unit = js.native
  def setExpandableAdapter(adapter: ExpandableListAdapter): Unit = js.native
  def setGroupIndicator(groupIndicator: Drawable): Unit = js.native
  def setIndicatorBounds(left: Double, right: Double): Unit = js.native
  def setIndicatorBoundsRelative(start: Double, end: Double): Unit = js.native
  def setOnChildClickListener(onChildClickListener: OnChildClickListener): Unit = js.native
  def setOnGroupClickListener(onGroupClickListener: OnGroupClickListener): Unit = js.native
  def setOnGroupCollapseListener(onGroupCollapseListener: OnGroupCollapseListener): Unit = js.native
  def setOnGroupExpandListener(onGroupExpandListener: OnGroupExpandListener): Unit = js.native
  def setSelectedChild(groupPosition: Double, childPosition: Double, shouldExpandGroup: Boolean): Boolean = js.native
  def setSelectedGroup(groupPosition: Double): Unit = js.native
}

/* static members */
@JSGlobal("android.widget.ExpandableListView")
@js.native
object ExpandableListView extends js.Object {
  var CHILD_INDICATOR_INHERIT: Double = js.native
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
  var PACKED_POSITION_TYPE_CHILD: Double = js.native
  var PACKED_POSITION_TYPE_GROUP: Double = js.native
  var PACKED_POSITION_TYPE_NULL: Double = js.native
  var PACKED_POSITION_VALUE_NULL: Double = js.native
  def getPackedPositionChild(packedPosition: Double): Double = js.native
  def getPackedPositionForChild(groupPosition: Double, childPosition: Double): Double = js.native
  def getPackedPositionForGroup(groupPosition: Double): Double = js.native
  def getPackedPositionGroup(packedPosition: Double): Double = js.native
  def getPackedPositionType(packedPosition: Double): Double = js.native
}

