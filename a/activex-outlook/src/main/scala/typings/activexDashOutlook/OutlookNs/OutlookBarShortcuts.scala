package typings.activexDashOutlook.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.OutlookBarShortcuts")
@js.native
class OutlookBarShortcuts protected () extends js.Object {
  val Application: typings.activexDashOutlook.OutlookNs.Application = js.native
  val Class: OlObjectClass = js.native
  val Count: Double = js.native
  var `Outlook.OutlookBarShortcuts_typekey`: OutlookBarShortcuts = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def Add(Target: js.Any, Name: String): OutlookBarShortcut = js.native
  def Add(Target: js.Any, Name: String, Index: js.Any): OutlookBarShortcut = js.native
  def Item(Index: js.Any): OutlookBarShortcut = js.native
  def Remove(Index: js.Any): Unit = js.native
}

