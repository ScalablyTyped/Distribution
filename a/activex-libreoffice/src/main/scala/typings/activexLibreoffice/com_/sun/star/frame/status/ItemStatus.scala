package typings.activexLibreoffice.com_.sun.star.frame.status

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a state of a property.
  * @since OOo 2.0
  */
trait ItemStatus extends js.Object {
  /**
    * numerical value which describes the current state of an item.
    * @see ItemState
    */
  var State: Double
  /** optional data which can be used by an implementation to send additional information. The content is dependent on the specific implementation. */
  var aStateData: js.Any
}

object ItemStatus {
  @scala.inline
  def apply(State: Double, aStateData: js.Any): ItemStatus = {
    val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any], aStateData = aStateData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemStatus]
  }
}

