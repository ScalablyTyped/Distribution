package typings.androiduix.android.widget

import typings.androiduix.android.database.DataSetObserver
import typings.androiduix.android.view.View
import typings.androiduix.android.view.ViewGroup
import typings.androiduix.android.widget.ExpandableListConnector.GroupMetadata
import typings.androiduix.android.widget.ExpandableListConnector.PositionMetadata
import typings.androiduix.java_.lang.Comparable
import typings.androiduix.java_.util.ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpandableListConnector extends BaseAdapter {
  
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
  
  var mDataSetObserver: js.Any = js.native
  
  var mExpGroupMetadataList: js.Any = js.native
  
  var mExpandableListAdapter: js.Any = js.native
  
  var mMaxExpGroupCount: js.Any = js.native
  
  var mTotalExpChildrenCount: js.Any = js.native
  
  /* private */ def refreshExpGroupMetadataList(forceChildrenCountRefresh: js.Any, syncGroupPositions: js.Any): js.Any = js.native
  
  def setExpandableListAdapter(expandableListAdapter: ExpandableListAdapter): Unit = js.native
  
  def setExpandedGroupMetadataList(expandedGroupMetadataList: ArrayList[GroupMetadata]): Unit = js.native
  
  def setMaxExpGroupCount(maxExpGroupCount: Double): Unit = js.native
}
object ExpandableListConnector {
  
  @scala.inline
  def apply(
    areAllItemsEnabled: () => Boolean,
    collapseGroup: Double => Boolean,
    collapseGroupWithMeta: PositionMetadata => Boolean,
    expandGroup: Double => Boolean,
    expandGroupWithMeta: PositionMetadata => Boolean,
    findGroupPosition: (Double, Double) => Double,
    getAdapter: () => ExpandableListAdapter,
    getCount: () => Double,
    getDropDownView: (Double, View, ViewGroup) => View,
    getExpandedGroupMetadataList: () => ArrayList[GroupMetadata],
    getFlattenedPos: ExpandableListPosition => PositionMetadata,
    getItem: Double => js.Any,
    getItemId: Double => Double,
    getItemViewType: Double => Double,
    getUnflattenedPos: Double => PositionMetadata,
    getView: (Double, View, ViewGroup) => View,
    getViewTypeCount: () => Double,
    hasStableIds: () => Boolean,
    isEmpty: () => Boolean,
    isEnabled: Double => Boolean,
    isGroupExpanded: Double => Boolean,
    mDataSetObservable: js.Any,
    mDataSetObserver: js.Any,
    mExpGroupMetadataList: js.Any,
    mExpandableListAdapter: js.Any,
    mMaxExpGroupCount: js.Any,
    mTotalExpChildrenCount: js.Any,
    notifyDataSetChanged: () => Unit,
    notifyDataSetInvalidated: () => Unit,
    refreshExpGroupMetadataList: (js.Any, js.Any) => js.Any,
    registerDataSetObserver: DataSetObserver => Unit,
    setExpandableListAdapter: ExpandableListAdapter => Unit,
    setExpandedGroupMetadataList: ArrayList[GroupMetadata] => Unit,
    setMaxExpGroupCount: Double => Unit,
    unregisterDataSetObserver: DataSetObserver => Unit
  ): ExpandableListConnector = {
    val __obj = js.Dynamic.literal(areAllItemsEnabled = js.Any.fromFunction0(areAllItemsEnabled), collapseGroup = js.Any.fromFunction1(collapseGroup), collapseGroupWithMeta = js.Any.fromFunction1(collapseGroupWithMeta), expandGroup = js.Any.fromFunction1(expandGroup), expandGroupWithMeta = js.Any.fromFunction1(expandGroupWithMeta), findGroupPosition = js.Any.fromFunction2(findGroupPosition), getAdapter = js.Any.fromFunction0(getAdapter), getCount = js.Any.fromFunction0(getCount), getDropDownView = js.Any.fromFunction3(getDropDownView), getExpandedGroupMetadataList = js.Any.fromFunction0(getExpandedGroupMetadataList), getFlattenedPos = js.Any.fromFunction1(getFlattenedPos), getItem = js.Any.fromFunction1(getItem), getItemId = js.Any.fromFunction1(getItemId), getItemViewType = js.Any.fromFunction1(getItemViewType), getUnflattenedPos = js.Any.fromFunction1(getUnflattenedPos), getView = js.Any.fromFunction3(getView), getViewTypeCount = js.Any.fromFunction0(getViewTypeCount), hasStableIds = js.Any.fromFunction0(hasStableIds), isEmpty = js.Any.fromFunction0(isEmpty), isEnabled = js.Any.fromFunction1(isEnabled), isGroupExpanded = js.Any.fromFunction1(isGroupExpanded), mDataSetObservable = mDataSetObservable.asInstanceOf[js.Any], mDataSetObserver = mDataSetObserver.asInstanceOf[js.Any], mExpGroupMetadataList = mExpGroupMetadataList.asInstanceOf[js.Any], mExpandableListAdapter = mExpandableListAdapter.asInstanceOf[js.Any], mMaxExpGroupCount = mMaxExpGroupCount.asInstanceOf[js.Any], mTotalExpChildrenCount = mTotalExpChildrenCount.asInstanceOf[js.Any], notifyDataSetChanged = js.Any.fromFunction0(notifyDataSetChanged), notifyDataSetInvalidated = js.Any.fromFunction0(notifyDataSetInvalidated), refreshExpGroupMetadataList = js.Any.fromFunction2(refreshExpGroupMetadataList), registerDataSetObserver = js.Any.fromFunction1(registerDataSetObserver), setExpandableListAdapter = js.Any.fromFunction1(setExpandableListAdapter), setExpandedGroupMetadataList = js.Any.fromFunction1(setExpandedGroupMetadataList), setMaxExpGroupCount = js.Any.fromFunction1(setMaxExpGroupCount), unregisterDataSetObserver = js.Any.fromFunction1(unregisterDataSetObserver))
    __obj.asInstanceOf[ExpandableListConnector]
  }
  
