package typings.activexOffice.global.Office

import typings.activexOffice.Office.IFoundFiles
import typings.activexOffice.Office.MsoFileFindListBy
import typings.activexOffice.Office.MsoFileFindOptions
import typings.activexOffice.Office.MsoFileFindSortBy
import typings.activexOffice.Office.MsoFileFindView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** For Macintosh only */
@JSGlobal("Office.IFind")
@js.native
/* private */ open class IFind ()
  extends StObject
     with typings.activexOffice.Office.IFind {
  
  /* CompleteClass */
  var Author: String = js.native
  
  /* CompleteClass */
  var DateCreatedFrom: Any = js.native
  
  /* CompleteClass */
  var DateCreatedTo: Any = js.native
  
  /* CompleteClass */
  var DateSavedFrom: Any = js.native
  
  /* CompleteClass */
  var DateSavedTo: Any = js.native
  
  /* CompleteClass */
  override def Delete(bstrQueryName: String): Unit = js.native
  
  /* CompleteClass */
  override def Execute(): Unit = js.native
  
  /* CompleteClass */
  var FileType: Double = js.native
  
  /* CompleteClass */
  var Keywords: String = js.native
  
  /* CompleteClass */
  var ListBy: MsoFileFindListBy = js.native
  
  /* CompleteClass */
  override def Load(bstrQueryName: String): Unit = js.native
  
  /* CompleteClass */
  var MatchCase: Boolean = js.native
  
  /* CompleteClass */
  var Name: String = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Office.IFind_typekey")
  var OfficeDotIFind_typekey: typings.activexOffice.Office.IFind = js.native
  
  /* CompleteClass */
  var Options: MsoFileFindOptions = js.native
  
  /* CompleteClass */
  var PatternMatch: Boolean = js.native
  
  /* CompleteClass */
  override def Results(Index: Double): String = js.native
  /* CompleteClass */
  @JSName("Results")
  override val Results_Original: IFoundFiles = js.native
  
  /* CompleteClass */
  override def Save(bstrQueryName: String): Unit = js.native
  
  /* CompleteClass */
  var SavedBy: String = js.native
  
  /* CompleteClass */
  var SearchPath: String = js.native
  
  /* CompleteClass */
  var SelectedFile: Double = js.native
  
  /* CompleteClass */
  override def Show(): Double = js.native
  
  /* CompleteClass */
  var SortBy: MsoFileFindSortBy = js.native
  
  /* CompleteClass */
  var SubDir: Boolean = js.native
  
  /* CompleteClass */
  var Subject: String = js.native
  
  /* CompleteClass */
  var Text: String = js.native
  
  /* CompleteClass */
  var Title: String = js.native
  
  /* CompleteClass */
  var View: MsoFileFindView = js.native
}
