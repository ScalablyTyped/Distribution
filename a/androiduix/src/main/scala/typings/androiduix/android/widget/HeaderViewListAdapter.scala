package typings.androiduix.android.widget

import typings.androiduix.android.database.DataSetObserver
import typings.androiduix.android.view.View
import typings.androiduix.android.view.ViewGroup
import typings.androiduix.android.widget.ListView.FixedViewInfo
import typings.androiduix.java_.util.ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeaderViewListAdapter extends WrapperListAdapter {
  
  /* private */ def areAllListInfosSelectable(infos: js.Any): js.Any = js.native
  
  def getFilter(): js.Any = js.native
  
  def getFootersCount(): Double = js.native
  
  def getHeadersCount(): Double = js.native
  
  var mAdapter: js.Any = js.native
  
  var mAreAllFixedViewsSelectable: Boolean = js.native
  
  var mFooterViewInfos: ArrayList[FixedViewInfo] = js.native
  
  var mHeaderViewInfos: ArrayList[FixedViewInfo] = js.native
  
  var mIsFilterable: js.Any = js.native
  
  def removeFooter(v: View): Boolean = js.native
  
  def removeHeader(v: View): Boolean = js.native
}
object HeaderViewListAdapter {
  
  @scala.inline
  def apply(
    areAllItemsEnabled: () => Boolean,
    areAllListInfosSelectable: js.Any => js.Any,
    getCount: () => Double,
    getFilter: () => js.Any,
    getFootersCount: () => Double,
    getHeadersCount: () => Double,
    getItem: Double => js.Any,
    getItemId: Double => Double,
    getItemViewType: Double => Double,
    getView: (Double, View, ViewGroup) => View,
    getViewTypeCount: () => Double,
    getWrappedAdapter: () => ListAdapter,
    hasStableIds: () => Boolean,
    isEmpty: () => Boolean,
    isEnabled: Double => Boolean,
    mAdapter: js.Any,
    mAreAllFixedViewsSelectable: Boolean,
    mFooterViewInfos: ArrayList[FixedViewInfo],
    mHeaderViewInfos: ArrayList[FixedViewInfo],
    mIsFilterable: js.Any,
    registerDataSetObserver: DataSetObserver => Unit,
    removeFooter: View => Boolean,
    removeHeader: View => Boolean,
    unregisterDataSetObserver: DataSetObserver => Unit
  ): HeaderViewListAdapter = {
    val __obj = js.Dynamic.literal(areAllItemsEnabled = js.Any.fromFunction0(areAllItemsEnabled), areAllListInfosSelectable = js.Any.fromFunction1(areAllListInfosSelectable), getCount = js.Any.fromFunction0(getCount), getFilter = js.Any.fromFunction0(getFilter), getFootersCount = js.Any.fromFunction0(getFootersCount), getHeadersCount = js.Any.fromFunction0(getHeadersCount), getItem = js.Any.fromFunction1(getItem), getItemId = js.Any.fromFunction1(getItemId), getItemViewType = js.Any.fromFunction1(getItemViewType), getView = js.Any.fromFunction3(getView), getViewTypeCount = js.Any.fromFunction0(getViewTypeCount), getWrappedAdapter = js.Any.fromFunction0(getWrappedAdapter), hasStableIds = js.Any.fromFunction0(hasStableIds), isEmpty = js.Any.fromFunction0(isEmpty), isEnabled = js.Any.fromFunction1(isEnabled), mAdapter = mAdapter.asInstanceOf[js.Any], mAreAllFixedViewsSelectable = mAreAllFixedViewsSelectable.asInstanceOf[js.Any], mFooterViewInfos = mFooterViewInfos.asInstanceOf[js.Any], mHeaderViewInfos = mHeaderViewInfos.asInstanceOf[js.Any], mIsFilterable = mIsFilterable.asInstanceOf[js.Any], registerDataSetObserver = js.Any.fromFunction1(registerDataSetObserver), removeFooter = js.Any.fromFunction1(removeFooter), removeHeader = js.Any.fromFunction1(removeHeader), unregisterDataSetObserver = js.Any.fromFunction1(unregisterDataSetObserver))
    __obj.asInstanceOf[HeaderViewListAdapter]
  }
  
  @scala.inline
  implicit class HeaderViewListAdapterMutableBuilder[Self <: HeaderViewListAdapter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAreAllListInfosSelectable(value: js.Any => js.Any): Self = StObject.set(x, "areAllListInfosSelectable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetFilter(value: () => js.Any): Self = StObject.set(x, "getFilter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFootersCount(value: () => Double): Self = StObject.set(x, "getFootersCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHeadersCount(value: () => Double): Self = StObject.set(x, "getHeadersCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMAdapter(value: js.Any): Self = StObject.set(x, "mAdapter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMAreAllFixedViewsSelectable(value: Boolean): Self = StObject.set(x, "mAreAllFixedViewsSelectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMFooterViewInfos(value: ArrayList[FixedViewInfo]): Self = StObject.set(x, "mFooterViewInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMHeaderViewInfos(value: ArrayList[FixedViewInfo]): Self = StObject.set(x, "mHeaderViewInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMIsFilterable(value: js.Any): Self = StObject.set(x, "mIsFilterable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveFooter(value: View => Boolean): Self = StObject.set(x, "removeFooter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveHeader(value: View => Boolean): Self = StObject.set(x, "removeHeader", js.Any.fromFunction1(value))
  }
}
