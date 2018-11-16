package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Rule extends js.Object {
  /**
     * `true` if the connection is enabled, `false` otherwise.
     */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * The rule's identifier.
     */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
     * The name of the rule.
     */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
     * The rule's order in relation to other rules. A rule with a lower order than another rule executes first.
     */
  var order: js.UndefOr[scala.Double] = js.undefined
  /**
     * The code to be executed when the rule runs.
     */
  var script: js.UndefOr[java.lang.String] = js.undefined
  /**
     * The rule's execution stage.
     */
  var stage: js.UndefOr[java.lang.String] = js.undefined
}

