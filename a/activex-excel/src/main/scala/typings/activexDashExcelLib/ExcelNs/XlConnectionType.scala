package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlConnectionType extends js.Object

@JSGlobal("Excel.XlConnectionType")
@js.native
object XlConnectionType extends js.Object {
  @js.native
  sealed trait xlConnectionTypeODBC
    extends activexDashExcelLib.ExcelNs.XlConnectionType
  
  @js.native
  sealed trait xlConnectionTypeOLEDB
    extends activexDashExcelLib.ExcelNs.XlConnectionType
  
  @js.native
  sealed trait xlConnectionTypeTEXT
    extends activexDashExcelLib.ExcelNs.XlConnectionType
  
  @js.native
  sealed trait xlConnectionTypeWEB
    extends activexDashExcelLib.ExcelNs.XlConnectionType
  
  @js.native
  sealed trait xlConnectionTypeXMLMAP
    extends activexDashExcelLib.ExcelNs.XlConnectionType
  
  /* 2 */ val xlConnectionTypeODBC: xlConnectionTypeODBC with scala.Double = js.native
  /* 1 */ val xlConnectionTypeOLEDB: xlConnectionTypeOLEDB with scala.Double = js.native
  /* 4 */ val xlConnectionTypeTEXT: xlConnectionTypeTEXT with scala.Double = js.native
  /* 5 */ val xlConnectionTypeWEB: xlConnectionTypeWEB with scala.Double = js.native
  /* 3 */ val xlConnectionTypeXMLMAP: xlConnectionTypeXMLMAP with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlConnectionType with scala.Double] = js.native
}

