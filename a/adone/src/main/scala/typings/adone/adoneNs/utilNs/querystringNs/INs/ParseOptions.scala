package typings.adone.adoneNs.utilNs.querystringNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  var allowDots: js.UndefOr[Boolean] = js.undefined
  var allowPrototypes: js.UndefOr[Boolean] = js.undefined
  var arrayLimit: js.UndefOr[Double] = js.undefined
  var decoder: js.UndefOr[
    js.Function2[
      /* str */ String, 
      /* defaultDecoder */ js.Function1[/* str */ String, String], 
      String
    ]
  ] = js.undefined
  var delimiter: js.UndefOr[String] = js.undefined
  var depth: js.UndefOr[Double] = js.undefined
  var ignoreQueryPrefix: js.UndefOr[Boolean] = js.undefined
  var parameterLimit: js.UndefOr[Double] = js.undefined
  var parseArrays: js.UndefOr[Boolean] = js.undefined
  var plainObjects: js.UndefOr[Boolean] = js.undefined
  var strictNullHandling: js.UndefOr[Boolean] = js.undefined
}

object ParseOptions {
  @scala.inline
  def apply(
    allowDots: js.UndefOr[Boolean] = js.undefined,
    allowPrototypes: js.UndefOr[Boolean] = js.undefined,
    arrayLimit: Int | Double = null,
    decoder: (/* str */ String, /* defaultDecoder */ js.Function1[/* str */ String, String]) => String = null,
    delimiter: String = null,
    depth: Int | Double = null,
    ignoreQueryPrefix: js.UndefOr[Boolean] = js.undefined,
    parameterLimit: Int | Double = null,
    parseArrays: js.UndefOr[Boolean] = js.undefined,
    plainObjects: js.UndefOr[Boolean] = js.undefined,
    strictNullHandling: js.UndefOr[Boolean] = js.undefined
  ): ParseOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDots)) __obj.updateDynamic("allowDots")(allowDots)
    if (!js.isUndefined(allowPrototypes)) __obj.updateDynamic("allowPrototypes")(allowPrototypes)
    if (arrayLimit != null) __obj.updateDynamic("arrayLimit")(arrayLimit.asInstanceOf[js.Any])
    if (decoder != null) __obj.updateDynamic("decoder")(js.Any.fromFunction2(decoder))
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreQueryPrefix)) __obj.updateDynamic("ignoreQueryPrefix")(ignoreQueryPrefix)
    if (parameterLimit != null) __obj.updateDynamic("parameterLimit")(parameterLimit.asInstanceOf[js.Any])
    if (!js.isUndefined(parseArrays)) __obj.updateDynamic("parseArrays")(parseArrays)
    if (!js.isUndefined(plainObjects)) __obj.updateDynamic("plainObjects")(plainObjects)
    if (!js.isUndefined(strictNullHandling)) __obj.updateDynamic("strictNullHandling")(strictNullHandling)
    __obj.asInstanceOf[ParseOptions]
  }
}

