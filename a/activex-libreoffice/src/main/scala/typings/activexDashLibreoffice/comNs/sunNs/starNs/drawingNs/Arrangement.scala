package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * With this enumeration you can arrange the relative position of an object within the other objects.
  * @deprecated Deprecated
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
*/
trait Arrangement extends js.Object

object Arrangement {
  /** Move this object behind all other objects. */
  @scala.inline
  def BACK: `3` = this.cast(3)
  /** Move this object in front of all other objects. */
  @scala.inline
  def FRONT: `0` = this.cast(0)
  /** Move this object one object more to the back. */
  @scala.inline
  def MORE_BACK: `2` = this.cast(2)
  /** Move this object one object more to the front. */
  @scala.inline
  def MORE_FRONT: `1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

