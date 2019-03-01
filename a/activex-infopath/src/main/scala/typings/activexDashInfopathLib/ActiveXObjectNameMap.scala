package typings
package activexDashInfopathLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObjectNameMap extends js.Object {
  var `InfoPath.Application`: activexDashInfopathLib.InfoPathNs.Application
  var `InfoPath.Editor`: activexDashInfopathLib.InfoPathNs.InfoPathEditorObject
  var `InfoPath.ExternalApplication`: activexDashInfopathLib.InfoPathNs.ExternalApplication
}

object ActiveXObjectNameMap {
  @scala.inline
  def apply(
    `InfoPath.Application`: activexDashInfopathLib.InfoPathNs.Application,
    `InfoPath.Editor`: activexDashInfopathLib.InfoPathNs.InfoPathEditorObject,
    `InfoPath.ExternalApplication`: activexDashInfopathLib.InfoPathNs.ExternalApplication
  ): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal(`InfoPath.Application` = `InfoPath.Application`, `InfoPath.Editor` = `InfoPath.Editor`, `InfoPath.ExternalApplication` = `InfoPath.ExternalApplication`)
  
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
}

