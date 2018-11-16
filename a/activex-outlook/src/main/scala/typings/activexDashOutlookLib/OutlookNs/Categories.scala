package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Categories")
@js.native
class Categories protected () extends js.Object {
  val Application: Application = js.native
  val Class: OlObjectClass = js.native
  val Count: scala.Double = js.native
  var `Outlook.Categories_typekey`: Categories = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def Add(Name: java.lang.String): Category = js.native
  def Add(Name: java.lang.String, Color: js.Any): Category = js.native
  def Add(Name: java.lang.String, Color: js.Any, ShortcutKey: js.Any): Category = js.native
  def Item(Index: js.Any): Category = js.native
  def Remove(Index: js.Any): scala.Unit = js.native
}

