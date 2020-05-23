package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddIns extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  val Count: Double
  val Parent: js.Any
  @JSName("PowerPoint.AddIns_typekey")
  var PowerPointDotAddIns_typekey: AddIns
  def Add(FileName: String): AddIn
  def Item(Index: js.Any): AddIn
  def Remove(Index: js.Any): Unit
}

object AddIns {
  @scala.inline
  def apply(
    Add: String => AddIn,
    Application: Application,
    Count: Double,
    Item: js.Any => AddIn,
    Parent: js.Any,
    PowerPointDotAddIns_typekey: AddIns,
    Remove: js.Any => Unit
  ): AddIns = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Remove = js.Any.fromFunction1(Remove))
    __obj.updateDynamic("PowerPoint.AddIns_typekey")(PowerPointDotAddIns_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddIns]
  }
}

