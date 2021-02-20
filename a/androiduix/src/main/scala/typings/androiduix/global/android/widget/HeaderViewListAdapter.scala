package typings.androiduix.global.android.widget

import typings.androiduix.android.widget.ListView.FixedViewInfo
import typings.androiduix.java_.util.ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object HeaderViewListAdapter {
  
  @JSGlobal("android.widget.HeaderViewListAdapter")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("android.widget.HeaderViewListAdapter.EMPTY_INFO_LIST")
  @js.native
  def EMPTY_INFO_LIST: ArrayList[FixedViewInfo] = js.native
  @scala.inline
  def EMPTY_INFO_LIST_=(x: ArrayList[FixedViewInfo]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMPTY_INFO_LIST")(x.asInstanceOf[js.Any])
}
