package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.eventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AttrChangeType extends js.Object

@JSGlobal("com.sun.star.xml.dom.events.AttrChangeType")
@js.native
object AttrChangeType extends js.Object {
  @js.native
  sealed trait ADDITION
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.eventsNs.AttrChangeType
  
  @js.native
  sealed trait MODIFICATION
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.eventsNs.AttrChangeType
  
  @js.native
  sealed trait REMOVAL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.eventsNs.AttrChangeType
  
  /* 1 */ val ADDITION: ADDITION with scala.Double = js.native
  /* 0 */ val MODIFICATION: MODIFICATION with scala.Double = js.native
  /* 2 */ val REMOVAL: REMOVAL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.eventsNs.AttrChangeType with scala.Double
  ] = js.native
}

