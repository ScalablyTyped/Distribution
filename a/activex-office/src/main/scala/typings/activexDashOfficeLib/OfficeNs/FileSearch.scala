package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.FileSearch")
@js.native
class FileSearch protected () extends js.Object {
  val Application: js.Any = js.native
  val Creator: scala.Double = js.native
  var FileName: java.lang.String = js.native
  var FileType: MsoFileType = js.native
  @JSName("FileTypes")
  val FileTypes_Original: FileTypes = js.native
  @JSName("FoundFiles")
  val FoundFiles_Original: FoundFiles = js.native
  var LastModified: MsoLastModified = js.native
  var LookIn: java.lang.String = js.native
  var MatchAllWordForms: scala.Boolean = js.native
  var MatchTextExactly: scala.Boolean = js.native
  var `Office.FileSearch_typekey`: FileSearch = js.native
  @JSName("PropertyTests")
  val PropertyTests_Original: PropertyTests = js.native
  @JSName("SearchFolders")
  val SearchFolders_Original: SearchFolders = js.native
  @JSName("SearchScopes")
  val SearchScopes_Original: SearchScopes = js.native
  var SearchSubFolders: scala.Boolean = js.native
  var TextOrProperty: java.lang.String = js.native
  /**
    * @param SortBy [SortBy=1]
    * @param SortOrder [SortOrder=1]
    * @param AlwaysAccurate [AlwaysAccurate=true]
    */
  def Execute(): scala.Double = js.native
  def Execute(SortBy: MsoSortBy): scala.Double = js.native
  def Execute(SortBy: MsoSortBy, SortOrder: MsoSortOrder): scala.Double = js.native
  def Execute(SortBy: MsoSortBy, SortOrder: MsoSortOrder, AlwaysAccurate: scala.Boolean): scala.Double = js.native
  def FileTypes(Index: scala.Double): MsoFileType = js.native
  def FoundFiles(Index: scala.Double): java.lang.String = js.native
  def NewSearch(): scala.Unit = js.native
  def PropertyTests(Index: scala.Double): PropertyTest = js.native
  def RefreshScopes(): scala.Unit = js.native
  def SearchFolders(Index: scala.Double): ScopeFolder = js.native
  def SearchScopes(Index: scala.Double): SearchScope = js.native
}

