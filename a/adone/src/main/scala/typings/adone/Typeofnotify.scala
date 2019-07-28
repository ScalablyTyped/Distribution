package typings.adone

import typings.adone.adoneNs.fastNs.INs.pluginNs.notifyNs.OnErrorOptions
import typings.adone.adoneNs.fastNs.INs.pluginNs.notifyNs.OptionsArg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofnotify extends js.Object {
  /**
    * Creates a callback that can be used as a reporter for errors
    */
  def onError[T](): js.Function1[/* error */ T, Unit] = js.native
  def onError[T](options: OptionsArg[T, OnErrorOptions[T]]): js.Function1[/* error */ T, Unit] = js.native
}

