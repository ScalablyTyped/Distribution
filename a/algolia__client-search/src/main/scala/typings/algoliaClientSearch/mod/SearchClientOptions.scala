package typings.algoliaClientSearch.mod

import typings.algoliaClientCommon.mod.AuthModeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchClientOptions extends js.Object {
  /**
    * The api key.
    */
  val apiKey: String
  /**
    * The application id.
    */
  val appId: String
  /**
    * The auth mode type. In browser environments credentials may
    * be passed within the headers.
    */
  val authMode: js.UndefOr[AuthModeType] = js.undefined
}

object SearchClientOptions {
  @scala.inline
  def apply(apiKey: String, appId: String, authMode: AuthModeType = null): SearchClientOptions = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any])
    if (authMode != null) __obj.updateDynamic("authMode")(authMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchClientOptions]
  }
}

