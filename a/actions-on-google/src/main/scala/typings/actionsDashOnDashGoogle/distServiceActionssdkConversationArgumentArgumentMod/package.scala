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
    - java.lang.String
    - `js.undefined`
    - scala.Nothing
    - typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2DateTime
    - typings.actionsDashOnDashGoogle.distCommonMod.ApiClientObjectMap[js.Any]
    - scala.Boolean
    - typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2Location
    - typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleRpcStatus
    - scala.Double
  */
  type Argument = js.UndefOr[_Argument | ApiClientObjectMap[js.Any] | String | Boolean | Double]
  type ArgumentsIndexable = StringDictionary[Argument]
  type ArgumentsRaw = /** @public */
  StringDictionary[GoogleActionsV2Argument]
  type ArgumentsStatus = /** @public */
  StringDictionary[js.UndefOr[GoogleRpcStatus]]
}
