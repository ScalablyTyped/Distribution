package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoAutoSize extends js.Object

@JSGlobal("Office.MsoAutoSize")
@js.native
object MsoAutoSize extends js.Object {
  @js.native
  sealed trait msoAutoSizeMixed
    extends activexDashOfficeLib.OfficeNs.MsoAutoSize
  
  @js.native
  sealed trait msoAutoSizeNone
    extends activexDashOfficeLib.OfficeNs.MsoAutoSize
  
  @js.native
  sealed trait msoAutoSizeShapeToFitText
    extends activexDashOfficeLib.OfficeNs.MsoAutoSize
  
  @js.native
  sealed trait msoAutoSizeTextToFitShape
    extends activexDashOfficeLib.OfficeNs.MsoAutoSize
  
  /* -2 */ val msoAutoSizeMixed: msoAutoSizeMixed with scala.Double = js.native
  /* 0 */ val msoAutoSizeNone: msoAutoSizeNone with scala.Double = js.native
  /* 1 */ val msoAutoSizeShapeToFitText: msoAutoSizeShapeToFitText with scala.Double = js.native
  /* 2 */ val msoAutoSizeTextToFitShape: msoAutoSizeTextToFitShape with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoAutoSize with scala.Double] = js.native
}

