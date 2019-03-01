package typings
package adoneLib.adoneNs.utilNs.querystringNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  var allowDots: js.UndefOr[scala.Boolean] = js.undefined
  var allowPrototypes: js.UndefOr[scala.Boolean] = js.undefined
  var arrayLimit: js.UndefOr[scala.Double] = js.undefined
  var decoder: js.UndefOr[
    js.Function2[
      /* str */ java.lang.String, 
      /* defaultDecoder */ js.Function1[/* str */ java.lang.String, java.lang.String], 
      java.lang.String
    ]
  ] = js.undefined
  var delimiter: js.UndefOr[java.lang.String] = js.undefined
  var depth: js.UndefOr[scala.Double] = js.undefined
  var ignoreQueryPrefix: js.UndefOr[scala.Boolean] = js.undefined
  var parameterLimit: js.UndefOr[scala.Double] = js.undefined
  var parseArrays: js.UndefOr[scala.Boolean] = js.undefined
  var plainObjects: js.UndefOr[scala.Boolean] = js.undefined
  var strictNullHandling: js.UndefOr[scala.Boolean] = js.undefined
}

object ParseOptions {
  @scala.inline
  def apply(
    allowDots: js.UndefOr[scala.Boolean] = js.undefined,
    allowPrototypes: js.UndefOr[scala.Boolean] = js.undefined,
    arrayLimit: scala.Int | scala.Double = null,
    decoder: js.Function2[
      /* str */ java.lang.String, 
      /* defaultDecoder */ js.Function1[/* str */ java.lang.String, java.lang.String], 
      java.lang.String
    ] = null,
    delimiter: java.lang.String = null,
    depth: scala.Int | scala.Double = null,
    ignoreQueryPrefix: js.UndefOr[scala.Boolean] = js.undefined,
    parameterLimit: scala.Int | scala.Double = null,
    parseArrays: js.UndefOr[scala.Boolean] = js.undefined,
    plainObjects: js.UndefOr[scala.Boolean] = js.undefined,
    strictNullHandling: js.UndefOr[scala.Boolean] = js.undefined
  ): ParseOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDots)) __obj.updateDynamic("allowDots")(allowDots)
    if (!js.isUndefined(allowPrototypes)) __obj.updateDynamic("allowPrototypes")(allowPrototypes)
    if (arrayLimit != null) __obj.updateDynamic("arrayLimit")(arrayLimit.asInstanceOf[js.Any])
    if (decoder != null) __obj.updateDynamic("decoder")(decoder)
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

