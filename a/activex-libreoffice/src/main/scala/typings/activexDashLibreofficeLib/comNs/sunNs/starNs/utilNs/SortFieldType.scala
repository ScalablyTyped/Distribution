package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SortFieldType extends js.Object

/**
  * enumeration used to specify the type of contents in a sort field.
  * @deprecated Deprecated
  */
@JSGlobal("com.sun.star.util.SortFieldType")
@js.native
object SortFieldType extends js.Object {
  /** sort field contains text data. */
  @js.native
  sealed trait ALPHANUMERIC
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.SortFieldType
  
  /** type is determined automatically. */
  @js.native
  sealed trait AUTOMATIC
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.SortFieldType
  
  /** sort field contains numerical data. */
  @js.native
  sealed trait NUMERIC
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.SortFieldType
  
  /* 2 */ val ALPHANUMERIC: ALPHANUMERIC with scala.Double = js.native
  /* 0 */ val AUTOMATIC: AUTOMATIC with scala.Double = js.native
  /* 1 */ val NUMERIC: NUMERIC with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.SortFieldType with scala.Double
  ] = js.native
}

