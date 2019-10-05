package typings.activexDashPowerpoint.PowerPoint

import typings.activexDashOffice.Office.CustomXMLPart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.CustomerData")
@js.native
class CustomerData protected () extends js.Object {
  val Application: typings.activexDashPowerpoint.PowerPoint.Application = js.native
  val Count: Double = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.CustomerData_typekey`: CustomerData = js.native
  def Add(): CustomXMLPart = js.native
  def Delete(Id: String): Unit = js.native
  def Item(Id: String): CustomXMLPart = js.native
}

