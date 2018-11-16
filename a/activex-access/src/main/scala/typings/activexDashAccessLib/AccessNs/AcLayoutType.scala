package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcLayoutType extends js.Object

@JSGlobal("Access.AcLayoutType")
@js.native
object AcLayoutType extends js.Object {
  @js.native
  sealed trait acLayoutNone
    extends activexDashAccessLib.AccessNs.AcLayoutType
  
  @js.native
  sealed trait acLayoutStacked
    extends activexDashAccessLib.AccessNs.AcLayoutType
  
  @js.native
  sealed trait acLayoutTabular
    extends activexDashAccessLib.AccessNs.AcLayoutType
  
  /* 0 */ val acLayoutNone: acLayoutNone with scala.Double = js.native
  /* 2 */ val acLayoutStacked: acLayoutStacked with scala.Double = js.native
  /* 1 */ val acLayoutTabular: acLayoutTabular with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcLayoutType with scala.Double] = js.native
}

