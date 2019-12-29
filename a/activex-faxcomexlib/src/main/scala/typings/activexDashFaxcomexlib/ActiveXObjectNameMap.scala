package typings.activexDashFaxcomexlib

import typings.activexDashFaxcomexlib.FAXCOMEXLib.FaxDocument
import typings.activexDashFaxcomexlib.FAXCOMEXLib.FaxServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObjectNameMap extends js.Object {
  @JSName("FaxComEx.FaxDocument")
  var FaxComExDotFaxDocument: FaxDocument
  @JSName("FaxComEx.FaxServer")
  var FaxComExDotFaxServer: FaxServer
}

object ActiveXObjectNameMap {
  @scala.inline
  def apply(FaxComExDotFaxDocument: FaxDocument, FaxComExDotFaxServer: FaxServer): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("FaxComEx.FaxDocument")(FaxComExDotFaxDocument.asInstanceOf[js.Any])
    __obj.updateDynamic("FaxComEx.FaxServer")(FaxComExDotFaxServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
}

