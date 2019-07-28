package typings.adone.adoneNs.shaniNs.INs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HookRuntimeContext
  extends /* key */ StringDictionary[js.Any] {
  /**
    * Specify timeout for this hook
    */
  def timeout(ms: Double): Unit
}

object HookRuntimeContext {
  @scala.inline
  def apply(timeout: Double => Unit, StringDictionary: /* key */ StringDictionary[js.Any] = null): HookRuntimeContext = {
    val __obj = js.Dynamic.literal(timeout = js.Any.fromFunction1(timeout))
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[HookRuntimeContext]
  }
}

