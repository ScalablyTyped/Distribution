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
    onPageScrollStateChanged: js.Function1[scala.Double, scala.Unit],
    onPageScrolled: js.Function3[scala.Double, scala.Double, scala.Double, scala.Unit],
    onPageSelected: js.Function1[scala.Double, scala.Unit]
  ): OnPageChangeListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onPageScrollStateChanged")(onPageScrollStateChanged)
    __obj.updateDynamic("onPageScrolled")(onPageScrolled)
    __obj.updateDynamic("onPageSelected")(onPageSelected)
    __obj.asInstanceOf[OnPageChangeListener]
  }
}

