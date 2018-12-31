package typings
package activexDashShellLib.Shell32Ns

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
  val SearchID: java.lang.String = js.native
  var `Shell32.FileSearchBand_typekey`: FileSearchBand = js.native
  /** method SetFocus */
  def SetFocus(): scala.Unit = js.native
  /** method SetSearchParameters */
  def SetSearchParameters(pbstrSearchID: java.lang.String, bNavToResults: scala.Boolean): scala.Unit = js.native
  def SetSearchParameters(pbstrSearchID: java.lang.String, bNavToResults: scala.Boolean, pvarScope: js.Any): scala.Unit = js.native
  def SetSearchParameters(
    pbstrSearchID: java.lang.String,
    bNavToResults: scala.Boolean,
    pvarScope: js.Any,
    pvarQueryFile: js.Any
  ): scala.Unit = js.native
}

