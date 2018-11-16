package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Bookmark")
@js.native
class Bookmark protected () extends js.Object {
  val Application: Application = js.native
  val Column: scala.Boolean = js.native
  val Creator: scala.Double = js.native
  val Empty: scala.Boolean = js.native
  var End: scala.Double = js.native
  val Name: java.lang.String = js.native
  val Parent: js.Any = js.native
  val Range: Range = js.native
  var Start: scala.Double = js.native
  val StoryType: WdStoryType = js.native
  var `Word.Bookmark_typekey`: Bookmark = js.native
  def Copy(Name: java.lang.String): Bookmark = js.native
  def Delete(): scala.Unit = js.native
  def Select(): scala.Unit = js.native
}

