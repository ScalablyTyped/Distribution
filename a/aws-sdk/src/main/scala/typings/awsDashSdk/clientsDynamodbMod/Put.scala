package typings.awsDashSdk.clientsDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Put extends js.Object {
  /**
    * A condition that must be satisfied in order for a conditional update to succeed.
    */
  var ConditionExpression: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.ConditionExpression] = js.undefined
  /**
    * One or more substitution tokens for attribute names in an expression.
    */
  var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined
  /**
    * One or more values that can be substituted in an expression.
    */
  var ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap] = js.undefined
  /**
    * A map of attribute name to attribute values, representing the primary key of the item to be written by PutItem. All of the table's primary key attributes must be specified, and their data types must match those of the table's key schema. If any attributes are present in the item that are part of an index key schema for the table, their types must match the index key schema. 
    */
  var Item: PutItemInputAttributeMap
  /**
    * Use ReturnValuesOnConditionCheckFailure to get the item attributes if the Put condition fails. For ReturnValuesOnConditionCheckFailure, the valid values are: NONE and ALL_OLD.
    */
  var ReturnValuesOnConditionCheckFailure: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.ReturnValuesOnConditionCheckFailure] = js.undefined
  /**
    * Name of the table in which to write the item.
    */
  var TableName: typings.awsDashSdk.clientsDynamodbMod.TableName
}

object Put {
  @scala.inline
  def apply(
    Item: PutItemInputAttributeMap,
    TableName: TableName,
    ConditionExpression: ConditionExpression = null,
    ExpressionAttributeNames: ExpressionAttributeNameMap = null,
    ExpressionAttributeValues: ExpressionAttributeValueMap = null,
    ReturnValuesOnConditionCheckFailure: ReturnValuesOnConditionCheckFailure = null
  ): Put = {
    val __obj = js.Dynamic.literal(Item = Item, TableName = TableName)
    if (ConditionExpression != null) __obj.updateDynamic("ConditionExpression")(ConditionExpression)
    if (ExpressionAttributeNames != null) __obj.updateDynamic("ExpressionAttributeNames")(ExpressionAttributeNames)
    if (ExpressionAttributeValues != null) __obj.updateDynamic("ExpressionAttributeValues")(ExpressionAttributeValues)
    if (ReturnValuesOnConditionCheckFailure != null) __obj.updateDynamic("ReturnValuesOnConditionCheckFailure")(ReturnValuesOnConditionCheckFailure.asInstanceOf[js.Any])
    __obj.asInstanceOf[Put]
  }
}

