package typings.autobahn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEvent extends js.Object {
  var publication: Double
  var publisher: js.UndefOr[Double] = js.undefined
  var topic: String
}

object IEvent {
  @scala.inline
  def apply(publication: Double, topic: String, publisher: js.UndefOr[Double] = js.undefined): IEvent = {
    val __obj = js.Dynamic.literal(publication = publication.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    if (!js.isUndefined(publisher)) __obj.updateDynamic("publisher")(publisher.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEvent]
  }
}

