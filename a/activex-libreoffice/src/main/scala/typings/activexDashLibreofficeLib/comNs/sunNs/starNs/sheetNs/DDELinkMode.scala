package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DDELinkMode extends js.Object

/**
  * used to specify how the DDE server application converts its data into numbers.
  * @see com.sun.star.sheet.XDDELinks
  * @since OOo 3.0
  */
@JSGlobal("com.sun.star.sheet.DDELinkMode")
@js.native
object DDELinkMode extends js.Object {
  /** numbers are converted into the default format. */
  @js.native
  sealed trait DEFAULT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DDELinkMode
  
  /** numbers are converted into the English default format. */
  @js.native
  sealed trait ENGLISH
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DDELinkMode
  
  /** numbers are not converted, but treated as text. */
  @js.native
  sealed trait TEXT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DDELinkMode
  
  /* 0 */ val DEFAULT: DEFAULT with scala.Double = js.native
  /* 1 */ val ENGLISH: ENGLISH with scala.Double = js.native
  /* 2 */ val TEXT: TEXT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DDELinkMode with scala.Double
  ] = js.native
}

