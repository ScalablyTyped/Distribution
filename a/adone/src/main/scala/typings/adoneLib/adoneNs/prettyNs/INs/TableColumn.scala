package typings
package adoneLib.adoneNs.prettyNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableColumn extends js.Object {
  var align: js.UndefOr[
    adoneLib.adoneLibStrings.right | adoneLib.adoneLibStrings.center | adoneLib.adoneLibStrings.left
  ] = js.undefined
  var format: js.UndefOr[
    java.lang.String | (js.Function2[/* val */ js.Any, /* item */ js.Object, java.lang.String])
  ] = js.undefined
  var handle: js.UndefOr[js.Function1[/* item */ js.Object, java.lang.String]] = js.undefined
  var header: js.UndefOr[java.lang.String] = js.undefined
  var id: java.lang.String
  var maxWidth: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var style: js.UndefOr[
    java.lang.String | (js.Function2[/* val */ js.Any, /* str */ java.lang.String, java.lang.String])
  ] = js.undefined
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var wordwrap: js.UndefOr[
    adoneLib.adoneLibStrings.soft | adoneLib.adoneLibStrings.hard | adoneLib.adoneNs.textNs.INs.WordWrapOptions
  ] = js.undefined
}

object TableColumn {
  @scala.inline
  def apply(
    id: java.lang.String,
    align: adoneLib.adoneLibStrings.right | adoneLib.adoneLibStrings.center | adoneLib.adoneLibStrings.left = null,
    format: java.lang.String | (js.Function2[/* val */ js.Any, /* item */ js.Object, java.lang.String]) = null,
    handle: js.Function1[/* item */ js.Object, java.lang.String] = null,
    header: java.lang.String = null,
    maxWidth: scala.Double | java.lang.String = null,
    style: java.lang.String | (js.Function2[/* val */ js.Any, /* str */ java.lang.String, java.lang.String]) = null,
    width: java.lang.String | scala.Double = null,
    wordwrap: adoneLib.adoneLibStrings.soft | adoneLib.adoneLibStrings.hard | adoneLib.adoneNs.textNs.INs.WordWrapOptions = null
  ): TableColumn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle)
    if (header != null) __obj.updateDynamic("header")(header)
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (wordwrap != null) __obj.updateDynamic("wordwrap")(wordwrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableColumn]
  }
}

