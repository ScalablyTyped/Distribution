package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.browseNs.BrowseNodeTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.script.browse.BrowseNodeTypes.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait CONTAINER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.browseNs.BrowseNodeTypesNs.Constants
  
  @js.native
  sealed trait ROOT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.browseNs.BrowseNodeTypesNs.Constants
  
  @js.native
  sealed trait SCRIPT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.browseNs.BrowseNodeTypesNs.Constants
  
  /* 1 */ val CONTAINER: CONTAINER with scala.Double = js.native
  /* 2 */ val ROOT: ROOT with scala.Double = js.native
  /* 0 */ val SCRIPT: SCRIPT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.browseNs.BrowseNodeTypesNs.Constants with scala.Double
  ] = js.native
}

