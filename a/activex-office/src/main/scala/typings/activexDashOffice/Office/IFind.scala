package typings.activexDashOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** For Macintosh only */
// tslint:disable-next-line:interface-name
@JSGlobal("Office.IFind")
@js.native
class IFind protected () extends js.Object {
  var Author: String = js.native
  var DateCreatedFrom: js.Any = js.native
  var DateCreatedTo: js.Any = js.native
  var DateSavedFrom: js.Any = js.native
  var DateSavedTo: js.Any = js.native
  var FileType: Double = js.native
  var Keywords: String = js.native
  var ListBy: MsoFileFindListBy = js.native
  var MatchCase: Boolean = js.native
  var Name: String = js.native
  var `Office.IFind_typekey`: IFind = js.native
  var Options: MsoFileFindOptions = js.native
  var PatternMatch: Boolean = js.native
  @JSName("Results")
  val Results_Original: IFoundFiles = js.native
  var SavedBy: String = js.native
  var SearchPath: String = js.native
  var SelectedFile: Double = js.native
  var SortBy: MsoFileFindSortBy = js.native
  var SubDir: Boolean = js.native
  var Subject: String = js.native
  var Text: String = js.native
  var Title: String = js.native
  var View: MsoFileFindView = js.native
  def Delete(bstrQueryName: String): Unit = js.native
  def Execute(): Unit = js.native
  def Load(bstrQueryName: String): Unit = js.native
  def Results(Index: Double): String = js.native
  def Save(bstrQueryName: String): Unit = js.native
  def Show(): Double = js.native
}

