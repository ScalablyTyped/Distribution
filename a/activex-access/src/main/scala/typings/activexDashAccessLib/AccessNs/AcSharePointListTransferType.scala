package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcSharePointListTransferType extends js.Object

@JSGlobal("Access.AcSharePointListTransferType")
@js.native
object AcSharePointListTransferType extends js.Object {
  @js.native
  sealed trait acImportSharePointList
    extends activexDashAccessLib.AccessNs.AcSharePointListTransferType
  
  @js.native
  sealed trait acLinkSharePointList
    extends activexDashAccessLib.AccessNs.AcSharePointListTransferType
  
  /* 0 */ val acImportSharePointList: acImportSharePointList with scala.Double = js.native
  /* 1 */ val acLinkSharePointList: acLinkSharePointList with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcSharePointListTransferType with scala.Double] = js.native
}

