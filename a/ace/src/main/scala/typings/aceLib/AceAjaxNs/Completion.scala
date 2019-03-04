package typings
package aceLib.AceAjaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Completion extends js.Object {
  var caption: js.UndefOr[java.lang.String] = js.undefined
  var docHTML: js.UndefOr[java.lang.String] = js.undefined
  var exactMatch: js.UndefOr[scala.Double] = js.undefined
  var meta: java.lang.String
  var score: js.UndefOr[scala.Double] = js.undefined
  var snippet: js.UndefOr[js.Any] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var value: java.lang.String
}

object Completion {
  @scala.inline
  def apply(
    meta: java.lang.String,
    value: java.lang.String,
    caption: java.lang.String = null,
    docHTML: java.lang.String = null,
    exactMatch: scala.Int | scala.Double = null,
    score: scala.Int | scala.Double = null,
    snippet: js.Any = null,
    `type`: java.lang.String = null
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

