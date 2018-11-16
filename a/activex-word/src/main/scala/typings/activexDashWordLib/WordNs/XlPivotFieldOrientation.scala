package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlPivotFieldOrientation extends js.Object

@JSGlobal("Word.XlPivotFieldOrientation")
@js.native
object XlPivotFieldOrientation extends js.Object {
  @js.native
  sealed trait xlColumnField
    extends activexDashWordLib.WordNs.XlPivotFieldOrientation
  
  @js.native
  sealed trait xlDataField
    extends activexDashWordLib.WordNs.XlPivotFieldOrientation
  
  @js.native
  sealed trait xlHidden
    extends activexDashWordLib.WordNs.XlPivotFieldOrientation
  
  @js.native
  sealed trait xlPageField
    extends activexDashWordLib.WordNs.XlPivotFieldOrientation
  
  @js.native
  sealed trait xlRowField
    extends activexDashWordLib.WordNs.XlPivotFieldOrientation
  
  /* 2 */ val xlColumnField: xlColumnField with scala.Double = js.native
  /* 4 */ val xlDataField: xlDataField with scala.Double = js.native
  /* 0 */ val xlHidden: xlHidden with scala.Double = js.native
  /* 3 */ val xlPageField: xlPageField with scala.Double = js.native
  /* 1 */ val xlRowField: xlRowField with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.XlPivotFieldOrientation with scala.Double] = js.native
}

