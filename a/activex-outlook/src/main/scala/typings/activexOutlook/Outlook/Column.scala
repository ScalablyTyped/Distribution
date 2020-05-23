package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Column extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  val Name: String
  @JSName("Outlook.Column_typekey")
  var OutlookDotColumn_typekey: Column
  val Parent: js.Any
  val Session: NameSpace
}

object Column {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    Name: String,
    OutlookDotColumn_typekey: Column,
    Parent: js.Any,
    Session: NameSpace
  ): Column = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Column_typekey")(OutlookDotColumn_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
}

