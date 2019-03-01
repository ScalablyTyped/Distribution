package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScandalResult extends js.Object {
  var filePath: java.lang.String
  var matches: js.Array[atomLib.Anon_LeadingContextLines]
}

object ScandalResult {
  @scala.inline
  def apply(filePath: java.lang.String, matches: js.Array[atomLib.Anon_LeadingContextLines]): ScandalResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("filePath")(filePath)
    __obj.updateDynamic("matches")(matches)
    __obj.asInstanceOf[ScandalResult]
  }
}

