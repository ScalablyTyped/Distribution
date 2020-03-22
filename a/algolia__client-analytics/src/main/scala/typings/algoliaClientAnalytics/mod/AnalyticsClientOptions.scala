package typings.algoliaClientAnalytics.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsClientOptions extends js.Object {
  /**
    * The api key.
    */
  val apiKey: String
  /**
    * The application id.
    */
  val appId: String
  /**
    * The prefered region.
    */
  val region: js.UndefOr[String] = js.undefined
}

object AnalyticsClientOptions {
  @scala.inline
  def apply(apiKey: String, appId: String, region: String = null): AnalyticsClientOptions = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsClientOptions]
  }
}

