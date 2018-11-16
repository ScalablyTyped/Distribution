package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcResourceType extends js.Object

@JSGlobal("Access.AcResourceType")
@js.native
object AcResourceType extends js.Object {
  @js.native
  sealed trait acResourceImage
    extends activexDashAccessLib.AccessNs.AcResourceType
  
  @js.native
  sealed trait acResourceTheme
    extends activexDashAccessLib.AccessNs.AcResourceType
  
  /* 1 */ val acResourceImage: acResourceImage with scala.Double = js.native
  /* 0 */ val acResourceTheme: acResourceTheme with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcResourceType with scala.Double] = js.native
}

