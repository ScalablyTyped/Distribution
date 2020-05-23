package typings.atom.mod

import typings.atom.anon.LeadingContextLines
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScandalResult extends js.Object {
  var filePath: String
  var matches: js.Array[LeadingContextLines]
}

object ScandalResult {
  @scala.inline
  def apply(filePath: String, matches: js.Array[LeadingContextLines]): ScandalResult = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScandalResult]
  }
}

