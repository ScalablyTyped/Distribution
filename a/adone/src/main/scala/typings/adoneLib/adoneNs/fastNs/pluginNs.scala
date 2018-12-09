package typings
package adoneLib.adoneNs.fastNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.fast.plugin")
@js.native
object pluginNs extends js.Object {
  @JSName("notify")
  @js.native
  object notifyNs extends js.Object {
    /**
                     * Creates a callback that can be used as a reporter for errors
                     */
    def onError[T](): js.Function1[/* error */ T, scala.Unit] = js.native
    /**
                     * Creates a callback that can be used as a reporter for errors
                     */
    def onError[T](
      options: adoneLib.adoneNs.fastNs.INs.pluginNs.notifyNs.OptionsArg[T, adoneLib.adoneNs.fastNs.INs.pluginNs.notifyNs.OnErrorOptions[T]]
    ): js.Function1[/* error */ T, scala.Unit] = js.native
  }
  
}

