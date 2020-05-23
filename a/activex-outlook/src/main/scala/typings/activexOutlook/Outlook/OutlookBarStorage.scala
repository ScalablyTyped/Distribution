package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutlookBarStorage extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  val Groups: OutlookBarGroups
  @JSName("Outlook.OutlookBarStorage_typekey")
  var OutlookDotOutlookBarStorage_typekey: OutlookBarStorage
  val Parent: js.Any
  val Session: NameSpace
}

object OutlookBarStorage {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    Groups: OutlookBarGroups,
    OutlookDotOutlookBarStorage_typekey: OutlookBarStorage,
    Parent: js.Any,
    Session: NameSpace
  ): OutlookBarStorage = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Groups = Groups.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OutlookBarStorage_typekey")(OutlookDotOutlookBarStorage_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutlookBarStorage]
  }
}

