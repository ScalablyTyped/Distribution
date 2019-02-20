package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.FootnoteLineStyleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.style.FootnoteLineStyle.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait DASHED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.FootnoteLineStyleNs.Constants
  
  @js.native
  sealed trait DOTTED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.FootnoteLineStyleNs.Constants
  
  @js.native
  sealed trait NONE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.FootnoteLineStyleNs.Constants
  
  @js.native
  sealed trait SOLID
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.FootnoteLineStyleNs.Constants
  
  /* 3 */ val DASHED: DASHED with scala.Double = js.native
  /* 2 */ val DOTTED: DOTTED with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  /* 1 */ val SOLID: SOLID with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.FootnoteLineStyleNs.Constants with scala.Double
  ] = js.native
}

