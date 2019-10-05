package typings.androiduix.android.view.View

import typings.androiduix.android.view.KeyEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnKeyListener extends js.Object {
  def onKey(v: typings.androiduix.android.view.View, keyCode: Double, event: KeyEvent): Unit
}

@JSGlobal("android.view.View.OnKeyListener")
@js.native
object OnKeyListener extends js.Object {
  def fromFunction(
    func: js.Function3[
      /* v */ typings.androiduix.android.view.View, 
      /* keyCode */ Double, 
      /* event */ KeyEvent, 
      Unit
    ]
  ): OnKeyListener = js.native
}

