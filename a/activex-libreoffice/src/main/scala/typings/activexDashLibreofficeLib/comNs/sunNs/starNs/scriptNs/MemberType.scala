package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MemberType extends js.Object

/** These values are used to specify a member accessible by {@link XInvocation} . */
@JSGlobal("com.sun.star.script.MemberType")
@js.native
object MemberType extends js.Object {
  @js.native
  sealed trait METHOD
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.MemberType
  
  @js.native
  sealed trait PROPERTY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.MemberType
  
  @js.native
  sealed trait UNKNOWN
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.MemberType
  
  /* 0 */ val METHOD: METHOD with scala.Double = js.native
  /* 1 */ val PROPERTY: PROPERTY with scala.Double = js.native
  /* 2 */ val UNKNOWN: UNKNOWN with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.MemberType with scala.Double
  ] = js.native
}

