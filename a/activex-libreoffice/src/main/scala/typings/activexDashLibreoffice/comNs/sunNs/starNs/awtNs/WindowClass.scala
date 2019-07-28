package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the class of a window. */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
*/
trait WindowClass extends js.Object

object WindowClass {
  /** is a container that may contain other components. It is not a top window. */
  @scala.inline
  def CONTAINER: `2` = this.cast(2)
  /** is a modal top level window on the desktop. It is also a container. */
  @scala.inline
  def MODALTOP: `1` = this.cast(1)
  /** is the simplest window. It can be a container. */
  @scala.inline
  def SIMPLE: `3` = this.cast(3)
  /** specifies a top level window on the desktop. It is also a container. */
  @scala.inline
  def TOP: `0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

