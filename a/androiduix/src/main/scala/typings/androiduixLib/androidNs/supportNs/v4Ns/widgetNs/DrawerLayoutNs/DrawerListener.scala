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

