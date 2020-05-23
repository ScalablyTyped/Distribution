package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoRGBType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtraColors extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  val Count: Double
  val Parent: js.Any
  @JSName("PowerPoint.ExtraColors_typekey")
  var PowerPointDotExtraColors_typekey: ExtraColors
  def Add(Type: MsoRGBType): Unit
  def Clear(): Unit
  def Item(Index: Double): MsoRGBType
}

object ExtraColors {
  @scala.inline
  def apply(
    Add: MsoRGBType => Unit,
    Application: Application,
    Clear: () => Unit,
    Count: Double,
    Item: Double => MsoRGBType,
    Parent: js.Any,
    PowerPointDotExtraColors_typekey: ExtraColors
  ): ExtraColors = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Clear = js.Any.fromFunction0(Clear), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.ExtraColors_typekey")(PowerPointDotExtraColors_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtraColors]
  }
}

