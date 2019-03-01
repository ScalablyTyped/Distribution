package typings
package androiduixLib.javaNs.langNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Runnable extends js.Object {
  def run(): js.Any
}

object Runnable {
  @scala.inline
  def apply(run: js.Function0[js.Any]): Runnable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("run")(run)
    __obj.asInstanceOf[Runnable]
  }
}

