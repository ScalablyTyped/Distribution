package typings.ace.AceAjax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Completion extends js.Object {
  var caption: js.UndefOr[String] = js.undefined
  var docHTML: js.UndefOr[String] = js.undefined
  var exactMatch: js.UndefOr[Double] = js.undefined
  var meta: String
  var score: js.UndefOr[Double] = js.undefined
  var snippet: js.UndefOr[js.Any] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var value: String
}

object Completion {
  @scala.inline
  def apply(
    meta: String,
    value: String,
    caption: String = null,
    docHTML: String = null,
    exactMatch: Int | Double = null,
    score: Int | Double = null,
    snippet: js.Any = null,
    `type`: String = null
  ): Completion = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (docHTML != null) __obj.updateDynamic("docHTML")(docHTML.asInstanceOf[js.Any])
    if (exactMatch != null) __obj.updateDynamic("exactMatch")(exactMatch.asInstanceOf[js.Any])
    if (score != null) __obj.updateDynamic("score")(score.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Completion]
  }
}

