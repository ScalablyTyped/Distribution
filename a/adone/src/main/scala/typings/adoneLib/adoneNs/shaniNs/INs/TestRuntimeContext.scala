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
    skip: () => scala.Unit,
    timeout: scala.Double => scala.Unit,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): TestRuntimeContext = {
    val __obj = js.Dynamic.literal(skip = js.Any.fromFunction0(skip), timeout = js.Any.fromFunction1(timeout))
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[TestRuntimeContext]
  }
}

