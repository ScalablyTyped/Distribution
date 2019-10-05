package typings.androiduix.android.support.v4.view

import typings.androiduix.android.database.DataSetObserver
import typings.androiduix.android.view.View
import typings.androiduix.android.view.ViewGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.support.v4.view.PagerAdapter")
@js.native
abstract class PagerAdapter () extends js.Object {
  var mObservable: js.Any = js.native
  def destroyItem(container: ViewGroup, position: Double, `object`: js.Any): Unit = js.native
  def finishUpdate(container: ViewGroup): Unit = js.native
  def getCount(): Double = js.native
  def getItemPosition(`object`: js.Any): Double = js.native
  def getPageTitle(position: Double): String = js.native
  def getPageWidth(position: Double): Double = js.native
  def instantiateItem(container: ViewGroup, position: Double): js.Any = js.native
  def isViewFromObject(view: View, `object`: js.Any): Boolean = js.native
  def notifyDataSetChanged(): Unit = js.native
  def registerDataSetObserver(observer: DataSetObserver): Unit = js.native
  def setPrimaryItem(container: ViewGroup, position: Double, `object`: js.Any): Unit = js.native
  def startUpdate(container: ViewGroup): Unit = js.native
  def unregisterDataSetObserver(observer: DataSetObserver): Unit = js.native
}

/* static members */
@JSGlobal("android.support.v4.view.PagerAdapter")
@js.native
object PagerAdapter extends js.Object {
  var POSITION_NONE: Double = js.native
  var POSITION_UNCHANGED: Double = js.native
}

