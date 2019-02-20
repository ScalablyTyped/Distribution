package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ElementMarkPriority extends js.Object

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
@JSGlobal("com.sun.star.xml.crypto.sax.ElementMarkPriority")
@js.native
object ElementMarkPriority extends js.Object {
  @js.native
  sealed trait AFTERMODIFY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs.ElementMarkPriority
  
  @js.native
  sealed trait BEFOREMODIFY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs.ElementMarkPriority
  
  @js.native
  sealed trait MINIMUM
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs.ElementMarkPriority
  
  /* 2 */ val AFTERMODIFY: AFTERMODIFY with scala.Double = js.native
  /* 3 */ val BEFOREMODIFY: BEFOREMODIFY with scala.Double = js.native
  /* 1 */ val MINIMUM: MINIMUM with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs.ElementMarkPriority with scala.Double
  ] = js.native
}

