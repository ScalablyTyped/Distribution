package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Inspectors extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  val Count: Double
  @JSName("Outlook.Inspectors_typekey")
  var OutlookDotInspectors_typekey: Inspectors
  val Parent: js.Any
  val Session: NameSpace
  def Add(Item: js.Any): Inspector
  def Item(Index: js.Any): Inspector
}

object Inspectors {
  @scala.inline
  def apply(
    Add: js.Any => Inspector,
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    Item: js.Any => Inspector,
    OutlookDotInspectors_typekey: Inspectors,
    Parent: js.Any,
    Session: NameSpace
  ): Inspectors = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Inspectors_typekey")(OutlookDotInspectors_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inspectors]
  }
}

