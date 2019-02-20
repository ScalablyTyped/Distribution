package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MethodMode extends js.Object

/**
  * MethodMode denotes the mode in which method calls are run, i.e. either oneway or twoway. Mode oneway denotes that a call may be run asynchronously
  * (thus having no out parameters or return value)
  */
@JSGlobal("com.sun.star.reflection.MethodMode")
@js.native
object MethodMode extends js.Object {
  /** method may be run asynchronously */
  @js.native
  sealed trait ONEWAY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs.MethodMode
  
  /** method is run The */
  @js.native
  sealed trait TWOWAY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs.MethodMode
  
  /* 0 */ val ONEWAY: ONEWAY with scala.Double = js.native
  /* 1 */ val TWOWAY: TWOWAY with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs.MethodMode with scala.Double
  ] = js.native
}

