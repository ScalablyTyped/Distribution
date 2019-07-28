package typings.androiduix.androidNs.widgetNs

import typings.androiduix.androidNs.widgetNs.ExpandableListConnectorNs.GroupMetadata
import typings.androiduix.androidNs.widgetNs.ExpandableListConnectorNs.PositionMetadata
import typings.androiduix.javaNs.utilNs.ArrayList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.ExpandableListConnector")
@js.native
class ExpandableListConnector protected () extends BaseAdapter {
  def this(expandableListAdapter: ExpandableListAdapter) = this()
  var mDataSetObserver: js.Any = js.native
  var mExpGroupMetadataList: js.Any = js.native
  var mExpandableListAdapter: js.Any = js.native
  var mMaxExpGroupCount: js.Any = js.native
  var mTotalExpChildrenCount: js.Any = js.native
  def collapseGroup(groupPos: Double): Boolean = js.native
  def collapseGroupWithMeta(posMetadata: PositionMetadata): Boolean = js.native
  def expandGroup(groupPos: Double): Boolean = js.native
  def expandGroupWithMeta(posMetadata: PositionMetadata): Boolean = js.native
  def findGroupPosition(groupIdToMatch: Double, seedGroupPosition: Double): Double = js.native
  def getAdapter(): ExpandableListAdapter = js.native
  def getExpandedGroupMetadataList(): ArrayList[GroupMetadata] = js.native
  def getFlattenedPos(pos: ExpandableListPosition): PositionMetadata = js.native
  def getUnflattenedPos(flPos: Double): PositionMetadata = js.native
  def isGroupExpanded(groupPosition: Double): Boolean = js.native
  /* private */ def refreshExpGroupMetadataList(forceChildrenCountRefresh: js.Any, syncGroupPositions: js.Any): js.Any = js.native
  def setExpandableListAdapter(expandableListAdapter: ExpandableListAdapter): Unit = js.native
  def setExpandedGroupMetadataList(expandedGroupMetadataList: ArrayList[GroupMetadata]): Unit = js.native
  def setMaxExpGroupCount(maxExpGroupCount: Double): Unit = js.native
}

