package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcDataTransferType extends js.Object

@JSGlobal("Access.AcDataTransferType")
@js.native
object AcDataTransferType extends js.Object {
  @js.native
  sealed trait acExport
    extends activexDashAccessLib.AccessNs.AcDataTransferType
  
  @js.native
  sealed trait acImport
    extends activexDashAccessLib.AccessNs.AcDataTransferType
  
  @js.native
  sealed trait acLink
    extends activexDashAccessLib.AccessNs.AcDataTransferType
  
  /* 1 */ val acExport: acExport with scala.Double = js.native
  /* 0 */ val acImport: acImport with scala.Double = js.native
  /* 2 */ val acLink: acLink with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcDataTransferType with scala.Double] = js.native
}

