package typings
package androiduixLib.androidNs.supportNs.v4Ns.viewNs.ViewPagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnAdapterChangeListener extends js.Object {
  def onAdapterChanged(
    oldAdapter: androiduixLib.androidNs.supportNs.v4Ns.viewNs.PagerAdapter,
    newAdapter: androiduixLib.androidNs.supportNs.v4Ns.viewNs.PagerAdapter
  ): scala.Unit
}

object OnAdapterChangeListener {
  @scala.inline
  def apply(
    onAdapterChanged: js.Function2[
      androiduixLib.androidNs.supportNs.v4Ns.viewNs.PagerAdapter, 
      androiduixLib.androidNs.supportNs.v4Ns.viewNs.PagerAdapter, 
      scala.Unit
    ]
  ): OnAdapterChangeListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onAdapterChanged")(onAdapterChanged)
    __obj.asInstanceOf[OnAdapterChangeListener]
  }
}

