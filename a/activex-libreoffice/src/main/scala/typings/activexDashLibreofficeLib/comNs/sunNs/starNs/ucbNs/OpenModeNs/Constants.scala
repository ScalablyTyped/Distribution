package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.OpenModeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.ucb.OpenMode.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait ALL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.OpenModeNs.Constants
  
  @js.native
  sealed trait DOCUMENT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.OpenModeNs.Constants
  
  @js.native
  sealed trait DOCUMENTS
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.OpenModeNs.Constants
  
  @js.native
  sealed trait DOCUMENT_SHARE_DENY_NONE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.OpenModeNs.Constants
  
  @js.native
  sealed trait DOCUMENT_SHARE_DENY_WRITE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.OpenModeNs.Constants
  
  @js.native
  sealed trait FOLDERS
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.OpenModeNs.Constants
  
  /* 0 */ val ALL: ALL with scala.Double = js.native
  /* 2 */ val DOCUMENT: DOCUMENT with scala.Double = js.native
  /* 3 */ val DOCUMENTS: DOCUMENTS with scala.Double = js.native
  /* 4 */ val DOCUMENT_SHARE_DENY_NONE: DOCUMENT_SHARE_DENY_NONE with scala.Double = js.native
  /* 5 */ val DOCUMENT_SHARE_DENY_WRITE: DOCUMENT_SHARE_DENY_WRITE with scala.Double = js.native
  /* 1 */ val FOLDERS: FOLDERS with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.OpenModeNs.Constants with scala.Double
  ] = js.native
}

