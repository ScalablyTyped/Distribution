package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.deploymentNs.PrerequisitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.deployment.Prerequisites.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait DEPENDENCIES
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.deploymentNs.PrerequisitesNs.Constants
  
  @js.native
  sealed trait LICENSE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.deploymentNs.PrerequisitesNs.Constants
  
  @js.native
  sealed trait PLATFORM
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.deploymentNs.PrerequisitesNs.Constants
  
  /* 2 */ val DEPENDENCIES: DEPENDENCIES with scala.Double = js.native
  /* 4 */ val LICENSE: LICENSE with scala.Double = js.native
  /* 1 */ val PLATFORM: PLATFORM with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.deploymentNs.PrerequisitesNs.Constants with scala.Double
  ] = js.native
}

