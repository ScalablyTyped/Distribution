package typings.atlassianConnectJs.AP.flag

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Flag extends js.Object {
  /**
    * Closes the Flag.
    */
  def close(): Unit
}

object Flag {
  @scala.inline
  def apply(close: () => Unit): Flag = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close))
    __obj.asInstanceOf[Flag]
  }
}

