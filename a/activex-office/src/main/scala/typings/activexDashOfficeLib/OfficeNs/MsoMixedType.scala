package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoMixedType extends js.Object

@JSGlobal("Office.MsoMixedType")
@js.native
object MsoMixedType extends js.Object {
  @js.native
  sealed trait msoIntegerMixed
    extends activexDashOfficeLib.OfficeNs.MsoMixedType
  
  @js.native
  sealed trait msoSingleMixed
    extends activexDashOfficeLib.OfficeNs.MsoMixedType
  
  /* 32768 */ val msoIntegerMixed: msoIntegerMixed with scala.Double = js.native
  /* -2147483648 */ val msoSingleMixed: msoSingleMixed with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoMixedType with scala.Double] = js.native
}

