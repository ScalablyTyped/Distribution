package typings
package adoneLib.adoneNs.shaniNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeRuntimeContext
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
    * Skip this block
    */
  def skip(): scala.Unit
  /**
    * Specify timeout for this block
    */
  def timeout(ms: scala.Double): scala.Unit
}

object DescribeRuntimeContext {
  @scala.inline
  def apply(
    skip: js.Function0[scala.Unit],
    timeout: js.Function1[scala.Double, scala.Unit],
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): DescribeRuntimeContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("skip")(skip)
    __obj.updateDynamic("timeout")(timeout)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[DescribeRuntimeContext]
  }
}

