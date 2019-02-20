package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertySetInfoChangeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.beans.PropertySetInfoChange.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait PROPERTY_INSERTED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertySetInfoChangeNs.Constants
  
  @js.native
  sealed trait PROPERTY_REMOVED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertySetInfoChangeNs.Constants
  
  /* 0 */ val PROPERTY_INSERTED: PROPERTY_INSERTED with scala.Double = js.native
  /* 1 */ val PROPERTY_REMOVED: PROPERTY_REMOVED with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertySetInfoChangeNs.Constants with scala.Double
  ] = js.native
}

