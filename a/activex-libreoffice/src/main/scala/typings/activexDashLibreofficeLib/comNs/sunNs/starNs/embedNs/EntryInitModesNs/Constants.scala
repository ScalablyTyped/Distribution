package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.EntryInitModesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.embed.EntryInitModes.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait DEFAULT_INIT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.EntryInitModesNs.Constants
  
  @js.native
  sealed trait MEDIA_DESCRIPTOR_INIT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.EntryInitModesNs.Constants
  
  @js.native
  sealed trait NO_INIT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.EntryInitModesNs.Constants
  
  @js.native
  sealed trait TRUNCATE_INIT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.EntryInitModesNs.Constants
  
  @js.native
  sealed trait URL_LINK_INIT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.EntryInitModesNs.Constants
  
  /* 0 */ val DEFAULT_INIT: DEFAULT_INIT with scala.Double = js.native
  /* 3 */ val MEDIA_DESCRIPTOR_INIT: MEDIA_DESCRIPTOR_INIT with scala.Double = js.native
  /* 2 */ val NO_INIT: NO_INIT with scala.Double = js.native
  /* 1 */ val TRUNCATE_INIT: TRUNCATE_INIT with scala.Double = js.native
  /* 4 */ val URL_LINK_INIT: URL_LINK_INIT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.EntryInitModesNs.Constants with scala.Double
  ] = js.native
}

