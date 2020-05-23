package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Recipients extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  val Count: Double
  @JSName("Outlook.Recipients_typekey")
  var OutlookDotRecipients_typekey: Recipients
  val Parent: js.Any
  val Session: NameSpace
  def Add(Name: String): Recipient
  def Item(Index: js.Any): Recipient
  def Remove(Index: Double): Unit
  def ResolveAll(): Boolean
}

object Recipients {
  @scala.inline
  def apply(
    Add: String => Recipient,
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    Item: js.Any => Recipient,
    OutlookDotRecipients_typekey: Recipients,
    Parent: js.Any,
    Remove: Double => Unit,
    ResolveAll: () => Boolean,
    Session: NameSpace
  ): Recipients = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Remove = js.Any.fromFunction1(Remove), ResolveAll = js.Any.fromFunction0(ResolveAll), Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Recipients_typekey")(OutlookDotRecipients_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recipients]
  }
}

