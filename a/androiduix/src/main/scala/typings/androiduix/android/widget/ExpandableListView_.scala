package typings.androiduix.android.widget

import typings.androiduix.android.content.Context
import typings.androiduix.android.graphics.drawable.Drawable
import typings.androiduix.android.view.View
import typings.androiduix.android.widget.ExpandableListView.OnChildClickListener
import typings.androiduix.android.widget.ExpandableListView.OnGroupClickListener
import typings.androiduix.android.widget.ExpandableListView.OnGroupCollapseListener
import typings.androiduix.android.widget.ExpandableListView.OnGroupExpandListener
import typings.std.HTMLElement
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.ExpandableListView")
@js.native
class ExpandableListView_ protected () extends ListView {
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

