package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ElementMarkType extends js.Object

/**
  * Defines types of element mark.
  *
  * the TYPEOFELEMENTMARK type represents a blocker, and the TYPEOFELEMENTCOLLECTOR type represents a element collector.
  */
@JSGlobal("com.sun.star.xml.crypto.sax.ElementMarkType")
@js.native
object ElementMarkType extends js.Object {
  @js.native
  sealed trait ELEMENTCOLLECTOR
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs.ElementMarkType
  
  @js.native
  sealed trait ELEMENTMARK
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs.ElementMarkType
  
  /* 2 */ val ELEMENTCOLLECTOR: ELEMENTCOLLECTOR with scala.Double = js.native
  /* 1 */ val ELEMENTMARK: ELEMENTMARK with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs.ElementMarkType with scala.Double
  ] = js.native
}

