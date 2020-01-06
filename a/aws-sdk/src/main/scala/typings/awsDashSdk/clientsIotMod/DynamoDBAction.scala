package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynamoDBAction extends js.Object {
  /**
    * The hash key name.
    */
  var hashKeyField: HashKeyField = js.native
  /**
    * The hash key type. Valid values are "STRING" or "NUMBER"
    */
  var hashKeyType: js.UndefOr[DynamoKeyType] = js.native
  /**
    * The hash key value.
    */
  var hashKeyValue: HashKeyValue = js.native
  /**
    * The type of operation to be performed. This follows the substitution template, so it can be ${operation}, but the substitution must result in one of the following: INSERT, UPDATE, or DELETE.
    */
  var operation: js.UndefOr[DynamoOperation] = js.native
  /**
    * The action payload. This name can be customized.
    */
  var payloadField: js.UndefOr[PayloadField] = js.native
  /**
    * The range key name.
    */
  var rangeKeyField: js.UndefOr[RangeKeyField] = js.native
  /**
    * The range key type. Valid values are "STRING" or "NUMBER"
    */
  var rangeKeyType: js.UndefOr[DynamoKeyType] = js.native
  /**
    * The range key value.
    */
  var rangeKeyValue: js.UndefOr[RangeKeyValue] = js.native
  /**
    * The ARN of the IAM role that grants access to the DynamoDB table.
    */
  var roleArn: AwsArn = js.native
  /**
    * The name of the DynamoDB table.
    */
  var tableName: TableName = js.native
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
    val __obj = js.Dynamic.literal(hashKeyField = hashKeyField.asInstanceOf[js.Any], hashKeyValue = hashKeyValue.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    if (hashKeyType != null) __obj.updateDynamic("hashKeyType")(hashKeyType.asInstanceOf[js.Any])
    if (operation != null) __obj.updateDynamic("operation")(operation.asInstanceOf[js.Any])
    if (payloadField != null) __obj.updateDynamic("payloadField")(payloadField.asInstanceOf[js.Any])
    if (rangeKeyField != null) __obj.updateDynamic("rangeKeyField")(rangeKeyField.asInstanceOf[js.Any])
    if (rangeKeyType != null) __obj.updateDynamic("rangeKeyType")(rangeKeyType.asInstanceOf[js.Any])
    if (rangeKeyValue != null) __obj.updateDynamic("rangeKeyValue")(rangeKeyValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamoDBAction]
  }
}

