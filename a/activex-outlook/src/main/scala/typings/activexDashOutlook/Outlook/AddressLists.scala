package typings.activexDashOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.AddressLists")
@js.native
class AddressLists protected () extends js.Object {
  val Application: typings.activexDashOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val Count: Double = js.native
  @JSName("Outlook.AddressLists_typekey")
  var OutlookDotAddressLists_typekey: AddressLists = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def Item(Index: js.Any): AddressList = js.native
}

