package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConsequencePromote extends js.Object {
  /**
    * Unique identifier of the object to promote.
    */
  val objectID: String = js.native
  /**
    * Promoted rank for the object (zero-based).
    */
  val position: Double = js.native
}

object ConsequencePromote {
  @scala.inline
  def apply(objectID: String, position: Double): ConsequencePromote = {
    val __obj = js.Dynamic.literal(objectID = objectID.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsequencePromote]
  }
  @scala.inline
  implicit class ConsequencePromoteOps[Self <: ConsequencePromote] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setObjectID(value: String): Self = this.set("objectID", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
  }
  
}

