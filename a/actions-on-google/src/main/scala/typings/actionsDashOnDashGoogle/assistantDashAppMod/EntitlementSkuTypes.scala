package typings.actionsDashOnDashGoogle.assistantDashAppMod

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
  sealed trait APP extends EntitlementSkuTypes
  
  /** In app purchase */
  @js.native
  sealed trait IN_APP extends EntitlementSkuTypes
  
  /** In app subscription */
  @js.native
  sealed trait SUBSCRIPTION extends EntitlementSkuTypes
  
  /* 2 */ val APP: typings.actionsDashOnDashGoogle.assistantDashAppMod.EntitlementSkuTypes.APP with Double = js.native
  /* 0 */ val IN_APP: typings.actionsDashOnDashGoogle.assistantDashAppMod.EntitlementSkuTypes.IN_APP with Double = js.native
  /* 1 */ val SUBSCRIPTION: typings.actionsDashOnDashGoogle.assistantDashAppMod.EntitlementSkuTypes.SUBSCRIPTION with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EntitlementSkuTypes with Double] = js.native
}

