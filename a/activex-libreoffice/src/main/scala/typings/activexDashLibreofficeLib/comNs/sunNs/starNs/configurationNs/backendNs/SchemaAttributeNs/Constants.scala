package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.SchemaAttributeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.configuration.backend.SchemaAttribute.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait EXTENSIBLE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.SchemaAttributeNs.Constants
  
  @js.native
  sealed trait LOCALIZED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.SchemaAttributeNs.Constants
  
  @js.native
  sealed trait MASK
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.SchemaAttributeNs.Constants
  
  @js.native
  sealed trait REQUIRED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.SchemaAttributeNs.Constants
  
  /* 4 */ val EXTENSIBLE: EXTENSIBLE with scala.Double = js.native
  /* 2 */ val LOCALIZED: LOCALIZED with scala.Double = js.native
  /* 255 */ val MASK: MASK with scala.Double = js.native
  /* 1 */ val REQUIRED: REQUIRED with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.SchemaAttributeNs.Constants with scala.Double
  ] = js.native
}

