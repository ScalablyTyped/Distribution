package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ParamMode extends js.Object

/** The parameter mode denotes the transfer between caller and callee of a method. */
@JSGlobal("com.sun.star.reflection.ParamMode")
@js.native
object ParamMode extends js.Object {
  /** parameter serves as pure input for a called method */
  @js.native
  sealed trait IN
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs.ParamMode
  
  /** parameter serves as input as well as output; data can transferred in both directions */
  @js.native
  sealed trait INOUT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs.ParamMode
  
  /** parameter serves as pure output for the callee (in addition to the return value) */
  @js.native
  sealed trait OUT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs.ParamMode
  
  /* 0 */ val IN: IN with scala.Double = js.native
  /* 2 */ val INOUT: INOUT with scala.Double = js.native
  /* 1 */ val OUT: OUT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs.ParamMode with scala.Double
  ] = js.native
}

