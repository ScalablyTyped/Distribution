package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TriState extends js.Object

/**
  * This enumeration represents a tristate value.
  *
  * This enumeration defines three values, `TRUE` , `FALSE` and a don't know value.
  */
@JSGlobal("com.sun.star.util.TriState")
@js.native
object TriState extends js.Object {
  /** The value is indeterminate. */
  @js.native
  sealed trait INDETERMINATE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.TriState
  
  /** The value is equivalent to `FALSE` . */
  @js.native
  sealed trait NO
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.TriState
  
  /** The value is equivalent to `TRUE` . */
  @js.native
  sealed trait YES
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.TriState
  
  /* 2 */ val INDETERMINATE: INDETERMINATE with scala.Double = js.native
  /* 0 */ val NO: NO with scala.Double = js.native
  /* 1 */ val YES: YES with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.TriState with scala.Double] = js.native
}

