package typings
package autobahnLib.autobahnMod.autobahnNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEvent extends js.Object {
  var publication: scala.Double
  var publisher: js.UndefOr[scala.Double] = js.undefined
  var topic: java.lang.String
}

object IEvent {
  @scala.inline
  def apply(publication: scala.Double, topic: java.lang.String, publisher: scala.Int | scala.Double = null): IEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("publication")(publication)
    __obj.updateDynamic("topic")(topic)
    if (publisher != null) __obj.updateDynamic("publisher")(publisher.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEvent]
  }
}

