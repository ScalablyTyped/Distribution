package typings.activexDashShell.Shell32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FileSearchBand Class */
@JSGlobal("Shell32.FileSearchBand")
@js.native
class FileSearchBand protected () extends js.Object {
  /** Retrieve the file from which the search was restored. */
  val QueryFile: js.Any = js.native
  /** Get the search scope */
  val Scope: js.Any = js.native
  /** Retrieve the guid of the currently active search. */
  val SearchID: String = js.native
  @JSName("Shell32.FileSearchBand_typekey")
  var Shell32DotFileSearchBand_typekey: FileSearchBand = js.native
  /** method SetFocus */
  def SetFocus(): Unit = js.native
  /** method SetSearchParameters */
  def SetSearchParameters(pbstrSearchID: String, bNavToResults: Boolean): Unit = js.native
  def SetSearchParameters(pbstrSearchID: String, bNavToResults: Boolean, pvarScope: js.Any): Unit = js.native
  def SetSearchParameters(pbstrSearchID: String, bNavToResults: Boolean, pvarScope: js.Any, pvarQueryFile: js.Any): Unit = js.native
}

