package typings.algoliaClientAnalytics.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteABTestResponse extends js.Object {
  /**
    * The ab test unique identifier.
    */
  var abTestID: Double = js.native
  /**
    * The index name where the ab test was attached to.
    */
  var index: String = js.native
  /**
    * The operation task id. May be used to perform a wait task.
    */
  var taskID: Double = js.native
}

object DeleteABTestResponse {
  @scala.inline
  def apply(abTestID: Double, index: String, taskID: Double): DeleteABTestResponse = {
    val __obj = js.Dynamic.literal(abTestID = abTestID.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], taskID = taskID.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteABTestResponse]
  }
  @scala.inline
  implicit class DeleteABTestResponseOps[Self <: DeleteABTestResponse] (val x: Self) extends AnyVal {
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
    def setAbTestID(value: Double): Self = this.set("abTestID", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: String): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setTaskID(value: Double): Self = this.set("taskID", value.asInstanceOf[js.Any])
  }
  
}

