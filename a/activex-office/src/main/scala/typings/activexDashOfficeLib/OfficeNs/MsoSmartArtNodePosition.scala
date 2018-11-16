package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoSmartArtNodePosition extends js.Object

@JSGlobal("Office.MsoSmartArtNodePosition")
@js.native
object MsoSmartArtNodePosition extends js.Object {
  @js.native
  sealed trait msoSmartArtNodeAbove
    extends activexDashOfficeLib.OfficeNs.MsoSmartArtNodePosition
  
  @js.native
  sealed trait msoSmartArtNodeAfter
    extends activexDashOfficeLib.OfficeNs.MsoSmartArtNodePosition
  
  @js.native
  sealed trait msoSmartArtNodeBefore
    extends activexDashOfficeLib.OfficeNs.MsoSmartArtNodePosition
  
  @js.native
  sealed trait msoSmartArtNodeBelow
    extends activexDashOfficeLib.OfficeNs.MsoSmartArtNodePosition
  
  @js.native
  sealed trait msoSmartArtNodeDefault
    extends activexDashOfficeLib.OfficeNs.MsoSmartArtNodePosition
  
  /* 4 */ val msoSmartArtNodeAbove: msoSmartArtNodeAbove with scala.Double = js.native
  /* 2 */ val msoSmartArtNodeAfter: msoSmartArtNodeAfter with scala.Double = js.native
  /* 3 */ val msoSmartArtNodeBefore: msoSmartArtNodeBefore with scala.Double = js.native
  /* 5 */ val msoSmartArtNodeBelow: msoSmartArtNodeBelow with scala.Double = js.native
  /* 1 */ val msoSmartArtNodeDefault: msoSmartArtNodeDefault with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoSmartArtNodePosition with scala.Double] = js.native
}

