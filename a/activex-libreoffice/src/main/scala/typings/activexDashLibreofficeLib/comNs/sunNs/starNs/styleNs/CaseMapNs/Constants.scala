package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.CaseMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.style.CaseMap.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait LOWERCASE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.CaseMapNs.Constants
  
  @js.native
  sealed trait NONE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.CaseMapNs.Constants
  
  @js.native
  sealed trait SMALLCAPS
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.CaseMapNs.Constants
  
  @js.native
  sealed trait TITLE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.CaseMapNs.Constants
  
  @js.native
  sealed trait UPPERCASE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.CaseMapNs.Constants
  
  /* 2 */ val LOWERCASE: LOWERCASE with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  /* 4 */ val SMALLCAPS: SMALLCAPS with scala.Double = js.native
  /* 3 */ val TITLE: TITLE with scala.Double = js.native
  /* 1 */ val UPPERCASE: UPPERCASE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.CaseMapNs.Constants with scala.Double
  ] = js.native
}

