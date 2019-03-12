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
    onDrawerClosed: androiduixLib.androidNs.viewNs.View => scala.Unit,
    onDrawerOpened: androiduixLib.androidNs.viewNs.View => scala.Unit,
    onDrawerSlide: (androiduixLib.androidNs.viewNs.View, scala.Double) => scala.Unit,
    onDrawerStateChanged: scala.Double => scala.Unit
  ): DrawerListener = {
    val __obj = js.Dynamic.literal(onDrawerClosed = js.Any.fromFunction1(onDrawerClosed), onDrawerOpened = js.Any.fromFunction1(onDrawerOpened), onDrawerSlide = js.Any.fromFunction2(onDrawerSlide), onDrawerStateChanged = js.Any.fromFunction1(onDrawerStateChanged))
  
    __obj.asInstanceOf[DrawerListener]
  }
}

