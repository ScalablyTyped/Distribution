package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NotePrintMode extends js.Object

/** enumeration values are used to define the printing of notes in a document. */
@JSGlobal("com.sun.star.text.NotePrintMode")
@js.native
object NotePrintMode extends js.Object {
  /** Notes are collected at the end of the document. */
  @js.native
  sealed trait DOC_END
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.NotePrintMode
  
  /** Notes are not printed. */
  @js.native
  sealed trait NOT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.NotePrintMode
  
  /** Only notes are printed. */
  @js.native
  sealed trait ONLY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.NotePrintMode
  
  /** Notes are collected at the end of a page and printed on an inserted page. */
  @js.native
  sealed trait PAGE_END
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.NotePrintMode
  
  /* 2 */ val DOC_END: DOC_END with scala.Double = js.native
  /* 0 */ val NOT: NOT with scala.Double = js.native
  /* 1 */ val ONLY: ONLY with scala.Double = js.native
  /* 3 */ val PAGE_END: PAGE_END with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.NotePrintMode with scala.Double
  ] = js.native
}

