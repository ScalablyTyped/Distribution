package typings.algoliaClientRecommendation.mod

import typings.algoliaTransporter.mod.Transporter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecommendationClient extends js.Object {
  /**
    * The application id.
    */
  val appId: String
  /**
    * The underlying transporter.
    */
  val transporter: Transporter
}

object RecommendationClient {
  @scala.inline
  def apply(appId: String, transporter: Transporter): RecommendationClient = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], transporter = transporter.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RecommendationClient]
  }
}

