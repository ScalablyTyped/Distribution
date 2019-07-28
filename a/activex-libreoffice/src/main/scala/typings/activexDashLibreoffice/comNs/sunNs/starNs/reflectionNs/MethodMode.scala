package typings.activexDashLibreoffice.comNs.sunNs.starNs.reflectionNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * MethodMode denotes the mode in which method calls are run, i.e. either oneway or twoway. Mode oneway denotes that a call may be run asynchronously
  * (thus having no out parameters or return value)
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
*/
trait MethodMode extends js.Object

object MethodMode {
  /** method may be run asynchronously */
  @scala.inline
  def ONEWAY: `0` = this.cast(0)
  /** method is run The */
  @scala.inline
  def TWOWAY: `1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

