package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.WrapInfluenceOnPositionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.text.WrapInfluenceOnPosition.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait ITERATIVE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.WrapInfluenceOnPositionNs.Constants
  
  @js.native
  sealed trait ONCE_CONCURRENT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.WrapInfluenceOnPositionNs.Constants
  
  @js.native
  sealed trait ONCE_SUCCESSIVE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.WrapInfluenceOnPositionNs.Constants
  
  /* 3 */ val ITERATIVE: ITERATIVE with scala.Double = js.native
  /* 2 */ val ONCE_CONCURRENT: ONCE_CONCURRENT with scala.Double = js.native
  /* 1 */ val ONCE_SUCCESSIVE: ONCE_SUCCESSIVE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.WrapInfluenceOnPositionNs.Constants with scala.Double
  ] = js.native
}

