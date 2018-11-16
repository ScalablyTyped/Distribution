package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Search")
@js.native
class Search protected () extends js.Object {
  val Application: Application = js.native
  val Class: OlObjectClass = js.native
  val Filter: java.lang.String = js.native
  val IsSynchronous: scala.Boolean = js.native
  var `Outlook.Search_typekey`: Search = js.native
  val Parent: js.Any = js.native
  val Results: Results = js.native
  val Scope: java.lang.String = js.native
  val SearchSubFolders: scala.Boolean = js.native
  val Session: NameSpace = js.native
  val Tag: java.lang.String = js.native
  def GetTable(): Table = js.native
  def Save(Name: java.lang.String): Folder = js.native
  def Stop(): scala.Unit = js.native
}

