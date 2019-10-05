package typings.androiduix.android.widget

import typings.androiduix.android.database.DataSetObserver
import typings.androiduix.android.widget.ExpandableListConnector.GroupMetadata
import typings.androiduix.android.widget.ExpandableListConnector.PositionMetadata
import typings.androiduix.java.lang.Comparable
import typings.androiduix.java.util.ArrayList
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

@JSGlobal("android.widget.ExpandableListConnector")
@js.native
object ExpandableListConnector extends js.Object {
  @js.native
  class GroupMetadata () extends Comparable[GroupMetadata] {
    var flPos: Double = js.native
    var gId: Double = js.native
    var gPos: Double = js.native
    var lastChildFlPos: Double = js.native
    /* CompleteClass */
    override def compareTo(o: GroupMetadata): Double = js.native
  }
  
  @js.native
  class MyDataSetObserver protected () extends DataSetObserver {
    def this(arg: ExpandableListConnector) = this()
    var _ExpandableListConnector_this: ExpandableListConnector = js.native
  }
  
  @js.native
  class PositionMetadata () extends js.Object {
    var groupInsertIndex: Double = js.native
    var groupMetadata: GroupMetadata = js.native
    var position: ExpandableListPosition = js.native
    def isExpanded(): Boolean = js.native
    def recycle(): Unit = js.native
    /* private */ def resetState(): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object GroupMetadata extends js.Object {
    var REFRESH: Double = js.native
    def obtain(flPos: Double, lastChildFlPos: Double, gPos: Double, gId: Double): GroupMetadata = js.native
  }
  
  /* static members */
  @js.native
  object PositionMetadata extends js.Object {
    var MAX_POOL_SIZE: js.Any = js.native
    var sPool: js.Any = js.native
    /* private */ def getRecycledOrCreate(): js.Any = js.native
    def obtain(
      flatListPos: Double,
      `type`: Double,
      groupPos: Double,
      childPos: Double,
      groupMetadata: GroupMetadata,
      groupInsertIndex: Double
    ): PositionMetadata = js.native
  }
  
}

