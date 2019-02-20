package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.SizeTypeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.text.SizeType.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait FIX
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.SizeTypeNs.Constants
  
  @js.native
  sealed trait MIN
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.SizeTypeNs.Constants
  
  @js.native
  sealed trait VARIABLE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.SizeTypeNs.Constants
  
  /* 1 */ val FIX: FIX with scala.Double = js.native
  /* 2 */ val MIN: MIN with scala.Double = js.native
  /* 0 */ val VARIABLE: VARIABLE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.SizeTypeNs.Constants with scala.Double
  ] = js.native
}

