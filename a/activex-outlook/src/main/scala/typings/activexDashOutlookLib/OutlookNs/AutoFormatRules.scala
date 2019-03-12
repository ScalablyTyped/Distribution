package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.AutoFormatRules")
@js.native
class AutoFormatRules protected () extends js.Object {
  val Application: activexDashOutlookLib.OutlookNs.Application = js.native
  val Class: OlObjectClass = js.native
  val Count: scala.Double = js.native
  var `Outlook.AutoFormatRules_typekey`: AutoFormatRules = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def Add(Name: java.lang.String): AutoFormatRule = js.native
  def Insert(Name: java.lang.String, Index: js.Any): AutoFormatRule = js.native
  def Item(Index: js.Any): AutoFormatRule = js.native
  def Remove(Index: js.Any): scala.Unit = js.native
  def RemoveAll(): scala.Unit = js.native
  def Save(): scala.Unit = js.native
}

