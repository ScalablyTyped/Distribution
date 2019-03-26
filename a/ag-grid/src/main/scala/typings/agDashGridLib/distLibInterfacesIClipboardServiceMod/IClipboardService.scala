package typings
package agDashGridLib.distLibInterfacesIClipboardServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClipboardService extends js.Object {
  def copyRangeDown(): scala.Unit = js.native
  def copySelectedRangeToClipboard(): scala.Unit = js.native
  def copySelectedRangeToClipboard(includeHeader: scala.Boolean): scala.Unit = js.native
  def copySelectedRowsToClipboard(): scala.Unit = js.native
  def copySelectedRowsToClipboard(includeHeader: scala.Boolean): scala.Unit = js.native
  def copySelectedRowsToClipboard(
    includeHeader: scala.Boolean,
    columnKeys: js.Array[java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column]
  ): scala.Unit = js.native
  def copyToClipboard(): scala.Unit = js.native
  def copyToClipboard(includeHeader: scala.Boolean): scala.Unit = js.native
  def pasteFromClipboard(): scala.Unit = js.native
}

