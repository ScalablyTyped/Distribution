package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.ShapeAnimationSubTypeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.presentation.ShapeAnimationSubType.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait AS_WHOLE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.ShapeAnimationSubTypeNs.Constants
  
  @js.native
  sealed trait ONLY_BACKGROUND
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.ShapeAnimationSubTypeNs.Constants
  
  @js.native
  sealed trait ONLY_TEXT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.ShapeAnimationSubTypeNs.Constants
  
  /* 0 */ val AS_WHOLE: AS_WHOLE with scala.Double = js.native
  /* 1 */ val ONLY_BACKGROUND: ONLY_BACKGROUND with scala.Double = js.native
  /* 2 */ val ONLY_TEXT: ONLY_TEXT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.ShapeAnimationSubTypeNs.Constants with scala.Double
  ] = js.native
}

