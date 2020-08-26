package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.CustomXMLPart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomerData extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  val Count: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.CustomerData_typekey")
  var PowerPointDotCustomerData_typekey: CustomerData = js.native
  def Add(): CustomXMLPart = js.native
  def Delete(Id: String): Unit = js.native
  def Item(Id: String): CustomXMLPart = js.native
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
  @scala.inline
  implicit class CustomerDataOps[Self <: CustomerData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdd(value: () => CustomXMLPart): Self = this.set("Add", js.Any.fromFunction0(value))
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelete(value: String => Unit): Self = this.set("Delete", js.Any.fromFunction1(value))
    @scala.inline
    def setItem(value: String => CustomXMLPart): Self = this.set("Item", js.Any.fromFunction1(value))
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPowerPointDotCustomerData_typekey(value: CustomerData): Self = this.set("PowerPoint.CustomerData_typekey", value.asInstanceOf[js.Any])
  }
  
}

