package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoRelativeNodePosition extends js.Object

@JSGlobal("Office.MsoRelativeNodePosition")
@js.native
object MsoRelativeNodePosition extends js.Object {
  @js.native
  sealed trait msoAfterLastSibling
    extends activexDashOfficeLib.OfficeNs.MsoRelativeNodePosition
  
  @js.native
  sealed trait msoAfterNode
    extends activexDashOfficeLib.OfficeNs.MsoRelativeNodePosition
  
  @js.native
  sealed trait msoBeforeFirstSibling
    extends activexDashOfficeLib.OfficeNs.MsoRelativeNodePosition
  
  @js.native
  sealed trait msoBeforeNode
    extends activexDashOfficeLib.OfficeNs.MsoRelativeNodePosition
  
  /* 4 */ val msoAfterLastSibling: msoAfterLastSibling with scala.Double = js.native
  /* 2 */ val msoAfterNode: msoAfterNode with scala.Double = js.native
  /* 3 */ val msoBeforeFirstSibling: msoBeforeFirstSibling with scala.Double = js.native
  /* 1 */ val msoBeforeNode: msoBeforeNode with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoRelativeNodePosition with scala.Double] = js.native
}

