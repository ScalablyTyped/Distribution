package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FontSlant extends js.Object

/** used to specify the slant of a font. */
@JSGlobal("com.sun.star.awt.FontSlant")
@js.native
object FontSlant extends js.Object {
  /**
    * specifies a font with an unknown slant.
    *
    * specifies that the menu item type is unknown.
    */
  @js.native
  sealed trait DONTKNOW
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontSlant
  
  /** specifies an italic font (slant designed into the font). */
  @js.native
  sealed trait ITALIC
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontSlant
  
  /** specifies a font without slant. */
  @js.native
  sealed trait NONE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontSlant
  
  /** specifies an oblique font (slant not designed into the font). */
  @js.native
  sealed trait OBLIQUE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontSlant
  
  /** specifies a reverse italic font (slant designed into the font). */
  @js.native
  sealed trait REVERSE_ITALIC
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontSlant
  
  /** specifies a reverse oblique font (slant not designed into the font). */
  @js.native
  sealed trait REVERSE_OBLIQUE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontSlant
  
  /* 3 */ val DONTKNOW: DONTKNOW with scala.Double = js.native
  /* 2 */ val ITALIC: ITALIC with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  /* 1 */ val OBLIQUE: OBLIQUE with scala.Double = js.native
  /* 5 */ val REVERSE_ITALIC: REVERSE_ITALIC with scala.Double = js.native
  /* 4 */ val REVERSE_OBLIQUE: REVERSE_OBLIQUE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontSlant with scala.Double] = js.native
}

