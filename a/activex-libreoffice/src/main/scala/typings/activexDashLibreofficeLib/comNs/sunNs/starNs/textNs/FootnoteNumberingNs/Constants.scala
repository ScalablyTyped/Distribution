package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.FootnoteNumberingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.text.FootnoteNumbering.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait PER_CHAPTER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.FootnoteNumberingNs.Constants
  
  @js.native
  sealed trait PER_DOCUMENT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.FootnoteNumberingNs.Constants
  
  @js.native
  sealed trait PER_PAGE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.FootnoteNumberingNs.Constants
  
  /* 1 */ val PER_CHAPTER: PER_CHAPTER with scala.Double = js.native
  /* 2 */ val PER_DOCUMENT: PER_DOCUMENT with scala.Double = js.native
  /* 0 */ val PER_PAGE: PER_PAGE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.FootnoteNumberingNs.Constants with scala.Double
  ] = js.native
}

