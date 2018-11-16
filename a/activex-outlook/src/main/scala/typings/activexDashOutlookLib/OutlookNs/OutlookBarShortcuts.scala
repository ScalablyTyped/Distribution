package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.OutlookBarShortcuts")
@js.native
class OutlookBarShortcuts protected () extends js.Object {
  val Application: Application = js.native
  val Class: OlObjectClass = js.native
  val Count: scala.Double = js.native
  var `Outlook.OutlookBarShortcuts_typekey`: OutlookBarShortcuts = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def Add(Target: js.Any, Name: java.lang.String): OutlookBarShortcut = js.native
  def Add(Target: js.Any, Name: java.lang.String, Index: js.Any): OutlookBarShortcut = js.native
  def Item(Index: js.Any): OutlookBarShortcut = js.native
  def Remove(Index: js.Any): scala.Unit = js.native
}

