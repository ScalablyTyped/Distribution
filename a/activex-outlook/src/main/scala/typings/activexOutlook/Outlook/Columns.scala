package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Columns extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  val Count: Double
  @JSName("Outlook.Columns_typekey")
  var OutlookDotColumns_typekey: Columns
  val Parent: js.Any
  val Session: NameSpace
  def Add(Name: String): Column
  def Item(Index: js.Any): Column
  def Remove(Index: js.Any): Unit
  def RemoveAll(): Unit
}

object Columns {
  @scala.inline
  def apply(
    Add: String => Column,
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    Item: js.Any => Column,
    OutlookDotColumns_typekey: Columns,
    Parent: js.Any,
    Remove: js.Any => Unit,
    RemoveAll: () => Unit,
    Session: NameSpace
  ): Columns = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Remove = js.Any.fromFunction1(Remove), RemoveAll = js.Any.fromFunction0(RemoveAll), Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Columns_typekey")(OutlookDotColumns_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Columns]
  }
}

