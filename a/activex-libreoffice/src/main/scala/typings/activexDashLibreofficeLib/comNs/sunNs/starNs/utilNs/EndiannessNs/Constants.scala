package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.EndiannessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.util.Endianness.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait BIG
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.EndiannessNs.Constants
  
  @js.native
  sealed trait LITTLE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.EndiannessNs.Constants
  
  /* 1 */ val BIG: BIG with scala.Double = js.native
  /* 0 */ val LITTLE: LITTLE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.EndiannessNs.Constants with scala.Double
  ] = js.native
}

