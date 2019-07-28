package typings.androiduix.comNs.jakewhartonNs.salvageNs

import typings.androiduix.androidNs.supportNs.v4Ns.viewNs.PagerAdapter
import typings.androiduix.androidNs.viewNs.View
import typings.androiduix.androidNs.viewNs.ViewGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("com.jakewharton.salvage.RecyclingPagerAdapter")
@js.native
abstract class RecyclingPagerAdapter () extends PagerAdapter {
  var recycleBin: js.Any = js.native
  def getItemViewType(position: Double): Double = js.native
  def getView(position: Double, convertView: View, parent: ViewGroup): View = js.native
  def getViewTypeCount(): Double = js.native
}

/* static members */
@JSGlobal("com.jakewharton.salvage.RecyclingPagerAdapter")
@js.native
object RecyclingPagerAdapter extends js.Object {
  var IGNORE_ITEM_VIEW_TYPE: Double = js.native
}

