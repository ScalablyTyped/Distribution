package typings.androiduix.androidNs.supportNs.v4Ns.viewNs.ViewPagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnPageChangeListener extends js.Object {
  def onPageScrollStateChanged(state: Double): Unit
  def onPageScrolled(position: Double, positionOffset: Double, positionOffsetPixels: Double): Unit
  def onPageSelected(position: Double): Unit
}

object OnPageChangeListener {
  @scala.inline
  def apply(
    onPageScrollStateChanged: Double => Unit,
    onPageScrolled: (Double, Double, Double) => Unit,
    onPageSelected: Double => Unit
  ): OnPageChangeListener = {
    val __obj = js.Dynamic.literal(onPageScrollStateChanged = js.Any.fromFunction1(onPageScrollStateChanged), onPageScrolled = js.Any.fromFunction3(onPageScrolled), onPageSelected = js.Any.fromFunction1(onPageSelected))
  
    __obj.asInstanceOf[OnPageChangeListener]
  }
}

