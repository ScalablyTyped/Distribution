package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.CustomXMLPart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomerData extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  val Count: Double
  val Parent: js.Any
  @JSName("PowerPoint.CustomerData_typekey")
  var PowerPointDotCustomerData_typekey: CustomerData
  def Add(): CustomXMLPart
  def Delete(Id: String): Unit
  def Item(Id: String): CustomXMLPart
}

object CustomerData {
  @scala.inline
  def apply(
    Add: () => CustomXMLPart,
    Application: Application,
    Count: Double,
    Delete: String => Unit,
    Item: String => CustomXMLPart,
    Parent: js.Any,
    PowerPointDotCustomerData_typekey: CustomerData
  ): CustomerData = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction0(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Delete = js.Any.fromFunction1(Delete), Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.CustomerData_typekey")(PowerPointDotCustomerData_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerData]
  }
}

