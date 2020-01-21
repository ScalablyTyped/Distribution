package typings.aliOss.mod

import typings.aliOss.AnonFragCount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutChannelConf extends js.Object {
  var Description: js.UndefOr[String] = js.undefined
  var Status: js.UndefOr[String] = js.undefined
  var Target: js.UndefOr[AnonFragCount] = js.undefined
}

object PutChannelConf {
  @scala.inline
  def apply(Description: String = null, Status: String = null, Target: AnonFragCount = null): PutChannelConf = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Target != null) __obj.updateDynamic("Target")(Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutChannelConf]
  }
}

