package typings.androiduix.androidNs.supportNs.v4Ns.viewNs.ViewPagerNs

import typings.androiduix.androidNs.supportNs.v4Ns.viewNs.PagerAdapter
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

