package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** For Macintosh only */
@js.native
trait IFind extends js.Object {
  
  var Author: String = js.native
  
  var DateCreatedFrom: js.Any = js.native
  
  var DateCreatedTo: js.Any = js.native
  
  var DateSavedFrom: js.Any = js.native
  
  var DateSavedTo: js.Any = js.native
  
  def Delete(bstrQueryName: String): Unit = js.native
  
  def Execute(): Unit = js.native
  
  var FileType: Double = js.native
  
  var Keywords: String = js.native
  
  var ListBy: MsoFileFindListBy = js.native
  
  def Load(bstrQueryName: String): Unit = js.native
  
  var MatchCase: Boolean = js.native
  
  var Name: String = js.native
  
  @JSName("Office.IFind_typekey")
  var OfficeDotIFind_typekey: IFind = js.native
  
  var Options: MsoFileFindOptions = js.native
  
  var PatternMatch: Boolean = js.native
  
  def Results(Index: Double): String = js.native
  @JSName("Results")
  val Results_Original: IFoundFiles = js.native
  
  def Save(bstrQueryName: String): Unit = js.native
  
  var SavedBy: String = js.native
  
  var SearchPath: String = js.native
  
  var SelectedFile: Double = js.native
  
  def Show(): Double = js.native
  
  var SortBy: MsoFileFindSortBy = js.native
  
  var SubDir: Boolean = js.native
  
  var Subject: String = js.native
  
  var Text: String = js.native
  
  var Title: String = js.native
  
  var View: MsoFileFindView = js.native
}
