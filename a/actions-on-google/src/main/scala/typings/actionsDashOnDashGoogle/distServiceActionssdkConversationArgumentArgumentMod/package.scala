package typings.actionsDashOnDashGoogle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distServiceActionssdkConversationArgumentArgumentMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.actionsDashOnDashGoogle.distCommonMod.ApiClientObjectMap
  import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2Argument
  import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleRpcStatus

  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - `js.undefined`
    - scala.Double
    - typings.actionsDashOnDashGoogle.distCommonMod.ApiClientObjectMap[js.Any]
    - java.lang.String
    - typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2Location
    - typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleRpcStatus
    - typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2DateTime
  */
  type Argument = js.UndefOr[_Argument | ApiClientObjectMap[js.Any] | Boolean | Double | String]
  type ArgumentsIndexable = StringDictionary[Argument]
  type ArgumentsRaw = /** @public */
  StringDictionary[GoogleActionsV2Argument]
  type ArgumentsStatus = /** @public */
  StringDictionary[js.UndefOr[GoogleRpcStatus]]
}
