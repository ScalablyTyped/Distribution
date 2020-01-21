package typings.astTypes.astTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fork extends js.Object {
  def use[T](plugin: Plugin[T]): T
}

object Fork {
  @scala.inline
  def apply(use: Plugin[js.Any] => js.Any): Fork = {
    val __obj = js.Dynamic.literal(use = js.Any.fromFunction1(use))
  
    __obj.asInstanceOf[Fork]
  }
}

