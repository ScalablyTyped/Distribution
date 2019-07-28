package typings.atAngularCore.atAngularCoreMod

import typings.atAngularCore.atAngularCoreNumbers._4294901760
import typings.atAngularCore.atAngularCoreNumbers.`16`
import typings.atAngularCore.atAngularCoreNumbers.`65535`
import typings.atAngularCore.atAngularCoreNumbers.`65536`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** More flags associated with an LView (saved in LView[FLAGS_MORE]) */
/* Rewritten from type alias, can be one of: 
  - typings.atAngularCore.atAngularCoreNumbers.`65535`
  - typings.atAngularCore.atAngularCoreNumbers.`65536`
  - typings.atAngularCore.atAngularCoreNumbers.`16`
  - typings.atAngularCore.atAngularCoreNumbers._4294901760
*/
trait PreOrderHookFlags extends js.Object

object PreOrderHookFlags {
  /** The index of the next pre-order hook to be called in the hooks array, on the first 16
    bits */
  @scala.inline
  def IndexOfTheNextPreOrderHookMaskMask: `65535` = this.cast(65535)
  /**
    * The number of init hooks that have already been called, on the last 16 bits
    */
  @scala.inline
  def NumberOfInitHooksCalledIncrementer: `65536` = this.cast(65536)
  @scala.inline
  def NumberOfInitHooksCalledMask: _4294901760 = this.cast(4294901760.0)
  @scala.inline
  def NumberOfInitHooksCalledShift: `16` = this.cast(16)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

