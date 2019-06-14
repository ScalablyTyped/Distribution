package typings
package actionsDashOnDashGoogleLib.assistantDashAppMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EntitlementSkuTypes extends js.Object

@JSImport("actions-on-google/assistant-app", "EntitlementSkuTypes")
@js.native
object EntitlementSkuTypes extends js.Object {
  /** Paid app. */
  @js.native
  sealed trait APP
    extends actionsDashOnDashGoogleLib.assistantDashAppMod.EntitlementSkuTypes
  
  /** In app purchase */
  @js.native
  sealed trait IN_APP
    extends actionsDashOnDashGoogleLib.assistantDashAppMod.EntitlementSkuTypes
  
  /** In app subscription */
  @js.native
  sealed trait SUBSCRIPTION
    extends actionsDashOnDashGoogleLib.assistantDashAppMod.EntitlementSkuTypes
  
  /* 2 */ val APP: APP with scala.Double = js.native
  /* 0 */ val IN_APP: IN_APP with scala.Double = js.native
  /* 1 */ val SUBSCRIPTION: SUBSCRIPTION with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    actionsDashOnDashGoogleLib.assistantDashAppMod.EntitlementSkuTypes with scala.Double
  ] = js.native
}

