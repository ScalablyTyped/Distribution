package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tags extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  val Count: Double
  val Parent: js.Any
  @JSName("PowerPoint.Tags_typekey")
  var PowerPointDotTags_typekey: Tags
  def Add(Name: String, Value: String): Unit
  def AddBinary(Name: String, FilePath: String): Unit
  def BinaryValue(Name: String): Double
  def Delete(Name: String): Unit
  def Item(Name: String): String
  def Name(Index: Double): String
  def Value(Index: Double): String
}

object Tags {
  @scala.inline
  def apply(
    Add: (String, String) => Unit,
    AddBinary: (String, String) => Unit,
    Application: Application,
    BinaryValue: String => Double,
    Count: Double,
    Delete: String => Unit,
    Item: String => String,
    Name: Double => String,
    Parent: js.Any,
    PowerPointDotTags_typekey: Tags,
    Value: Double => String
  ): Tags = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), AddBinary = js.Any.fromFunction2(AddBinary), Application = Application.asInstanceOf[js.Any], BinaryValue = js.Any.fromFunction1(BinaryValue), Count = Count.asInstanceOf[js.Any], Delete = js.Any.fromFunction1(Delete), Item = js.Any.fromFunction1(Item), Name = js.Any.fromFunction1(Name), Parent = Parent.asInstanceOf[js.Any], Value = js.Any.fromFunction1(Value))
    __obj.updateDynamic("PowerPoint.Tags_typekey")(PowerPointDotTags_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tags]
  }
}

