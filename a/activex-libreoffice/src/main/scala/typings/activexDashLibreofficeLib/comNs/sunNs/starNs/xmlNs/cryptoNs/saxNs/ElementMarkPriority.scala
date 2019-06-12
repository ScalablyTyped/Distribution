package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs

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
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
*/
trait ElementMarkPriority extends js.Object

