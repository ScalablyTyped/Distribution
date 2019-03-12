package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.OrderFields")
@js.native
class OrderFields protected () extends js.Object {
  val Application: activexDashOutlookLib.OutlookNs.Application = js.native
  val Class: OlObjectClass = js.native
  val Count: scala.Double = js.native
  var `Outlook.OrderFields_typekey`: OrderFields = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def Add(PropertyName: java.lang.String): OrderField = js.native
  def Add(PropertyName: java.lang.String, IsDescending: js.Any): OrderField = js.native
  def Insert(PropertyName: java.lang.String, Index: js.Any): OrderField = js.native
  def Insert(PropertyName: java.lang.String, Index: js.Any, IsDescending: js.Any): OrderField = js.native
  def Item(Index: js.Any): OrderField = js.native
  def Remove(Index: js.Any): scala.Unit = js.native
  def RemoveAll(): scala.Unit = js.native
}

