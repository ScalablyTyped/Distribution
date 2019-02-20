package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PageNumberType extends js.Object

/** determines which page number is displayed in a page number text field. */
@JSGlobal("com.sun.star.text.PageNumberType")
@js.native
object PageNumberType extends js.Object {
  /** The number of the current page is displayed. */
  @js.native
  sealed trait CURRENT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.PageNumberType
  
  /** The number of the next page is displayed if there is any, otherwise the field is empty. */
  @js.native
  sealed trait NEXT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.PageNumberType
  
  /** The number of the previous page is displayed if there is any, otherwise the field is empty. */
  @js.native
  sealed trait PREV
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.PageNumberType
  
  /* 1 */ val CURRENT: CURRENT with scala.Double = js.native
  /* 2 */ val NEXT: NEXT with scala.Double = js.native
  /* 0 */ val PREV: PREV with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.PageNumberType with scala.Double
  ] = js.native
}

