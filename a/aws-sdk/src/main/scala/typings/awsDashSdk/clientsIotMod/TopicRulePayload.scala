package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicRulePayload extends js.Object {
  /**
    * The actions associated with the rule.
    */
  var actions: ActionList
  /**
    * The version of the SQL rules engine to use when evaluating the rule.
    */
  var awsIotSqlVersion: js.UndefOr[AwsIotSqlVersion] = js.undefined
  /**
    * The description of the rule.
    */
  var description: js.UndefOr[Description] = js.undefined
  /**
    * The action to take when an error occurs.
    */
  var errorAction: js.UndefOr[Action] = js.undefined
  /**
    * Specifies whether the rule is disabled.
    */
  var ruleDisabled: js.UndefOr[IsDisabled] = js.undefined
  /**
    * The SQL statement used to query the topic. For more information, see AWS IoT SQL Reference in the AWS IoT Developer Guide.
    */
  var sql: SQL
}

object TopicRulePayload {
  @scala.inline
  def apply(
    actions: ActionList,
    sql: SQL,
    awsIotSqlVersion: AwsIotSqlVersion = null,
    description: Description = null,
    errorAction: Action = null,
    ruleDisabled: js.UndefOr[scala.Boolean] = js.undefined
  ): TopicRulePayload = {
    val __obj = js.Dynamic.literal(actions = actions, sql = sql)
    if (awsIotSqlVersion != null) __obj.updateDynamic("awsIotSqlVersion")(awsIotSqlVersion)
    if (description != null) __obj.updateDynamic("description")(description)
    if (errorAction != null) __obj.updateDynamic("errorAction")(errorAction)
    if (!js.isUndefined(ruleDisabled)) __obj.updateDynamic("ruleDisabled")(ruleDisabled)
    __obj.asInstanceOf[TopicRulePayload]
  }
}

