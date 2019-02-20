package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.dndNs.DNDConstantsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.datatransfer.dnd.DNDConstants.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait ACTION_COPY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.dndNs.DNDConstantsNs.Constants
  
  @js.native
  sealed trait ACTION_COPY_OR_MOVE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.dndNs.DNDConstantsNs.Constants
  
  @js.native
  sealed trait ACTION_DEFAULT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.dndNs.DNDConstantsNs.Constants
  
  @js.native
  sealed trait ACTION_LINK
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.dndNs.DNDConstantsNs.Constants
  
  @js.native
  sealed trait ACTION_MOVE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.dndNs.DNDConstantsNs.Constants
  
  @js.native
  sealed trait ACTION_NONE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.dndNs.DNDConstantsNs.Constants
  
  @js.native
  sealed trait ACTION_REFERENCE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.dndNs.DNDConstantsNs.Constants
  
  /* 1 */ val ACTION_COPY: ACTION_COPY with scala.Double = js.native
  /* 3 */ val ACTION_COPY_OR_MOVE: ACTION_COPY_OR_MOVE with scala.Double = js.native
  /* -128 */ val ACTION_DEFAULT: ACTION_DEFAULT with scala.Double = js.native
  /* 4 */ val ACTION_LINK: ACTION_LINK with scala.Double = js.native
  /* 2 */ val ACTION_MOVE: ACTION_MOVE with scala.Double = js.native
  /* 0 */ val ACTION_NONE: ACTION_NONE with scala.Double = js.native
  /* 4 */ val ACTION_REFERENCE: ACTION_REFERENCE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.dndNs.DNDConstantsNs.Constants with scala.Double
  ] = js.native
}

