package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** For Macintosh only */
// tslint:disable-next-line:interface-name
@JSGlobal("Office.IFind")
@js.native
class IFind protected () extends js.Object {
  var Author: java.lang.String = js.native
  var DateCreatedFrom: js.Any = js.native
  var DateCreatedTo: js.Any = js.native
  var DateSavedFrom: js.Any = js.native
  var DateSavedTo: js.Any = js.native
  var FileType: scala.Double = js.native
  var Keywords: java.lang.String = js.native
  var ListBy: MsoFileFindListBy = js.native
  var MatchCase: scala.Boolean = js.native
  var Name: java.lang.String = js.native
  var `Office.IFind_typekey`: IFind = js.native
  var Options: MsoFileFindOptions = js.native
  var PatternMatch: scala.Boolean = js.native
  @JSName("Results")
  val Results_Original: IFoundFiles = js.native
  var SavedBy: java.lang.String = js.native
  var SearchPath: java.lang.String = js.native
  var SelectedFile: scala.Double = js.native
  var SortBy: MsoFileFindSortBy = js.native
  var SubDir: scala.Boolean = js.native
  var Subject: java.lang.String = js.native
  var Text: java.lang.String = js.native
  var Title: java.lang.String = js.native
  var View: MsoFileFindView = js.native
  def Delete(bstrQueryName: java.lang.String): scala.Unit = js.native
  def Execute(): scala.Unit = js.native
  def Load(bstrQueryName: java.lang.String): scala.Unit = js.native
  def Results(Index: scala.Double): java.lang.String = js.native
  def Save(bstrQueryName: java.lang.String): scala.Unit = js.native
  def Show(): scala.Double = js.native
}

