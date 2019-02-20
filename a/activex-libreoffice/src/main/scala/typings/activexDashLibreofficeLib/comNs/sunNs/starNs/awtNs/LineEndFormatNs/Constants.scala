package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.LineEndFormatNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.awt.LineEndFormat.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait CARRIAGE_RETURN
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.LineEndFormatNs.Constants
  
  @js.native
  sealed trait CARRIAGE_RETURN_LINE_FEED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.LineEndFormatNs.Constants
  
  @js.native
  sealed trait LINE_FEED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.LineEndFormatNs.Constants
  
  /* 0 */ val CARRIAGE_RETURN: CARRIAGE_RETURN with scala.Double = js.native
  /* 2 */ val CARRIAGE_RETURN_LINE_FEED: CARRIAGE_RETURN_LINE_FEED with scala.Double = js.native
  /* 1 */ val LINE_FEED: LINE_FEED with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.LineEndFormatNs.Constants with scala.Double
  ] = js.native
}

