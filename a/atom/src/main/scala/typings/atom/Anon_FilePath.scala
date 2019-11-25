package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FilePath extends js.Object {
  var filePath: js.UndefOr[String] = js.undefined
  var replacements: Double
}

object Anon_FilePath {
  @scala.inline
  def apply(replacements: Double, filePath: String = null): Anon_FilePath = {
    val __obj = js.Dynamic.literal(replacements = replacements.asInstanceOf[js.Any])
    if (filePath != null) __obj.updateDynamic("filePath")(filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FilePath]
  }
}

