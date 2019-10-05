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
    val __obj = js.Dynamic.literal(meta = meta, value = value)
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (docHTML != null) __obj.updateDynamic("docHTML")(docHTML)
    if (exactMatch != null) __obj.updateDynamic("exactMatch")(exactMatch.asInstanceOf[js.Any])
    if (score != null) __obj.updateDynamic("score")(score.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Completion]
  }
}

