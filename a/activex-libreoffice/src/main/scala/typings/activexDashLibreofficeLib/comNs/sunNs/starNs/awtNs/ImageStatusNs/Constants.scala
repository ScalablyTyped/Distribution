package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.ImageStatusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.awt.ImageStatus.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait IMAGESTATUS_ABORTED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.ImageStatusNs.Constants
  
  @js.native
  sealed trait IMAGESTATUS_ERROR
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.ImageStatusNs.Constants
  
  @js.native
  sealed trait IMAGESTATUS_SINGLEFRAMEDONE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.ImageStatusNs.Constants
  
  @js.native
  sealed trait IMAGESTATUS_STATICIMAGEDONE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.ImageStatusNs.Constants
  
  /* 4 */ val IMAGESTATUS_ABORTED: IMAGESTATUS_ABORTED with scala.Double = js.native
  /* 1 */ val IMAGESTATUS_ERROR: IMAGESTATUS_ERROR with scala.Double = js.native
  /* 2 */ val IMAGESTATUS_SINGLEFRAMEDONE: IMAGESTATUS_SINGLEFRAMEDONE with scala.Double = js.native
  /* 3 */ val IMAGESTATUS_STATICIMAGEDONE: IMAGESTATUS_STATICIMAGEDONE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.ImageStatusNs.Constants with scala.Double
  ] = js.native
}

