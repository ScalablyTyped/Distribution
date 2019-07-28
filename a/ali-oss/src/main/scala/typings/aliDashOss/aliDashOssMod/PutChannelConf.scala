package typings.aliDashOss.aliDashOssMod

import typings.aliDashOss.Anon_FragCount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutChannelConf extends js.Object {
  var Description: js.UndefOr[String] = js.undefined
  var Status: js.UndefOr[String] = js.undefined
  var Target: js.UndefOr[Anon_FragCount] = js.undefined
}

object PutChannelConf {
  @scala.inline
  def apply(Description: String = null, Status: String = null, Target: Anon_FragCount = null): PutChannelConf = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    if (Target != null) __obj.updateDynamic("Target")(Target)
    __obj.asInstanceOf[PutChannelConf]
  }
}

