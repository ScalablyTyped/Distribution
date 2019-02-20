package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BreakType extends js.Object

/** These enumeration values are used to specify if and how a page or column break is applied. */
@JSGlobal("com.sun.star.style.BreakType")
@js.native
object BreakType extends js.Object {
  /**
    * A column break is applied after the object to which it belongs.
    *
    * <p>This implies that the object to which it belongs is the last
    *
    * in its column.</p>
    */
  @js.native
  sealed trait COLUMN_AFTER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.BreakType
  
  /**
    * A column break is applied before the object to which it belongs.
    *
    * <p>This implies that the object to which it belongs is the
    *
    * first in its column.</p>
    */
  @js.native
  sealed trait COLUMN_BEFORE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.BreakType
  
  /**
    * A column break is applied before and after the object to which it belongs.
    *
    * <p>This implies that this object is the only one in its column.</p>
    */
  @js.native
  sealed trait COLUMN_BOTH
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.BreakType
  
  /**
    * No column or page break is applied.
    *
    * This value specifies that a location is not yet assigned.
    */
  @js.native
  sealed trait NONE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.BreakType
  
  /**
    * A page break is applied after the object to which it belongs.
    *
    * <p>This implies that the object to which it belongs is the last
    *
    * on its page.</p>
    */
  @js.native
  sealed trait PAGE_AFTER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.BreakType
  
  /**
    * A page break is applied before the object to which it belongs.
    *
    * <p>This implies that the object to which it belongs is the
    *
    * first on its page.      </p>
    */
  @js.native
  sealed trait PAGE_BEFORE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.BreakType
  
  /**
    * A page break is applied before and after the object to which it belongs.
    *
    * <p>This implies that this object is the only one on its page.</p>
    */
  @js.native
  sealed trait PAGE_BOTH
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.BreakType
  
  /* 2 */ val COLUMN_AFTER: COLUMN_AFTER with scala.Double = js.native
  /* 1 */ val COLUMN_BEFORE: COLUMN_BEFORE with scala.Double = js.native
  /* 3 */ val COLUMN_BOTH: COLUMN_BOTH with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  /* 5 */ val PAGE_AFTER: PAGE_AFTER with scala.Double = js.native
  /* 4 */ val PAGE_BEFORE: PAGE_BEFORE with scala.Double = js.native
  /* 6 */ val PAGE_BOTH: PAGE_BOTH with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.BreakType with scala.Double] = js.native
}

