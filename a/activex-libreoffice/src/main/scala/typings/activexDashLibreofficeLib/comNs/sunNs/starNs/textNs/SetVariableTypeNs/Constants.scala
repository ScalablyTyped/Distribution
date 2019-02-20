package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.SetVariableTypeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.text.SetVariableType.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait FORMULA
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.SetVariableTypeNs.Constants
  
  @js.native
  sealed trait SEQUENCE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.SetVariableTypeNs.Constants
  
  @js.native
  sealed trait STRING
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.SetVariableTypeNs.Constants
  
  @js.native
  sealed trait VAR
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.SetVariableTypeNs.Constants
  
  /* 2 */ val FORMULA: FORMULA with scala.Double = js.native
  /* 1 */ val SEQUENCE: SEQUENCE with scala.Double = js.native
  /* 3 */ val STRING: STRING with scala.Double = js.native
  /* 0 */ val VAR: VAR with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.SetVariableTypeNs.Constants with scala.Double
  ] = js.native
}

