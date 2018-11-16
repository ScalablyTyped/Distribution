package typings
package activexDashInfopathLib.InfoPathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XdDocumentVersionMode extends js.Object

@JSGlobal("InfoPath.XdDocumentVersionMode")
@js.native
object XdDocumentVersionMode extends js.Object {
  @js.native
  sealed trait xdCanOpenInReadOnlyMode
    extends activexDashInfopathLib.InfoPathNs.XdDocumentVersionMode
  
  @js.native
  sealed trait xdCanTransformSigned
    extends activexDashInfopathLib.InfoPathNs.XdDocumentVersionMode
  
  @js.native
  sealed trait xdDoNotInstallActiveXCabs
    extends activexDashInfopathLib.InfoPathNs.XdDocumentVersionMode
  
  @js.native
  sealed trait xdFailOnVersionMismatch
    extends activexDashInfopathLib.InfoPathNs.XdDocumentVersionMode
  
  @js.native
  sealed trait xdFailOnVersionOlder
    extends activexDashInfopathLib.InfoPathNs.XdDocumentVersionMode
  
  @js.native
  sealed trait xdIgnoreDataAdaptersQueryFailure
    extends activexDashInfopathLib.InfoPathNs.XdDocumentVersionMode
  
  @js.native
  sealed trait xdPromptTransformSigned
    extends activexDashInfopathLib.InfoPathNs.XdDocumentVersionMode
  
  @js.native
  sealed trait xdUseExistingVersion
    extends activexDashInfopathLib.InfoPathNs.XdDocumentVersionMode
  
  /* 8 */ val xdCanOpenInReadOnlyMode: xdCanOpenInReadOnlyMode with scala.Double = js.native
  /* 16 */ val xdCanTransformSigned: xdCanTransformSigned with scala.Double = js.native
  /* 128 */ val xdDoNotInstallActiveXCabs: xdDoNotInstallActiveXCabs with scala.Double = js.native
  /* 0 */ val xdFailOnVersionMismatch: xdFailOnVersionMismatch with scala.Double = js.native
  /* 1 */ val xdFailOnVersionOlder: xdFailOnVersionOlder with scala.Double = js.native
  /* 64 */ val xdIgnoreDataAdaptersQueryFailure: xdIgnoreDataAdaptersQueryFailure with scala.Double = js.native
  /* 32 */ val xdPromptTransformSigned: xdPromptTransformSigned with scala.Double = js.native
  /* 2 */ val xdUseExistingVersion: xdUseExistingVersion with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashInfopathLib.InfoPathNs.XdDocumentVersionMode with scala.Double] = js.native
}

