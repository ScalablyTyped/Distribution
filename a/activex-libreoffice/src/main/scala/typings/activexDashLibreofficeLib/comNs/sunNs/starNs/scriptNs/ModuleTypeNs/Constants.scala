package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.ModuleTypeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.script.ModuleType.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait CLASS
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.ModuleTypeNs.Constants
  
  @js.native
  sealed trait DOCUMENT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.ModuleTypeNs.Constants
  
  @js.native
  sealed trait FORM
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.ModuleTypeNs.Constants
  
  @js.native
  sealed trait NORMAL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.ModuleTypeNs.Constants
  
  @js.native
  sealed trait UNKNOWN
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.ModuleTypeNs.Constants
  
  /* 2 */ val CLASS: CLASS with scala.Double = js.native
  /* 4 */ val DOCUMENT: DOCUMENT with scala.Double = js.native
  /* 3 */ val FORM: FORM with scala.Double = js.native
  /* 1 */ val NORMAL: NORMAL with scala.Double = js.native
  /* 0 */ val UNKNOWN: UNKNOWN with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.ModuleTypeNs.Constants with scala.Double
  ] = js.native
}

