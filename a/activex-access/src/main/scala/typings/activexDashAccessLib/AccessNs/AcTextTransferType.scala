package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcTextTransferType extends js.Object

@JSGlobal("Access.AcTextTransferType")
@js.native
object AcTextTransferType extends js.Object {
  @js.native
  sealed trait acExportDelim
    extends activexDashAccessLib.AccessNs.AcTextTransferType
  
  @js.native
  sealed trait acExportFixed
    extends activexDashAccessLib.AccessNs.AcTextTransferType
  
  @js.native
  sealed trait acExportHTML
    extends activexDashAccessLib.AccessNs.AcTextTransferType
  
  @js.native
  sealed trait acExportMerge
    extends activexDashAccessLib.AccessNs.AcTextTransferType
  
  @js.native
  sealed trait acImportDelim
    extends activexDashAccessLib.AccessNs.AcTextTransferType
  
  @js.native
  sealed trait acImportFixed
    extends activexDashAccessLib.AccessNs.AcTextTransferType
  
  @js.native
  sealed trait acImportHTML
    extends activexDashAccessLib.AccessNs.AcTextTransferType
  
  @js.native
  sealed trait acLinkDelim
    extends activexDashAccessLib.AccessNs.AcTextTransferType
  
  @js.native
  sealed trait acLinkFixed
    extends activexDashAccessLib.AccessNs.AcTextTransferType
  
  @js.native
  sealed trait acLinkHTML
    extends activexDashAccessLib.AccessNs.AcTextTransferType
  
  /* 2 */ val acExportDelim: acExportDelim with scala.Double = js.native
  /* 3 */ val acExportFixed: acExportFixed with scala.Double = js.native
  /* 8 */ val acExportHTML: acExportHTML with scala.Double = js.native
  /* 4 */ val acExportMerge: acExportMerge with scala.Double = js.native
  /* 0 */ val acImportDelim: acImportDelim with scala.Double = js.native
  /* 1 */ val acImportFixed: acImportFixed with scala.Double = js.native
  /* 7 */ val acImportHTML: acImportHTML with scala.Double = js.native
  /* 5 */ val acLinkDelim: acLinkDelim with scala.Double = js.native
  /* 6 */ val acLinkFixed: acLinkFixed with scala.Double = js.native
  /* 9 */ val acLinkHTML: acLinkHTML with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcTextTransferType with scala.Double] = js.native
}

