package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.loggingNs.LogLevelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.logging.LogLevel.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait ALL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.loggingNs.LogLevelNs.Constants
  
  @js.native
  sealed trait CONFIG
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.loggingNs.LogLevelNs.Constants
  
  @js.native
  sealed trait FINE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.loggingNs.LogLevelNs.Constants
  
  @js.native
  sealed trait FINER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.loggingNs.LogLevelNs.Constants
  
  @js.native
  sealed trait FINEST
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.loggingNs.LogLevelNs.Constants
  
  @js.native
  sealed trait INFO
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.loggingNs.LogLevelNs.Constants
  
  @js.native
  sealed trait OFF
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.loggingNs.LogLevelNs.Constants
  
  @js.native
  sealed trait SEVERE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.loggingNs.LogLevelNs.Constants
  
  @js.native
  sealed trait WARNING
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.loggingNs.LogLevelNs.Constants
  
  /* -2147483648 */ val ALL: ALL with scala.Double = js.native
  /* 700 */ val CONFIG: CONFIG with scala.Double = js.native
  /* 500 */ val FINE: FINE with scala.Double = js.native
  /* 400 */ val FINER: FINER with scala.Double = js.native
  /* 300 */ val FINEST: FINEST with scala.Double = js.native
  /* 800 */ val INFO: INFO with scala.Double = js.native
  /* 2147483647 */ val OFF: OFF with scala.Double = js.native
  /* 1000 */ val SEVERE: SEVERE with scala.Double = js.native
  /* 900 */ val WARNING: WARNING with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.loggingNs.LogLevelNs.Constants with scala.Double
  ] = js.native
}

