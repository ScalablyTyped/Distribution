package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ConditionCheck extends js.Object {
  /**
       * A condition that must be satisfied in order for a conditional update to succeed.
       */
  var ConditionExpression: ConditionExpression
  /**
       * One or more substitution tokens for attribute names in an expression.
       */
  var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined
  /**
       * One or more values that can be substituted in an expression.
       */
  var ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap] = js.undefined
  /**
       * The primary key of the item to be checked. Each element consists of an attribute name and a value for that attribute.
       */
  var Key: Key
  /**
       * Use ReturnValuesOnConditionCheckFailure to get the item attributes if the ConditionCheck condition fails. For ReturnValuesOnConditionCheckFailure, the valid values are: NONE and ALL_OLD.
       */
  var ReturnValuesOnConditionCheckFailure: js.UndefOr[ReturnValuesOnConditionCheckFailure] = js.undefined
  /**
       * Name of the table for the check item request.
       */
  var TableName: TableName
}

