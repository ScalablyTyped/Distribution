package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.AddressEntries")
@js.native
class AddressEntries protected () extends js.Object {
  val Application: Application = js.native
  val Class: OlObjectClass = js.native
  val Count: scala.Double = js.native
  var `Outlook.AddressEntries_typekey`: AddressEntries = js.native
  val Parent: js.Any = js.native
  val RawTable: js.Any = js.native
  val Session: NameSpace = js.native
  def Add(Type: java.lang.String): AddressEntry = js.native
  def Add(Type: java.lang.String, Name: js.Any): AddressEntry = js.native
  def Add(Type: java.lang.String, Name: js.Any, Address: js.Any): AddressEntry = js.native
  def GetFirst(): AddressEntry = js.native
  def GetLast(): AddressEntry = js.native
  def GetNext(): AddressEntry = js.native
  def GetPrevious(): AddressEntry = js.native
  def Item(Index: js.Any): AddressEntry = js.native
  def Sort(): scala.Unit = js.native
  def Sort(Property: js.Any): scala.Unit = js.native
  def Sort(Property: js.Any, Order: js.Any): scala.Unit = js.native
}

