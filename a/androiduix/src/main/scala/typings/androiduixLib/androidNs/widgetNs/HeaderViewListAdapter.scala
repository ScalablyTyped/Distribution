package typings
package androiduixLib.androidNs.widgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.HeaderViewListAdapter")
@js.native
class HeaderViewListAdapter protected () extends WrapperListAdapter {
  def this(headerViewInfos: androiduixLib.javaNs.utilNs.ArrayList[androiduixLib.androidNs.widgetNs.ListViewNs.FixedViewInfo], footerViewInfos: androiduixLib.javaNs.utilNs.ArrayList[androiduixLib.androidNs.widgetNs.ListViewNs.FixedViewInfo], adapter: ListAdapter) = this()
  var mAdapter: js.Any = js.native
  var mAreAllFixedViewsSelectable: scala.Boolean = js.native
  var mFooterViewInfos: androiduixLib.javaNs.utilNs.ArrayList[androiduixLib.androidNs.widgetNs.ListViewNs.FixedViewInfo] = js.native
  var mHeaderViewInfos: androiduixLib.javaNs.utilNs.ArrayList[androiduixLib.androidNs.widgetNs.ListViewNs.FixedViewInfo] = js.native
  var mIsFilterable: js.Any = js.native
  /* CompleteClass */
  override def areAllItemsEnabled(): scala.Boolean = js.native
  /* private */ def areAllListInfosSelectable(infos: js.Any): js.Any = js.native
  /* CompleteClass */
  override def getCount(): scala.Double = js.native
  def getFilter(): js.Any = js.native
  def getFootersCount(): scala.Double = js.native
  def getHeadersCount(): scala.Double = js.native
  /* CompleteClass */
  override def getItem(position: scala.Double): js.Any = js.native
  /* CompleteClass */
  override def getItemId(position: scala.Double): scala.Double = js.native
  /* CompleteClass */
  override def getItemViewType(position: scala.Double): scala.Double = js.native
  /* CompleteClass */
  override def getView(
    position: scala.Double,
    convertView: androiduixLib.androidNs.viewNs.View,
    parent: androiduixLib.androidNs.viewNs.ViewGroup
  ): androiduixLib.androidNs.viewNs.View = js.native
  /* CompleteClass */
  override def getViewTypeCount(): scala.Double = js.native
  /* CompleteClass */
  override def getWrappedAdapter(): ListAdapter = js.native
  /* CompleteClass */
  override def hasStableIds(): scala.Boolean = js.native
  /* CompleteClass */
  override def isEmpty(): scala.Boolean = js.native
  /* CompleteClass */
  override def isEnabled(position: scala.Double): scala.Boolean = js.native
  /* CompleteClass */
  override def registerDataSetObserver(observer: androiduixLib.androidNs.databaseNs.DataSetObserver): scala.Unit = js.native
  def removeFooter(v: androiduixLib.androidNs.viewNs.View): scala.Boolean = js.native
  def removeHeader(v: androiduixLib.androidNs.viewNs.View): scala.Boolean = js.native
  /* CompleteClass */
  override def unregisterDataSetObserver(observer: androiduixLib.androidNs.databaseNs.DataSetObserver): scala.Unit = js.native
}

/* static members */
@JSGlobal("android.widget.HeaderViewListAdapter")
@js.native
object HeaderViewListAdapter extends js.Object {
  var EMPTY_INFO_LIST: androiduixLib.javaNs.utilNs.ArrayList[androiduixLib.androidNs.widgetNs.ListViewNs.FixedViewInfo] = js.native
}

