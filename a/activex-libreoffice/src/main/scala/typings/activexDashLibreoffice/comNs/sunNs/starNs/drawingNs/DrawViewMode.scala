package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This enumeration specifies the view mode of a view in a presentation document.
  * @deprecated Deprecated
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
*/
trait DrawViewMode extends js.Object

object DrawViewMode {
  /** The view shows the drawing pages. */
  @scala.inline
  def DRAW: `0` = this.cast(0)
  /** The view shows the handout pages, */
  @scala.inline
  def HANDOUT: `2` = this.cast(2)
  /** The view shows the notes pages. */
  @scala.inline
  def NOTES: `1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

