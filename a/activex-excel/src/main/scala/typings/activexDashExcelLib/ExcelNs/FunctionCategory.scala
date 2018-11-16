package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FunctionCategory extends js.Object

@JSGlobal("Excel.FunctionCategory")
@js.native
object FunctionCategory extends js.Object {
  @js.native
  sealed trait Commands
    extends activexDashExcelLib.ExcelNs.FunctionCategory
  
  @js.native
  sealed trait Customizing
    extends activexDashExcelLib.ExcelNs.FunctionCategory
  
  @js.native
  sealed trait DDEAndExternal
    extends activexDashExcelLib.ExcelNs.FunctionCategory
  
  @js.native
  sealed trait Database
    extends activexDashExcelLib.ExcelNs.FunctionCategory
  
  @js.native
  sealed trait DateAndTime
    extends activexDashExcelLib.ExcelNs.FunctionCategory
  
  @js.native
  sealed trait Financial
    extends activexDashExcelLib.ExcelNs.FunctionCategory
  
  @js.native
  sealed trait Information
    extends activexDashExcelLib.ExcelNs.FunctionCategory
  
  @js.native
  sealed trait Logical
    extends activexDashExcelLib.ExcelNs.FunctionCategory
  
  @js.native
  sealed trait LookupAndReference
    extends activexDashExcelLib.ExcelNs.FunctionCategory
  
  @js.native
  sealed trait MacroControl
    extends activexDashExcelLib.ExcelNs.FunctionCategory
  
  @js.native
  sealed trait MathAndTrig
    extends activexDashExcelLib.ExcelNs.FunctionCategory
  
  @js.native
  sealed trait Statistical
    extends activexDashExcelLib.ExcelNs.FunctionCategory
  
  @js.native
  sealed trait Text
    extends activexDashExcelLib.ExcelNs.FunctionCategory
  
  @js.native
  sealed trait UserDefined
    extends activexDashExcelLib.ExcelNs.FunctionCategory
  
  /* 10 */ val Commands: Commands with scala.Double = js.native
  /* 11 */ val Customizing: Customizing with scala.Double = js.native
  /* 13 */ val DDEAndExternal: DDEAndExternal with scala.Double = js.native
  /* 6 */ val Database: Database with scala.Double = js.native
  /* 2 */ val DateAndTime: DateAndTime with scala.Double = js.native
  /* 1 */ val Financial: Financial with scala.Double = js.native
  /* 9 */ val Information: Information with scala.Double = js.native
  /* 8 */ val Logical: Logical with scala.Double = js.native
  /* 5 */ val LookupAndReference: LookupAndReference with scala.Double = js.native
  /* 12 */ val MacroControl: MacroControl with scala.Double = js.native
  /* 3 */ val MathAndTrig: MathAndTrig with scala.Double = js.native
  /* 4 */ val Statistical: Statistical with scala.Double = js.native
  /* 7 */ val Text: Text with scala.Double = js.native
  /* 14 */ val UserDefined: UserDefined with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.FunctionCategory with scala.Double] = js.native
}

