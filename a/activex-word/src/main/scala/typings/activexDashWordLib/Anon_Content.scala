package typings
package activexDashWordLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Content extends js.Object {
  var Content: java.lang.String
  val ContentControl: activexDashWordLib.WordNs.ContentControl
}

object Anon_Content {
  @scala.inline
  def apply(Content: java.lang.String, ContentControl: activexDashWordLib.WordNs.ContentControl): Anon_Content = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Content")(Content)
    __obj.updateDynamic("ContentControl")(ContentControl)
    __obj.asInstanceOf[Anon_Content]
  }
}

