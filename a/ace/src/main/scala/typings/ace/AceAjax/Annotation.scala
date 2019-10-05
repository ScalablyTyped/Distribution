package typings.ace.AceAjax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Annotation extends js.Object {
  var column: Double
  var row: Double
  var text: String
  var `type`: String
}

object Annotation {
  @scala.inline
  def apply(column: Double, row: Double, text: String, `type`: String): Annotation = {
    val __obj = js.Dynamic.literal(column = column, row = row, text = text)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Annotation]
  }
}

