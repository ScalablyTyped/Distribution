package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyTest extends js.Object {
  val Application: js.Any
  val Condition: MsoCondition
  val Connector: MsoConnector
  val Creator: Double
  val Name: String
  @JSName("Office.PropertyTest_typekey")
  var OfficeDotPropertyTest_typekey: PropertyTest
  val SecondValue: js.Any
  val Value: js.Any
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
}

