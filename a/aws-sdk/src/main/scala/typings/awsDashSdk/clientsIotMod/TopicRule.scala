package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicRule extends js.Object {
  /**
    * The actions associated with the rule.
    */
  var actions: js.UndefOr[ActionList] = js.native
  /**
    * The version of the SQL rules engine to use when evaluating the rule.
    */
  var awsIotSqlVersion: js.UndefOr[AwsIotSqlVersion] = js.native
  /**
    * The date and time the rule was created.
    */
  var createdAt: js.UndefOr[CreatedAtDate] = js.native
  /**
    * The description of the rule.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * The action to perform when an error occurs.
    */
  var errorAction: js.UndefOr[Action] = js.native
  /**
    * Specifies whether the rule is disabled.
    */
  var ruleDisabled: js.UndefOr[IsDisabled] = js.native
  /**
    * The name of the rule.
    */
  var ruleName: js.UndefOr[RuleName] = js.native
  /**
    * The SQL statement used to query the topic. When using a SQL query with multiple lines, be sure to escape the newline characters.
    */
  var sql: js.UndefOr[SQL] = js.native
}

object TopicRule {
  @scala.inline
  def apply(
    actions: ActionList = null,
    awsIotSqlVersion: AwsIotSqlVersion = null,
    createdAt: CreatedAtDate = null,
    description: Description = null,
    errorAction: Action = null,
    ruleDisabled: js.UndefOr[scala.Boolean] = js.undefined,
    ruleName: RuleName = null,
    sql: SQL = null
  ): TopicRule = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (awsIotSqlVersion != null) __obj.updateDynamic("awsIotSqlVersion")(awsIotSqlVersion.asInstanceOf[js.Any])
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (errorAction != null) __obj.updateDynamic("errorAction")(errorAction.asInstanceOf[js.Any])
    if (!js.isUndefined(ruleDisabled)) __obj.updateDynamic("ruleDisabled")(ruleDisabled.asInstanceOf[js.Any])
    if (ruleName != null) __obj.updateDynamic("ruleName")(ruleName.asInstanceOf[js.Any])
    if (sql != null) __obj.updateDynamic("sql")(sql.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRule]
  }
}

