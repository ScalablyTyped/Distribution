package typings.actionsOnGoogle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object argumentArgumentMod {
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - js.UndefOr[scala.Nothing]
    - typings.actionsOnGoogle.v2Mod.GoogleRpcStatus
    - scala.Boolean
    - java.lang.String
    - typings.actionsOnGoogle.v2Mod.GoogleActionsV2Location
    - typings.actionsOnGoogle.commonMod.ApiClientObjectMap[js.Any]
    - typings.actionsOnGoogle.v2Mod.GoogleActionsV2DateTime
  */
  type Argument = js.UndefOr[
    typings.actionsOnGoogle.argumentArgumentMod._Argument | typings.actionsOnGoogle.commonMod.ApiClientObjectMap[js.Any] | scala.Double | scala.Boolean | java.lang.String
  ]
  type ArgumentsIndexable = org.scalablytyped.runtime.StringDictionary[typings.actionsOnGoogle.argumentArgumentMod.Argument]
  type ArgumentsRaw = /** @public */
  org.scalablytyped.runtime.StringDictionary[typings.actionsOnGoogle.v2Mod.GoogleActionsV2Argument]
  type ArgumentsStatus = /** @public */
  org.scalablytyped.runtime.StringDictionary[js.UndefOr[typings.actionsOnGoogle.v2Mod.GoogleRpcStatus]]
}
