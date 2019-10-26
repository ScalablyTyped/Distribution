package typings.actionsDashOnDashGoogle.distServiceSmarthomeSmarthomeMod

import typings.actionsDashOnDashGoogle.distAssistantMod.AppOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartHomeOptions extends AppOptions {
  /**
    * A JWT (JSON Web Token) that is able to access the home graph API.
    * This is used for report state. See https://jwt.io/. A JWT can be
    * created through the Google Cloud Console: https://console.cloud.google.com/apis/credentials
    * @public
    */
  var jwt: js.UndefOr[SmartHomeJwt] = js.undefined
  /**
    * An API key to use the home graph API. See
    * https://console.cloud.google.com/apis/api/homegraph.googleapis.com/overview
    * to learn more.
    * @public
    */
  var key: js.UndefOr[String] = js.undefined
}

object SmartHomeOptions {
  @scala.inline
  def apply(debug: js.UndefOr[Boolean] = js.undefined, jwt: SmartHomeJwt = null, key: String = null): SmartHomeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (jwt != null) __obj.updateDynamic("jwt")(jwt)
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[SmartHomeOptions]
  }
}

