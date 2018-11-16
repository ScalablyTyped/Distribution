package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoIodGroup extends js.Object

@JSGlobal("Office.MsoIodGroup")
@js.native
object MsoIodGroup extends js.Object {
  @js.native
  sealed trait msoIodGroupPIAs
    extends activexDashOfficeLib.OfficeNs.MsoIodGroup
  
  @js.native
  sealed trait msoIodGroupVSTOR35Mgd
    extends activexDashOfficeLib.OfficeNs.MsoIodGroup
  
  @js.native
  sealed trait msoIodGroupVSTOR40Mgd
    extends activexDashOfficeLib.OfficeNs.MsoIodGroup
  
  /* 0 */ val msoIodGroupPIAs: msoIodGroupPIAs with scala.Double = js.native
  /* 1 */ val msoIodGroupVSTOR35Mgd: msoIodGroupVSTOR35Mgd with scala.Double = js.native
  /* 2 */ val msoIodGroupVSTOR40Mgd: msoIodGroupVSTOR40Mgd with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoIodGroup with scala.Double] = js.native
}

