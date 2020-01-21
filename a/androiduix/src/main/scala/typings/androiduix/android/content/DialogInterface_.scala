package typings.androiduix.android.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogInterface_ extends js.Object {
  def cancel(): Unit
  def dismiss(): Unit
}

object DialogInterface_ {
  @scala.inline
  def apply(cancel: () => Unit, dismiss: () => Unit): DialogInterface_ = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), dismiss = js.Any.fromFunction0(dismiss))
  
    __obj.asInstanceOf[DialogInterface_]
  }
}

