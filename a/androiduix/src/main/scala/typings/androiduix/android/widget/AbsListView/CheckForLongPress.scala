package typings.androiduix.android.widget.AbsListView

import typings.androiduix.java_.lang.Runnable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckForLongPress
  extends WindowRunnnable
     with Runnable
object CheckForLongPress {
  
  @scala.inline
  def apply(
    _AbsListView_this: typings.androiduix.android.widget.AbsListView,
    mOriginalAttachCount: js.Any,
    rememberWindowAttachCount: () => Unit,
    run: () => js.Any,
    sameWindow: () => Boolean
  ): CheckForLongPress = {
    val __obj = js.Dynamic.literal(_AbsListView_this = _AbsListView_this.asInstanceOf[js.Any], mOriginalAttachCount = mOriginalAttachCount.asInstanceOf[js.Any], rememberWindowAttachCount = js.Any.fromFunction0(rememberWindowAttachCount), run = js.Any.fromFunction0(run), sameWindow = js.Any.fromFunction0(sameWindow))
    __obj.asInstanceOf[CheckForLongPress]
  }
}
