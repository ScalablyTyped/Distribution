package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlEditionType extends js.Object

@JSGlobal("Excel.XlEditionType")
@js.native
object XlEditionType extends js.Object {
  @js.native
  sealed trait xlPublisher
    extends activexDashExcelLib.ExcelNs.XlEditionType
  
  @js.native
  sealed trait xlSubscriber
    extends activexDashExcelLib.ExcelNs.XlEditionType
  
  /* 1 */ val xlPublisher: xlPublisher with scala.Double = js.native
  /* 2 */ val xlSubscriber: xlSubscriber with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlEditionType with scala.Double] = js.native
}

