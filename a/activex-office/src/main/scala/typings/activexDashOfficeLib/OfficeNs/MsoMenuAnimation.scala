package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoMenuAnimation extends js.Object

@JSGlobal("Office.MsoMenuAnimation")
@js.native
object MsoMenuAnimation extends js.Object {
  @js.native
  sealed trait msoMenuAnimationNone
    extends activexDashOfficeLib.OfficeNs.MsoMenuAnimation
  
  @js.native
  sealed trait msoMenuAnimationRandom
    extends activexDashOfficeLib.OfficeNs.MsoMenuAnimation
  
  @js.native
  sealed trait msoMenuAnimationSlide
    extends activexDashOfficeLib.OfficeNs.MsoMenuAnimation
  
  @js.native
  sealed trait msoMenuAnimationUnfold
    extends activexDashOfficeLib.OfficeNs.MsoMenuAnimation
  
  /* 0 */ val msoMenuAnimationNone: msoMenuAnimationNone with scala.Double = js.native
  /* 1 */ val msoMenuAnimationRandom: msoMenuAnimationRandom with scala.Double = js.native
  /* 3 */ val msoMenuAnimationSlide: msoMenuAnimationSlide with scala.Double = js.native
  /* 2 */ val msoMenuAnimationUnfold: msoMenuAnimationUnfold with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoMenuAnimation with scala.Double] = js.native
}

