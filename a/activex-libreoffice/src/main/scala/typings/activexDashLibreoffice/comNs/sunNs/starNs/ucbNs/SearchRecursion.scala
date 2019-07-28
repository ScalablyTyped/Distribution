package typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * the various modes of recursion when searching through a hierarchical object.
  * @see SearchInfo
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
*/
trait SearchRecursion extends js.Object

object SearchRecursion {
  /** Searches through the complete hierarchy of all sub-objects. */
  @scala.inline
  def DEEP: `2` = this.cast(2)
  /** Does not search through any sub-objects. */
  @scala.inline
  def NONE: `0` = this.cast(0)
  /** Only searches through sub-objects of the first hierarchy level. */
  @scala.inline
  def ONE_LEVEL: `1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

