package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rule extends js.Object {
  /**
    * `true` if the connection is enabled, `false` otherwise.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The rule's identifier.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * The name of the rule.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The rule's order in relation to other rules. A rule with a lower order than another rule executes first.
    */
  var order: js.UndefOr[Double] = js.undefined
  /**
    * The code to be executed when the rule runs.
    */
  var script: js.UndefOr[String] = js.undefined
  /**
    * The rule's execution stage.
    */
  var stage: js.UndefOr[String] = js.undefined
}

object Rule {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    name: String = null,
    order: js.UndefOr[Double] = js.undefined,
    script: String = null,
    stage: String = null
  ): Rule = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(order)) __obj.updateDynamic("order")(order.get.asInstanceOf[js.Any])
    if (script != null) __obj.updateDynamic("script")(script.asInstanceOf[js.Any])
    if (stage != null) __obj.updateDynamic("stage")(stage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
}

