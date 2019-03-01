package typings
package androiduixLib.androidNs.supportNs.v4Ns.widgetNs.DrawerLayoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerListener extends js.Object {
  def onDrawerClosed(drawerView: androiduixLib.androidNs.viewNs.View): scala.Unit
  def onDrawerOpened(drawerView: androiduixLib.androidNs.viewNs.View): scala.Unit
  def onDrawerSlide(drawerView: androiduixLib.androidNs.viewNs.View, slideOffset: scala.Double): scala.Unit
  def onDrawerStateChanged(newState: scala.Double): scala.Unit
}

object DrawerListener {
  @scala.inline
  def apply(
    onDrawerClosed: js.Function1[androiduixLib.androidNs.viewNs.View, scala.Unit],
    onDrawerOpened: js.Function1[androiduixLib.androidNs.viewNs.View, scala.Unit],
    onDrawerSlide: js.Function2[androiduixLib.androidNs.viewNs.View, scala.Double, scala.Unit],
    onDrawerStateChanged: js.Function1[scala.Double, scala.Unit]
  ): DrawerListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onDrawerClosed")(onDrawerClosed)
    __obj.updateDynamic("onDrawerOpened")(onDrawerOpened)
    __obj.updateDynamic("onDrawerSlide")(onDrawerSlide)
    __obj.updateDynamic("onDrawerStateChanged")(onDrawerStateChanged)
    __obj.asInstanceOf[DrawerListener]
  }
}

