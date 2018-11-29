package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Put extends js.Object {
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
       * A map of attribute name to attribute values, representing the primary key of the item to be written by PutItem. All of the table's primary key attributes must be specified, and their data types must match those of the table's key schema. If any attributes are present in the item that are part of an index key schema for the table, their types must match the index key schema. 
       */
  var Item: PutItemInputAttributeMap
  /**
       * Use ReturnValuesOnConditionCheckFailure to get the item attributes if the Put condition fails. For ReturnValuesOnConditionCheckFailure, the valid values are: NONE and ALL_OLD.
       */
  var ReturnValuesOnConditionCheckFailure: js.UndefOr[ReturnValuesOnConditionCheckFailure] = js.undefined
  /**
       * Name of the table in which to write the item.
       */
  var TableName: TableName
}

