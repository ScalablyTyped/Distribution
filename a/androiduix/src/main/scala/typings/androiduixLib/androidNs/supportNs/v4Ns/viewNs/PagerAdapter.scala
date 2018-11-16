package typings
package androiduixLib.androidNs.supportNs.v4Ns.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.support.v4.view.PagerAdapter")
@js.native
abstract class PagerAdapter () extends js.Object {
  var mObservable: js.Any = js.native
  def destroyItem(container: androiduixLib.androidNs.viewNs.ViewGroup, position: scala.Double, `object`: js.Any): scala.Unit = js.native
  def finishUpdate(container: androiduixLib.androidNs.viewNs.ViewGroup): scala.Unit = js.native
  def getCount(): scala.Double = js.native
  def getItemPosition(`object`: js.Any): scala.Double = js.native
  def getPageTitle(position: scala.Double): java.lang.String = js.native
  def getPageWidth(position: scala.Double): scala.Double = js.native
  def instantiateItem(container: androiduixLib.androidNs.viewNs.ViewGroup, position: scala.Double): js.Any = js.native
  def isViewFromObject(view: androiduixLib.androidNs.viewNs.View, `object`: js.Any): scala.Boolean = js.native
  def notifyDataSetChanged(): scala.Unit = js.native
  def registerDataSetObserver(observer: androiduixLib.androidNs.databaseNs.DataSetObserver): scala.Unit = js.native
  def setPrimaryItem(container: androiduixLib.androidNs.viewNs.ViewGroup, position: scala.Double, `object`: js.Any): scala.Unit = js.native
  def startUpdate(container: androiduixLib.androidNs.viewNs.ViewGroup): scala.Unit = js.native
  def unregisterDataSetObserver(observer: androiduixLib.androidNs.databaseNs.DataSetObserver): scala.Unit = js.native
}

@JSGlobal("android.support.v4.view.PagerAdapter")
@js.native
object PagerAdapter extends js.Object {
  var POSITION_NONE: scala.Double = js.native
  var POSITION_UNCHANGED: scala.Double = js.native
}

