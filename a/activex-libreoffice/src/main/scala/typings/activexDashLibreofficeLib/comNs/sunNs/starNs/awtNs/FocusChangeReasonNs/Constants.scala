package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FocusChangeReasonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.awt.FocusChangeReason.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait AROUND
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FocusChangeReasonNs.Constants
  
  @js.native
  sealed trait BACKWARD
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FocusChangeReasonNs.Constants
  
  @js.native
  sealed trait CURSOR
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FocusChangeReasonNs.Constants
  
  @js.native
  sealed trait FORWARD
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FocusChangeReasonNs.Constants
  
  @js.native
  sealed trait MNEMONIC
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FocusChangeReasonNs.Constants
  
  @js.native
  sealed trait TAB
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FocusChangeReasonNs.Constants
  
  @js.native
  sealed trait UNIQUEMNEMONIC
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FocusChangeReasonNs.Constants
  
  /* 64 */ val AROUND: AROUND with scala.Double = js.native
  /* 32 */ val BACKWARD: BACKWARD with scala.Double = js.native
  /* 2 */ val CURSOR: CURSOR with scala.Double = js.native
  /* 16 */ val FORWARD: FORWARD with scala.Double = js.native
  /* 4 */ val MNEMONIC: MNEMONIC with scala.Double = js.native
  /* 1 */ val TAB: TAB with scala.Double = js.native
  /* 256 */ val UNIQUEMNEMONIC: UNIQUEMNEMONIC with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FocusChangeReasonNs.Constants with scala.Double
  ] = js.native
}

