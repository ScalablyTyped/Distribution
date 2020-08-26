package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertyTest extends js.Object {
  val Application: js.Any = js.native
  val Condition: MsoCondition = js.native
  val Connector: MsoConnector = js.native
  val Creator: Double = js.native
  val Name: String = js.native
  @JSName("Office.PropertyTest_typekey")
  var OfficeDotPropertyTest_typekey: PropertyTest = js.native
  val SecondValue: js.Any = js.native
  val Value: js.Any = js.native
}

object PropertyTest {
  @scala.inline
  def apply(
    Application: js.Any,
    Condition: MsoCondition,
    Connector: MsoConnector,
    Creator: Double,
    Name: String,
    OfficeDotPropertyTest_typekey: PropertyTest,
    SecondValue: js.Any,
    Value: js.Any
  ): PropertyTest = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Condition = Condition.asInstanceOf[js.Any], Connector = Connector.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], SecondValue = SecondValue.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.PropertyTest_typekey")(OfficeDotPropertyTest_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyTest]
  }
  @scala.inline
  implicit class PropertyTestOps[Self <: PropertyTest] (val x: Self) extends AnyVal {
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
    def setApplication(value: js.Any): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setCondition(value: MsoCondition): Self = this.set("Condition", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnector(value: MsoConnector): Self = this.set("Connector", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOfficeDotPropertyTest_typekey(value: PropertyTest): Self = this.set("Office.PropertyTest_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecondValue(value: js.Any): Self = this.set("SecondValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: js.Any): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
  
}

