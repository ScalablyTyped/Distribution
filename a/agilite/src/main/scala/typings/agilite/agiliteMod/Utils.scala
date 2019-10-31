package typings.agilite.agiliteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("agilite", "Utils")
@js.native
class Utils protected () extends js.Object {
  def this(config: AgiliteConfig) = this()
  var responseType: typings.agilite.agiliteMod.responseType = js.native
  def JSToXML(data: String): js.Any = js.native
  def XMLToJS(data: String): js.Any = js.native
  def account(): js.Any = js.native
  def dashboardReports(startDate: js.Any, endDate: js.Any): js.Any = js.native
  def decodeXML(data: String): js.Any = js.native
  def encodeXML(data: String): js.Any = js.native
  def exportData(includeModules: js.Any): js.Any = js.native
  def formatDateTime(dateTimeValue: String, formatKey: String): js.Any = js.native
  def generatePDF(data: js.Any): js.Any = js.native
  def generateUUID(): js.Any = js.native
  def html2json(data: String): js.Any = js.native
  def importData(fileId: String): js.Any = js.native
}

