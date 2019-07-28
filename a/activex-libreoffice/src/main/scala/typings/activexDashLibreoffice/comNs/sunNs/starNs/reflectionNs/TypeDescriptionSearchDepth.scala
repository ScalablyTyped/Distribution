package typings.activexDashLibreoffice.comNs.sunNs.starNs.reflectionNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`-1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines depths for searching through type description collections.
  * @since OOo 1.1.2
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`-1`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
*/
trait TypeDescriptionSearchDepth extends js.Object

object TypeDescriptionSearchDepth {
  /** Infinite search depth. Search through all children including direct children, grand children, grand children's children, ... */
  @scala.inline
  def INFINITE: `-1` = this.cast(-1)
  /** Search only through direct children. */
  @scala.inline
  def ONE: `1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

