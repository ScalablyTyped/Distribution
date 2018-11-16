package typings
package androiduixLib.androidNs.widgetNs

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
  def collapseGroup(groupPos: scala.Double): scala.Boolean = js.native
  def collapseGroupWithMeta(posMetadata: androiduixLib.androidNs.widgetNs.ExpandableListConnectorNs.PositionMetadata): scala.Boolean = js.native
  def expandGroup(groupPos: scala.Double): scala.Boolean = js.native
  def expandGroupWithMeta(posMetadata: androiduixLib.androidNs.widgetNs.ExpandableListConnectorNs.PositionMetadata): scala.Boolean = js.native
  def findGroupPosition(groupIdToMatch: scala.Double, seedGroupPosition: scala.Double): scala.Double = js.native
  def getAdapter(): ExpandableListAdapter = js.native
  def getExpandedGroupMetadataList(): androiduixLib.javaNs.utilNs.ArrayList[androiduixLib.androidNs.widgetNs.ExpandableListConnectorNs.GroupMetadata] = js.native
  def getFlattenedPos(pos: ExpandableListPosition): androiduixLib.androidNs.widgetNs.ExpandableListConnectorNs.PositionMetadata = js.native
  def getUnflattenedPos(flPos: scala.Double): androiduixLib.androidNs.widgetNs.ExpandableListConnectorNs.PositionMetadata = js.native
  def isGroupExpanded(groupPosition: scala.Double): scala.Boolean = js.native
  /* private */ def refreshExpGroupMetadataList(forceChildrenCountRefresh: js.Any, syncGroupPositions: js.Any): js.Any = js.native
  def setExpandableListAdapter(expandableListAdapter: ExpandableListAdapter): scala.Unit = js.native
  def setExpandedGroupMetadataList(
    expandedGroupMetadataList: androiduixLib.javaNs.utilNs.ArrayList[androiduixLib.androidNs.widgetNs.ExpandableListConnectorNs.GroupMetadata]
  ): scala.Unit = js.native
  def setMaxExpGroupCount(maxExpGroupCount: scala.Double): scala.Unit = js.native
}

