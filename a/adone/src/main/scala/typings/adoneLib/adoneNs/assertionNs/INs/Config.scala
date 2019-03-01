package typings
package adoneLib.adoneNs.assertionNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  /**
    * Include stack in Assertion error message
    */
  var includeStack: scala.Boolean
  /**
    * properties that should be ignored instead of throwing an error if they do not exist on the assertion
    */
  var proxyExcludedKeys: js.Array[java.lang.String]
  /**
    * Include `showDiff` flag in the thrown errors
    */
  var showDiff: scala.Boolean
  /**
    * Length threshold for actual and expected values in assertion errors
    */
  var truncateThreshold: scala.Double
  /**
    * use Proxy to throw an error when a non-existent property is read
    */
  var useProxy: scala.Boolean
}

object Config {
  @scala.inline
  def apply(
    includeStack: scala.Boolean,
    proxyExcludedKeys: js.Array[java.lang.String],
    showDiff: scala.Boolean,
    truncateThreshold: scala.Double,
    useProxy: scala.Boolean
  ): Config = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("includeStack")(includeStack)
    __obj.updateDynamic("proxyExcludedKeys")(proxyExcludedKeys)
    __obj.updateDynamic("showDiff")(showDiff)
    __obj.updateDynamic("truncateThreshold")(truncateThreshold)
    __obj.updateDynamic("useProxy")(useProxy)
    __obj.asInstanceOf[Config]
  }
}

