package typings
package adoneLib.adoneNs.dataNs.yamlNs.loaderNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * String to be used as a file path in error/warning messages. Default: null
    */
  var filename: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Compatibility with JSON.parse behaviour.
    * If true, then duplicate keys in a mapping will override values rather than throwing an error
    */
  var json: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Function to call on warning messages.
    * Loader will throw on warnings if this function is not provided
    */
  var onWarning: js.UndefOr[js.Function1[/* warning */ js.Any, scala.Unit]] = js.undefined
  /**
    * Specifies a schema to use
    */
  var schema: js.UndefOr[adoneLib.adoneNs.dataNs.yamlNs.schemaNs.Schema] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    filename: java.lang.String = null,
    json: js.UndefOr[scala.Boolean] = js.undefined,
    onWarning: /* warning */ js.Any => scala.Unit = null,
    schema: adoneLib.adoneNs.dataNs.yamlNs.schemaNs.Schema = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (!js.isUndefined(json)) __obj.updateDynamic("json")(json)
    if (onWarning != null) __obj.updateDynamic("onWarning")(js.Any.fromFunction1(onWarning))
    if (schema != null) __obj.updateDynamic("schema")(schema)
    __obj.asInstanceOf[Options]
  }
}

