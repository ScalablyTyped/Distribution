package typings
package activexDashFaxcomexlibLib.FAXCOMEXLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FaxConstants extends js.Object

// tslint:disable-next-line:no-const-enum
@JSGlobal("FAXCOMEXLib.FaxConstants")
@js.native
object FaxConstants extends js.Object {
  @js.native
  sealed trait bstrGROUPNAME_ALLDEVICES
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxConstants
  
  @js.native
  sealed trait lDEFAULT_PREFETCH_SIZE
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxConstants
  
  @js.native
  sealed trait wcharREASSIGN_RECIPIENTS_DELIMITER
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxConstants
  
  /* "<All Devices>" */ val bstrGROUPNAME_ALLDEVICES: bstrGROUPNAME_ALLDEVICES with java.lang.String = js.native
  /* 100 */ val lDEFAULT_PREFETCH_SIZE: lDEFAULT_PREFETCH_SIZE with java.lang.String = js.native
  /* 59 */ val wcharREASSIGN_RECIPIENTS_DELIMITER: wcharREASSIGN_RECIPIENTS_DELIMITER with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxConstants with java.lang.String] = js.native
}

