package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcProjectType extends js.Object

@JSGlobal("Access.AcProjectType")
@js.native
object AcProjectType extends js.Object {
  @js.native
  sealed trait acADP
    extends activexDashAccessLib.AccessNs.AcProjectType
  
  @js.native
  sealed trait acMDB
    extends activexDashAccessLib.AccessNs.AcProjectType
  
  @js.native
  sealed trait acNull
    extends activexDashAccessLib.AccessNs.AcProjectType
  
  /* 1 */ val acADP: acADP with scala.Double = js.native
  /* 2 */ val acMDB: acMDB with scala.Double = js.native
  /* 0 */ val acNull: acNull with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcProjectType with scala.Double] = js.native
}

