package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/dynamodb/document_client", "DocumentClient")
@js.native
class DocumentClient () extends js.Object {
  /**
       * Creates a DynamoDB document client with a set of configuration options.
       */
  def this(options: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.DocumentClientOptions with awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ClientConfiguration) = this()
  /**
       * Returns the attributes of one or more items from one or more tables by delegating to AWS.DynamoDB.batchGetItem().
       */
  def batchGet(params: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BatchGetItemInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BatchGetItemOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
       * Returns the attributes of one or more items from one or more tables by delegating to AWS.DynamoDB.batchGetItem().
       */
  def batchGet(
    params: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BatchGetItemInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BatchGetItemOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BatchGetItemOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
       * Puts or deletes multiple items in one or more tables by delegating to AWS.DynamoDB.batchWriteItem().
       */
  def batchWrite(params: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BatchWriteItemInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BatchWriteItemOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
       * Puts or deletes multiple items in one or more tables by delegating to AWS.DynamoDB.batchWriteItem().
       */
  def batchWrite(
    params: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BatchWriteItemInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BatchWriteItemOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BatchWriteItemOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
       * Creates a set of elements inferring the type of set from the type of the first element. Amazon DynamoDB currently supports the number sets, string sets, and binary sets. For more information about DynamoDB data types see the documentation on the Amazon DynamoDB Data Model.
       */
  def createSet(
    list: js.Array[
      awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.binaryType | java.lang.String | scala.Double
    ]
  ): awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.DynamoDbSet = js.native
  /**
       * Creates a set of elements inferring the type of set from the type of the first element. Amazon DynamoDB currently supports the number sets, string sets, and binary sets. For more information about DynamoDB data types see the documentation on the Amazon DynamoDB Data Model.
       */
  def createSet(
    list: js.Array[
      awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.binaryType | java.lang.String | scala.Double
    ],
    options: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.CreateSetOptions
  ): awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.DynamoDbSet = js.native
  /**
       * Deletes a single item in a table by primary key by delegating to AWS.DynamoDB.deleteItem().
       */
  def delete(params: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.DeleteItemInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.DeleteItemOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
       * Deletes a single item in a table by primary key by delegating to AWS.DynamoDB.deleteItem().
       */
  def delete(
    params: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.DeleteItemInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.DeleteItemOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.DeleteItemOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
       * Returns a set of attributes for the item with the given primary key by delegating to AWS.DynamoDB.getItem().
       */
  def get(params: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.GetItemInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.GetItemOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
       * Returns a set of attributes for the item with the given primary key by delegating to AWS.DynamoDB.getItem().
       */
  def get(
    params: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.GetItemInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.GetItemOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.GetItemOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
       * Creates a new item, or replaces an old item with a new item by delegating to AWS.DynamoDB.putItem().
       */
  def put(params: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.PutItemInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.PutItemOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
       * Creates a new item, or replaces an old item with a new item by delegating to AWS.DynamoDB.putItem().
       */
  def put(
    params: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.PutItemInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.PutItemOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.PutItemOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
       * Directly access items from a table by primary key or a secondary index.
       */
  def query(params: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.QueryInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.QueryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
       * Directly access items from a table by primary key or a secondary index.
       */
  def query(
    params: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.QueryInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.QueryOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.QueryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
       * Returns one or more items and item attributes by accessing every item in a table or a secondary index.
       */
  def scan(params: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ScanInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ScanOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
       * Returns one or more items and item attributes by accessing every item in a table or a secondary index.
       */
  def scan(
    params: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ScanInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ScanOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ScanOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
       * Atomically retrieves multiple items from one or more tables (but not from indexes) in a single account and region.
       */
  def transactGet(params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.TransactGetItemsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.TransactGetItemsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
       * Atomically retrieves multiple items from one or more tables (but not from indexes) in a single account and region.
       */
  def transactGet(
    params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.TransactGetItemsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.TransactGetItemsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.TransactGetItemsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
       * Synchronous write operation that groups up to 10 action requests
       */
  def transactWrite(params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.TransactWriteItemsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.TransactWriteItemsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
       * Synchronous write operation that groups up to 10 action requests
       */
  def transactWrite(
    params: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.TransactWriteItemsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.TransactWriteItemsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.TransactWriteItemsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
       * Edits an existing item's attributes, or adds a new item to the table if it does not already exist by delegating to AWS.DynamoDB.updateItem().
       */
  def update(params: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.UpdateItemInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.UpdateItemOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
       * Edits an existing item's attributes, or adds a new item to the table if it does not already exist by delegating to AWS.DynamoDB.updateItem().
       */
  def update(
    params: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.UpdateItemInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.UpdateItemOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.UpdateItemOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

