package typings.androiduix.global.android.widget

import typings.androiduix.android.widget.ListView.FixedViewInfo
import typings.androiduix.java_.util.ArrayList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.HeaderViewListAdapter")
@js.native
class HeaderViewListAdapter protected ()
  extends typings.androiduix.android.widget.HeaderViewListAdapter {
  def this(
    headerViewInfos: ArrayList[FixedViewInfo],
    footerViewInfos: ArrayList[FixedViewInfo],
    adapter: typings.androiduix.android.widget.ListAdapter
  ) = this()
}

/* static members */
@JSGlobal("android.widget.HeaderViewListAdapter")
@js.native
object HeaderViewListAdapter extends js.Object {
  var EMPTY_INFO_LIST: ArrayList[FixedViewInfo] = js.native
}

