package typings.activexDashOutlook.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Folders")
@js.native
class Folders protected () extends js.Object {
  val Application: typings.activexDashOutlook.OutlookNs.Application = js.native
  val Class: OlObjectClass = js.native
  val Count: Double = js.native
  var `Outlook.Folders_typekey`: Folders = js.native
  val Parent: js.Any = js.native
  val RawTable: js.Any = js.native
  val Session: NameSpace = js.native
  def Add(Name: String): Folder = js.native
  def Add(Name: String, Type: js.Any): Folder = js.native
  def GetFirst(): Folder = js.native
  def GetLast(): Folder = js.native
  def GetNext(): Folder = js.native
  def GetPrevious(): Folder = js.native
  def Item(Index: js.Any): Folder = js.native
  def Remove(Index: Double): Unit = js.native
}

