package typings.activexDashInfopath

import typings.activexDashInfopath.InfoPath.Application
import typings.activexDashInfopath.InfoPath.ExternalApplication
import typings.activexDashInfopath.InfoPath.InfoPathEditorObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObjectNameMap extends js.Object {
  var `InfoPath.Application`: Application
  var `InfoPath.Editor`: InfoPathEditorObject
  var `InfoPath.ExternalApplication`: ExternalApplication
}

object ActiveXObjectNameMap {
  @scala.inline
  def apply(
    `InfoPath.Application`: Application,
    `InfoPath.Editor`: InfoPathEditorObject,
    `InfoPath.ExternalApplication`: ExternalApplication
  ): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("InfoPath.Application")(`InfoPath.Application`)
    __obj.updateDynamic("InfoPath.Editor")(`InfoPath.Editor`)
    __obj.updateDynamic("InfoPath.ExternalApplication")(`InfoPath.ExternalApplication`)
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
}

