package typings.atAntDashDesignReactDashNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Refresh extends js.Object {
  def refresh(): Unit
}

object Anon_Refresh {
  @scala.inline
  def apply(refresh: () => Unit): Anon_Refresh = {
    val __obj = js.Dynamic.literal(refresh = js.Any.fromFunction0(refresh))
  
    __obj.asInstanceOf[Anon_Refresh]
  }
}

