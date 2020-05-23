package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Link extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  val Item: js.Any
  val Name: String
  @JSName("Outlook.Link_typekey")
  var OutlookDotLink_typekey: Link
  val Parent: js.Any
  val Session: NameSpace
  val Type: OlObjectClass
}

object Link {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    Item: js.Any,
    Name: String,
    OutlookDotLink_typekey: Link,
    Parent: js.Any,
    Session: NameSpace,
    Type: OlObjectClass
  ): Link = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Link_typekey")(OutlookDotLink_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Link]
  }
}

