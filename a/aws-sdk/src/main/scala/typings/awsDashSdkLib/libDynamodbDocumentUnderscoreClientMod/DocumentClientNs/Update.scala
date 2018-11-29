package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Update extends js.Object {
  /**
       * A condition that must be satisfied in order for a conditional update to succeed.
       */
  var ConditionExpression: js.UndefOr[ConditionExpression] = js.undefined
  /**
       * One or more substitution tokens for attribute names in an expression.
       */
  var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined
  /**
       * One or more values that can be substituted in an expression.
       */
  var ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap] = js.undefined
  /**
       * The primary key of the item to be updated. Each element consists of an attribute name and a value for that attribute.
       */
  var Key: Key
  /**
       * Use ReturnValuesOnConditionCheckFailure to get the item attributes if the Update condition fails. For ReturnValuesOnConditionCheckFailure, the valid values are: NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW.
       */
  var ReturnValuesOnConditionCheckFailure: js.UndefOr[ReturnValuesOnConditionCheckFailure] = js.undefined
  /**
       * Name of the table for the UpdateItem request.
       */
  var TableName: TableName
  /**
       * An expression that defines one or more attributes to be updated, the action to be performed on them, and new value(s) for them.
       */
  var UpdateExpression: UpdateExpression
}

