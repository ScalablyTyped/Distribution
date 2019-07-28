package typings.adone.adoneNs.shaniNs.INs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeRuntimeContext
  extends /* key */ StringDictionary[js.Any] {
  /**
    * Skip this block
    */
  def skip(): Unit
  /**
    * Specify timeout for this block
    */
  def timeout(ms: Double): Unit
}

object DescribeRuntimeContext {
  @scala.inline
  def apply(
    skip: () => Unit,
    timeout: Double => Unit,
    StringDictionary: /* key */ StringDictionary[js.Any] = null
  ): DescribeRuntimeContext = {
    val __obj = js.Dynamic.literal(skip = js.Any.fromFunction0(skip), timeout = js.Any.fromFunction1(timeout))
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[DescribeRuntimeContext]
  }
}

