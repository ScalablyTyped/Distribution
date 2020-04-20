package typings.androiduix.android.support.v4.widget.DrawerLayout

import typings.androiduix.android.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerListener extends js.Object {
  def onDrawerClosed(drawerView: View): Unit
  def onDrawerOpened(drawerView: View): Unit
  def onDrawerSlide(drawerView: View, slideOffset: Double): Unit
  def onDrawerStateChanged(newState: Double): Unit
}

object DrawerListener {
  @scala.inline
  def apply(
    onDrawerClosed: View => Unit,
    onDrawerOpened: View => Unit,
    onDrawerSlide: (View, Double) => Unit,
    onDrawerStateChanged: Double => Unit
  ): DrawerListener = {
    val __obj = js.Dynamic.literal(onDrawerClosed = js.Any.fromFunction1(onDrawerClosed), onDrawerOpened = js.Any.fromFunction1(onDrawerOpened), onDrawerSlide = js.Any.fromFunction2(onDrawerSlide), onDrawerStateChanged = js.Any.fromFunction1(onDrawerStateChanged))
    __obj.asInstanceOf[DrawerListener]
  }
}

