package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.eventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PhaseType extends js.Object

@JSGlobal("com.sun.star.xml.dom.events.PhaseType")
@js.native
object PhaseType extends js.Object {
  @js.native
  sealed trait AT_TARGET
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.eventsNs.PhaseType
  
  @js.native
  sealed trait BUBBLING_PHASE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.eventsNs.PhaseType
  
  @js.native
  sealed trait CAPTURING_PHASE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.eventsNs.PhaseType
  
  /* 1 */ val AT_TARGET: AT_TARGET with scala.Double = js.native
  /* 2 */ val BUBBLING_PHASE: BUBBLING_PHASE with scala.Double = js.native
  /* 0 */ val CAPTURING_PHASE: CAPTURING_PHASE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.eventsNs.PhaseType with scala.Double
  ] = js.native
}

