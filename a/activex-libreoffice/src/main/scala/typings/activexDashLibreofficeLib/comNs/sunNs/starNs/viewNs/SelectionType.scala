package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectionType extends js.Object

/** Specifies a selection type for a view that supports a selection model. */
@JSGlobal("com.sun.star.view.SelectionType")
@js.native
object SelectionType extends js.Object {
  /** The selection can contain zero or more objects. */
  @js.native
  sealed trait MULTI
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.SelectionType
  
  /**
    * No selection is possible.
    *
    * The selection is always empty.
    */
  @js.native
  sealed trait NONE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.SelectionType
  
  /**
    * The selection can contain zero or more objects.
    *
    * all selected objects must be part of a continues range
    */
  @js.native
  sealed trait RANGE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.SelectionType
  
  /** The selection can only contain one or zero objects. */
  @js.native
  sealed trait SINGLE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.SelectionType
  
  /* 2 */ val MULTI: MULTI with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  /* 3 */ val RANGE: RANGE with scala.Double = js.native
  /* 1 */ val SINGLE: SINGLE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.SelectionType with scala.Double
  ] = js.native
}

