package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SearchRecursion extends js.Object

/**
  * the various modes of recursion when searching through a hierarchical object.
  * @see SearchInfo
  */
@JSGlobal("com.sun.star.ucb.SearchRecursion")
@js.native
object SearchRecursion extends js.Object {
  /** Searches through the complete hierarchy of all sub-objects. */
  @js.native
  sealed trait DEEP
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.SearchRecursion
  
  /** Does not search through any sub-objects. */
  @js.native
  sealed trait NONE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.SearchRecursion
  
  /** Only searches through sub-objects of the first hierarchy level. */
  @js.native
  sealed trait ONE_LEVEL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.SearchRecursion
  
  /* 2 */ val DEEP: DEEP with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  /* 1 */ val ONE_LEVEL: ONE_LEVEL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.SearchRecursion with scala.Double
  ] = js.native
}

