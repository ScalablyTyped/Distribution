package typings.androiduix.android.view.View

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnLongClickListener extends js.Object {
  def onLongClick(v: typings.androiduix.android.view.View): Boolean
}

@JSGlobal("android.view.View.OnLongClickListener")
@js.native
object OnLongClickListener extends js.Object {
  def fromFunction(func: js.Function1[/* v */ typings.androiduix.android.view.View, Boolean]): OnLongClickListener = js.native
}

