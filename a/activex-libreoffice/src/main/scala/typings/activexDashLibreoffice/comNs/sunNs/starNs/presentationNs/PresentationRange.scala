package typings.activexDashLibreoffice.comNs.sunNs.starNs.presentationNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies which part of the presentation is to show. */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
*/
trait PresentationRange extends js.Object

object PresentationRange {
  /** use all slides. */
  @scala.inline
  def PRESENTATIONRANGE_ALL: `0` = this.cast(0)
  /** use only the active slide. */
  @scala.inline
  def PRESENTATIONRANGE_FROM_PAGE: `1` = this.cast(1)
  /** use an individual choice of slides. */
  @scala.inline
  def PRESENTATIONRANGE_INDIVIDUAL: `2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

