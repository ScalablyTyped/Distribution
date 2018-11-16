package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoFileFindSortBy extends js.Object

@JSGlobal("Office.MsoFileFindSortBy")
@js.native
object MsoFileFindSortBy extends js.Object {
  @js.native
  sealed trait msoFileFindSortbyAuthor
    extends activexDashOfficeLib.OfficeNs.MsoFileFindSortBy
  
  @js.native
  sealed trait msoFileFindSortbyDateCreated
    extends activexDashOfficeLib.OfficeNs.MsoFileFindSortBy
  
  @js.native
  sealed trait msoFileFindSortbyDateSaved
    extends activexDashOfficeLib.OfficeNs.MsoFileFindSortBy
  
  @js.native
  sealed trait msoFileFindSortbyFileName
    extends activexDashOfficeLib.OfficeNs.MsoFileFindSortBy
  
  @js.native
  sealed trait msoFileFindSortbyLastSavedBy
    extends activexDashOfficeLib.OfficeNs.MsoFileFindSortBy
  
  @js.native
  sealed trait msoFileFindSortbySize
    extends activexDashOfficeLib.OfficeNs.MsoFileFindSortBy
  
  @js.native
  sealed trait msoFileFindSortbyTitle
    extends activexDashOfficeLib.OfficeNs.MsoFileFindSortBy
  
  /* 1 */ val msoFileFindSortbyAuthor: msoFileFindSortbyAuthor with scala.Double = js.native
  /* 2 */ val msoFileFindSortbyDateCreated: msoFileFindSortbyDateCreated with scala.Double = js.native
  /* 4 */ val msoFileFindSortbyDateSaved: msoFileFindSortbyDateSaved with scala.Double = js.native
  /* 5 */ val msoFileFindSortbyFileName: msoFileFindSortbyFileName with scala.Double = js.native
  /* 3 */ val msoFileFindSortbyLastSavedBy: msoFileFindSortbyLastSavedBy with scala.Double = js.native
  /* 6 */ val msoFileFindSortbySize: msoFileFindSortbySize with scala.Double = js.native
  /* 7 */ val msoFileFindSortbyTitle: msoFileFindSortbyTitle with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoFileFindSortBy with scala.Double] = js.native
}

