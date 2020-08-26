package typings.androiduix.android.support.v4.view.ViewPager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleOnPageChangeListener extends OnPageChangeListener

object SimpleOnPageChangeListener {
  @scala.inline
  def apply(
    onPageScrollStateChanged: Double => Unit,
    onPageScrolled: (Double, Double, Double) => Unit,
    onPageSelected: Double => Unit
  ): SimpleOnPageChangeListener = {
    val __obj = js.Dynamic.literal(onPageScrollStateChanged = js.Any.fromFunction1(onPageScrollStateChanged), onPageScrolled = js.Any.fromFunction3(onPageScrolled), onPageSelected = js.Any.fromFunction1(onPageSelected))
    __obj.asInstanceOf[SimpleOnPageChangeListener]
  }
}

