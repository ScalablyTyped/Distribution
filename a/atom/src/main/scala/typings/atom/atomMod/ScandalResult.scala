package typings.atom.atomMod

import typings.atom.Anon_LeadingContextLines
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScandalResult extends js.Object {
  var filePath: String
  var matches: js.Array[Anon_LeadingContextLines]
}

object ScandalResult {
  @scala.inline
  def apply(filePath: String, matches: js.Array[Anon_LeadingContextLines]): ScandalResult = {
    val __obj = js.Dynamic.literal(filePath = filePath, matches = matches)
  
    __obj.asInstanceOf[ScandalResult]
  }
}

