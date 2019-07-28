package typings.activexDashOutlook.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Search")
@js.native
class Search protected () extends js.Object {
  val Application: typings.activexDashOutlook.OutlookNs.Application = js.native
  val Class: OlObjectClass = js.native
  val Filter: String = js.native
  val IsSynchronous: Boolean = js.native
  var `Outlook.Search_typekey`: Search = js.native
  val Parent: js.Any = js.native
  val Results: typings.activexDashOutlook.OutlookNs.Results = js.native
  val Scope: String = js.native
  val SearchSubFolders: Boolean = js.native
  val Session: NameSpace = js.native
  val Tag: String = js.native
  def GetTable(): Table = js.native
  def Save(Name: String): Folder = js.native
  def Stop(): Unit = js.native
}

