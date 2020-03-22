package typings.aceBuilds.mod.Ace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Annotation extends js.Object {
  var column: js.UndefOr[Double] = js.undefined
  var row: js.UndefOr[Double] = js.undefined
  var text: String
  var `type`: String
}

object Annotation {
  @scala.inline
  def apply(text: String, `type`: String, column: Int | Double = null, row: Int | Double = null): Annotation = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    __obj.asInstanceOf[Annotation]
  }
}

