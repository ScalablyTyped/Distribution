package typings
package adoneLib.adoneNs.utilNs.querystringNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringifyOptions extends js.Object {
  var addQueryPrefix: js.UndefOr[scala.Boolean] = js.undefined
  var allowDots: js.UndefOr[scala.Boolean] = js.undefined
  var arrayFormat: js.UndefOr[
    adoneLib.adoneLibStrings.indices | adoneLib.adoneLibStrings.brackets | adoneLib.adoneLibStrings.repeat
  ] = js.undefined
  var delimiter: js.UndefOr[java.lang.String] = js.undefined
  var encode: js.UndefOr[scala.Boolean] = js.undefined
  var encodeValuesOnly: js.UndefOr[scala.Boolean] = js.undefined
  var encoder: js.UndefOr[js.Function1[/* str */ java.lang.String, _]] = js.undefined
  var filter: js.UndefOr[
    (js.Array[java.lang.String | scala.Double]) | (js.Function2[/* prefix */ java.lang.String, /* value */ js.Any, _])
  ] = js.undefined
  var format: js.UndefOr[adoneLib.adoneLibStrings.RFC1738 | adoneLib.adoneLibStrings.RFC3986] = js.undefined
  var indices: js.UndefOr[scala.Boolean] = js.undefined
  var serializeDate: js.UndefOr[js.Function1[/* d */ stdLib.Date, java.lang.String]] = js.undefined
  var skipNulls: js.UndefOr[scala.Boolean] = js.undefined
  var sort: js.UndefOr[js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Double]] = js.undefined
  var strictNullHandling: js.UndefOr[scala.Boolean] = js.undefined
}

object StringifyOptions {
  @scala.inline
  def apply(
    addQueryPrefix: js.UndefOr[scala.Boolean] = js.undefined,
    allowDots: js.UndefOr[scala.Boolean] = js.undefined,
    arrayFormat: adoneLib.adoneLibStrings.indices | adoneLib.adoneLibStrings.brackets | adoneLib.adoneLibStrings.repeat = null,
    delimiter: java.lang.String = null,
    encode: js.UndefOr[scala.Boolean] = js.undefined,
    encodeValuesOnly: js.UndefOr[scala.Boolean] = js.undefined,
    encoder: /* str */ java.lang.String => _ = null,
    filter: (js.Array[java.lang.String | scala.Double]) | (js.Function2[/* prefix */ java.lang.String, /* value */ js.Any, _]) = null,
    format: adoneLib.adoneLibStrings.RFC1738 | adoneLib.adoneLibStrings.RFC3986 = null,
    indices: js.UndefOr[scala.Boolean] = js.undefined,
    serializeDate: /* d */ stdLib.Date => java.lang.String = null,
    skipNulls: js.UndefOr[scala.Boolean] = js.undefined,
    sort: (/* a */ js.Any, /* b */ js.Any) => scala.Double = null,
    strictNullHandling: js.UndefOr[scala.Boolean] = js.undefined
  ): StringifyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addQueryPrefix)) __obj.updateDynamic("addQueryPrefix")(addQueryPrefix)
    if (!js.isUndefined(allowDots)) __obj.updateDynamic("allowDots")(allowDots)
    if (arrayFormat != null) __obj.updateDynamic("arrayFormat")(arrayFormat.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (!js.isUndefined(encode)) __obj.updateDynamic("encode")(encode)
    if (!js.isUndefined(encodeValuesOnly)) __obj.updateDynamic("encodeValuesOnly")(encodeValuesOnly)
    if (encoder != null) __obj.updateDynamic("encoder")(js.Any.fromFunction1(encoder))
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(indices)) __obj.updateDynamic("indices")(indices)
    if (serializeDate != null) __obj.updateDynamic("serializeDate")(js.Any.fromFunction1(serializeDate))
    if (!js.isUndefined(skipNulls)) __obj.updateDynamic("skipNulls")(skipNulls)
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction2(sort))
    if (!js.isUndefined(strictNullHandling)) __obj.updateDynamic("strictNullHandling")(strictNullHandling)
    __obj.asInstanceOf[StringifyOptions]
  }
}

