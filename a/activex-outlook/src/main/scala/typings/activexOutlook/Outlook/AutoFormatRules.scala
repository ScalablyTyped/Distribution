package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoFormatRules extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  val Count: Double
  @JSName("Outlook.AutoFormatRules_typekey")
  var OutlookDotAutoFormatRules_typekey: AutoFormatRules
  val Parent: js.Any
  val Session: NameSpace
  def Add(Name: String): AutoFormatRule
  def Insert(Name: String, Index: js.Any): AutoFormatRule
  def Item(Index: js.Any): AutoFormatRule
  def Remove(Index: js.Any): Unit
  def RemoveAll(): Unit
  def Save(): Unit
}

object AutoFormatRules {
  @scala.inline
  def apply(
    Add: String => AutoFormatRule,
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    Insert: (String, js.Any) => AutoFormatRule,
    Item: js.Any => AutoFormatRule,
    OutlookDotAutoFormatRules_typekey: AutoFormatRules,
    Parent: js.Any,
    Remove: js.Any => Unit,
    RemoveAll: () => Unit,
    Save: () => Unit,
    Session: NameSpace
  ): AutoFormatRules = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Insert = js.Any.fromFunction2(Insert), Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Remove = js.Any.fromFunction1(Remove), RemoveAll = js.Any.fromFunction0(RemoveAll), Save = js.Any.fromFunction0(Save), Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.AutoFormatRules_typekey")(OutlookDotAutoFormatRules_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoFormatRules]
  }
}

