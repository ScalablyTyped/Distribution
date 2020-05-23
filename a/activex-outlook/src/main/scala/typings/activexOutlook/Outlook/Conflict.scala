package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Conflict extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  val Item: js.Any
  val Name: String
  @JSName("Outlook.Conflict_typekey")
  var OutlookDotConflict_typekey: Conflict
  val Parent: js.Any
  val Session: NameSpace
  val Type: OlObjectClass
}

object Conflict {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    Item: js.Any,
    Name: String,
    OutlookDotConflict_typekey: Conflict,
    Parent: js.Any,
    Session: NameSpace,
    Type: OlObjectClass
  ): Conflict = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Conflict_typekey")(OutlookDotConflict_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conflict]
  }
}

