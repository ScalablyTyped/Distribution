package typings.adone.adoneNs.prettyNs.INs

import typings.adone.adoneNs.textNs.INs.WordWrapOptions
import typings.adone.adoneStrings.center
import typings.adone.adoneStrings.hard
import typings.adone.adoneStrings.left
import typings.adone.adoneStrings.right
import typings.adone.adoneStrings.soft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableColumn extends js.Object {
  var align: js.UndefOr[right | center | left] = js.undefined
  var format: js.UndefOr[String | (js.Function2[/* val */ js.Any, /* item */ js.Object, String])] = js.undefined
  var handle: js.UndefOr[js.Function1[/* item */ js.Object, String]] = js.undefined
  var header: js.UndefOr[String] = js.undefined
  var id: String
  var maxWidth: js.UndefOr[Double | String] = js.undefined
  var style: js.UndefOr[String | (js.Function2[/* val */ js.Any, /* str */ String, String])] = js.undefined
  var width: js.UndefOr[String | Double] = js.undefined
  var wordwrap: js.UndefOr[soft | hard | WordWrapOptions] = js.undefined
}

object TableColumn {
  @scala.inline
  def apply(
    id: String,
    align: right | center | left = null,
    format: String | (js.Function2[/* val */ js.Any, /* item */ js.Object, String]) = null,
    handle: /* item */ js.Object => String = null,
    header: String = null,
    maxWidth: Double | String = null,
    style: String | (js.Function2[/* val */ js.Any, /* str */ String, String]) = null,
    width: String | Double = null,
    wordwrap: soft | hard | WordWrapOptions = null
  ): TableColumn = {
    val __obj = js.Dynamic.literal(id = id)
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(js.Any.fromFunction1(handle))
    if (header != null) __obj.updateDynamic("header")(header)
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (wordwrap != null) __obj.updateDynamic("wordwrap")(wordwrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableColumn]
  }
}

