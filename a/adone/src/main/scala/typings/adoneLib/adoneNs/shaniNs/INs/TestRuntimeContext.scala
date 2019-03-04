package typings
package adoneLib.adoneNs.shaniNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestRuntimeContext
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
    * Skip this test
    */
  def skip(): scala.Unit
  /**
    * Specify timeout for this test
    */
  def timeout(ms: scala.Double): scala.Unit
}

object TestRuntimeContext {
  @scala.inline
  def apply(
    skip: js.Function0[scala.Unit],
    timeout: js.Function1[scala.Double, scala.Unit],
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): TestRuntimeContext = {
    val __obj = js.Dynamic.literal(skip = skip, timeout = timeout)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[TestRuntimeContext]
  }
}

