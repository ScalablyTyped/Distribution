package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TransactWriteItemsInput extends js.Object {
  /**
       * Providing a ClientRequestToken makes the call to TransactWriteItems idempotent, meaning that multiple identical calls have the same effect as one single call. Although multiple identical calls using the same client request token produce the same result on the server (no side effects), the responses to the calls may not be the same. If the ReturnConsumedCapacity&gt; parameter is set, then the initial TransactWriteItems call returns the amount of write capacity units consumed in making the changes, and subsequent TransactWriteItems calls with the same client token return the amount of read capacity units consumed in reading the item. A client request token is valid for 10 minutes after the first request that uses it completes. After 10 minutes, any request with the same client token is treated as a new request. Do not resubmit the same request with the same client token for more than 10 minutes or the result may not be idempotent. If you submit a request with the same client token but a change in other parameters within the 10 minute idempotency window, DynamoDB returns an IdempotentParameterMismatch exception.
       */
  var ClientRequestToken: js.UndefOr[java.lang.String] = js.undefined
  var ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity] = js.undefined
  /**
       * Determines whether item collection metrics are returned. If set to SIZE, the response includes statistics about item collections (if any), that were modified during the operation and are returned in the response. If set to NONE (the default), no statistics are returned. 
       */
  var ReturnItemCollectionMetrics: js.UndefOr[ReturnItemCollectionMetrics] = js.undefined
  /**
       * An ordered array of up to 10 TransactWriteItem objects, each of which contains a ConditionCheck, Put, Update, or Delete object. These can operate on items in different tables, but the tables must reside in the same AWS account and region, and no two of them can operate on the same item. 
       */
  var TransactItems: TransactWriteItemList
}

