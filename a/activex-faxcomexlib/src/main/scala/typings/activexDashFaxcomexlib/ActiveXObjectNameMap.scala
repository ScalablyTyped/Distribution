package typings.activexDashFaxcomexlib

import typings.activexDashFaxcomexlib.FAXCOMEXLib.FaxDocument
import typings.activexDashFaxcomexlib.FAXCOMEXLib.FaxServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObjectNameMap extends js.Object {
  var `FaxComEx.FaxDocument`: FaxDocument
  var `FaxComEx.FaxServer`: FaxServer
}

object ActiveXObjectNameMap {
  @scala.inline
  def apply(`FaxComEx.FaxDocument`: FaxDocument, `FaxComEx.FaxServer`: FaxServer): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("FaxComEx.FaxDocument")(`FaxComEx.FaxDocument`)
    __obj.updateDynamic("FaxComEx.FaxServer")(`FaxComEx.FaxServer`)
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
}

