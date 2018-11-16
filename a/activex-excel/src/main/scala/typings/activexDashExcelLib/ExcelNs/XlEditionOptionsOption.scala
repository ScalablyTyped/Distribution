package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlEditionOptionsOption extends js.Object

@JSGlobal("Excel.XlEditionOptionsOption")
@js.native
object XlEditionOptionsOption extends js.Object {
  @js.native
  sealed trait xlAutomaticUpdate
    extends activexDashExcelLib.ExcelNs.XlEditionOptionsOption
  
  @js.native
  sealed trait xlCancel
    extends activexDashExcelLib.ExcelNs.XlEditionOptionsOption
  
  @js.native
  sealed trait xlChangeAttributes
    extends activexDashExcelLib.ExcelNs.XlEditionOptionsOption
  
  @js.native
  sealed trait xlManualUpdate
    extends activexDashExcelLib.ExcelNs.XlEditionOptionsOption
  
  @js.native
  sealed trait xlOpenSource
    extends activexDashExcelLib.ExcelNs.XlEditionOptionsOption
  
  @js.native
  sealed trait xlSelect
    extends activexDashExcelLib.ExcelNs.XlEditionOptionsOption
  
  @js.native
  sealed trait xlSendPublisher
    extends activexDashExcelLib.ExcelNs.XlEditionOptionsOption
  
  @js.native
  sealed trait xlUpdateSubscriber
    extends activexDashExcelLib.ExcelNs.XlEditionOptionsOption
  
  /* 4 */ val xlAutomaticUpdate: xlAutomaticUpdate with scala.Double = js.native
  /* 1 */ val xlCancel: xlCancel with scala.Double = js.native
  /* 6 */ val xlChangeAttributes: xlChangeAttributes with scala.Double = js.native
  /* 5 */ val xlManualUpdate: xlManualUpdate with scala.Double = js.native
  /* 3 */ val xlOpenSource: xlOpenSource with scala.Double = js.native
  /* 3 */ val xlSelect: xlSelect with scala.Double = js.native
  /* 2 */ val xlSendPublisher: xlSendPublisher with scala.Double = js.native
  /* 2 */ val xlUpdateSubscriber: xlUpdateSubscriber with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlEditionOptionsOption with scala.Double] = js.native
}

