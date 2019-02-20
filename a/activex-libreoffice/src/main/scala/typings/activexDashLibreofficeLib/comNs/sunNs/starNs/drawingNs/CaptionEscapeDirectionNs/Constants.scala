package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.CaptionEscapeDirectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.drawing.CaptionEscapeDirection.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait auto
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.CaptionEscapeDirectionNs.Constants
  
  @js.native
  sealed trait horizontal
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.CaptionEscapeDirectionNs.Constants
  
  @js.native
  sealed trait vertical
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.CaptionEscapeDirectionNs.Constants
  
  /* 2 */ val auto: auto with scala.Double = js.native
  /* 0 */ val horizontal: horizontal with scala.Double = js.native
  /* 1 */ val vertical: vertical with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.CaptionEscapeDirectionNs.Constants with scala.Double
  ] = js.native
}