  @scala.inline
  implicit class ExpandableListConnectorMutableBuilder[Self <: ExpandableListConnector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollapseGroup(value: Double => Boolean): Self = StObject.set(x, "collapseGroup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCollapseGroupWithMeta(value: PositionMetadata => Boolean): Self = StObject.set(x, "collapseGroupWithMeta", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExpandGroup(value: Double => Boolean): Self = StObject.set(x, "expandGroup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExpandGroupWithMeta(value: PositionMetadata => Boolean): Self = StObject.set(x, "expandGroupWithMeta", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFindGroupPosition(value: (Double, Double) => Double): Self = StObject.set(x, "findGroupPosition", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetAdapter(value: () => ExpandableListAdapter): Self = StObject.set(x, "getAdapter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetExpandedGroupMetadataList(value: () => ArrayList[GroupMetadata]): Self = StObject.set(x, "getExpandedGroupMetadataList", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFlattenedPos(value: ExpandableListPosition => PositionMetadata): Self = StObject.set(x, "getFlattenedPos", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetUnflattenedPos(value: Double => PositionMetadata): Self = StObject.set(x, "getUnflattenedPos", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsGroupExpanded(value: Double => Boolean): Self = StObject.set(x, "isGroupExpanded", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMDataSetObserver(value: js.Any): Self = StObject.set(x, "mDataSetObserver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMExpGroupMetadataList(value: js.Any): Self = StObject.set(x, "mExpGroupMetadataList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMExpandableListAdapter(value: js.Any): Self = StObject.set(x, "mExpandableListAdapter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMMaxExpGroupCount(value: js.Any): Self = StObject.set(x, "mMaxExpGroupCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMTotalExpChildrenCount(value: js.Any): Self = StObject.set(x, "mTotalExpChildrenCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshExpGroupMetadataList(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "refreshExpGroupMetadataList", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetExpandableListAdapter(value: ExpandableListAdapter => Unit): Self = StObject.set(x, "setExpandableListAdapter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetExpandedGroupMetadataList(value: ArrayList[GroupMetadata] => Unit): Self = StObject.set(x, "setExpandedGroupMetadataList", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMaxExpGroupCount(value: Double => Unit): Self = StObject.set(x, "setMaxExpGroupCount", js.Any.fromFunction1(value))
  }
  
  @js.native
  trait GroupMetadata extends Comparable[GroupMetadata] {
    
    var flPos: Double = js.native
    
    var gId: Double = js.native
    
    var gPos: Double = js.native
    
    var lastChildFlPos: Double = js.native
  }
  object GroupMetadata {
    
    @scala.inline
    def apply(
      compareTo: GroupMetadata => Double,
      flPos: Double,
      gId: Double,
      gPos: Double,
      lastChildFlPos: Double
    ): GroupMetadata = {
      val __obj = js.Dynamic.literal(compareTo = js.Any.fromFunction1(compareTo), flPos = flPos.asInstanceOf[js.Any], gId = gId.asInstanceOf[js.Any], gPos = gPos.asInstanceOf[js.Any], lastChildFlPos = lastChildFlPos.asInstanceOf[js.Any])
      __obj.asInstanceOf[GroupMetadata]
    }
    
    @scala.inline
    implicit class GroupMetadataMutableBuilder[Self <: GroupMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFlPos(value: Double): Self = StObject.set(x, "flPos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGId(value: Double): Self = StObject.set(x, "gId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGPos(value: Double): Self = StObject.set(x, "gPos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastChildFlPos(value: Double): Self = StObject.set(x, "lastChildFlPos", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MyDataSetObserver extends DataSetObserver {
    
    var _ExpandableListConnector_this: ExpandableListConnector = js.native
  }
  object MyDataSetObserver {
    
    @scala.inline
    def apply(
      _ExpandableListConnector_this: ExpandableListConnector,
      onChanged: () => Unit,
      onInvalidated: () => Unit
    ): MyDataSetObserver = {
      val __obj = js.Dynamic.literal(_ExpandableListConnector_this = _ExpandableListConnector_this.asInstanceOf[js.Any], onChanged = js.Any.fromFunction0(onChanged), onInvalidated = js.Any.fromFunction0(onInvalidated))
      __obj.asInstanceOf[MyDataSetObserver]
    }
    
    @scala.inline
    implicit class MyDataSetObserverMutableBuilder[Self <: MyDataSetObserver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_ExpandableListConnector_this(value: ExpandableListConnector): Self = StObject.set(x, "_ExpandableListConnector_this", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PositionMetadata extends StObject {
    
    var groupInsertIndex: Double = js.native
    
    var groupMetadata: GroupMetadata = js.native
    
    def isExpanded(): Boolean = js.native
    
    var position: ExpandableListPosition = js.native
    
    def recycle(): Unit = js.native
    
    /* private */ def resetState(): js.Any = js.native
  }
  object PositionMetadata {
    
    @scala.inline
    def apply(
      groupInsertIndex: Double,
      groupMetadata: GroupMetadata,
      isExpanded: () => Boolean,
      position: ExpandableListPosition,
      recycle: () => Unit,
      resetState: () => js.Any
    ): PositionMetadata = {
      val __obj = js.Dynamic.literal(groupInsertIndex = groupInsertIndex.asInstanceOf[js.Any], groupMetadata = groupMetadata.asInstanceOf[js.Any], isExpanded = js.Any.fromFunction0(isExpanded), position = position.asInstanceOf[js.Any], recycle = js.Any.fromFunction0(recycle), resetState = js.Any.fromFunction0(resetState))
      __obj.asInstanceOf[PositionMetadata]
    }
    
    @scala.inline
    implicit class PositionMetadataMutableBuilder[Self <: PositionMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroupInsertIndex(value: Double): Self = StObject.set(x, "groupInsertIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupMetadata(value: GroupMetadata): Self = StObject.set(x, "groupMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsExpanded(value: () => Boolean): Self = StObject.set(x, "isExpanded", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPosition(value: ExpandableListPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecycle(value: () => Unit): Self = StObject.set(x, "recycle", js.Any.fromFunction0(value))
      
      @scala.inline
      def setResetState(value: () => js.Any): Self = StObject.set(x, "resetState", js.Any.fromFunction0(value))
    }
  }
}
