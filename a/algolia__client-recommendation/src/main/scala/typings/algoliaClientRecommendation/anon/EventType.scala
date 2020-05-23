package typings.algoliaClientRecommendation.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventType extends js.Object {
  val eventName: String
  val eventType: String
  val score: Double
}

object EventType {
  @scala.inline
  def apply(eventName: String, eventType: String, score: Double): EventType = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventType]
  }
}

