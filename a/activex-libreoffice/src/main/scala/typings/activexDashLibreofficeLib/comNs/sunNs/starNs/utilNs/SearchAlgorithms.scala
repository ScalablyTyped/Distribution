package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SearchAlgorithms extends js.Object

@JSGlobal("com.sun.star.util.SearchAlgorithms")
@js.native
object SearchAlgorithms extends js.Object {
  @js.native
  sealed trait ABSOLUTE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.SearchAlgorithms
  
  @js.native
  sealed trait APPROXIMATE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.SearchAlgorithms
  
  @js.native
  sealed trait REGEXP
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.SearchAlgorithms
  
  /* 0 */ val ABSOLUTE: ABSOLUTE with scala.Double = js.native
  /* 2 */ val APPROXIMATE: APPROXIMATE with scala.Double = js.native
  /* 1 */ val REGEXP: REGEXP with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.SearchAlgorithms with scala.Double
  ] = js.native
}

