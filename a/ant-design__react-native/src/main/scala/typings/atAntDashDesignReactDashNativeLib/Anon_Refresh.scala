package typings
package atAntDashDesignReactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Refresh extends js.Object {
  def refresh(): scala.Unit
}

object Anon_Refresh {
  @scala.inline
  def apply(refresh: () => scala.Unit): Anon_Refresh = {
    val __obj = js.Dynamic.literal(refresh = js.Any.fromFunction0(refresh))
  
    __obj.asInstanceOf[Anon_Refresh]
  }
}

