package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Links extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  val Count: Double
  @JSName("Outlook.Links_typekey")
  var OutlookDotLinks_typekey: Links
  val Parent: js.Any
  val Session: NameSpace
  def Add(Item: js.Any): Link
  def Item(Index: js.Any): Link
  def Remove(Index: js.Any): Unit
}

object Links {
  @scala.inline
  def apply(
    Add: js.Any => Link,
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    Item: js.Any => Link,
    OutlookDotLinks_typekey: Links,
    Parent: js.Any,
    Remove: js.Any => Unit,
    Session: NameSpace
  ): Links = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Remove = js.Any.fromFunction1(Remove), Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Links_typekey")(OutlookDotLinks_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Links]
  }
}

