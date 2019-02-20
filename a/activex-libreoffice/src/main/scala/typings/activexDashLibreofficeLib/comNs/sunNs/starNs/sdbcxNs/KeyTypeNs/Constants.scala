package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.KeyTypeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.sdbcx.KeyType.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait FOREIGN
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.KeyTypeNs.Constants
  
  @js.native
  sealed trait PRIMARY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.KeyTypeNs.Constants
  
  @js.native
  sealed trait UNIQUE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.KeyTypeNs.Constants
  
  /* 3 */ val FOREIGN: FOREIGN with scala.Double = js.native
  /* 1 */ val PRIMARY: PRIMARY with scala.Double = js.native
  /* 2 */ val UNIQUE: UNIQUE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.KeyTypeNs.Constants with scala.Double
  ] = js.native
}

