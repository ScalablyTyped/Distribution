package typings
package adoneLib.adoneNs.netNs.httpNs.clientNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormValueOptions extends js.Object {
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  var filename: js.UndefOr[java.lang.String] = js.undefined
  var filepath: js.UndefOr[java.lang.String] = js.undefined
  var header: js.UndefOr[java.lang.String | org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var knownLength: js.UndefOr[scala.Double] = js.undefined
}

object FormValueOptions {
  @scala.inline
  def apply(
    contentType: java.lang.String = null,
    filename: java.lang.String = null,
    filepath: java.lang.String = null,
    header: java.lang.String | org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    knownLength: scala.Int | scala.Double = null
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

