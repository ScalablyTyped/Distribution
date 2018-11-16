package typings
package androiduixLib.comNs.jakewhartonNs.salvageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("com.jakewharton.salvage.RecyclingPagerAdapter")
@js.native
abstract class RecyclingPagerAdapter ()
  extends androiduixLib.androidNs.supportNs.v4Ns.viewNs.PagerAdapter {
  var recycleBin: js.Any = js.native
  def getItemViewType(position: scala.Double): scala.Double = js.native
  def getView(
    position: scala.Double,
    convertView: androiduixLib.androidNs.viewNs.View,
    parent: androiduixLib.androidNs.viewNs.ViewGroup
  ): androiduixLib.androidNs.viewNs.View = js.native
  def getViewTypeCount(): scala.Double = js.native
}

@JSGlobal("com.jakewharton.salvage.RecyclingPagerAdapter")
@js.native
object RecyclingPagerAdapter extends js.Object {
  var IGNORE_ITEM_VIEW_TYPE: scala.Double = js.native
}

