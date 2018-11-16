package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoMergeCmd extends js.Object

@JSGlobal("Office.MsoMergeCmd")
@js.native
object MsoMergeCmd extends js.Object {
  @js.native
  sealed trait msoMergeCombine
    extends activexDashOfficeLib.OfficeNs.MsoMergeCmd
  
  @js.native
  sealed trait msoMergeFragment
    extends activexDashOfficeLib.OfficeNs.MsoMergeCmd
  
  @js.native
  sealed trait msoMergeIntersect
    extends activexDashOfficeLib.OfficeNs.MsoMergeCmd
  
  @js.native
  sealed trait msoMergeSubtract
    extends activexDashOfficeLib.OfficeNs.MsoMergeCmd
  
  @js.native
  sealed trait msoMergeUnion
    extends activexDashOfficeLib.OfficeNs.MsoMergeCmd
  
  /* 2 */ val msoMergeCombine: msoMergeCombine with scala.Double = js.native
  /* 5 */ val msoMergeFragment: msoMergeFragment with scala.Double = js.native
  /* 3 */ val msoMergeIntersect: msoMergeIntersect with scala.Double = js.native
  /* 4 */ val msoMergeSubtract: msoMergeSubtract with scala.Double = js.native
  /* 1 */ val msoMergeUnion: msoMergeUnion with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoMergeCmd with scala.Double] = js.native
}

