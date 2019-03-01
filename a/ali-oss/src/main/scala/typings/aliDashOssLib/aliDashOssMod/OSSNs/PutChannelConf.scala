package typings
package aliDashOssLib.aliDashOssMod.OSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutChannelConf extends js.Object {
  var Description: js.UndefOr[java.lang.String] = js.undefined
  var Status: js.UndefOr[java.lang.String] = js.undefined
  var Target: js.UndefOr[aliDashOssLib.Anon_FragCount] = js.undefined
}

object PutChannelConf {
  @scala.inline
  def apply(
    Description: java.lang.String = null,
    Status: java.lang.String = null,
    Target: aliDashOssLib.Anon_FragCount = null
  ): PutChannelConf = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    if (Target != null) __obj.updateDynamic("Target")(Target)
    __obj.asInstanceOf[PutChannelConf]
  }
}

