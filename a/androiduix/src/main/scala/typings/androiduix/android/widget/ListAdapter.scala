package typings.androiduix.android.widget

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAdapter extends Adapter {
  def areAllItemsEnabled(): Boolean
  def isEnabled(position: Double): Boolean
}

@JSGlobal("android.widget.ListAdapter")
@js.native
object ListAdapter extends js.Object {
  def isImpl(obj: js.Any): js.Any = js.native
}

