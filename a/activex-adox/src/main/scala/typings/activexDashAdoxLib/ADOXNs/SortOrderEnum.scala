package typings
package activexDashAdoxLib.ADOXNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SortOrderEnum extends js.Object

@JSGlobal("ADOX.SortOrderEnum")
@js.native
object SortOrderEnum extends js.Object {
  @js.native
  sealed trait adSortAscending
    extends activexDashAdoxLib.ADOXNs.SortOrderEnum
  
  @js.native
  sealed trait adSortDescending
    extends activexDashAdoxLib.ADOXNs.SortOrderEnum
  
  /* 1 */ val adSortAscending: adSortAscending with scala.Double = js.native
  /* 2 */ val adSortDescending: adSortDescending with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAdoxLib.ADOXNs.SortOrderEnum with scala.Double] = js.native
}

