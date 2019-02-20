package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.StorageFormatsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.embed.StorageFormats.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait OFOPXML
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.StorageFormatsNs.Constants
  
  @js.native
  sealed trait PACKAGE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.StorageFormatsNs.Constants
  
  @js.native
  sealed trait ZIP
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.StorageFormatsNs.Constants
  
  /* 3 */ val OFOPXML: OFOPXML with scala.Double = js.native
  /* 1 */ val PACKAGE: PACKAGE with scala.Double = js.native
  /* 2 */ val ZIP: ZIP with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.StorageFormatsNs.Constants with scala.Double
  ] = js.native
}

