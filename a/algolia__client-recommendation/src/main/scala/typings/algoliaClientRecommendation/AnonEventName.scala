package typings.algoliaClientRecommendation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEventName extends js.Object {
  val eventName: String
  val eventType: String
  val score: Double
}

object AnonEventName {
  @scala.inline
  def apply(eventName: String, eventType: String, score: Double): AnonEventName = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEventName]
  }
}

