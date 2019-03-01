package typings
package activexDashFaxcomexlibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObjectNameMap extends js.Object {
  var `FaxComEx.FaxDocument`: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxDocument
  var `FaxComEx.FaxServer`: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer
}

object ActiveXObjectNameMap {
  @scala.inline
  def apply(
    `FaxComEx.FaxDocument`: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxDocument,
    `FaxComEx.FaxServer`: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer
  ): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal(`FaxComEx.FaxDocument` = `FaxComEx.FaxDocument`, `FaxComEx.FaxServer` = `FaxComEx.FaxServer`)
  
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
}

