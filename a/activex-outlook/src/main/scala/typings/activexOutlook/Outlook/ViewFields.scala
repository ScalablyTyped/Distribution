package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewFields extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  val Count: Double
  @JSName("Outlook.ViewFields_typekey")
  var OutlookDotViewFields_typekey: ViewFields
  val Parent: js.Any
  val Session: NameSpace
  def Add(PropertyName: String): ViewField
  def Insert(PropertyName: String, Index: js.Any): ViewField
  def Item(Index: js.Any): ViewField
  def Remove(Index: js.Any): Unit
}

object ViewFields {
  @scala.inline
  def apply(
    Add: String => ViewField,
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    Insert: (String, js.Any) => ViewField,
    Item: js.Any => ViewField,
    OutlookDotViewFields_typekey: ViewFields,
    Parent: js.Any,
    Remove: js.Any => Unit,
    Session: NameSpace
  ): ViewFields = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Insert = js.Any.fromFunction2(Insert), Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Remove = js.Any.fromFunction1(Remove), Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.ViewFields_typekey")(OutlookDotViewFields_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewFields]
  }
}

