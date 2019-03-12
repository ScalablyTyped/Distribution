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
  def apply(run: () => js.Any): Runnable = {
    val __obj = js.Dynamic.literal(run = js.Any.fromFunction0(run))
  
    __obj.asInstanceOf[Runnable]
  }
}

