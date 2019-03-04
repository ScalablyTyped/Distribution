package typings
package activexDashWordLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObjectNameMap extends js.Object {
  var `Word.Application`: activexDashWordLib.WordNs.Application
  var `Word.Document`: activexDashWordLib.WordNs.Document
}

object ActiveXObjectNameMap {
  @scala.inline
  def apply(
    `Word.Application`: activexDashWordLib.WordNs.Application,
    `Word.Document`: activexDashWordLib.WordNs.Document
  ): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Word.Application")(`Word.Application`)
    __obj.updateDynamic("Word.Document")(`Word.Document`)
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
}

