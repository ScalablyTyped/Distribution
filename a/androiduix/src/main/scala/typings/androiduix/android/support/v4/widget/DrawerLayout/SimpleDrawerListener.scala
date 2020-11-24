package typings.androiduix.android.support.v4.widget.DrawerLayout

import typings.androiduix.android.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimpleDrawerListener extends DrawerListener
object SimpleDrawerListener {
  
  @scala.inline
  def apply(
    onDrawerClosed: View => Unit,
    onDrawerOpened: View => Unit,
    onDrawerSlide: (View, Double) => Unit,
    onDrawerStateChanged: Double => Unit
  ): SimpleDrawerListener = {
    val __obj = js.Dynamic.literal(onDrawerClosed = js.Any.fromFunction1(onDrawerClosed), onDrawerOpened = js.Any.fromFunction1(onDrawerOpened), onDrawerSlide = js.Any.fromFunction2(onDrawerSlide), onDrawerStateChanged = js.Any.fromFunction1(onDrawerStateChanged))
    __obj.asInstanceOf[SimpleDrawerListener]
  }
}
