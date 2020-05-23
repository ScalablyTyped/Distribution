package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.CustomXMLPart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.CustomerData")
@js.native
class CustomerData protected ()
  extends typings.activexPowerpoint.PowerPoint.CustomerData {
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("PowerPoint.CustomerData_typekey")
  override var PowerPointDotCustomerData_typekey: typings.activexPowerpoint.PowerPoint.CustomerData = js.native
  /* CompleteClass */
  override def Add(): CustomXMLPart = js.native
  /* CompleteClass */
  override def Delete(Id: String): Unit = js.native
  /* CompleteClass */
  override def Item(Id: String): CustomXMLPart = js.native
}

