package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddressLists extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  val Count: Double
  @JSName("Outlook.AddressLists_typekey")
  var OutlookDotAddressLists_typekey: AddressLists
  val Parent: js.Any
  val Session: NameSpace
  def Item(Index: js.Any): AddressList
}

object AddressLists {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    Item: js.Any => AddressList,
    OutlookDotAddressLists_typekey: AddressLists,
    Parent: js.Any,
    Session: NameSpace
  ): AddressLists = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.AddressLists_typekey")(OutlookDotAddressLists_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressLists]
  }
}

