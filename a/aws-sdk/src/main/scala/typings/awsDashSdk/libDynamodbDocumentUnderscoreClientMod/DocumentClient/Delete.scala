package typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delete extends js.Object {
  /**
    * A condition that must be satisfied in order for a conditional delete to succeed.
    */
  var ConditionExpression: js.UndefOr[
    typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient.ConditionExpression
  ] = js.undefined
  /**
    * One or more substitution tokens for attribute names in an expression.
    */
  var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined
  /**
    * One or more values that can be substituted in an expression.
    */
  var ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap] = js.undefined
  /**
    * The primary key of the item to be deleted. Each element consists of an attribute name and a value for that attribute.
    */
  var Key: typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient.Key
  /**
    * Use ReturnValuesOnConditionCheckFailure to get the item attributes if the Delete condition fails. For ReturnValuesOnConditionCheckFailure, the valid values are: NONE and ALL_OLD.
    */
  var ReturnValuesOnConditionCheckFailure: js.UndefOr[
    typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient.ReturnValuesOnConditionCheckFailure
  ] = js.undefined
  /**
    * Name of the table in which the item to be deleted resides.
    */
  var TableName: typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient.TableName
}

object Delete {
  @scala.inline
  def apply(
    Key: Key,
    TableName: TableName,
    ConditionExpression: ConditionExpression = null,
    ExpressionAttributeNames: ExpressionAttributeNameMap = null,
    ExpressionAttributeValues: ExpressionAttributeValueMap = null,
    ReturnValuesOnConditionCheckFailure: ReturnValuesOnConditionCheckFailure = null
  ): Delete = {
    val __obj = js.Dynamic.literal(Key = Key, TableName = TableName)
    if (ConditionExpression != null) __obj.updateDynamic("ConditionExpression")(ConditionExpression)
    if (ExpressionAttributeNames != null) __obj.updateDynamic("ExpressionAttributeNames")(ExpressionAttributeNames)
    if (ExpressionAttributeValues != null) __obj.updateDynamic("ExpressionAttributeValues")(ExpressionAttributeValues)
    if (ReturnValuesOnConditionCheckFailure != null) __obj.updateDynamic("ReturnValuesOnConditionCheckFailure")(ReturnValuesOnConditionCheckFailure.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delete]
  }
}

