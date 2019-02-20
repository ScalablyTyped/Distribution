package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.NodeAttributeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.configuration.backend.NodeAttribute.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait FINALIZED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.NodeAttributeNs.Constants
  
  @js.native
  sealed trait FUSE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.NodeAttributeNs.Constants
  
  @js.native
  sealed trait MANDATORY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.NodeAttributeNs.Constants
  
  @js.native
  sealed trait MASK
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.NodeAttributeNs.Constants
  
  @js.native
  sealed trait READONLY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.NodeAttributeNs.Constants
  
  /* 256 */ val FINALIZED: FINALIZED with scala.Double = js.native
  /* 2048 */ val FUSE: FUSE with scala.Double = js.native
  /* 512 */ val MANDATORY: MANDATORY with scala.Double = js.native
  /* 32512 */ val MASK: MASK with scala.Double = js.native
  /* 1024 */ val READONLY: READONLY with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.NodeAttributeNs.Constants with scala.Double
  ] = js.native
}

