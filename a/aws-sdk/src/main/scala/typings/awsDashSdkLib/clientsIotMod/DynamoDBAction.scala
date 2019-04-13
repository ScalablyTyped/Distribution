package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamoDBAction extends js.Object {
  /**
    * The hash key name.
    */
  var hashKeyField: HashKeyField
  /**
    * The hash key type. Valid values are "STRING" or "NUMBER"
    */
  var hashKeyType: js.UndefOr[DynamoKeyType] = js.undefined
  /**
    * The hash key value.
    */
  var hashKeyValue: HashKeyValue
  /**
    * The type of operation to be performed. This follows the substitution template, so it can be ${operation}, but the substitution must result in one of the following: INSERT, UPDATE, or DELETE.
    */
  var operation: js.UndefOr[DynamoOperation] = js.undefined
  /**
    * The action payload. This name can be customized.
    */
  var payloadField: js.UndefOr[PayloadField] = js.undefined
  /**
    * The range key name.
    */
  var rangeKeyField: js.UndefOr[RangeKeyField] = js.undefined
  /**
    * The range key type. Valid values are "STRING" or "NUMBER"
    */
  var rangeKeyType: js.UndefOr[DynamoKeyType] = js.undefined
  /**
    * The range key value.
    */
  var rangeKeyValue: js.UndefOr[RangeKeyValue] = js.undefined
  /**
    * The ARN of the IAM role that grants access to the DynamoDB table.
    */
  var roleArn: AwsArn
  /**
    * The name of the DynamoDB table.
    */
  var tableName: TableName
}

object DynamoDBAction {
  @scala.inline
  def apply(
    hashKeyField: HashKeyField,
    hashKeyValue: HashKeyValue,
    roleArn: AwsArn,
    tableName: TableName,
    hashKeyType: DynamoKeyType = null,
    operation: DynamoOperation = null,
    payloadField: PayloadField = null,
    rangeKeyField: RangeKeyField = null,
    rangeKeyType: DynamoKeyType = null,
    rangeKeyValue: RangeKeyValue = null
  ): DynamoDBAction = {
    val __obj = js.Dynamic.literal(hashKeyField = hashKeyField, hashKeyValue = hashKeyValue, roleArn = roleArn, tableName = tableName)
    if (hashKeyType != null) __obj.updateDynamic("hashKeyType")(hashKeyType.asInstanceOf[js.Any])
    if (operation != null) __obj.updateDynamic("operation")(operation)
    if (payloadField != null) __obj.updateDynamic("payloadField")(payloadField)
    if (rangeKeyField != null) __obj.updateDynamic("rangeKeyField")(rangeKeyField)
    if (rangeKeyType != null) __obj.updateDynamic("rangeKeyType")(rangeKeyType.asInstanceOf[js.Any])
    if (rangeKeyValue != null) __obj.updateDynamic("rangeKeyValue")(rangeKeyValue)
    __obj.asInstanceOf[DynamoDBAction]
  }
}

