package typings
package androiduixLib.androidNs.supportNs.v4Ns.viewNs.ViewPagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnPageChangeListener extends js.Object {
  def onPageScrollStateChanged(state: scala.Double): scala.Unit
  def onPageScrolled(position: scala.Double, positionOffset: scala.Double, positionOffsetPixels: scala.Double): scala.Unit
  def onPageSelected(position: scala.Double): scala.Unit
}

object OnPageChangeListener {
  @scala.inline
  def apply(
    onPageScrollStateChanged: scala.Double => scala.Unit,
    onPageScrolled: (scala.Double, scala.Double, scala.Double) => scala.Unit,
    onPageSelected: scala.Double => scala.Unit
  ): OnPageChangeListener = {
    val __obj = js.Dynamic.literal(onPageScrollStateChanged = js.Any.fromFunction1(onPageScrollStateChanged), onPageScrolled = js.Any.fromFunction3(onPageScrolled), onPageSelected = js.Any.fromFunction1(onPageSelected))
  
    __obj.asInstanceOf[OnPageChangeListener]
  }
}

