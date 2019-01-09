package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Error extends js.Object {
  /**
    * Creates a callback that can be used as a reporter for errors
    */
  def onError[T](): js.Function1[/* error */ T, scala.Unit] = js.native
  def onError[T](
    options: adoneLib.adoneNs.fastNs.INs.pluginNs.notifyNs.OptionsArg[T, adoneLib.adoneNs.fastNs.INs.pluginNs.notifyNs.OnErrorOptions[T]]
  ): js.Function1[/* error */ T, scala.Unit] = js.native
}

