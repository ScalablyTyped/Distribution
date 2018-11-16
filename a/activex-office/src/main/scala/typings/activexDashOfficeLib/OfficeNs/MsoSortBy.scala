package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoSortBy extends js.Object

@JSGlobal("Office.MsoSortBy")
@js.native
object MsoSortBy extends js.Object {
  @js.native
  sealed trait msoSortByFileName
    extends activexDashOfficeLib.OfficeNs.MsoSortBy
  
  @js.native
  sealed trait msoSortByFileType
    extends activexDashOfficeLib.OfficeNs.MsoSortBy
  
  @js.native
  sealed trait msoSortByLastModified
    extends activexDashOfficeLib.OfficeNs.MsoSortBy
  
  @js.native
  sealed trait msoSortByNone
    extends activexDashOfficeLib.OfficeNs.MsoSortBy
  
  @js.native
  sealed trait msoSortBySize
    extends activexDashOfficeLib.OfficeNs.MsoSortBy
  
  /* 1 */ val msoSortByFileName: msoSortByFileName with scala.Double = js.native
  /* 3 */ val msoSortByFileType: msoSortByFileType with scala.Double = js.native
  /* 4 */ val msoSortByLastModified: msoSortByLastModified with scala.Double = js.native
  /* 5 */ val msoSortByNone: msoSortByNone with scala.Double = js.native
  /* 2 */ val msoSortBySize: msoSortBySize with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoSortBy with scala.Double] = js.native
}

