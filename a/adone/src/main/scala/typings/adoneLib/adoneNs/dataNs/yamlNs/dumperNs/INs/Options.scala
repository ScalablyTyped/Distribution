package typings
package adoneLib.adoneNs.dataNs.yamlNs.dumperNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * If true flow sequences will be condensed, omitting the space between a, b. Eg. '[a,b]'
    */
  var condenseFlow: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specifies level of nesting, when to switch from block to flow style for collections.
    * -1 means block style everwhere. Default: -1
    */
  var flowLevel: js.UndefOr[scala.Double] = js.undefined
  /**
    * indentation width to use (in spaces). Default: 2
    */
  var indent: js.UndefOr[scala.Double] = js.undefined
  /**
    * Set max line width. Default: 80
    */
  var lineWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * If true don't try to be compatible with older yaml versions.
    * Currently: don't quote "yes", "no" and so on, as required for YAML 1.1.
    * Default: false
    */
  var noCompatMode: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, don't convert duplicate objects into references. Default: false
    */
  var noRefs: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specifies a schema to use
    */
  var schema: js.UndefOr[adoneLib.adoneNs.dataNs.yamlNs.schemaNs.Schema] = js.undefined
  /**
    * Do not throw on invalid types (like function in the safe schema) and skip pairs and single values with such types.
    * Default: false
    */
  var skipInvalid: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, sort keys when dumping YAML. If a function, use the function to sort the keys. Default: false
    */
  var sortKeys: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * "tag" => "style" map. Each tag may have own set of styles
    */
  var styles: js.UndefOr[js.Object] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    condenseFlow: js.UndefOr[scala.Boolean] = js.undefined,
    flowLevel: scala.Int | scala.Double = null,
    indent: scala.Int | scala.Double = null,
    lineWidth: scala.Int | scala.Double = null,
    noCompatMode: js.UndefOr[scala.Boolean] = js.undefined,
    noRefs: js.UndefOr[scala.Boolean] = js.undefined,
    schema: adoneLib.adoneNs.dataNs.yamlNs.schemaNs.Schema = null,
    skipInvalid: js.UndefOr[scala.Boolean] = js.undefined,
    sortKeys: js.UndefOr[scala.Boolean] = js.undefined,
    styles: js.Object = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(condenseFlow)) __obj.updateDynamic("condenseFlow")(condenseFlow)
    if (flowLevel != null) __obj.updateDynamic("flowLevel")(flowLevel.asInstanceOf[js.Any])
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(noCompatMode)) __obj.updateDynamic("noCompatMode")(noCompatMode)
    if (!js.isUndefined(noRefs)) __obj.updateDynamic("noRefs")(noRefs)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    if (!js.isUndefined(skipInvalid)) __obj.updateDynamic("skipInvalid")(skipInvalid)
    if (!js.isUndefined(sortKeys)) __obj.updateDynamic("sortKeys")(sortKeys)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    __obj.asInstanceOf[Options]
  }
}

