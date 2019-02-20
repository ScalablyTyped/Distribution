package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.SearchAlgorithms2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.util.SearchAlgorithms2.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait ABSOLUTE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.SearchAlgorithms2Ns.Constants
  
  @js.native
  sealed trait APPROXIMATE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.SearchAlgorithms2Ns.Constants
  
  @js.native
  sealed trait REGEXP
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.SearchAlgorithms2Ns.Constants
  
  @js.native
  sealed trait WILDCARD
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.SearchAlgorithms2Ns.Constants
  
  /* 1 */ val ABSOLUTE: ABSOLUTE with scala.Double = js.native
  /* 3 */ val APPROXIMATE: APPROXIMATE with scala.Double = js.native
  /* 2 */ val REGEXP: REGEXP with scala.Double = js.native
  /* 4 */ val WILDCARD: WILDCARD with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.SearchAlgorithms2Ns.Constants with scala.Double
  ] = js.native
}

