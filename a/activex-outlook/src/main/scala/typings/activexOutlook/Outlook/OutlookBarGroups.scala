package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutlookBarGroups extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val Count: Double = js.native
  @JSName("Outlook.OutlookBarGroups_typekey")
  var OutlookDotOutlookBarGroups_typekey: OutlookBarGroups = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def Add(Name: String): OutlookBarGroup = js.native
  def Add(Name: String, Index: js.Any): OutlookBarGroup = js.native
  def Item(Index: js.Any): OutlookBarGroup = js.native
  def Remove(Index: js.Any): Unit = js.native
}

