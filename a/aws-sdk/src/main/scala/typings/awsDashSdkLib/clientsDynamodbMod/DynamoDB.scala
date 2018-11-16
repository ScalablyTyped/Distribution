package typings
package awsDashSdkLib.clientsDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynamoDB
  extends awsDashSdkLib.libServicesDynamodbMod.DynamoDBCustomizations {
  @JSName("config")
  var config_DynamoDB: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ClientConfiguration = js.native
  /**
     * The BatchGetItem operation returns the attributes of one or more items from one or more tables. You identify requested items by primary key. A single operation can retrieve up to 16 MB of data, which can contain as many as 100 items. BatchGetItem will return a partial result if the response size limit is exceeded, the table's provisioned throughput is exceeded, or an internal processing failure occurs. If a partial result is returned, the operation returns a value for UnprocessedKeys. You can use this value to retry the operation starting with the next item to get.  If you request more than 100 items BatchGetItem will return a ValidationException with the message "Too many items requested for the BatchGetItem call".  For example, if you ask to retrieve 100 items, but each individual item is 300 KB in size, the system returns 52 items (so as not to exceed the 16 MB limit). It also returns an appropriate UnprocessedKeys value so you can get the next page of results. If desired, your application can include its own logic to assemble the pages of results into one data set. If none of the items can be processed due to insufficient provisioned throughput on all of the tables in the request, then BatchGetItem will return a ProvisionedThroughputExceededException. If at least one of the items is successfully processed, then BatchGetItem completes successfully, while returning the keys of the unread items in UnprocessedKeys.  If DynamoDB returns any unprocessed items, you should retry the batch operation on those items. However, we strongly recommend that you use an exponential backoff algorithm. If you retry the batch operation immediately, the underlying read or write requests can still fail due to throttling on the individual tables. If you delay the batch operation using exponential backoff, the individual requests in the batch are much more likely to succeed. For more information, see Batch Operations and Error Handling in the Amazon DynamoDB Developer Guide.  By default, BatchGetItem performs eventually consistent reads on every table in the request. If you want strongly consistent reads instead, you can set ConsistentRead to true for any or all tables. In order to minimize response latency, BatchGetItem retrieves items in parallel. When designing your application, keep in mind that DynamoDB does not return items in any particular order. To help parse the response by item, include the primary key values for the items in your request in the ProjectionExpression parameter. If a requested item does not exist, it is not returned in the result. Requests for nonexistent items consume the minimum read capacity units according to the type of read. For more information, see Capacity Units Calculations in the Amazon DynamoDB Developer Guide.
     */
  def batchGetItem(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.BatchGetItemOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The BatchGetItem operation returns the attributes of one or more items from one or more tables. You identify requested items by primary key. A single operation can retrieve up to 16 MB of data, which can contain as many as 100 items. BatchGetItem will return a partial result if the response size limit is exceeded, the table's provisioned throughput is exceeded, or an internal processing failure occurs. If a partial result is returned, the operation returns a value for UnprocessedKeys. You can use this value to retry the operation starting with the next item to get.  If you request more than 100 items BatchGetItem will return a ValidationException with the message "Too many items requested for the BatchGetItem call".  For example, if you ask to retrieve 100 items, but each individual item is 300 KB in size, the system returns 52 items (so as not to exceed the 16 MB limit). It also returns an appropriate UnprocessedKeys value so you can get the next page of results. If desired, your application can include its own logic to assemble the pages of results into one data set. If none of the items can be processed due to insufficient provisioned throughput on all of the tables in the request, then BatchGetItem will return a ProvisionedThroughputExceededException. If at least one of the items is successfully processed, then BatchGetItem completes successfully, while returning the keys of the unread items in UnprocessedKeys.  If DynamoDB returns any unprocessed items, you should retry the batch operation on those items. However, we strongly recommend that you use an exponential backoff algorithm. If you retry the batch operation immediately, the underlying read or write requests can still fail due to throttling on the individual tables. If you delay the batch operation using exponential backoff, the individual requests in the batch are much more likely to succeed. For more information, see Batch Operations and Error Handling in the Amazon DynamoDB Developer Guide.  By default, BatchGetItem performs eventually consistent reads on every table in the request. If you want strongly consistent reads instead, you can set ConsistentRead to true for any or all tables. In order to minimize response latency, BatchGetItem retrieves items in parallel. When designing your application, keep in mind that DynamoDB does not return items in any particular order. To help parse the response by item, include the primary key values for the items in your request in the ProjectionExpression parameter. If a requested item does not exist, it is not returned in the result. Requests for nonexistent items consume the minimum read capacity units according to the type of read. For more information, see Capacity Units Calculations in the Amazon DynamoDB Developer Guide.
     */
  def batchGetItem(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.BatchGetItemOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.BatchGetItemOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The BatchGetItem operation returns the attributes of one or more items from one or more tables. You identify requested items by primary key. A single operation can retrieve up to 16 MB of data, which can contain as many as 100 items. BatchGetItem will return a partial result if the response size limit is exceeded, the table's provisioned throughput is exceeded, or an internal processing failure occurs. If a partial result is returned, the operation returns a value for UnprocessedKeys. You can use this value to retry the operation starting with the next item to get.  If you request more than 100 items BatchGetItem will return a ValidationException with the message "Too many items requested for the BatchGetItem call".  For example, if you ask to retrieve 100 items, but each individual item is 300 KB in size, the system returns 52 items (so as not to exceed the 16 MB limit). It also returns an appropriate UnprocessedKeys value so you can get the next page of results. If desired, your application can include its own logic to assemble the pages of results into one data set. If none of the items can be processed due to insufficient provisioned throughput on all of the tables in the request, then BatchGetItem will return a ProvisionedThroughputExceededException. If at least one of the items is successfully processed, then BatchGetItem completes successfully, while returning the keys of the unread items in UnprocessedKeys.  If DynamoDB returns any unprocessed items, you should retry the batch operation on those items. However, we strongly recommend that you use an exponential backoff algorithm. If you retry the batch operation immediately, the underlying read or write requests can still fail due to throttling on the individual tables. If you delay the batch operation using exponential backoff, the individual requests in the batch are much more likely to succeed. For more information, see Batch Operations and Error Handling in the Amazon DynamoDB Developer Guide.  By default, BatchGetItem performs eventually consistent reads on every table in the request. If you want strongly consistent reads instead, you can set ConsistentRead to true for any or all tables. In order to minimize response latency, BatchGetItem retrieves items in parallel. When designing your application, keep in mind that DynamoDB does not return items in any particular order. To help parse the response by item, include the primary key values for the items in your request in the ProjectionExpression parameter. If a requested item does not exist, it is not returned in the result. Requests for nonexistent items consume the minimum read capacity units according to the type of read. For more information, see Capacity Units Calculations in the Amazon DynamoDB Developer Guide.
     */
  def batchGetItem(params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.BatchGetItemInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.BatchGetItemOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The BatchGetItem operation returns the attributes of one or more items from one or more tables. You identify requested items by primary key. A single operation can retrieve up to 16 MB of data, which can contain as many as 100 items. BatchGetItem will return a partial result if the response size limit is exceeded, the table's provisioned throughput is exceeded, or an internal processing failure occurs. If a partial result is returned, the operation returns a value for UnprocessedKeys. You can use this value to retry the operation starting with the next item to get.  If you request more than 100 items BatchGetItem will return a ValidationException with the message "Too many items requested for the BatchGetItem call".  For example, if you ask to retrieve 100 items, but each individual item is 300 KB in size, the system returns 52 items (so as not to exceed the 16 MB limit). It also returns an appropriate UnprocessedKeys value so you can get the next page of results. If desired, your application can include its own logic to assemble the pages of results into one data set. If none of the items can be processed due to insufficient provisioned throughput on all of the tables in the request, then BatchGetItem will return a ProvisionedThroughputExceededException. If at least one of the items is successfully processed, then BatchGetItem completes successfully, while returning the keys of the unread items in UnprocessedKeys.  If DynamoDB returns any unprocessed items, you should retry the batch operation on those items. However, we strongly recommend that you use an exponential backoff algorithm. If you retry the batch operation immediately, the underlying read or write requests can still fail due to throttling on the individual tables. If you delay the batch operation using exponential backoff, the individual requests in the batch are much more likely to succeed. For more information, see Batch Operations and Error Handling in the Amazon DynamoDB Developer Guide.  By default, BatchGetItem performs eventually consistent reads on every table in the request. If you want strongly consistent reads instead, you can set ConsistentRead to true for any or all tables. In order to minimize response latency, BatchGetItem retrieves items in parallel. When designing your application, keep in mind that DynamoDB does not return items in any particular order. To help parse the response by item, include the primary key values for the items in your request in the ProjectionExpression parameter. If a requested item does not exist, it is not returned in the result. Requests for nonexistent items consume the minimum read capacity units according to the type of read. For more information, see Capacity Units Calculations in the Amazon DynamoDB Developer Guide.
     */
  def batchGetItem(
    params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.BatchGetItemInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.BatchGetItemOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.BatchGetItemOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The BatchWriteItem operation puts or deletes multiple items in one or more tables. A single call to BatchWriteItem can write up to 16 MB of data, which can comprise as many as 25 put or delete requests. Individual items to be written can be as large as 400 KB.   BatchWriteItem cannot update items. To update items, use the UpdateItem action.  The individual PutItem and DeleteItem operations specified in BatchWriteItem are atomic; however BatchWriteItem as a whole is not. If any requested operations fail because the table's provisioned throughput is exceeded or an internal processing failure occurs, the failed operations are returned in the UnprocessedItems response parameter. You can investigate and optionally resend the requests. Typically, you would call BatchWriteItem in a loop. Each iteration would check for unprocessed items and submit a new BatchWriteItem request with those unprocessed items until all items have been processed. Note that if none of the items can be processed due to insufficient provisioned throughput on all of the tables in the request, then BatchWriteItem will return a ProvisionedThroughputExceededException.  If DynamoDB returns any unprocessed items, you should retry the batch operation on those items. However, we strongly recommend that you use an exponential backoff algorithm. If you retry the batch operation immediately, the underlying read or write requests can still fail due to throttling on the individual tables. If you delay the batch operation using exponential backoff, the individual requests in the batch are much more likely to succeed. For more information, see Batch Operations and Error Handling in the Amazon DynamoDB Developer Guide.  With BatchWriteItem, you can efficiently write or delete large amounts of data, such as from Amazon Elastic MapReduce (EMR), or copy data from another database into DynamoDB. In order to improve performance with these large-scale operations, BatchWriteItem does not behave in the same way as individual PutItem and DeleteItem calls would. For example, you cannot specify conditions on individual put and delete requests, and BatchWriteItem does not return deleted items in the response. If you use a programming language that supports concurrency, you can use threads to write items in parallel. Your application must include the necessary logic to manage the threads. With languages that don't support threading, you must update or delete the specified items one at a time. In both situations, BatchWriteItem performs the specified put and delete operations in parallel, giving you the power of the thread pool approach without having to introduce complexity into your application. Parallel processing reduces latency, but each specified put and delete request consumes the same number of write capacity units whether it is processed in parallel or not. Delete operations on nonexistent items consume one write capacity unit. If one or more of the following is true, DynamoDB rejects the entire batch write operation:   One or more tables specified in the BatchWriteItem request does not exist.   Primary key attributes specified on an item in the request do not match those in the corresponding table's primary key schema.   You try to perform multiple operations on the same item in the same BatchWriteItem request. For example, you cannot put and delete the same item in the same BatchWriteItem request.     Your request contains at least two items with identical hash and range keys (which essentially is two put operations).    There are more than 25 requests in the batch.   Any individual item in a batch exceeds 400 KB.   The total request size exceeds 16 MB.  
     */
  def batchWriteItem(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.BatchWriteItemOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The BatchWriteItem operation puts or deletes multiple items in one or more tables. A single call to BatchWriteItem can write up to 16 MB of data, which can comprise as many as 25 put or delete requests. Individual items to be written can be as large as 400 KB.   BatchWriteItem cannot update items. To update items, use the UpdateItem action.  The individual PutItem and DeleteItem operations specified in BatchWriteItem are atomic; however BatchWriteItem as a whole is not. If any requested operations fail because the table's provisioned throughput is exceeded or an internal processing failure occurs, the failed operations are returned in the UnprocessedItems response parameter. You can investigate and optionally resend the requests. Typically, you would call BatchWriteItem in a loop. Each iteration would check for unprocessed items and submit a new BatchWriteItem request with those unprocessed items until all items have been processed. Note that if none of the items can be processed due to insufficient provisioned throughput on all of the tables in the request, then BatchWriteItem will return a ProvisionedThroughputExceededException.  If DynamoDB returns any unprocessed items, you should retry the batch operation on those items. However, we strongly recommend that you use an exponential backoff algorithm. If you retry the batch operation immediately, the underlying read or write requests can still fail due to throttling on the individual tables. If you delay the batch operation using exponential backoff, the individual requests in the batch are much more likely to succeed. For more information, see Batch Operations and Error Handling in the Amazon DynamoDB Developer Guide.  With BatchWriteItem, you can efficiently write or delete large amounts of data, such as from Amazon Elastic MapReduce (EMR), or copy data from another database into DynamoDB. In order to improve performance with these large-scale operations, BatchWriteItem does not behave in the same way as individual PutItem and DeleteItem calls would. For example, you cannot specify conditions on individual put and delete requests, and BatchWriteItem does not return deleted items in the response. If you use a programming language that supports concurrency, you can use threads to write items in parallel. Your application must include the necessary logic to manage the threads. With languages that don't support threading, you must update or delete the specified items one at a time. In both situations, BatchWriteItem performs the specified put and delete operations in parallel, giving you the power of the thread pool approach without having to introduce complexity into your application. Parallel processing reduces latency, but each specified put and delete request consumes the same number of write capacity units whether it is processed in parallel or not. Delete operations on nonexistent items consume one write capacity unit. If one or more of the following is true, DynamoDB rejects the entire batch write operation:   One or more tables specified in the BatchWriteItem request does not exist.   Primary key attributes specified on an item in the request do not match those in the corresponding table's primary key schema.   You try to perform multiple operations on the same item in the same BatchWriteItem request. For example, you cannot put and delete the same item in the same BatchWriteItem request.     Your request contains at least two items with identical hash and range keys (which essentially is two put operations).    There are more than 25 requests in the batch.   Any individual item in a batch exceeds 400 KB.   The total request size exceeds 16 MB.  
     */
  def batchWriteItem(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.BatchWriteItemOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.BatchWriteItemOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The BatchWriteItem operation puts or deletes multiple items in one or more tables. A single call to BatchWriteItem can write up to 16 MB of data, which can comprise as many as 25 put or delete requests. Individual items to be written can be as large as 400 KB.   BatchWriteItem cannot update items. To update items, use the UpdateItem action.  The individual PutItem and DeleteItem operations specified in BatchWriteItem are atomic; however BatchWriteItem as a whole is not. If any requested operations fail because the table's provisioned throughput is exceeded or an internal processing failure occurs, the failed operations are returned in the UnprocessedItems response parameter. You can investigate and optionally resend the requests. Typically, you would call BatchWriteItem in a loop. Each iteration would check for unprocessed items and submit a new BatchWriteItem request with those unprocessed items until all items have been processed. Note that if none of the items can be processed due to insufficient provisioned throughput on all of the tables in the request, then BatchWriteItem will return a ProvisionedThroughputExceededException.  If DynamoDB returns any unprocessed items, you should retry the batch operation on those items. However, we strongly recommend that you use an exponential backoff algorithm. If you retry the batch operation immediately, the underlying read or write requests can still fail due to throttling on the individual tables. If you delay the batch operation using exponential backoff, the individual requests in the batch are much more likely to succeed. For more information, see Batch Operations and Error Handling in the Amazon DynamoDB Developer Guide.  With BatchWriteItem, you can efficiently write or delete large amounts of data, such as from Amazon Elastic MapReduce (EMR), or copy data from another database into DynamoDB. In order to improve performance with these large-scale operations, BatchWriteItem does not behave in the same way as individual PutItem and DeleteItem calls would. For example, you cannot specify conditions on individual put and delete requests, and BatchWriteItem does not return deleted items in the response. If you use a programming language that supports concurrency, you can use threads to write items in parallel. Your application must include the necessary logic to manage the threads. With languages that don't support threading, you must update or delete the specified items one at a time. In both situations, BatchWriteItem performs the specified put and delete operations in parallel, giving you the power of the thread pool approach without having to introduce complexity into your application. Parallel processing reduces latency, but each specified put and delete request consumes the same number of write capacity units whether it is processed in parallel or not. Delete operations on nonexistent items consume one write capacity unit. If one or more of the following is true, DynamoDB rejects the entire batch write operation:   One or more tables specified in the BatchWriteItem request does not exist.   Primary key attributes specified on an item in the request do not match those in the corresponding table's primary key schema.   You try to perform multiple operations on the same item in the same BatchWriteItem request. For example, you cannot put and delete the same item in the same BatchWriteItem request.     Your request contains at least two items with identical hash and range keys (which essentially is two put operations).    There are more than 25 requests in the batch.   Any individual item in a batch exceeds 400 KB.   The total request size exceeds 16 MB.  
     */
  def batchWriteItem(params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.BatchWriteItemInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.BatchWriteItemOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The BatchWriteItem operation puts or deletes multiple items in one or more tables. A single call to BatchWriteItem can write up to 16 MB of data, which can comprise as many as 25 put or delete requests. Individual items to be written can be as large as 400 KB.   BatchWriteItem cannot update items. To update items, use the UpdateItem action.  The individual PutItem and DeleteItem operations specified in BatchWriteItem are atomic; however BatchWriteItem as a whole is not. If any requested operations fail because the table's provisioned throughput is exceeded or an internal processing failure occurs, the failed operations are returned in the UnprocessedItems response parameter. You can investigate and optionally resend the requests. Typically, you would call BatchWriteItem in a loop. Each iteration would check for unprocessed items and submit a new BatchWriteItem request with those unprocessed items until all items have been processed. Note that if none of the items can be processed due to insufficient provisioned throughput on all of the tables in the request, then BatchWriteItem will return a ProvisionedThroughputExceededException.  If DynamoDB returns any unprocessed items, you should retry the batch operation on those items. However, we strongly recommend that you use an exponential backoff algorithm. If you retry the batch operation immediately, the underlying read or write requests can still fail due to throttling on the individual tables. If you delay the batch operation using exponential backoff, the individual requests in the batch are much more likely to succeed. For more information, see Batch Operations and Error Handling in the Amazon DynamoDB Developer Guide.  With BatchWriteItem, you can efficiently write or delete large amounts of data, such as from Amazon Elastic MapReduce (EMR), or copy data from another database into DynamoDB. In order to improve performance with these large-scale operations, BatchWriteItem does not behave in the same way as individual PutItem and DeleteItem calls would. For example, you cannot specify conditions on individual put and delete requests, and BatchWriteItem does not return deleted items in the response. If you use a programming language that supports concurrency, you can use threads to write items in parallel. Your application must include the necessary logic to manage the threads. With languages that don't support threading, you must update or delete the specified items one at a time. In both situations, BatchWriteItem performs the specified put and delete operations in parallel, giving you the power of the thread pool approach without having to introduce complexity into your application. Parallel processing reduces latency, but each specified put and delete request consumes the same number of write capacity units whether it is processed in parallel or not. Delete operations on nonexistent items consume one write capacity unit. If one or more of the following is true, DynamoDB rejects the entire batch write operation:   One or more tables specified in the BatchWriteItem request does not exist.   Primary key attributes specified on an item in the request do not match those in the corresponding table's primary key schema.   You try to perform multiple operations on the same item in the same BatchWriteItem request. For example, you cannot put and delete the same item in the same BatchWriteItem request.     Your request contains at least two items with identical hash and range keys (which essentially is two put operations).    There are more than 25 requests in the batch.   Any individual item in a batch exceeds 400 KB.   The total request size exceeds 16 MB.  
     */
  def batchWriteItem(
    params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.BatchWriteItemInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.BatchWriteItemOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.BatchWriteItemOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a backup for an existing table.  Each time you create an On-Demand Backup, the entire table data is backed up. There is no limit to the number of on-demand backups that can be taken.   When you create an On-Demand Backup, a time marker of the request is cataloged, and the backup is created asynchronously, by applying all changes until the time of the request to the last full table snapshot. Backup requests are processed instantaneously and become available for restore within minutes.  You can call CreateBackup at a maximum rate of 50 times per second. All backups in DynamoDB work without consuming any provisioned throughput on the table.  If you submit a backup request on 2018-12-14 at 14:25:00, the backup is guaranteed to contain all data committed to the table up to 14:24:00, and data committed after 14:26:00 will not be. The backup may or may not contain data modifications made between 14:24:00 and 14:26:00. On-Demand Backup does not support causal consistency.   Along with data, the following are also included on the backups:    Global secondary indexes (GSIs)   Local secondary indexes (LSIs)   Streams   Provisioned read and write capacity  
     */
  def createBackup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.CreateBackupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a backup for an existing table.  Each time you create an On-Demand Backup, the entire table data is backed up. There is no limit to the number of on-demand backups that can be taken.   When you create an On-Demand Backup, a time marker of the request is cataloged, and the backup is created asynchronously, by applying all changes until the time of the request to the last full table snapshot. Backup requests are processed instantaneously and become available for restore within minutes.  You can call CreateBackup at a maximum rate of 50 times per second. All backups in DynamoDB work without consuming any provisioned throughput on the table.  If you submit a backup request on 2018-12-14 at 14:25:00, the backup is guaranteed to contain all data committed to the table up to 14:24:00, and data committed after 14:26:00 will not be. The backup may or may not contain data modifications made between 14:24:00 and 14:26:00. On-Demand Backup does not support causal consistency.   Along with data, the following are also included on the backups:    Global secondary indexes (GSIs)   Local secondary indexes (LSIs)   Streams   Provisioned read and write capacity  
     */
  def createBackup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.CreateBackupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.CreateBackupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a backup for an existing table.  Each time you create an On-Demand Backup, the entire table data is backed up. There is no limit to the number of on-demand backups that can be taken.   When you create an On-Demand Backup, a time marker of the request is cataloged, and the backup is created asynchronously, by applying all changes until the time of the request to the last full table snapshot. Backup requests are processed instantaneously and become available for restore within minutes.  You can call CreateBackup at a maximum rate of 50 times per second. All backups in DynamoDB work without consuming any provisioned throughput on the table.  If you submit a backup request on 2018-12-14 at 14:25:00, the backup is guaranteed to contain all data committed to the table up to 14:24:00, and data committed after 14:26:00 will not be. The backup may or may not contain data modifications made between 14:24:00 and 14:26:00. On-Demand Backup does not support causal consistency.   Along with data, the following are also included on the backups:    Global secondary indexes (GSIs)   Local secondary indexes (LSIs)   Streams   Provisioned read and write capacity  
     */
  def createBackup(params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.CreateBackupInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.CreateBackupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a backup for an existing table.  Each time you create an On-Demand Backup, the entire table data is backed up. There is no limit to the number of on-demand backups that can be taken.   When you create an On-Demand Backup, a time marker of the request is cataloged, and the backup is created asynchronously, by applying all changes until the time of the request to the last full table snapshot. Backup requests are processed instantaneously and become available for restore within minutes.  You can call CreateBackup at a maximum rate of 50 times per second. All backups in DynamoDB work without consuming any provisioned throughput on the table.  If you submit a backup request on 2018-12-14 at 14:25:00, the backup is guaranteed to contain all data committed to the table up to 14:24:00, and data committed after 14:26:00 will not be. The backup may or may not contain data modifications made between 14:24:00 and 14:26:00. On-Demand Backup does not support causal consistency.   Along with data, the following are also included on the backups:    Global secondary indexes (GSIs)   Local secondary indexes (LSIs)   Streams   Provisioned read and write capacity  
     */
  def createBackup(
    params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.CreateBackupInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.CreateBackupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.CreateBackupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a global table from an existing table. A global table creates a replication relationship between two or more DynamoDB tables with the same table name in the provided regions.  If you want to add a new replica table to a global table, each of the following conditions must be true:   The table must have the same primary key as all of the other replicas.   The table must have the same name as all of the other replicas.   The table must have DynamoDB Streams enabled, with the stream containing both the new and the old images of the item.   None of the replica tables in the global table can contain any data.    If global secondary indexes are specified, then the following conditions must also be met:     The global secondary indexes must have the same name.     The global secondary indexes must have the same hash key and sort key (if present).      Write capacity settings should be set consistently across your replica tables and secondary indexes. DynamoDB strongly recommends enabling auto scaling to manage the write capacity settings for all of your global tables replicas and indexes.   If you prefer to manage write capacity settings manually, you should provision equal replicated write capacity units to your replica tables. You should also provision equal replicated write capacity units to matching secondary indexes across your global table.  
     */
  def createGlobalTable(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.CreateGlobalTableOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a global table from an existing table. A global table creates a replication relationship between two or more DynamoDB tables with the same table name in the provided regions.  If you want to add a new replica table to a global table, each of the following conditions must be true:   The table must have the same primary key as all of the other replicas.   The table must have the same name as all of the other replicas.   The table must have DynamoDB Streams enabled, with the stream containing both the new and the old images of the item.   None of the replica tables in the global table can contain any data.    If global secondary indexes are specified, then the following conditions must also be met:     The global secondary indexes must have the same name.     The global secondary indexes must have the same hash key and sort key (if present).      Write capacity settings should be set consistently across your replica tables and secondary indexes. DynamoDB strongly recommends enabling auto scaling to manage the write capacity settings for all of your global tables replicas and indexes.   If you prefer to manage write capacity settings manually, you should provision equal replicated write capacity units to your replica tables. You should also provision equal replicated write capacity units to matching secondary indexes across your global table.  
     */
  def createGlobalTable(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.CreateGlobalTableOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.CreateGlobalTableOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a global table from an existing table. A global table creates a replication relationship between two or more DynamoDB tables with the same table name in the provided regions.  If you want to add a new replica table to a global table, each of the following conditions must be true:   The table must have the same primary key as all of the other replicas.   The table must have the same name as all of the other replicas.   The table must have DynamoDB Streams enabled, with the stream containing both the new and the old images of the item.   None of the replica tables in the global table can contain any data.    If global secondary indexes are specified, then the following conditions must also be met:     The global secondary indexes must have the same name.     The global secondary indexes must have the same hash key and sort key (if present).      Write capacity settings should be set consistently across your replica tables and secondary indexes. DynamoDB strongly recommends enabling auto scaling to manage the write capacity settings for all of your global tables replicas and indexes.   If you prefer to manage write capacity settings manually, you should provision equal replicated write capacity units to your replica tables. You should also provision equal replicated write capacity units to matching secondary indexes across your global table.  
     */
  def createGlobalTable(params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.CreateGlobalTableInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.CreateGlobalTableOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a global table from an existing table. A global table creates a replication relationship between two or more DynamoDB tables with the same table name in the provided regions.  If you want to add a new replica table to a global table, each of the following conditions must be true:   The table must have the same primary key as all of the other replicas.   The table must have the same name as all of the other replicas.   The table must have DynamoDB Streams enabled, with the stream containing both the new and the old images of the item.   None of the replica tables in the global table can contain any data.    If global secondary indexes are specified, then the following conditions must also be met:     The global secondary indexes must have the same name.     The global secondary indexes must have the same hash key and sort key (if present).      Write capacity settings should be set consistently across your replica tables and secondary indexes. DynamoDB strongly recommends enabling auto scaling to manage the write capacity settings for all of your global tables replicas and indexes.   If you prefer to manage write capacity settings manually, you should provision equal replicated write capacity units to your replica tables. You should also provision equal replicated write capacity units to matching secondary indexes across your global table.  
     */
  def createGlobalTable(
    params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.CreateGlobalTableInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.CreateGlobalTableOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.CreateGlobalTableOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The CreateTable operation adds a new table to your account. In an AWS account, table names must be unique within each region. That is, you can have two tables with same name if you create the tables in different regions.  CreateTable is an asynchronous operation. Upon receiving a CreateTable request, DynamoDB immediately returns a response with a TableStatus of CREATING. After the table is created, DynamoDB sets the TableStatus to ACTIVE. You can perform read and write operations only on an ACTIVE table.  You can optionally define secondary indexes on the new table, as part of the CreateTable operation. If you want to create multiple tables with secondary indexes on them, you must create the tables sequentially. Only one table with secondary indexes can be in the CREATING state at any given time. You can use the DescribeTable action to check the table status.
     */
  def createTable(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.CreateTableOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The CreateTable operation adds a new table to your account. In an AWS account, table names must be unique within each region. That is, you can have two tables with same name if you create the tables in different regions.  CreateTable is an asynchronous operation. Upon receiving a CreateTable request, DynamoDB immediately returns a response with a TableStatus of CREATING. After the table is created, DynamoDB sets the TableStatus to ACTIVE. You can perform read and write operations only on an ACTIVE table.  You can optionally define secondary indexes on the new table, as part of the CreateTable operation. If you want to create multiple tables with secondary indexes on them, you must create the tables sequentially. Only one table with secondary indexes can be in the CREATING state at any given time. You can use the DescribeTable action to check the table status.
     */
  def createTable(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.CreateTableOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.CreateTableOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The CreateTable operation adds a new table to your account. In an AWS account, table names must be unique within each region. That is, you can have two tables with same name if you create the tables in different regions.  CreateTable is an asynchronous operation. Upon receiving a CreateTable request, DynamoDB immediately returns a response with a TableStatus of CREATING. After the table is created, DynamoDB sets the TableStatus to ACTIVE. You can perform read and write operations only on an ACTIVE table.  You can optionally define secondary indexes on the new table, as part of the CreateTable operation. If you want to create multiple tables with secondary indexes on them, you must create the tables sequentially. Only one table with secondary indexes can be in the CREATING state at any given time. You can use the DescribeTable action to check the table status.
     */
  def createTable(params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.CreateTableInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.CreateTableOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The CreateTable operation adds a new table to your account. In an AWS account, table names must be unique within each region. That is, you can have two tables with same name if you create the tables in different regions.  CreateTable is an asynchronous operation. Upon receiving a CreateTable request, DynamoDB immediately returns a response with a TableStatus of CREATING. After the table is created, DynamoDB sets the TableStatus to ACTIVE. You can perform read and write operations only on an ACTIVE table.  You can optionally define secondary indexes on the new table, as part of the CreateTable operation. If you want to create multiple tables with secondary indexes on them, you must create the tables sequentially. Only one table with secondary indexes can be in the CREATING state at any given time. You can use the DescribeTable action to check the table status.
     */
  def createTable(
    params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.CreateTableInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.CreateTableOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.CreateTableOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an existing backup of a table. You can call DeleteBackup at a maximum rate of 10 times per second.
     */
  def deleteBackup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DeleteBackupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an existing backup of a table. You can call DeleteBackup at a maximum rate of 10 times per second.
     */
  def deleteBackup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DeleteBackupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DeleteBackupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an existing backup of a table. You can call DeleteBackup at a maximum rate of 10 times per second.
     */
  def deleteBackup(params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DeleteBackupInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DeleteBackupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an existing backup of a table. You can call DeleteBackup at a maximum rate of 10 times per second.
     */
  def deleteBackup(
    params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DeleteBackupInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DeleteBackupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DeleteBackupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a single item in a table by primary key. You can perform a conditional delete operation that deletes the item if it exists, or if it has an expected attribute value. In addition to deleting an item, you can also return the item's attribute values in the same operation, using the ReturnValues parameter. Unless you specify conditions, the DeleteItem is an idempotent operation; running it multiple times on the same item or attribute does not result in an error response. Conditional deletes are useful for deleting items only if specific conditions are met. If those conditions are met, DynamoDB performs the delete. Otherwise, the item is not deleted.
     */
  def deleteItem(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DeleteItemOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a single item in a table by primary key. You can perform a conditional delete operation that deletes the item if it exists, or if it has an expected attribute value. In addition to deleting an item, you can also return the item's attribute values in the same operation, using the ReturnValues parameter. Unless you specify conditions, the DeleteItem is an idempotent operation; running it multiple times on the same item or attribute does not result in an error response. Conditional deletes are useful for deleting items only if specific conditions are met. If those conditions are met, DynamoDB performs the delete. Otherwise, the item is not deleted.
     */
  def deleteItem(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DeleteItemOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DeleteItemOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a single item in a table by primary key. You can perform a conditional delete operation that deletes the item if it exists, or if it has an expected attribute value. In addition to deleting an item, you can also return the item's attribute values in the same operation, using the ReturnValues parameter. Unless you specify conditions, the DeleteItem is an idempotent operation; running it multiple times on the same item or attribute does not result in an error response. Conditional deletes are useful for deleting items only if specific conditions are met. If those conditions are met, DynamoDB performs the delete. Otherwise, the item is not deleted.
     */
  def deleteItem(params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DeleteItemInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DeleteItemOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a single item in a table by primary key. You can perform a conditional delete operation that deletes the item if it exists, or if it has an expected attribute value. In addition to deleting an item, you can also return the item's attribute values in the same operation, using the ReturnValues parameter. Unless you specify conditions, the DeleteItem is an idempotent operation; running it multiple times on the same item or attribute does not result in an error response. Conditional deletes are useful for deleting items only if specific conditions are met. If those conditions are met, DynamoDB performs the delete. Otherwise, the item is not deleted.
     */
  def deleteItem(
    params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DeleteItemInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DeleteItemOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DeleteItemOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The DeleteTable operation deletes a table and all of its items. After a DeleteTable request, the specified table is in the DELETING state until DynamoDB completes the deletion. If the table is in the ACTIVE state, you can delete it. If a table is in CREATING or UPDATING states, then DynamoDB returns a ResourceInUseException. If the specified table does not exist, DynamoDB returns a ResourceNotFoundException. If table is already in the DELETING state, no error is returned.   DynamoDB might continue to accept data read and write operations, such as GetItem and PutItem, on a table in the DELETING state until the table deletion is complete.  When you delete a table, any indexes on that table are also deleted. If you have DynamoDB Streams enabled on the table, then the corresponding stream on that table goes into the DISABLED state, and the stream is automatically deleted after 24 hours. Use the DescribeTable action to check the status of the table. 
     */
  def deleteTable(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DeleteTableOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The DeleteTable operation deletes a table and all of its items. After a DeleteTable request, the specified table is in the DELETING state until DynamoDB completes the deletion. If the table is in the ACTIVE state, you can delete it. If a table is in CREATING or UPDATING states, then DynamoDB returns a ResourceInUseException. If the specified table does not exist, DynamoDB returns a ResourceNotFoundException. If table is already in the DELETING state, no error is returned.   DynamoDB might continue to accept data read and write operations, such as GetItem and PutItem, on a table in the DELETING state until the table deletion is complete.  When you delete a table, any indexes on that table are also deleted. If you have DynamoDB Streams enabled on the table, then the corresponding stream on that table goes into the DISABLED state, and the stream is automatically deleted after 24 hours. Use the DescribeTable action to check the status of the table. 
     */
  def deleteTable(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DeleteTableOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DeleteTableOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The DeleteTable operation deletes a table and all of its items. After a DeleteTable request, the specified table is in the DELETING state until DynamoDB completes the deletion. If the table is in the ACTIVE state, you can delete it. If a table is in CREATING or UPDATING states, then DynamoDB returns a ResourceInUseException. If the specified table does not exist, DynamoDB returns a ResourceNotFoundException. If table is already in the DELETING state, no error is returned.   DynamoDB might continue to accept data read and write operations, such as GetItem and PutItem, on a table in the DELETING state until the table deletion is complete.  When you delete a table, any indexes on that table are also deleted. If you have DynamoDB Streams enabled on the table, then the corresponding stream on that table goes into the DISABLED state, and the stream is automatically deleted after 24 hours. Use the DescribeTable action to check the status of the table. 
     */
  def deleteTable(params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DeleteTableInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DeleteTableOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The DeleteTable operation deletes a table and all of its items. After a DeleteTable request, the specified table is in the DELETING state until DynamoDB completes the deletion. If the table is in the ACTIVE state, you can delete it. If a table is in CREATING or UPDATING states, then DynamoDB returns a ResourceInUseException. If the specified table does not exist, DynamoDB returns a ResourceNotFoundException. If table is already in the DELETING state, no error is returned.   DynamoDB might continue to accept data read and write operations, such as GetItem and PutItem, on a table in the DELETING state until the table deletion is complete.  When you delete a table, any indexes on that table are also deleted. If you have DynamoDB Streams enabled on the table, then the corresponding stream on that table goes into the DISABLED state, and the stream is automatically deleted after 24 hours. Use the DescribeTable action to check the status of the table. 
     */
  def deleteTable(
    params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DeleteTableInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DeleteTableOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DeleteTableOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes an existing backup of a table. You can call DescribeBackup at a maximum rate of 10 times per second.
     */
  def describeBackup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeBackupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes an existing backup of a table. You can call DescribeBackup at a maximum rate of 10 times per second.
     */
  def describeBackup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeBackupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeBackupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes an existing backup of a table. You can call DescribeBackup at a maximum rate of 10 times per second.
     */
  def describeBackup(params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeBackupInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeBackupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes an existing backup of a table. You can call DescribeBackup at a maximum rate of 10 times per second.
     */
  def describeBackup(
    params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeBackupInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeBackupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeBackupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Checks the status of continuous backups and point in time recovery on the specified table. Continuous backups are ENABLED on all tables at table creation. If point in time recovery is enabled, PointInTimeRecoveryStatus will be set to ENABLED.  Once continuous backups and point in time recovery are enabled, you can restore to any point in time within EarliestRestorableDateTime and LatestRestorableDateTime.   LatestRestorableDateTime is typically 5 minutes before the current time. You can restore your table to any point in time during the last 35 days.  You can call DescribeContinuousBackups at a maximum rate of 10 times per second.
     */
  def describeContinuousBackups(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeContinuousBackupsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Checks the status of continuous backups and point in time recovery on the specified table. Continuous backups are ENABLED on all tables at table creation. If point in time recovery is enabled, PointInTimeRecoveryStatus will be set to ENABLED.  Once continuous backups and point in time recovery are enabled, you can restore to any point in time within EarliestRestorableDateTime and LatestRestorableDateTime.   LatestRestorableDateTime is typically 5 minutes before the current time. You can restore your table to any point in time during the last 35 days.  You can call DescribeContinuousBackups at a maximum rate of 10 times per second.
     */
  def describeContinuousBackups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeContinuousBackupsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeContinuousBackupsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Checks the status of continuous backups and point in time recovery on the specified table. Continuous backups are ENABLED on all tables at table creation. If point in time recovery is enabled, PointInTimeRecoveryStatus will be set to ENABLED.  Once continuous backups and point in time recovery are enabled, you can restore to any point in time within EarliestRestorableDateTime and LatestRestorableDateTime.   LatestRestorableDateTime is typically 5 minutes before the current time. You can restore your table to any point in time during the last 35 days.  You can call DescribeContinuousBackups at a maximum rate of 10 times per second.
     */
  def describeContinuousBackups(params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeContinuousBackupsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeContinuousBackupsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Checks the status of continuous backups and point in time recovery on the specified table. Continuous backups are ENABLED on all tables at table creation. If point in time recovery is enabled, PointInTimeRecoveryStatus will be set to ENABLED.  Once continuous backups and point in time recovery are enabled, you can restore to any point in time within EarliestRestorableDateTime and LatestRestorableDateTime.   LatestRestorableDateTime is typically 5 minutes before the current time. You can restore your table to any point in time during the last 35 days.  You can call DescribeContinuousBackups at a maximum rate of 10 times per second.
     */
  def describeContinuousBackups(
    params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeContinuousBackupsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeContinuousBackupsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeContinuousBackupsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * 
     */
  def describeEndpoints(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeEndpointsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * 
     */
  def describeEndpoints(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeEndpointsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeEndpointsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * 
     */
  def describeEndpoints(params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeEndpointsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeEndpointsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * 
     */
  def describeEndpoints(
    params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeEndpointsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeEndpointsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeEndpointsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the specified global table.
     */
  def describeGlobalTable(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeGlobalTableOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the specified global table.
     */
  def describeGlobalTable(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeGlobalTableOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeGlobalTableOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the specified global table.
     */
  def describeGlobalTable(params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeGlobalTableInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeGlobalTableOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the specified global table.
     */
  def describeGlobalTable(
    params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeGlobalTableInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeGlobalTableOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeGlobalTableOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes region specific settings for a global table.
     */
  def describeGlobalTableSettings(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeGlobalTableSettingsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes region specific settings for a global table.
     */
  def describeGlobalTableSettings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeGlobalTableSettingsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeGlobalTableSettingsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes region specific settings for a global table.
     */
  def describeGlobalTableSettings(params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeGlobalTableSettingsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeGlobalTableSettingsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes region specific settings for a global table.
     */
  def describeGlobalTableSettings(
    params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeGlobalTableSettingsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeGlobalTableSettingsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeGlobalTableSettingsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the current provisioned-capacity limits for your AWS account in a region, both for the region as a whole and for any one DynamoDB table that you create there. When you establish an AWS account, the account has initial limits on the maximum read capacity units and write capacity units that you can provision across all of your DynamoDB tables in a given region. Also, there are per-table limits that apply when you create a table there. For more information, see Limits page in the Amazon DynamoDB Developer Guide. Although you can increase these limits by filing a case at AWS Support Center, obtaining the increase is not instantaneous. The DescribeLimits action lets you write code to compare the capacity you are currently using to those limits imposed by your account so that you have enough time to apply for an increase before you hit a limit. For example, you could use one of the AWS SDKs to do the following:   Call DescribeLimits for a particular region to obtain your current account limits on provisioned capacity there.   Create a variable to hold the aggregate read capacity units provisioned for all your tables in that region, and one to hold the aggregate write capacity units. Zero them both.   Call ListTables to obtain a list of all your DynamoDB tables.   For each table name listed by ListTables, do the following:   Call DescribeTable with the table name.   Use the data returned by DescribeTable to add the read capacity units and write capacity units provisioned for the table itself to your variables.   If the table has one or more global secondary indexes (GSIs), loop over these GSIs and add their provisioned capacity values to your variables as well.     Report the account limits for that region returned by DescribeLimits, along with the total current provisioned capacity levels you have calculated.   This will let you see whether you are getting close to your account-level limits. The per-table limits apply only when you are creating a new table. They restrict the sum of the provisioned capacity of the new table itself and all its global secondary indexes. For existing tables and their GSIs, DynamoDB will not let you increase provisioned capacity extremely rapidly, but the only upper limit that applies is that the aggregate provisioned capacity over all your tables and GSIs cannot exceed either of the per-account limits.   DescribeLimits should only be called periodically. You can expect throttling errors if you call it more than once in a minute.  The DescribeLimits Request element has no content.
     */
  def describeLimits(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeLimitsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the current provisioned-capacity limits for your AWS account in a region, both for the region as a whole and for any one DynamoDB table that you create there. When you establish an AWS account, the account has initial limits on the maximum read capacity units and write capacity units that you can provision across all of your DynamoDB tables in a given region. Also, there are per-table limits that apply when you create a table there. For more information, see Limits page in the Amazon DynamoDB Developer Guide. Although you can increase these limits by filing a case at AWS Support Center, obtaining the increase is not instantaneous. The DescribeLimits action lets you write code to compare the capacity you are currently using to those limits imposed by your account so that you have enough time to apply for an increase before you hit a limit. For example, you could use one of the AWS SDKs to do the following:   Call DescribeLimits for a particular region to obtain your current account limits on provisioned capacity there.   Create a variable to hold the aggregate read capacity units provisioned for all your tables in that region, and one to hold the aggregate write capacity units. Zero them both.   Call ListTables to obtain a list of all your DynamoDB tables.   For each table name listed by ListTables, do the following:   Call DescribeTable with the table name.   Use the data returned by DescribeTable to add the read capacity units and write capacity units provisioned for the table itself to your variables.   If the table has one or more global secondary indexes (GSIs), loop over these GSIs and add their provisioned capacity values to your variables as well.     Report the account limits for that region returned by DescribeLimits, along with the total current provisioned capacity levels you have calculated.   This will let you see whether you are getting close to your account-level limits. The per-table limits apply only when you are creating a new table. They restrict the sum of the provisioned capacity of the new table itself and all its global secondary indexes. For existing tables and their GSIs, DynamoDB will not let you increase provisioned capacity extremely rapidly, but the only upper limit that applies is that the aggregate provisioned capacity over all your tables and GSIs cannot exceed either of the per-account limits.   DescribeLimits should only be called periodically. You can expect throttling errors if you call it more than once in a minute.  The DescribeLimits Request element has no content.
     */
  def describeLimits(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeLimitsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeLimitsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the current provisioned-capacity limits for your AWS account in a region, both for the region as a whole and for any one DynamoDB table that you create there. When you establish an AWS account, the account has initial limits on the maximum read capacity units and write capacity units that you can provision across all of your DynamoDB tables in a given region. Also, there are per-table limits that apply when you create a table there. For more information, see Limits page in the Amazon DynamoDB Developer Guide. Although you can increase these limits by filing a case at AWS Support Center, obtaining the increase is not instantaneous. The DescribeLimits action lets you write code to compare the capacity you are currently using to those limits imposed by your account so that you have enough time to apply for an increase before you hit a limit. For example, you could use one of the AWS SDKs to do the following:   Call DescribeLimits for a particular region to obtain your current account limits on provisioned capacity there.   Create a variable to hold the aggregate read capacity units provisioned for all your tables in that region, and one to hold the aggregate write capacity units. Zero them both.   Call ListTables to obtain a list of all your DynamoDB tables.   For each table name listed by ListTables, do the following:   Call DescribeTable with the table name.   Use the data returned by DescribeTable to add the read capacity units and write capacity units provisioned for the table itself to your variables.   If the table has one or more global secondary indexes (GSIs), loop over these GSIs and add their provisioned capacity values to your variables as well.     Report the account limits for that region returned by DescribeLimits, along with the total current provisioned capacity levels you have calculated.   This will let you see whether you are getting close to your account-level limits. The per-table limits apply only when you are creating a new table. They restrict the sum of the provisioned capacity of the new table itself and all its global secondary indexes. For existing tables and their GSIs, DynamoDB will not let you increase provisioned capacity extremely rapidly, but the only upper limit that applies is that the aggregate provisioned capacity over all your tables and GSIs cannot exceed either of the per-account limits.   DescribeLimits should only be called periodically. You can expect throttling errors if you call it more than once in a minute.  The DescribeLimits Request element has no content.
     */
  def describeLimits(params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeLimitsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeLimitsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the current provisioned-capacity limits for your AWS account in a region, both for the region as a whole and for any one DynamoDB table that you create there. When you establish an AWS account, the account has initial limits on the maximum read capacity units and write capacity units that you can provision across all of your DynamoDB tables in a given region. Also, there are per-table limits that apply when you create a table there. For more information, see Limits page in the Amazon DynamoDB Developer Guide. Although you can increase these limits by filing a case at AWS Support Center, obtaining the increase is not instantaneous. The DescribeLimits action lets you write code to compare the capacity you are currently using to those limits imposed by your account so that you have enough time to apply for an increase before you hit a limit. For example, you could use one of the AWS SDKs to do the following:   Call DescribeLimits for a particular region to obtain your current account limits on provisioned capacity there.   Create a variable to hold the aggregate read capacity units provisioned for all your tables in that region, and one to hold the aggregate write capacity units. Zero them both.   Call ListTables to obtain a list of all your DynamoDB tables.   For each table name listed by ListTables, do the following:   Call DescribeTable with the table name.   Use the data returned by DescribeTable to add the read capacity units and write capacity units provisioned for the table itself to your variables.   If the table has one or more global secondary indexes (GSIs), loop over these GSIs and add their provisioned capacity values to your variables as well.     Report the account limits for that region returned by DescribeLimits, along with the total current provisioned capacity levels you have calculated.   This will let you see whether you are getting close to your account-level limits. The per-table limits apply only when you are creating a new table. They restrict the sum of the provisioned capacity of the new table itself and all its global secondary indexes. For existing tables and their GSIs, DynamoDB will not let you increase provisioned capacity extremely rapidly, but the only upper limit that applies is that the aggregate provisioned capacity over all your tables and GSIs cannot exceed either of the per-account limits.   DescribeLimits should only be called periodically. You can expect throttling errors if you call it more than once in a minute.  The DescribeLimits Request element has no content.
     */
  def describeLimits(
    params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeLimitsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeLimitsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeLimitsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the table, including the current status of the table, when it was created, the primary key schema, and any indexes on the table.  If you issue a DescribeTable request immediately after a CreateTable request, DynamoDB might return a ResourceNotFoundException. This is because DescribeTable uses an eventually consistent query, and the metadata for your table might not be available at that moment. Wait for a few seconds, and then try the DescribeTable request again. 
     */
  def describeTable(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeTableOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the table, including the current status of the table, when it was created, the primary key schema, and any indexes on the table.  If you issue a DescribeTable request immediately after a CreateTable request, DynamoDB might return a ResourceNotFoundException. This is because DescribeTable uses an eventually consistent query, and the metadata for your table might not be available at that moment. Wait for a few seconds, and then try the DescribeTable request again. 
     */
  def describeTable(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeTableOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeTableOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the table, including the current status of the table, when it was created, the primary key schema, and any indexes on the table.  If you issue a DescribeTable request immediately after a CreateTable request, DynamoDB might return a ResourceNotFoundException. This is because DescribeTable uses an eventually consistent query, and the metadata for your table might not be available at that moment. Wait for a few seconds, and then try the DescribeTable request again. 
     */
  def describeTable(params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeTableInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeTableOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the table, including the current status of the table, when it was created, the primary key schema, and any indexes on the table.  If you issue a DescribeTable request immediately after a CreateTable request, DynamoDB might return a ResourceNotFoundException. This is because DescribeTable uses an eventually consistent query, and the metadata for your table might not be available at that moment. Wait for a few seconds, and then try the DescribeTable request again. 
     */
  def describeTable(
    params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeTableInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeTableOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeTableOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gives a description of the Time to Live (TTL) status on the specified table. 
     */
  def describeTimeToLive(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeTimeToLiveOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gives a description of the Time to Live (TTL) status on the specified table. 
     */
  def describeTimeToLive(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeTimeToLiveOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeTimeToLiveOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gives a description of the Time to Live (TTL) status on the specified table. 
     */
  def describeTimeToLive(params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeTimeToLiveInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeTimeToLiveOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gives a description of the Time to Live (TTL) status on the specified table. 
     */
  def describeTimeToLive(
    params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeTimeToLiveInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeTimeToLiveOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeTimeToLiveOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The GetItem operation returns a set of attributes for the item with the given primary key. If there is no matching item, GetItem does not return any data and there will be no Item element in the response.  GetItem provides an eventually consistent read by default. If your application requires a strongly consistent read, set ConsistentRead to true. Although a strongly consistent read might take more time than an eventually consistent read, it always returns the last updated value.
     */
  def getItem(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.GetItemOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The GetItem operation returns a set of attributes for the item with the given primary key. If there is no matching item, GetItem does not return any data and there will be no Item element in the response.  GetItem provides an eventually consistent read by default. If your application requires a strongly consistent read, set ConsistentRead to true. Although a strongly consistent read might take more time than an eventually consistent read, it always returns the last updated value.
     */
  def getItem(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.GetItemOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.GetItemOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The GetItem operation returns a set of attributes for the item with the given primary key. If there is no matching item, GetItem does not return any data and there will be no Item element in the response.  GetItem provides an eventually consistent read by default. If your application requires a strongly consistent read, set ConsistentRead to true. Although a strongly consistent read might take more time than an eventually consistent read, it always returns the last updated value.
     */
  def getItem(params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.GetItemInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.GetItemOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The GetItem operation returns a set of attributes for the item with the given primary key. If there is no matching item, GetItem does not return any data and there will be no Item element in the response.  GetItem provides an eventually consistent read by default. If your application requires a strongly consistent read, set ConsistentRead to true. Although a strongly consistent read might take more time than an eventually consistent read, it always returns the last updated value.
     */
  def getItem(
    params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.GetItemInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.GetItemOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.GetItemOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List backups associated with an AWS account. To list backups for a given table, specify TableName. ListBackups returns a paginated list of results with at most 1MB worth of items in a page. You can also specify a limit for the maximum number of entries to be returned in a page.  In the request, start time is inclusive but end time is exclusive. Note that these limits are for the time at which the original backup was requested. You can call ListBackups a maximum of 5 times per second.
     */
  def listBackups(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ListBackupsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List backups associated with an AWS account. To list backups for a given table, specify TableName. ListBackups returns a paginated list of results with at most 1MB worth of items in a page. You can also specify a limit for the maximum number of entries to be returned in a page.  In the request, start time is inclusive but end time is exclusive. Note that these limits are for the time at which the original backup was requested. You can call ListBackups a maximum of 5 times per second.
     */
  def listBackups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ListBackupsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ListBackupsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List backups associated with an AWS account. To list backups for a given table, specify TableName. ListBackups returns a paginated list of results with at most 1MB worth of items in a page. You can also specify a limit for the maximum number of entries to be returned in a page.  In the request, start time is inclusive but end time is exclusive. Note that these limits are for the time at which the original backup was requested. You can call ListBackups a maximum of 5 times per second.
     */
  def listBackups(params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ListBackupsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ListBackupsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List backups associated with an AWS account. To list backups for a given table, specify TableName. ListBackups returns a paginated list of results with at most 1MB worth of items in a page. You can also specify a limit for the maximum number of entries to be returned in a page.  In the request, start time is inclusive but end time is exclusive. Note that these limits are for the time at which the original backup was requested. You can call ListBackups a maximum of 5 times per second.
     */
  def listBackups(
    params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ListBackupsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ListBackupsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ListBackupsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all global tables that have a replica in the specified region.
     */
  def listGlobalTables(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ListGlobalTablesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all global tables that have a replica in the specified region.
     */
  def listGlobalTables(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ListGlobalTablesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ListGlobalTablesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all global tables that have a replica in the specified region.
     */
  def listGlobalTables(params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ListGlobalTablesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ListGlobalTablesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all global tables that have a replica in the specified region.
     */
  def listGlobalTables(
    params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ListGlobalTablesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ListGlobalTablesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ListGlobalTablesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns an array of table names associated with the current account and endpoint. The output from ListTables is paginated, with each page returning a maximum of 100 table names.
     */
  def listTables(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ListTablesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns an array of table names associated with the current account and endpoint. The output from ListTables is paginated, with each page returning a maximum of 100 table names.
     */
  def listTables(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ListTablesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ListTablesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns an array of table names associated with the current account and endpoint. The output from ListTables is paginated, with each page returning a maximum of 100 table names.
     */
  def listTables(params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ListTablesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ListTablesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns an array of table names associated with the current account and endpoint. The output from ListTables is paginated, with each page returning a maximum of 100 table names.
     */
  def listTables(
    params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ListTablesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ListTablesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ListTablesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List all tags on an Amazon DynamoDB resource. You can call ListTagsOfResource up to 10 times per second, per account. For an overview on tagging DynamoDB resources, see Tagging for DynamoDB in the Amazon DynamoDB Developer Guide.
     */
  def listTagsOfResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ListTagsOfResourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List all tags on an Amazon DynamoDB resource. You can call ListTagsOfResource up to 10 times per second, per account. For an overview on tagging DynamoDB resources, see Tagging for DynamoDB in the Amazon DynamoDB Developer Guide.
     */
  def listTagsOfResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ListTagsOfResourceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ListTagsOfResourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List all tags on an Amazon DynamoDB resource. You can call ListTagsOfResource up to 10 times per second, per account. For an overview on tagging DynamoDB resources, see Tagging for DynamoDB in the Amazon DynamoDB Developer Guide.
     */
  def listTagsOfResource(params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ListTagsOfResourceInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ListTagsOfResourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List all tags on an Amazon DynamoDB resource. You can call ListTagsOfResource up to 10 times per second, per account. For an overview on tagging DynamoDB resources, see Tagging for DynamoDB in the Amazon DynamoDB Developer Guide.
     */
  def listTagsOfResource(
    params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ListTagsOfResourceInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ListTagsOfResourceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ListTagsOfResourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new item, or replaces an old item with a new item. If an item that has the same primary key as the new item already exists in the specified table, the new item completely replaces the existing item. You can perform a conditional put operation (add a new item if one with the specified primary key doesn't exist), or replace an existing item if it has certain attribute values. You can return the item's attribute values in the same operation, using the ReturnValues parameter.  This topic provides general information about the PutItem API. For information on how to call the PutItem API using the AWS SDK in specific languages, see the following:     PutItem in the AWS Command Line Interface       PutItem in the AWS SDK for .NET       PutItem in the AWS SDK for C++       PutItem in the AWS SDK for Go       PutItem in the AWS SDK for Java       PutItem in the AWS SDK for JavaScript       PutItem in the AWS SDK for PHP V3       PutItem in the AWS SDK for Python       PutItem in the AWS SDK for Ruby V2      When you add an item, the primary key attribute(s) are the only required attributes. Attribute values cannot be null. String and Binary type attributes must have lengths greater than zero. Set type attributes cannot be empty. Requests with empty values will be rejected with a ValidationException exception.  To prevent a new item from replacing an existing item, use a conditional expression that contains the attribute_not_exists function with the name of the attribute being used as the partition key for the table. Since every record must contain that attribute, the attribute_not_exists function will only succeed if no matching item exists.  For more information about PutItem, see Working with Items in the Amazon DynamoDB Developer Guide.
     */
  def putItem(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.PutItemOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new item, or replaces an old item with a new item. If an item that has the same primary key as the new item already exists in the specified table, the new item completely replaces the existing item. You can perform a conditional put operation (add a new item if one with the specified primary key doesn't exist), or replace an existing item if it has certain attribute values. You can return the item's attribute values in the same operation, using the ReturnValues parameter.  This topic provides general information about the PutItem API. For information on how to call the PutItem API using the AWS SDK in specific languages, see the following:     PutItem in the AWS Command Line Interface       PutItem in the AWS SDK for .NET       PutItem in the AWS SDK for C++       PutItem in the AWS SDK for Go       PutItem in the AWS SDK for Java       PutItem in the AWS SDK for JavaScript       PutItem in the AWS SDK for PHP V3       PutItem in the AWS SDK for Python       PutItem in the AWS SDK for Ruby V2      When you add an item, the primary key attribute(s) are the only required attributes. Attribute values cannot be null. String and Binary type attributes must have lengths greater than zero. Set type attributes cannot be empty. Requests with empty values will be rejected with a ValidationException exception.  To prevent a new item from replacing an existing item, use a conditional expression that contains the attribute_not_exists function with the name of the attribute being used as the partition key for the table. Since every record must contain that attribute, the attribute_not_exists function will only succeed if no matching item exists.  For more information about PutItem, see Working with Items in the Amazon DynamoDB Developer Guide.
     */
  def putItem(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.PutItemOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.PutItemOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new item, or replaces an old item with a new item. If an item that has the same primary key as the new item already exists in the specified table, the new item completely replaces the existing item. You can perform a conditional put operation (add a new item if one with the specified primary key doesn't exist), or replace an existing item if it has certain attribute values. You can return the item's attribute values in the same operation, using the ReturnValues parameter.  This topic provides general information about the PutItem API. For information on how to call the PutItem API using the AWS SDK in specific languages, see the following:     PutItem in the AWS Command Line Interface       PutItem in the AWS SDK for .NET       PutItem in the AWS SDK for C++       PutItem in the AWS SDK for Go       PutItem in the AWS SDK for Java       PutItem in the AWS SDK for JavaScript       PutItem in the AWS SDK for PHP V3       PutItem in the AWS SDK for Python       PutItem in the AWS SDK for Ruby V2      When you add an item, the primary key attribute(s) are the only required attributes. Attribute values cannot be null. String and Binary type attributes must have lengths greater than zero. Set type attributes cannot be empty. Requests with empty values will be rejected with a ValidationException exception.  To prevent a new item from replacing an existing item, use a conditional expression that contains the attribute_not_exists function with the name of the attribute being used as the partition key for the table. Since every record must contain that attribute, the attribute_not_exists function will only succeed if no matching item exists.  For more information about PutItem, see Working with Items in the Amazon DynamoDB Developer Guide.
     */
  def putItem(params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.PutItemInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.PutItemOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new item, or replaces an old item with a new item. If an item that has the same primary key as the new item already exists in the specified table, the new item completely replaces the existing item. You can perform a conditional put operation (add a new item if one with the specified primary key doesn't exist), or replace an existing item if it has certain attribute values. You can return the item's attribute values in the same operation, using the ReturnValues parameter.  This topic provides general information about the PutItem API. For information on how to call the PutItem API using the AWS SDK in specific languages, see the following:     PutItem in the AWS Command Line Interface       PutItem in the AWS SDK for .NET       PutItem in the AWS SDK for C++       PutItem in the AWS SDK for Go       PutItem in the AWS SDK for Java       PutItem in the AWS SDK for JavaScript       PutItem in the AWS SDK for PHP V3       PutItem in the AWS SDK for Python       PutItem in the AWS SDK for Ruby V2      When you add an item, the primary key attribute(s) are the only required attributes. Attribute values cannot be null. String and Binary type attributes must have lengths greater than zero. Set type attributes cannot be empty. Requests with empty values will be rejected with a ValidationException exception.  To prevent a new item from replacing an existing item, use a conditional expression that contains the attribute_not_exists function with the name of the attribute being used as the partition key for the table. Since every record must contain that attribute, the attribute_not_exists function will only succeed if no matching item exists.  For more information about PutItem, see Working with Items in the Amazon DynamoDB Developer Guide.
     */
  def putItem(
    params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.PutItemInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.PutItemOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.PutItemOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The Query operation finds items based on primary key values. You can query any table or secondary index that has a composite primary key (a partition key and a sort key).  Use the KeyConditionExpression parameter to provide a specific value for the partition key. The Query operation will return all of the items from the table or index with that partition key value. You can optionally narrow the scope of the Query operation by specifying a sort key value and a comparison operator in KeyConditionExpression. To further refine the Query results, you can optionally provide a FilterExpression. A FilterExpression determines which items within the results should be returned to you. All of the other results are discarded.   A Query operation always returns a result set. If no matching items are found, the result set will be empty. Queries that do not return results consume the minimum number of read capacity units for that type of read operation.    DynamoDB calculates the number of read capacity units consumed based on item size, not on the amount of data that is returned to an application. The number of capacity units consumed will be the same whether you request all of the attributes (the default behavior) or just some of them (using a projection expression). The number will also be the same whether or not you use a FilterExpression.    Query results are always sorted by the sort key value. If the data type of the sort key is Number, the results are returned in numeric order; otherwise, the results are returned in order of UTF-8 bytes. By default, the sort order is ascending. To reverse the order, set the ScanIndexForward parameter to false.   A single Query operation will read up to the maximum number of items set (if using the Limit parameter) or a maximum of 1 MB of data and then apply any filtering to the results using FilterExpression. If LastEvaluatedKey is present in the response, you will need to paginate the result set. For more information, see Paginating the Results in the Amazon DynamoDB Developer Guide.   FilterExpression is applied after a Query finishes, but before the results are returned. A FilterExpression cannot contain partition key or sort key attributes. You need to specify those attributes in the KeyConditionExpression.    A Query operation can return an empty result set and a LastEvaluatedKey if all the items read for the page of results are filtered out.   You can query a table, a local secondary index, or a global secondary index. For a query on a table or on a local secondary index, you can set the ConsistentRead parameter to true and obtain a strongly consistent result. Global secondary indexes support eventually consistent reads only, so do not specify ConsistentRead when querying a global secondary index.
     */
  def query(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.QueryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The Query operation finds items based on primary key values. You can query any table or secondary index that has a composite primary key (a partition key and a sort key).  Use the KeyConditionExpression parameter to provide a specific value for the partition key. The Query operation will return all of the items from the table or index with that partition key value. You can optionally narrow the scope of the Query operation by specifying a sort key value and a comparison operator in KeyConditionExpression. To further refine the Query results, you can optionally provide a FilterExpression. A FilterExpression determines which items within the results should be returned to you. All of the other results are discarded.   A Query operation always returns a result set. If no matching items are found, the result set will be empty. Queries that do not return results consume the minimum number of read capacity units for that type of read operation.    DynamoDB calculates the number of read capacity units consumed based on item size, not on the amount of data that is returned to an application. The number of capacity units consumed will be the same whether you request all of the attributes (the default behavior) or just some of them (using a projection expression). The number will also be the same whether or not you use a FilterExpression.    Query results are always sorted by the sort key value. If the data type of the sort key is Number, the results are returned in numeric order; otherwise, the results are returned in order of UTF-8 bytes. By default, the sort order is ascending. To reverse the order, set the ScanIndexForward parameter to false.   A single Query operation will read up to the maximum number of items set (if using the Limit parameter) or a maximum of 1 MB of data and then apply any filtering to the results using FilterExpression. If LastEvaluatedKey is present in the response, you will need to paginate the result set. For more information, see Paginating the Results in the Amazon DynamoDB Developer Guide.   FilterExpression is applied after a Query finishes, but before the results are returned. A FilterExpression cannot contain partition key or sort key attributes. You need to specify those attributes in the KeyConditionExpression.    A Query operation can return an empty result set and a LastEvaluatedKey if all the items read for the page of results are filtered out.   You can query a table, a local secondary index, or a global secondary index. For a query on a table or on a local secondary index, you can set the ConsistentRead parameter to true and obtain a strongly consistent result. Global secondary indexes support eventually consistent reads only, so do not specify ConsistentRead when querying a global secondary index.
     */
  def query(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.QueryOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.QueryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The Query operation finds items based on primary key values. You can query any table or secondary index that has a composite primary key (a partition key and a sort key).  Use the KeyConditionExpression parameter to provide a specific value for the partition key. The Query operation will return all of the items from the table or index with that partition key value. You can optionally narrow the scope of the Query operation by specifying a sort key value and a comparison operator in KeyConditionExpression. To further refine the Query results, you can optionally provide a FilterExpression. A FilterExpression determines which items within the results should be returned to you. All of the other results are discarded.   A Query operation always returns a result set. If no matching items are found, the result set will be empty. Queries that do not return results consume the minimum number of read capacity units for that type of read operation.    DynamoDB calculates the number of read capacity units consumed based on item size, not on the amount of data that is returned to an application. The number of capacity units consumed will be the same whether you request all of the attributes (the default behavior) or just some of them (using a projection expression). The number will also be the same whether or not you use a FilterExpression.    Query results are always sorted by the sort key value. If the data type of the sort key is Number, the results are returned in numeric order; otherwise, the results are returned in order of UTF-8 bytes. By default, the sort order is ascending. To reverse the order, set the ScanIndexForward parameter to false.   A single Query operation will read up to the maximum number of items set (if using the Limit parameter) or a maximum of 1 MB of data and then apply any filtering to the results using FilterExpression. If LastEvaluatedKey is present in the response, you will need to paginate the result set. For more information, see Paginating the Results in the Amazon DynamoDB Developer Guide.   FilterExpression is applied after a Query finishes, but before the results are returned. A FilterExpression cannot contain partition key or sort key attributes. You need to specify those attributes in the KeyConditionExpression.    A Query operation can return an empty result set and a LastEvaluatedKey if all the items read for the page of results are filtered out.   You can query a table, a local secondary index, or a global secondary index. For a query on a table or on a local secondary index, you can set the ConsistentRead parameter to true and obtain a strongly consistent result. Global secondary indexes support eventually consistent reads only, so do not specify ConsistentRead when querying a global secondary index.
     */
  def query(params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.QueryInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.QueryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The Query operation finds items based on primary key values. You can query any table or secondary index that has a composite primary key (a partition key and a sort key).  Use the KeyConditionExpression parameter to provide a specific value for the partition key. The Query operation will return all of the items from the table or index with that partition key value. You can optionally narrow the scope of the Query operation by specifying a sort key value and a comparison operator in KeyConditionExpression. To further refine the Query results, you can optionally provide a FilterExpression. A FilterExpression determines which items within the results should be returned to you. All of the other results are discarded.   A Query operation always returns a result set. If no matching items are found, the result set will be empty. Queries that do not return results consume the minimum number of read capacity units for that type of read operation.    DynamoDB calculates the number of read capacity units consumed based on item size, not on the amount of data that is returned to an application. The number of capacity units consumed will be the same whether you request all of the attributes (the default behavior) or just some of them (using a projection expression). The number will also be the same whether or not you use a FilterExpression.    Query results are always sorted by the sort key value. If the data type of the sort key is Number, the results are returned in numeric order; otherwise, the results are returned in order of UTF-8 bytes. By default, the sort order is ascending. To reverse the order, set the ScanIndexForward parameter to false.   A single Query operation will read up to the maximum number of items set (if using the Limit parameter) or a maximum of 1 MB of data and then apply any filtering to the results using FilterExpression. If LastEvaluatedKey is present in the response, you will need to paginate the result set. For more information, see Paginating the Results in the Amazon DynamoDB Developer Guide.   FilterExpression is applied after a Query finishes, but before the results are returned. A FilterExpression cannot contain partition key or sort key attributes. You need to specify those attributes in the KeyConditionExpression.    A Query operation can return an empty result set and a LastEvaluatedKey if all the items read for the page of results are filtered out.   You can query a table, a local secondary index, or a global secondary index. For a query on a table or on a local secondary index, you can set the ConsistentRead parameter to true and obtain a strongly consistent result. Global secondary indexes support eventually consistent reads only, so do not specify ConsistentRead when querying a global secondary index.
     */
  def query(
    params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.QueryInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.QueryOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.QueryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new table from an existing backup. Any number of users can execute up to 4 concurrent restores (any type of restore) in a given account.  You can call RestoreTableFromBackup at a maximum rate of 10 times per second. You must manually set up the following on the restored table:   Auto scaling policies   IAM policies   Cloudwatch metrics and alarms   Tags   Stream settings   Time to Live (TTL) settings  
     */
  def restoreTableFromBackup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.RestoreTableFromBackupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new table from an existing backup. Any number of users can execute up to 4 concurrent restores (any type of restore) in a given account.  You can call RestoreTableFromBackup at a maximum rate of 10 times per second. You must manually set up the following on the restored table:   Auto scaling policies   IAM policies   Cloudwatch metrics and alarms   Tags   Stream settings   Time to Live (TTL) settings  
     */
  def restoreTableFromBackup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.RestoreTableFromBackupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.RestoreTableFromBackupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new table from an existing backup. Any number of users can execute up to 4 concurrent restores (any type of restore) in a given account.  You can call RestoreTableFromBackup at a maximum rate of 10 times per second. You must manually set up the following on the restored table:   Auto scaling policies   IAM policies   Cloudwatch metrics and alarms   Tags   Stream settings   Time to Live (TTL) settings  
     */
  def restoreTableFromBackup(params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.RestoreTableFromBackupInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.RestoreTableFromBackupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new table from an existing backup. Any number of users can execute up to 4 concurrent restores (any type of restore) in a given account.  You can call RestoreTableFromBackup at a maximum rate of 10 times per second. You must manually set up the following on the restored table:   Auto scaling policies   IAM policies   Cloudwatch metrics and alarms   Tags   Stream settings   Time to Live (TTL) settings  
     */
  def restoreTableFromBackup(
    params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.RestoreTableFromBackupInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.RestoreTableFromBackupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.RestoreTableFromBackupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Restores the specified table to the specified point in time within EarliestRestorableDateTime and LatestRestorableDateTime. You can restore your table to any point in time during the last 35 days. Any number of users can execute up to 4 concurrent restores (any type of restore) in a given account.   When you restore using point in time recovery, DynamoDB restores your table data to the state based on the selected date and time (day:hour:minute:second) to a new table.   Along with data, the following are also included on the new restored table using point in time recovery:    Global secondary indexes (GSIs)   Local secondary indexes (LSIs)   Provisioned read and write capacity   Encryption settings   All these settings come from the current settings of the source table at the time of restore.     You must manually set up the following on the restored table:   Auto scaling policies   IAM policies   Cloudwatch metrics and alarms   Tags   Stream settings   Time to Live (TTL) settings   Point in time recovery settings  
     */
  def restoreTableToPointInTime(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.RestoreTableToPointInTimeOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Restores the specified table to the specified point in time within EarliestRestorableDateTime and LatestRestorableDateTime. You can restore your table to any point in time during the last 35 days. Any number of users can execute up to 4 concurrent restores (any type of restore) in a given account.   When you restore using point in time recovery, DynamoDB restores your table data to the state based on the selected date and time (day:hour:minute:second) to a new table.   Along with data, the following are also included on the new restored table using point in time recovery:    Global secondary indexes (GSIs)   Local secondary indexes (LSIs)   Provisioned read and write capacity   Encryption settings   All these settings come from the current settings of the source table at the time of restore.     You must manually set up the following on the restored table:   Auto scaling policies   IAM policies   Cloudwatch metrics and alarms   Tags   Stream settings   Time to Live (TTL) settings   Point in time recovery settings  
     */
  def restoreTableToPointInTime(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.RestoreTableToPointInTimeOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.RestoreTableToPointInTimeOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Restores the specified table to the specified point in time within EarliestRestorableDateTime and LatestRestorableDateTime. You can restore your table to any point in time during the last 35 days. Any number of users can execute up to 4 concurrent restores (any type of restore) in a given account.   When you restore using point in time recovery, DynamoDB restores your table data to the state based on the selected date and time (day:hour:minute:second) to a new table.   Along with data, the following are also included on the new restored table using point in time recovery:    Global secondary indexes (GSIs)   Local secondary indexes (LSIs)   Provisioned read and write capacity   Encryption settings   All these settings come from the current settings of the source table at the time of restore.     You must manually set up the following on the restored table:   Auto scaling policies   IAM policies   Cloudwatch metrics and alarms   Tags   Stream settings   Time to Live (TTL) settings   Point in time recovery settings  
     */
  def restoreTableToPointInTime(params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.RestoreTableToPointInTimeInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.RestoreTableToPointInTimeOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Restores the specified table to the specified point in time within EarliestRestorableDateTime and LatestRestorableDateTime. You can restore your table to any point in time during the last 35 days. Any number of users can execute up to 4 concurrent restores (any type of restore) in a given account.   When you restore using point in time recovery, DynamoDB restores your table data to the state based on the selected date and time (day:hour:minute:second) to a new table.   Along with data, the following are also included on the new restored table using point in time recovery:    Global secondary indexes (GSIs)   Local secondary indexes (LSIs)   Provisioned read and write capacity   Encryption settings   All these settings come from the current settings of the source table at the time of restore.     You must manually set up the following on the restored table:   Auto scaling policies   IAM policies   Cloudwatch metrics and alarms   Tags   Stream settings   Time to Live (TTL) settings   Point in time recovery settings  
     */
  def restoreTableToPointInTime(
    params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.RestoreTableToPointInTimeInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.RestoreTableToPointInTimeOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.RestoreTableToPointInTimeOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The Scan operation returns one or more items and item attributes by accessing every item in a table or a secondary index. To have DynamoDB return fewer items, you can provide a FilterExpression operation. If the total number of scanned items exceeds the maximum data set size limit of 1 MB, the scan stops and results are returned to the user as a LastEvaluatedKey value to continue the scan in a subsequent operation. The results also include the number of items exceeding the limit. A scan can result in no table data meeting the filter criteria.  A single Scan operation will read up to the maximum number of items set (if using the Limit parameter) or a maximum of 1 MB of data and then apply any filtering to the results using FilterExpression. If LastEvaluatedKey is present in the response, you will need to paginate the result set. For more information, see Paginating the Results in the Amazon DynamoDB Developer Guide.   Scan operations proceed sequentially; however, for faster performance on a large table or secondary index, applications can request a parallel Scan operation by providing the Segment and TotalSegments parameters. For more information, see Parallel Scan in the Amazon DynamoDB Developer Guide.  Scan uses eventually consistent reads when accessing the data in a table; therefore, the result set might not include the changes to data in the table immediately before the operation began. If you need a consistent copy of the data, as of the time that the Scan begins, you can set the ConsistentRead parameter to true.
     */
  def scan(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ScanOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The Scan operation returns one or more items and item attributes by accessing every item in a table or a secondary index. To have DynamoDB return fewer items, you can provide a FilterExpression operation. If the total number of scanned items exceeds the maximum data set size limit of 1 MB, the scan stops and results are returned to the user as a LastEvaluatedKey value to continue the scan in a subsequent operation. The results also include the number of items exceeding the limit. A scan can result in no table data meeting the filter criteria.  A single Scan operation will read up to the maximum number of items set (if using the Limit parameter) or a maximum of 1 MB of data and then apply any filtering to the results using FilterExpression. If LastEvaluatedKey is present in the response, you will need to paginate the result set. For more information, see Paginating the Results in the Amazon DynamoDB Developer Guide.   Scan operations proceed sequentially; however, for faster performance on a large table or secondary index, applications can request a parallel Scan operation by providing the Segment and TotalSegments parameters. For more information, see Parallel Scan in the Amazon DynamoDB Developer Guide.  Scan uses eventually consistent reads when accessing the data in a table; therefore, the result set might not include the changes to data in the table immediately before the operation began. If you need a consistent copy of the data, as of the time that the Scan begins, you can set the ConsistentRead parameter to true.
     */
  def scan(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ScanOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ScanOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The Scan operation returns one or more items and item attributes by accessing every item in a table or a secondary index. To have DynamoDB return fewer items, you can provide a FilterExpression operation. If the total number of scanned items exceeds the maximum data set size limit of 1 MB, the scan stops and results are returned to the user as a LastEvaluatedKey value to continue the scan in a subsequent operation. The results also include the number of items exceeding the limit. A scan can result in no table data meeting the filter criteria.  A single Scan operation will read up to the maximum number of items set (if using the Limit parameter) or a maximum of 1 MB of data and then apply any filtering to the results using FilterExpression. If LastEvaluatedKey is present in the response, you will need to paginate the result set. For more information, see Paginating the Results in the Amazon DynamoDB Developer Guide.   Scan operations proceed sequentially; however, for faster performance on a large table or secondary index, applications can request a parallel Scan operation by providing the Segment and TotalSegments parameters. For more information, see Parallel Scan in the Amazon DynamoDB Developer Guide.  Scan uses eventually consistent reads when accessing the data in a table; therefore, the result set might not include the changes to data in the table immediately before the operation began. If you need a consistent copy of the data, as of the time that the Scan begins, you can set the ConsistentRead parameter to true.
     */
  def scan(params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ScanInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ScanOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The Scan operation returns one or more items and item attributes by accessing every item in a table or a secondary index. To have DynamoDB return fewer items, you can provide a FilterExpression operation. If the total number of scanned items exceeds the maximum data set size limit of 1 MB, the scan stops and results are returned to the user as a LastEvaluatedKey value to continue the scan in a subsequent operation. The results also include the number of items exceeding the limit. A scan can result in no table data meeting the filter criteria.  A single Scan operation will read up to the maximum number of items set (if using the Limit parameter) or a maximum of 1 MB of data and then apply any filtering to the results using FilterExpression. If LastEvaluatedKey is present in the response, you will need to paginate the result set. For more information, see Paginating the Results in the Amazon DynamoDB Developer Guide.   Scan operations proceed sequentially; however, for faster performance on a large table or secondary index, applications can request a parallel Scan operation by providing the Segment and TotalSegments parameters. For more information, see Parallel Scan in the Amazon DynamoDB Developer Guide.  Scan uses eventually consistent reads when accessing the data in a table; therefore, the result set might not include the changes to data in the table immediately before the operation began. If you need a consistent copy of the data, as of the time that the Scan begins, you can set the ConsistentRead parameter to true.
     */
  def scan(
    params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ScanInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ScanOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ScanOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associate a set of tags with an Amazon DynamoDB resource. You can then activate these user-defined tags so that they appear on the Billing and Cost Management console for cost allocation tracking. You can call TagResource up to 5 times per second, per account.  For an overview on tagging DynamoDB resources, see Tagging for DynamoDB in the Amazon DynamoDB Developer Guide.
     */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Associate a set of tags with an Amazon DynamoDB resource. You can then activate these user-defined tags so that they appear on the Billing and Cost Management console for cost allocation tracking. You can call TagResource up to 5 times per second, per account.  For an overview on tagging DynamoDB resources, see Tagging for DynamoDB in the Amazon DynamoDB Developer Guide.
     */
  def tagResource(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Associate a set of tags with an Amazon DynamoDB resource. You can then activate these user-defined tags so that they appear on the Billing and Cost Management console for cost allocation tracking. You can call TagResource up to 5 times per second, per account.  For an overview on tagging DynamoDB resources, see Tagging for DynamoDB in the Amazon DynamoDB Developer Guide.
     */
  def tagResource(params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.TagResourceInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Associate a set of tags with an Amazon DynamoDB resource. You can then activate these user-defined tags so that they appear on the Billing and Cost Management console for cost allocation tracking. You can call TagResource up to 5 times per second, per account.  For an overview on tagging DynamoDB resources, see Tagging for DynamoDB in the Amazon DynamoDB Developer Guide.
     */
  def tagResource(
    params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.TagResourceInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the association of tags from an Amazon DynamoDB resource. You can call UntagResource up to 5 times per second, per account.  For an overview on tagging DynamoDB resources, see Tagging for DynamoDB in the Amazon DynamoDB Developer Guide.
     */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the association of tags from an Amazon DynamoDB resource. You can call UntagResource up to 5 times per second, per account.  For an overview on tagging DynamoDB resources, see Tagging for DynamoDB in the Amazon DynamoDB Developer Guide.
     */
  def untagResource(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the association of tags from an Amazon DynamoDB resource. You can call UntagResource up to 5 times per second, per account.  For an overview on tagging DynamoDB resources, see Tagging for DynamoDB in the Amazon DynamoDB Developer Guide.
     */
  def untagResource(params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.UntagResourceInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the association of tags from an Amazon DynamoDB resource. You can call UntagResource up to 5 times per second, per account.  For an overview on tagging DynamoDB resources, see Tagging for DynamoDB in the Amazon DynamoDB Developer Guide.
     */
  def untagResource(
    params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.UntagResourceInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     *  UpdateContinuousBackups enables or disables point in time recovery for the specified table. A successful UpdateContinuousBackups call returns the current ContinuousBackupsDescription. Continuous backups are ENABLED on all tables at table creation. If point in time recovery is enabled, PointInTimeRecoveryStatus will be set to ENABLED.  Once continuous backups and point in time recovery are enabled, you can restore to any point in time within EarliestRestorableDateTime and LatestRestorableDateTime.   LatestRestorableDateTime is typically 5 minutes before the current time. You can restore your table to any point in time during the last 35 days.. 
     */
  def updateContinuousBackups(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.UpdateContinuousBackupsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  UpdateContinuousBackups enables or disables point in time recovery for the specified table. A successful UpdateContinuousBackups call returns the current ContinuousBackupsDescription. Continuous backups are ENABLED on all tables at table creation. If point in time recovery is enabled, PointInTimeRecoveryStatus will be set to ENABLED.  Once continuous backups and point in time recovery are enabled, you can restore to any point in time within EarliestRestorableDateTime and LatestRestorableDateTime.   LatestRestorableDateTime is typically 5 minutes before the current time. You can restore your table to any point in time during the last 35 days.. 
     */
  def updateContinuousBackups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.UpdateContinuousBackupsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.UpdateContinuousBackupsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  UpdateContinuousBackups enables or disables point in time recovery for the specified table. A successful UpdateContinuousBackups call returns the current ContinuousBackupsDescription. Continuous backups are ENABLED on all tables at table creation. If point in time recovery is enabled, PointInTimeRecoveryStatus will be set to ENABLED.  Once continuous backups and point in time recovery are enabled, you can restore to any point in time within EarliestRestorableDateTime and LatestRestorableDateTime.   LatestRestorableDateTime is typically 5 minutes before the current time. You can restore your table to any point in time during the last 35 days.. 
     */
  def updateContinuousBackups(params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.UpdateContinuousBackupsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.UpdateContinuousBackupsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  UpdateContinuousBackups enables or disables point in time recovery for the specified table. A successful UpdateContinuousBackups call returns the current ContinuousBackupsDescription. Continuous backups are ENABLED on all tables at table creation. If point in time recovery is enabled, PointInTimeRecoveryStatus will be set to ENABLED.  Once continuous backups and point in time recovery are enabled, you can restore to any point in time within EarliestRestorableDateTime and LatestRestorableDateTime.   LatestRestorableDateTime is typically 5 minutes before the current time. You can restore your table to any point in time during the last 35 days.. 
     */
  def updateContinuousBackups(
    params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.UpdateContinuousBackupsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.UpdateContinuousBackupsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.UpdateContinuousBackupsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds or removes replicas in the specified global table. The global table must already exist to be able to use this operation. Any replica to be added must be empty, must have the same name as the global table, must have the same key schema, and must have DynamoDB Streams enabled and must have same provisioned and maximum write capacity units.  Although you can use UpdateGlobalTable to add replicas and remove replicas in a single request, for simplicity we recommend that you issue separate requests for adding or removing replicas.   If global secondary indexes are specified, then the following conditions must also be met:     The global secondary indexes must have the same name.     The global secondary indexes must have the same hash key and sort key (if present).     The global secondary indexes must have the same provisioned and maximum write capacity units.   
     */
  def updateGlobalTable(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.UpdateGlobalTableOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds or removes replicas in the specified global table. The global table must already exist to be able to use this operation. Any replica to be added must be empty, must have the same name as the global table, must have the same key schema, and must have DynamoDB Streams enabled and must have same provisioned and maximum write capacity units.  Although you can use UpdateGlobalTable to add replicas and remove replicas in a single request, for simplicity we recommend that you issue separate requests for adding or removing replicas.   If global secondary indexes are specified, then the following conditions must also be met:     The global secondary indexes must have the same name.     The global secondary indexes must have the same hash key and sort key (if present).     The global secondary indexes must have the same provisioned and maximum write capacity units.   
     */
  def updateGlobalTable(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.UpdateGlobalTableOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.UpdateGlobalTableOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds or removes replicas in the specified global table. The global table must already exist to be able to use this operation. Any replica to be added must be empty, must have the same name as the global table, must have the same key schema, and must have DynamoDB Streams enabled and must have same provisioned and maximum write capacity units.  Although you can use UpdateGlobalTable to add replicas and remove replicas in a single request, for simplicity we recommend that you issue separate requests for adding or removing replicas.   If global secondary indexes are specified, then the following conditions must also be met:     The global secondary indexes must have the same name.     The global secondary indexes must have the same hash key and sort key (if present).     The global secondary indexes must have the same provisioned and maximum write capacity units.   
     */
  def updateGlobalTable(params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.UpdateGlobalTableInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.UpdateGlobalTableOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds or removes replicas in the specified global table. The global table must already exist to be able to use this operation. Any replica to be added must be empty, must have the same name as the global table, must have the same key schema, and must have DynamoDB Streams enabled and must have same provisioned and maximum write capacity units.  Although you can use UpdateGlobalTable to add replicas and remove replicas in a single request, for simplicity we recommend that you issue separate requests for adding or removing replicas.   If global secondary indexes are specified, then the following conditions must also be met:     The global secondary indexes must have the same name.     The global secondary indexes must have the same hash key and sort key (if present).     The global secondary indexes must have the same provisioned and maximum write capacity units.   
     */
  def updateGlobalTable(
    params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.UpdateGlobalTableInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.UpdateGlobalTableOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.UpdateGlobalTableOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates settings for a global table.
     */
  def updateGlobalTableSettings(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.UpdateGlobalTableSettingsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates settings for a global table.
     */
  def updateGlobalTableSettings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.UpdateGlobalTableSettingsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.UpdateGlobalTableSettingsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates settings for a global table.
     */
  def updateGlobalTableSettings(params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.UpdateGlobalTableSettingsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.UpdateGlobalTableSettingsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates settings for a global table.
     */
  def updateGlobalTableSettings(
    params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.UpdateGlobalTableSettingsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.UpdateGlobalTableSettingsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.UpdateGlobalTableSettingsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Edits an existing item's attributes, or adds a new item to the table if it does not already exist. You can put, delete, or add attribute values. You can also perform a conditional update on an existing item (insert a new attribute name-value pair if it doesn't exist, or replace an existing name-value pair if it has certain expected attribute values). You can also return the item's attribute values in the same UpdateItem operation using the ReturnValues parameter.
     */
  def updateItem(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.UpdateItemOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Edits an existing item's attributes, or adds a new item to the table if it does not already exist. You can put, delete, or add attribute values. You can also perform a conditional update on an existing item (insert a new attribute name-value pair if it doesn't exist, or replace an existing name-value pair if it has certain expected attribute values). You can also return the item's attribute values in the same UpdateItem operation using the ReturnValues parameter.
     */
  def updateItem(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.UpdateItemOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.UpdateItemOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Edits an existing item's attributes, or adds a new item to the table if it does not already exist. You can put, delete, or add attribute values. You can also perform a conditional update on an existing item (insert a new attribute name-value pair if it doesn't exist, or replace an existing name-value pair if it has certain expected attribute values). You can also return the item's attribute values in the same UpdateItem operation using the ReturnValues parameter.
     */
  def updateItem(params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.UpdateItemInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.UpdateItemOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Edits an existing item's attributes, or adds a new item to the table if it does not already exist. You can put, delete, or add attribute values. You can also perform a conditional update on an existing item (insert a new attribute name-value pair if it doesn't exist, or replace an existing name-value pair if it has certain expected attribute values). You can also return the item's attribute values in the same UpdateItem operation using the ReturnValues parameter.
     */
  def updateItem(
    params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.UpdateItemInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.UpdateItemOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.UpdateItemOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies the provisioned throughput settings, global secondary indexes, or DynamoDB Streams settings for a given table. You can only perform one of the following operations at once:   Modify the provisioned throughput settings of the table.   Enable or disable Streams on the table.   Remove a global secondary index from the table.   Create a new global secondary index on the table. Once the index begins backfilling, you can use UpdateTable to perform other operations.    UpdateTable is an asynchronous operation; while it is executing, the table status changes from ACTIVE to UPDATING. While it is UPDATING, you cannot issue another UpdateTable request. When the table returns to the ACTIVE state, the UpdateTable operation is complete.
     */
  def updateTable(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.UpdateTableOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies the provisioned throughput settings, global secondary indexes, or DynamoDB Streams settings for a given table. You can only perform one of the following operations at once:   Modify the provisioned throughput settings of the table.   Enable or disable Streams on the table.   Remove a global secondary index from the table.   Create a new global secondary index on the table. Once the index begins backfilling, you can use UpdateTable to perform other operations.    UpdateTable is an asynchronous operation; while it is executing, the table status changes from ACTIVE to UPDATING. While it is UPDATING, you cannot issue another UpdateTable request. When the table returns to the ACTIVE state, the UpdateTable operation is complete.
     */
  def updateTable(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.UpdateTableOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.UpdateTableOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies the provisioned throughput settings, global secondary indexes, or DynamoDB Streams settings for a given table. You can only perform one of the following operations at once:   Modify the provisioned throughput settings of the table.   Enable or disable Streams on the table.   Remove a global secondary index from the table.   Create a new global secondary index on the table. Once the index begins backfilling, you can use UpdateTable to perform other operations.    UpdateTable is an asynchronous operation; while it is executing, the table status changes from ACTIVE to UPDATING. While it is UPDATING, you cannot issue another UpdateTable request. When the table returns to the ACTIVE state, the UpdateTable operation is complete.
     */
  def updateTable(params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.UpdateTableInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.UpdateTableOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies the provisioned throughput settings, global secondary indexes, or DynamoDB Streams settings for a given table. You can only perform one of the following operations at once:   Modify the provisioned throughput settings of the table.   Enable or disable Streams on the table.   Remove a global secondary index from the table.   Create a new global secondary index on the table. Once the index begins backfilling, you can use UpdateTable to perform other operations.    UpdateTable is an asynchronous operation; while it is executing, the table status changes from ACTIVE to UPDATING. While it is UPDATING, you cannot issue another UpdateTable request. When the table returns to the ACTIVE state, the UpdateTable operation is complete.
     */
  def updateTable(
    params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.UpdateTableInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.UpdateTableOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.UpdateTableOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The UpdateTimeToLive method will enable or disable TTL for the specified table. A successful UpdateTimeToLive call returns the current TimeToLiveSpecification; it may take up to one hour for the change to fully process. Any additional UpdateTimeToLive calls for the same table during this one hour duration result in a ValidationException.  TTL compares the current time in epoch time format to the time stored in the TTL attribute of an item. If the epoch time value stored in the attribute is less than the current time, the item is marked as expired and subsequently deleted.   The epoch time format is the number of seconds elapsed since 12:00:00 AM January 1st, 1970 UTC.   DynamoDB deletes expired items on a best-effort basis to ensure availability of throughput for other data operations.   DynamoDB typically deletes expired items within two days of expiration. The exact duration within which an item gets deleted after expiration is specific to the nature of the workload. Items that have expired and not been deleted will still show up in reads, queries, and scans.  As items are deleted, they are removed from any Local Secondary Index and Global Secondary Index immediately in the same eventually consistent way as a standard delete operation. For more information, see Time To Live in the Amazon DynamoDB Developer Guide. 
     */
  def updateTimeToLive(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.UpdateTimeToLiveOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The UpdateTimeToLive method will enable or disable TTL for the specified table. A successful UpdateTimeToLive call returns the current TimeToLiveSpecification; it may take up to one hour for the change to fully process. Any additional UpdateTimeToLive calls for the same table during this one hour duration result in a ValidationException.  TTL compares the current time in epoch time format to the time stored in the TTL attribute of an item. If the epoch time value stored in the attribute is less than the current time, the item is marked as expired and subsequently deleted.   The epoch time format is the number of seconds elapsed since 12:00:00 AM January 1st, 1970 UTC.   DynamoDB deletes expired items on a best-effort basis to ensure availability of throughput for other data operations.   DynamoDB typically deletes expired items within two days of expiration. The exact duration within which an item gets deleted after expiration is specific to the nature of the workload. Items that have expired and not been deleted will still show up in reads, queries, and scans.  As items are deleted, they are removed from any Local Secondary Index and Global Secondary Index immediately in the same eventually consistent way as a standard delete operation. For more information, see Time To Live in the Amazon DynamoDB Developer Guide. 
     */
  def updateTimeToLive(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.UpdateTimeToLiveOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.UpdateTimeToLiveOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The UpdateTimeToLive method will enable or disable TTL for the specified table. A successful UpdateTimeToLive call returns the current TimeToLiveSpecification; it may take up to one hour for the change to fully process. Any additional UpdateTimeToLive calls for the same table during this one hour duration result in a ValidationException.  TTL compares the current time in epoch time format to the time stored in the TTL attribute of an item. If the epoch time value stored in the attribute is less than the current time, the item is marked as expired and subsequently deleted.   The epoch time format is the number of seconds elapsed since 12:00:00 AM January 1st, 1970 UTC.   DynamoDB deletes expired items on a best-effort basis to ensure availability of throughput for other data operations.   DynamoDB typically deletes expired items within two days of expiration. The exact duration within which an item gets deleted after expiration is specific to the nature of the workload. Items that have expired and not been deleted will still show up in reads, queries, and scans.  As items are deleted, they are removed from any Local Secondary Index and Global Secondary Index immediately in the same eventually consistent way as a standard delete operation. For more information, see Time To Live in the Amazon DynamoDB Developer Guide. 
     */
  def updateTimeToLive(params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.UpdateTimeToLiveInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.UpdateTimeToLiveOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The UpdateTimeToLive method will enable or disable TTL for the specified table. A successful UpdateTimeToLive call returns the current TimeToLiveSpecification; it may take up to one hour for the change to fully process. Any additional UpdateTimeToLive calls for the same table during this one hour duration result in a ValidationException.  TTL compares the current time in epoch time format to the time stored in the TTL attribute of an item. If the epoch time value stored in the attribute is less than the current time, the item is marked as expired and subsequently deleted.   The epoch time format is the number of seconds elapsed since 12:00:00 AM January 1st, 1970 UTC.   DynamoDB deletes expired items on a best-effort basis to ensure availability of throughput for other data operations.   DynamoDB typically deletes expired items within two days of expiration. The exact duration within which an item gets deleted after expiration is specific to the nature of the workload. Items that have expired and not been deleted will still show up in reads, queries, and scans.  As items are deleted, they are removed from any Local Secondary Index and Global Secondary Index immediately in the same eventually consistent way as a standard delete operation. For more information, see Time To Live in the Amazon DynamoDB Developer Guide. 
     */
  def updateTimeToLive(
    params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.UpdateTimeToLiveInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.UpdateTimeToLiveOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.UpdateTimeToLiveOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the tableExists state by periodically calling the underlying DynamoDB.describeTableoperation every 20 seconds (at most 25 times).
     */
  @JSName("waitFor")
  def waitFor_tableExists(state: awsDashSdkLib.awsDashSdkLibStrings.tableExists): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeTableOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the tableExists state by periodically calling the underlying DynamoDB.describeTableoperation every 20 seconds (at most 25 times).
     */
  @JSName("waitFor")
  def waitFor_tableExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.tableExists,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeTableOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeTableOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the tableExists state by periodically calling the underlying DynamoDB.describeTableoperation every 20 seconds (at most 25 times).
     */
  @JSName("waitFor")
  def waitFor_tableExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.tableExists,
    params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeTableInput with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeTableOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the tableExists state by periodically calling the underlying DynamoDB.describeTableoperation every 20 seconds (at most 25 times).
     */
  @JSName("waitFor")
  def waitFor_tableExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.tableExists,
    params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeTableInput with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeTableOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeTableOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the tableNotExists state by periodically calling the underlying DynamoDB.describeTableoperation every 20 seconds (at most 25 times).
     */
  @JSName("waitFor")
  def waitFor_tableNotExists(state: awsDashSdkLib.awsDashSdkLibStrings.tableNotExists): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeTableOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the tableNotExists state by periodically calling the underlying DynamoDB.describeTableoperation every 20 seconds (at most 25 times).
     */
  @JSName("waitFor")
  def waitFor_tableNotExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.tableNotExists,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeTableOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeTableOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the tableNotExists state by periodically calling the underlying DynamoDB.describeTableoperation every 20 seconds (at most 25 times).
     */
  @JSName("waitFor")
  def waitFor_tableNotExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.tableNotExists,
    params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeTableInput with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeTableOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the tableNotExists state by periodically calling the underlying DynamoDB.describeTableoperation every 20 seconds (at most 25 times).
     */
  @JSName("waitFor")
  def waitFor_tableNotExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.tableNotExists,
    params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeTableInput with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeTableOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeTableOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

