package typings.agilite.agiliteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("agilite", "Files")
@js.native
class Files protected () extends js.Object {
  def this(config: AgiliteConfig) = this()
  var responseType: typings.agilite.agiliteMod.responseType = js.native
  def deleteFile(recordId: String): js.Any = js.native
  def getFile(recordId: String, responseType: js.Any): js.Any = js.native
  def getFileName(recordId: String): js.Any = js.native
  def uploadFile(fileName: String, contentType: String, data: js.Any): js.Any = js.native
}

