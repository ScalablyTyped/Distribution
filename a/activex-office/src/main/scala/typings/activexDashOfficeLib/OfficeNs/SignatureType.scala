package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SignatureType extends js.Object

@JSGlobal("Office.SignatureType")
@js.native
object SignatureType extends js.Object {
  @js.native
  sealed trait sigtypeMax
    extends activexDashOfficeLib.OfficeNs.SignatureType
  
  @js.native
  sealed trait sigtypeNonVisible
    extends activexDashOfficeLib.OfficeNs.SignatureType
  
  @js.native
  sealed trait sigtypeSignatureLine
    extends activexDashOfficeLib.OfficeNs.SignatureType
  
  @js.native
  sealed trait sigtypeUnknown
    extends activexDashOfficeLib.OfficeNs.SignatureType
  
  /* 3 */ val sigtypeMax: sigtypeMax with scala.Double = js.native
  /* 1 */ val sigtypeNonVisible: sigtypeNonVisible with scala.Double = js.native
  /* 2 */ val sigtypeSignatureLine: sigtypeSignatureLine with scala.Double = js.native
  /* 0 */ val sigtypeUnknown: sigtypeUnknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.SignatureType with scala.Double] = js.native
}

