package typings
package adoneLib.adoneNs.shaniNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HookRuntimeContext
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
    * Specify timeout for this hook
    */
  def timeout(ms: scala.Double): scala.Unit
}

object HookRuntimeContext {
  @scala.inline
  def apply(
    timeout: scala.Double => scala.Unit,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): HookRuntimeContext = {
    val __obj = js.Dynamic.literal(timeout = js.Any.fromFunction1(timeout))
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[HookRuntimeContext]
  }
}

