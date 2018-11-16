package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PivotFieldSubtotal extends js.Object

@JSGlobal("Excel.PivotFieldSubtotal")
@js.native
object PivotFieldSubtotal extends js.Object {
  @js.native
  sealed trait Automatic
    extends activexDashExcelLib.ExcelNs.PivotFieldSubtotal
  
  @js.native
  sealed trait Average
    extends activexDashExcelLib.ExcelNs.PivotFieldSubtotal
  
  @js.native
  sealed trait Count
    extends activexDashExcelLib.ExcelNs.PivotFieldSubtotal
  
  @js.native
  sealed trait CountNums
    extends activexDashExcelLib.ExcelNs.PivotFieldSubtotal
  
  @js.native
  sealed trait Max
    extends activexDashExcelLib.ExcelNs.PivotFieldSubtotal
  
  @js.native
  sealed trait Min
    extends activexDashExcelLib.ExcelNs.PivotFieldSubtotal
  
  @js.native
  sealed trait Product
    extends activexDashExcelLib.ExcelNs.PivotFieldSubtotal
  
  @js.native
  sealed trait StdDev
    extends activexDashExcelLib.ExcelNs.PivotFieldSubtotal
  
  @js.native
  sealed trait StdDevp
    extends activexDashExcelLib.ExcelNs.PivotFieldSubtotal
  
  @js.native
  sealed trait Sum
    extends activexDashExcelLib.ExcelNs.PivotFieldSubtotal
  
  @js.native
  sealed trait Var
    extends activexDashExcelLib.ExcelNs.PivotFieldSubtotal
  
  @js.native
  sealed trait Varp
    extends activexDashExcelLib.ExcelNs.PivotFieldSubtotal
  
  /* 1 */ val Automatic: Automatic with scala.Double = js.native
  /* 4 */ val Average: Average with scala.Double = js.native
  /* 3 */ val Count: Count with scala.Double = js.native
  /* 8 */ val CountNums: CountNums with scala.Double = js.native
  /* 5 */ val Max: Max with scala.Double = js.native
  /* 6 */ val Min: Min with scala.Double = js.native
  /* 7 */ val Product: Product with scala.Double = js.native
  /* 9 */ val StdDev: StdDev with scala.Double = js.native
  /* 10 */ val StdDevp: StdDevp with scala.Double = js.native
  /* 2 */ val Sum: Sum with scala.Double = js.native
  /* 11 */ val Var: Var with scala.Double = js.native
  /* 12 */ val Varp: Varp with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.PivotFieldSubtotal with scala.Double] = js.native
}

