package typings.angularCore.mod

import typings.angularCore.angularCoreNumbers.`0`
import typings.angularCore.angularCoreNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the ICU type of `select` or `plural`
  */
/* Rewritten from type alias, can be one of: 
  - typings.angularCore.angularCoreNumbers.`0`
  - typings.angularCore.angularCoreNumbers.`1`
*/
trait IcuType extends js.Object

object IcuType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def plural: `1` = this.cast(1)
  @scala.inline
  def select: `0` = this.cast(0)
}

