package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSearch extends StObject {
  
  val Application: js.Any = js.native
  
  val Creator: Double = js.native
  
  /**
    * @param SortBy [SortBy=1]
    * @param SortOrder [SortOrder=1]
    * @param AlwaysAccurate [AlwaysAccurate=true]
    */
  def Execute(): Double = js.native
  def Execute(SortBy: Unit, SortOrder: Unit, AlwaysAccurate: Boolean): Double = js.native
  def Execute(SortBy: Unit, SortOrder: MsoSortOrder): Double = js.native
  def Execute(SortBy: Unit, SortOrder: MsoSortOrder, AlwaysAccurate: Boolean): Double = js.native
  def Execute(SortBy: MsoSortBy): Double = js.native
  def Execute(SortBy: MsoSortBy, SortOrder: Unit, AlwaysAccurate: Boolean): Double = js.native
  def Execute(SortBy: MsoSortBy, SortOrder: MsoSortOrder): Double = js.native
  def Execute(SortBy: MsoSortBy, SortOrder: MsoSortOrder, AlwaysAccurate: Boolean): Double = js.native
  
  var FileName: String = js.native
  
  var FileType: MsoFileType = js.native
  
  def FileTypes(Index: Double): MsoFileType = js.native
  @JSName("FileTypes")
  val FileTypes_Original: FileTypes = js.native
  
  def FoundFiles(Index: Double): String = js.native
  @JSName("FoundFiles")
  val FoundFiles_Original: FoundFiles = js.native
  
  var LastModified: MsoLastModified = js.native
  
  var LookIn: String = js.native
  
  var MatchAllWordForms: Boolean = js.native
  
  var MatchTextExactly: Boolean = js.native
  
  def NewSearch(): Unit = js.native
  
  /* private */ @JSName("Office.FileSearch_typekey")
  var OfficeDotFileSearch_typekey: FileSearch = js.native
  
  def PropertyTests(Index: Double): PropertyTest = js.native
  @JSName("PropertyTests")
  val PropertyTests_Original: PropertyTests = js.native
  
  def RefreshScopes(): Unit = js.native
  
  def SearchFolders(Index: Double): ScopeFolder = js.native
  @JSName("SearchFolders")
  val SearchFolders_Original: SearchFolders = js.native
  
  def SearchScopes(Index: Double): SearchScope = js.native
  @JSName("SearchScopes")
  val SearchScopes_Original: SearchScopes = js.native
  
  var SearchSubFolders: Boolean = js.native
  
  var TextOrProperty: String = js.native
}
