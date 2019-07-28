package typings.activexDashLibreoffice.comNs.sunNs.starNs.reflectionNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The parameter mode denotes the transfer between caller and callee of a method. */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
*/
trait ParamMode extends js.Object

object ParamMode {
  /** parameter serves as pure input for a called method */
  @scala.inline
  def IN: `0` = this.cast(0)
  /** parameter serves as input as well as output; data can transferred in both directions */
  @scala.inline
  def INOUT: `2` = this.cast(2)
  /** parameter serves as pure output for the callee (in addition to the return value) */
  @scala.inline
  def OUT: `1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

