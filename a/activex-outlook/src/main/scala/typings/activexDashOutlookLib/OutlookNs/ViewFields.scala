package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.ViewFields")
@js.native
class ViewFields protected () extends js.Object {
  val Application: activexDashOutlookLib.OutlookNs.Application = js.native
  val Class: OlObjectClass = js.native
  val Count: scala.Double = js.native
  var `Outlook.ViewFields_typekey`: ViewFields = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def Add(PropertyName: java.lang.String): ViewField = js.native
  def Insert(PropertyName: java.lang.String, Index: js.Any): ViewField = js.native
  def Item(Index: js.Any): ViewField = js.native
  def Remove(Index: js.Any): scala.Unit = js.native
}

