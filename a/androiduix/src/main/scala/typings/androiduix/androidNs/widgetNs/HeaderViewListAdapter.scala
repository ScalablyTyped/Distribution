package typings.androiduix.androidNs.widgetNs

import typings.androiduix.androidNs.databaseNs.DataSetObserver
import typings.androiduix.androidNs.viewNs.View
import typings.androiduix.androidNs.viewNs.ViewGroup
import typings.androiduix.androidNs.widgetNs.ListViewNs.FixedViewInfo
import typings.androiduix.javaNs.utilNs.ArrayList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.HeaderViewListAdapter")
@js.native
class HeaderViewListAdapter protected () extends WrapperListAdapter {
  def this(
    headerViewInfos: ArrayList[FixedViewInfo],
    footerViewInfos: ArrayList[FixedViewInfo],
    adapter: ListAdapter
  ) = this()
  var mAdapter: js.Any = js.native
  var mAreAllFixedViewsSelectable: Boolean = js.native
  var mFooterViewInfos: ArrayList[FixedViewInfo] = js.native
  var mHeaderViewInfos: ArrayList[FixedViewInfo] = js.native
  var mIsFilterable: js.Any = js.native
  /* CompleteClass */
  override def areAllItemsEnabled(): Boolean = js.native
  /* private */ def areAllListInfosSelectable(infos: js.Any): js.Any = js.native
  /* CompleteClass */
  override def getCount(): Double = js.native
  def getFilter(): js.Any = js.native
  def getFootersCount(): Double = js.native
  def getHeadersCount(): Double = js.native
  /* CompleteClass */
  override def getItem(position: Double): js.Any = js.native
  /* CompleteClass */
  override def getItemId(position: Double): Double = js.native
  /* CompleteClass */
  override def getItemViewType(position: Double): Double = js.native
  /* CompleteClass */
  override def getView(position: Double, convertView: View, parent: ViewGroup): View = js.native
  /* CompleteClass */
  override def getViewTypeCount(): Double = js.native
  /* CompleteClass */
  override def getWrappedAdapter(): ListAdapter = js.native
  /* CompleteClass */
  override def hasStableIds(): Boolean = js.native
  /* CompleteClass */
  override def isEmpty(): Boolean = js.native
  /* CompleteClass */
  override def isEnabled(position: Double): Boolean = js.native
  /* CompleteClass */
  override def registerDataSetObserver(observer: DataSetObserver): Unit = js.native
  def removeFooter(v: View): Boolean = js.native
  def removeHeader(v: View): Boolean = js.native
  /* CompleteClass */
  override def unregisterDataSetObserver(observer: DataSetObserver): Unit = js.native
}

/* static members */
@JSGlobal("android.widget.HeaderViewListAdapter")
@js.native
object HeaderViewListAdapter extends js.Object {
  var EMPTY_INFO_LIST: ArrayList[FixedViewInfo] = js.native
}

