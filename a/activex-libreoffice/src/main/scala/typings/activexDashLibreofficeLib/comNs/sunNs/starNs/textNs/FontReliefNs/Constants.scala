package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.FontReliefNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.text.FontRelief.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait EMBOSSED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.FontReliefNs.Constants
  
  @js.native
  sealed trait ENGRAVED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.FontReliefNs.Constants
  
  @js.native
  sealed trait NONE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.FontReliefNs.Constants
  
  /* 1 */ val EMBOSSED: EMBOSSED with scala.Double = js.native
  /* 2 */ val ENGRAVED: ENGRAVED with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.FontReliefNs.Constants with scala.Double
  ] = js.native
}

