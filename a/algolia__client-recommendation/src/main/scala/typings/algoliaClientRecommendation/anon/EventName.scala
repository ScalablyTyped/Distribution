package typings.algoliaClientRecommendation.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventName extends js.Object {
  var eventName: String
  var eventType: String
  var score: Double
}

object EventName {
  @scala.inline
  def apply(eventName: String, eventType: String, score: Double): EventName = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventName]
  }
}

