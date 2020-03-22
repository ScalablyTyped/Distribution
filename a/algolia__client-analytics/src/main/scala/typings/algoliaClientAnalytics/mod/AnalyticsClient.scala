package typings.algoliaClientAnalytics.mod

import typings.algoliaTransporter.mod.Transporter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsClient extends js.Object {
  /**
    * The application id.
    */
  val appId: String
  /**
    * The underlying transporter.
    */
  val transporter: Transporter
}

object AnalyticsClient {
  @scala.inline
  def apply(appId: String, transporter: Transporter): AnalyticsClient = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], transporter = transporter.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnalyticsClient]
  }
}

