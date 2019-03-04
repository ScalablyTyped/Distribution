package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisposableLike extends js.Object {
  def dispose(): scala.Unit
}

object DisposableLike {
  @scala.inline
  def apply(dispose: js.Function0[scala.Unit]): DisposableLike = {
    val __obj = js.Dynamic.literal(dispose = dispose)
  
    __obj.asInstanceOf[DisposableLike]
  }
}

