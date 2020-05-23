package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Exceptions extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  val Count: Double
  @JSName("Outlook.Exceptions_typekey")
  var OutlookDotExceptions_typekey: Exceptions
  val Parent: js.Any
  val Session: NameSpace
  def Item(Index: js.Any): Exception
}

object Exceptions {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    Item: js.Any => Exception,
    OutlookDotExceptions_typekey: Exceptions,
    Parent: js.Any,
    Session: NameSpace
  ): Exceptions = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Exceptions_typekey")(OutlookDotExceptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exceptions]
  }
}

