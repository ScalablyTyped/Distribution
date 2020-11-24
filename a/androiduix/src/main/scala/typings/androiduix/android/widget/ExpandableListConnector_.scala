package typings.androiduix.android.widget

import typings.androiduix.android.database.DataSetObserver
import typings.androiduix.android.view.View
import typings.androiduix.android.view.ViewGroup
import typings.androiduix.android.widget.ExpandableListConnector.GroupMetadata
import typings.androiduix.android.widget.ExpandableListConnector.PositionMetadata
import typings.androiduix.java_.util.ArrayList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpandableListConnector_ extends BaseAdapter {
  
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
object ExpandableListConnector_ {
  
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
  ): ExpandableListConnector_ = {
    val __obj = js.Dynamic.literal(areAllItemsEnabled = js.Any.fromFunction0(areAllItemsEnabled), collapseGroup = js.Any.fromFunction1(collapseGroup), collapseGroupWithMeta = js.Any.fromFunction1(collapseGroupWithMeta), expandGroup = js.Any.fromFunction1(expandGroup), expandGroupWithMeta = js.Any.fromFunction1(expandGroupWithMeta), findGroupPosition = js.Any.fromFunction2(findGroupPosition), getAdapter = js.Any.fromFunction0(getAdapter), getCount = js.Any.fromFunction0(getCount), getDropDownView = js.Any.fromFunction3(getDropDownView), getExpandedGroupMetadataList = js.Any.fromFunction0(getExpandedGroupMetadataList), getFlattenedPos = js.Any.fromFunction1(getFlattenedPos), getItem = js.Any.fromFunction1(getItem), getItemId = js.Any.fromFunction1(getItemId), getItemViewType = js.Any.fromFunction1(getItemViewType), getUnflattenedPos = js.Any.fromFunction1(getUnflattenedPos), getView = js.Any.fromFunction3(getView), getViewTypeCount = js.Any.fromFunction0(getViewTypeCount), hasStableIds = js.Any.fromFunction0(hasStableIds), isEmpty = js.Any.fromFunction0(isEmpty), isEnabled = js.Any.fromFunction1(isEnabled), isGroupExpanded = js.Any.fromFunction1(isGroupExpanded), mDataSetObservable = mDataSetObservable.asInstanceOf[js.Any], mDataSetObserver = mDataSetObserver.asInstanceOf[js.Any], mExpGroupMetadataList = mExpGroupMetadataList.asInstanceOf[js.Any], mExpandableListAdapter = mExpandableListAdapter.asInstanceOf[js.Any], mMaxExpGroupCount = mMaxExpGroupCount.asInstanceOf[js.Any], mTotalExpChildrenCount = mTotalExpChildrenCount.asInstanceOf[js.Any], notifyDataSetChanged = js.Any.fromFunction0(notifyDataSetChanged), notifyDataSetInvalidated = js.Any.fromFunction0(notifyDataSetInvalidated), refreshExpGroupMetadataList = js.Any.fromFunction2(refreshExpGroupMetadataList), registerDataSetObserver = js.Any.fromFunction1(registerDataSetObserver), setExpandableListAdapter = js.Any.fromFunction1(setExpandableListAdapter), setExpandedGroupMetadataList = js.Any.fromFunction1(setExpandedGroupMetadataList), setMaxExpGroupCount = js.Any.fromFunction1(setMaxExpGroupCount), unregisterDataSetObserver = js.Any.fromFunction1(unregisterDataSetObserver))
    __obj.asInstanceOf[ExpandableListConnector_]
  }
  
  @scala.inline
  implicit class ExpandableListConnector_Ops[Self <: ExpandableListConnector_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCollapseGroup(value: Double => Boolean): Self = this.set("collapseGroup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCollapseGroupWithMeta(value: PositionMetadata => Boolean): Self = this.set("collapseGroupWithMeta", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExpandGroup(value: Double => Boolean): Self = this.set("expandGroup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExpandGroupWithMeta(value: PositionMetadata => Boolean): Self = this.set("expandGroupWithMeta", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFindGroupPosition(value: (Double, Double) => Double): Self = this.set("findGroupPosition", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetAdapter(value: () => ExpandableListAdapter): Self = this.set("getAdapter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetExpandedGroupMetadataList(value: () => ArrayList[GroupMetadata]): Self = this.set("getExpandedGroupMetadataList", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFlattenedPos(value: ExpandableListPosition => PositionMetadata): Self = this.set("getFlattenedPos", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetUnflattenedPos(value: Double => PositionMetadata): Self = this.set("getUnflattenedPos", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsGroupExpanded(value: Double => Boolean): Self = this.set("isGroupExpanded", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMDataSetObserver(value: js.Any): Self = this.set("mDataSetObserver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMExpGroupMetadataList(value: js.Any): Self = this.set("mExpGroupMetadataList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMExpandableListAdapter(value: js.Any): Self = this.set("mExpandableListAdapter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMMaxExpGroupCount(value: js.Any): Self = this.set("mMaxExpGroupCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMTotalExpChildrenCount(value: js.Any): Self = this.set("mTotalExpChildrenCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshExpGroupMetadataList(value: (js.Any, js.Any) => js.Any): Self = this.set("refreshExpGroupMetadataList", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetExpandableListAdapter(value: ExpandableListAdapter => Unit): Self = this.set("setExpandableListAdapter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetExpandedGroupMetadataList(value: ArrayList[GroupMetadata] => Unit): Self = this.set("setExpandedGroupMetadataList", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMaxExpGroupCount(value: Double => Unit): Self = this.set("setMaxExpGroupCount", js.Any.fromFunction1(value))
  }
}
