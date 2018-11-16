package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.AddressList")
@js.native
class AddressList protected () extends js.Object {
  val AddressEntries: AddressEntries = js.native
  val AddressListType: OlAddressListType = js.native
  val Application: Application = js.native
  val Class: OlObjectClass = js.native
  val ID: java.lang.String = js.native
  val Index: scala.Double = js.native
  val IsInitialAddressList: scala.Boolean = js.native
  val IsReadOnly: scala.Boolean = js.native
  val Name: java.lang.String = js.native
  var `Outlook.AddressList_typekey`: AddressList = js.native
  val Parent: js.Any = js.native
  val PropertyAccessor: PropertyAccessor = js.native
  val ResolutionOrder: scala.Double = js.native
  val Session: NameSpace = js.native
  def GetContactsFolder(): Folder = js.native
}

