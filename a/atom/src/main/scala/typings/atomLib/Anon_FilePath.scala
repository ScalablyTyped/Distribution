package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FilePath extends js.Object {
  var filePath: js.UndefOr[java.lang.String]
  var replacements: scala.Double
}

object Anon_FilePath {
  @scala.inline
  def apply(replacements: scala.Double, filePath: java.lang.String = null): Anon_FilePath = {
    val __obj = js.Dynamic.literal(replacements = replacements)
    if (filePath != null) __obj.updateDynamic("filePath")(filePath)
    __obj.asInstanceOf[Anon_FilePath]
  }
}

