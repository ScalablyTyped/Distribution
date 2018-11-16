package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.OutlookBarGroups")
@js.native
class OutlookBarGroups protected () extends js.Object {
  val Application: Application = js.native
  val Class: OlObjectClass = js.native
  val Count: scala.Double = js.native
  var `Outlook.OutlookBarGroups_typekey`: OutlookBarGroups = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def Add(Name: java.lang.String): OutlookBarGroup = js.native
  def Add(Name: java.lang.String, Index: js.Any): OutlookBarGroup = js.native
  def Item(Index: js.Any): OutlookBarGroup = js.native
  def Remove(Index: js.Any): scala.Unit = js.native
}

