package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.CaptionTypeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.drawing.CaptionType.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait angled
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.CaptionTypeNs.Constants
  
  @js.native
  sealed trait connector
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.CaptionTypeNs.Constants
  
  @js.native
  sealed trait straight
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.CaptionTypeNs.Constants
  
  /* 1 */ val angled: angled with scala.Double = js.native
  /* 2 */ val connector: connector with scala.Double = js.native
  /* 0 */ val straight: straight with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.CaptionTypeNs.Constants with scala.Double
  ] = js.native
}

