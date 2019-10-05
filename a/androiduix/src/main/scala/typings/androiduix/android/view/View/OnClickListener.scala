package typings.androiduix.android.view.View

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnClickListener extends js.Object {
  def onClick(v: typings.androiduix.android.view.View): Unit
}

@JSGlobal("android.view.View.OnClickListener")
@js.native
object OnClickListener extends js.Object {
  def fromFunction(func: js.Function1[/* v */ typings.androiduix.android.view.View, Unit]): OnClickListener = js.native
}

