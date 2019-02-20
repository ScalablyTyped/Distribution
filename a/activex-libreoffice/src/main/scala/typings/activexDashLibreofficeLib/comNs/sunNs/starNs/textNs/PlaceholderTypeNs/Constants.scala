package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.PlaceholderTypeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.text.PlaceholderType.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait GRAPHIC
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.PlaceholderTypeNs.Constants
  
  @js.native
  sealed trait OBJECT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.PlaceholderTypeNs.Constants
  
  @js.native
  sealed trait TABLE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.PlaceholderTypeNs.Constants
  
  @js.native
  sealed trait TEXT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.PlaceholderTypeNs.Constants
  
  @js.native
  sealed trait TEXTFRAME
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.PlaceholderTypeNs.Constants
  
  /* 3 */ val GRAPHIC: GRAPHIC with scala.Double = js.native
  /* 4 */ val OBJECT: OBJECT with scala.Double = js.native
  /* 1 */ val TABLE: TABLE with scala.Double = js.native
  /* 0 */ val TEXT: TEXT with scala.Double = js.native
  /* 2 */ val TEXTFRAME: TEXTFRAME with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.PlaceholderTypeNs.Constants with scala.Double
  ] = js.native
}

