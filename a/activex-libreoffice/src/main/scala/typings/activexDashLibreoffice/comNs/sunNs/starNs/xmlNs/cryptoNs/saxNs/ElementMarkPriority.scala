package typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines priority for the element mark's notification.
  *
  * The PRI_MINIMUM priority is a value less than any practical priority value, it is used when compare between different priority values.
  *
  * The PRI_AFTERMODIFY priority represents the notification will be sent after any internal modification has finished.
  *
  * The PRI_BEFOREMODIFY proirity represents the notification will be sent before any internal modification happens.
  *
  * So an element mark with PRI_BEFOREMODIFY will be handled first, and one with PRI_AFTERMODIFY will be handled at last.
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
*/
trait ElementMarkPriority extends js.Object

object ElementMarkPriority {
  @scala.inline
  def AFTERMODIFY: `2` = this.cast(2)
  @scala.inline
  def BEFOREMODIFY: `3` = this.cast(3)
  @scala.inline
  def MINIMUM: `1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

