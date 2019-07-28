package typings.adone.adoneNs.netNs.httpNs.clientNs.INs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormValueOptions extends js.Object {
  var contentType: js.UndefOr[String] = js.undefined
  var filename: js.UndefOr[String] = js.undefined
  var filepath: js.UndefOr[String] = js.undefined
  var header: js.UndefOr[String | StringDictionary[String]] = js.undefined
  var knownLength: js.UndefOr[Double] = js.undefined
}

object FormValueOptions {
  @scala.inline
  def apply(
    contentType: String = null,
    filename: String = null,
    filepath: String = null,
    header: String | StringDictionary[String] = null,
    knownLength: Int | Double = null
  ): FormValueOptions = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (filepath != null) __obj.updateDynamic("filepath")(filepath)
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (knownLength != null) __obj.updateDynamic("knownLength")(knownLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormValueOptions]
  }
}

