package typings.androiduix.android.support.v4.view.ViewPager

import typings.androiduix.android.support.v4.view.PagerAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnAdapterChangeListener extends js.Object {
  def onAdapterChanged(oldAdapter: PagerAdapter, newAdapter: PagerAdapter): Unit
}

object OnAdapterChangeListener {
  @scala.inline
  def apply(onAdapterChanged: (PagerAdapter, PagerAdapter) => Unit): OnAdapterChangeListener = {
    val __obj = js.Dynamic.literal(onAdapterChanged = js.Any.fromFunction2(onAdapterChanged))
    __obj.asInstanceOf[OnAdapterChangeListener]
  }
}

