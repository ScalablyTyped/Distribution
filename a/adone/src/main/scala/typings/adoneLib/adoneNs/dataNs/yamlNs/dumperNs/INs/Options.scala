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

