package typings.activexDashWord

import typings.activexDashWord.Word.Application
import typings.activexDashWord.Word.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObjectNameMap extends js.Object {
  var `Word.Application`: Application
  var `Word.Document`: Document
}

object ActiveXObjectNameMap {
  @scala.inline
  def apply(`Word.Application`: Application, `Word.Document`: Document): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Word.Application")(`Word.Application`.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Document")(`Word.Document`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
}

