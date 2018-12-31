package typings
package awsDashSdkLib.clientsDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/dynamodb", "DynamoDB")
@js.native
object DynamoDBNs extends js.Object {
  trait AttributeDefinition extends js.Object {
    /**
      * A name for the attribute.
      */
    var AttributeName: KeySchemaAttributeName
    /**
      * The data type for the attribute, where:    S - the attribute is of type String    N - the attribute is of type Number    B - the attribute is of type Binary  
      */
    var AttributeType: ScalarAttributeType
  }
  
  trait AttributeMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[AttributeValue]
  
  trait AttributeUpdates
    extends /* key */ org.scalablytyped.runtime.StringDictionary[AttributeValueUpdate]
  
  trait AttributeValue extends js.Object {
    /**
      * An attribute of type Binary. For example:  "B": "dGhpcyB0ZXh0IGlzIGJhc2U2NC1lbmNvZGVk" 
      */
    var B: js.UndefOr[BinaryAttributeValue] = js.undefined
    /**
      * An attribute of type Boolean. For example:  "BOOL": true 
      */
    var BOOL: js.UndefOr[BooleanAttributeValue] = js.undefined
    /**
      * An attribute of type Binary Set. For example:  "BS": ["U3Vubnk=", "UmFpbnk=", "U25vd3k="] 
      */
    var BS: js.UndefOr[BinarySetAttributeValue] = js.undefined
    /**
      * An attribute of type List. For example:  "L": ["Cookies", "Coffee", 3.14159] 
      */
    var L: js.UndefOr[ListAttributeValue] = js.undefined
    /**
      * An attribute of type Map. For example:  "M": {"Name": {"S": "Joe"}, "Age": {"N": "35"}} 
      */
    var M: js.UndefOr[MapAttributeValue] = js.undefined
    /**
      * An attribute of type Number. For example:  "N": "123.45"  Numbers are sent across the network to DynamoDB as strings, to maximize compatibility across languages and libraries. However, DynamoDB treats them as number type attributes for mathematical operations.
      */
    var N: js.UndefOr[NumberAttributeValue] = js.undefined
    /**
      * An attribute of type Number Set. For example:  "NS": ["42.2", "-19", "7.5", "3.14"]  Numbers are sent across the network to DynamoDB as strings, to maximize compatibility across languages and libraries. However, DynamoDB treats them as number type attributes for mathematical operations.
      */
    var NS: js.UndefOr[NumberSetAttributeValue] = js.undefined
    /**
      * An attribute of type Null. For example:  "NULL": true 
      */
    var NULL: js.UndefOr[NullAttributeValue] = js.undefined
    /**
      * An attribute of type String. For example:  "S": "Hello" 
      */
    var S: js.UndefOr[StringAttributeValue] = js.undefined
    /**
      * An attribute of type String Set. For example:  "SS": ["Giraffe", "Hippo" ,"Zebra"] 
      */
    var SS: js.UndefOr[StringSetAttributeValue] = js.undefined
  }
  
  trait AttributeValueUpdate extends js.Object {
    /**
      * Specifies how to perform the update. Valid values are PUT (default), DELETE, and ADD. The behavior depends on whether the specified primary key already exists in the table.  If an item with the specified Key is found in the table:     PUT - Adds the specified attribute to the item. If the attribute already exists, it is replaced by the new value.     DELETE - If no value is specified, the attribute and its value are removed from the item. The data type of the specified value must match the existing value's data type. If a set of values is specified, then those values are subtracted from the old set. For example, if the attribute value was the set [a,b,c] and the DELETE action specified [a,c], then the final attribute value would be [b]. Specifying an empty set is an error.    ADD - If the attribute does not already exist, then the attribute and its values are added to the item. If the attribute does exist, then the behavior of ADD depends on the data type of the attribute:   If the existing attribute is a number, and if Value is also a number, then the Value is mathematically added to the existing attribute. If Value is a negative number, then it is subtracted from the existing attribute.   If you use ADD to increment or decrement a number value for an item that doesn't exist before the update, DynamoDB uses 0 as the initial value. In addition, if you use ADD to update an existing item, and intend to increment or decrement an attribute value which does not yet exist, DynamoDB uses 0 as the initial value. For example, suppose that the item you want to update does not yet have an attribute named itemcount, but you decide to ADD the number 3 to this attribute anyway, even though it currently does not exist. DynamoDB will create the itemcount attribute, set its initial value to 0, and finally add 3 to it. The result will be a new itemcount attribute in the item, with a value of 3.    If the existing data type is a set, and if the Value is also a set, then the Value is added to the existing set. (This is a set operation, not mathematical addition.) For example, if the attribute value was the set [1,2], and the ADD action specified [3], then the final attribute value would be [1,2,3]. An error occurs if an Add action is specified for a set attribute and the attribute type specified does not match the existing set type.  Both sets must have the same primitive data type. For example, if the existing data type is a set of strings, the Value must also be a set of strings. The same holds true for number sets and binary sets.   This action is only valid for an existing attribute whose data type is number or is a set. Do not use ADD for any other data types.    If no item with the specified Key is found:     PUT - DynamoDB creates a new item with the specified primary key, and then adds the attribute.     DELETE - Nothing happens; there is no attribute to delete.    ADD - DynamoDB creates an item with the supplied primary key and number (or set of numbers) for the attribute value. The only data types allowed are number and number set; no other data types can be specified.  
      */
    var Action: js.UndefOr[AttributeAction] = js.undefined
    /**
      * Represents the data for an attribute. Each attribute value is described as a name-value pair. The name is the data type, and the value is the data itself. For more information, see Data Types in the Amazon DynamoDB Developer Guide. 
      */
    var Value: js.UndefOr[AttributeValue] = js.undefined
  }
  
  trait AutoScalingPolicyDescription extends js.Object {
    /**
      * The name of the scaling policy.
      */
    var PolicyName: js.UndefOr[AutoScalingPolicyName] = js.undefined
    /**
      * Represents a target tracking scaling policy configuration.
      */
    var TargetTrackingScalingPolicyConfiguration: js.UndefOr[AutoScalingTargetTrackingScalingPolicyConfigurationDescription] = js.undefined
  }
  
  trait AutoScalingPolicyUpdate extends js.Object {
    /**
      * The name of the scaling policy.
      */
    var PolicyName: js.UndefOr[AutoScalingPolicyName] = js.undefined
    /**
      * Represents a target tracking scaling policy configuration.
      */
    var TargetTrackingScalingPolicyConfiguration: AutoScalingTargetTrackingScalingPolicyConfigurationUpdate
  }
  
  trait AutoScalingSettingsDescription extends js.Object {
    /**
      * Disabled autoscaling for this global table or global secondary index.
      */
    var AutoScalingDisabled: js.UndefOr[BooleanObject] = js.undefined
    /**
      * Role ARN used for configuring autoScaling policy.
      */
    var AutoScalingRoleArn: js.UndefOr[String] = js.undefined
    /**
      * The maximum capacity units that a global table or global secondary index should be scaled up to.
      */
    var MaximumUnits: js.UndefOr[PositiveLongObject] = js.undefined
    /**
      * The minimum capacity units that a global table or global secondary index should be scaled down to.
      */
    var MinimumUnits: js.UndefOr[PositiveLongObject] = js.undefined
    /**
      * Information about the scaling policies.
      */
    var ScalingPolicies: js.UndefOr[AutoScalingPolicyDescriptionList] = js.undefined
  }
  
  trait AutoScalingSettingsUpdate extends js.Object {
    /**
      * Disabled autoscaling for this global table or global secondary index.
      */
    var AutoScalingDisabled: js.UndefOr[BooleanObject] = js.undefined
    /**
      * Role ARN used for configuring autoscaling policy.
      */
    var AutoScalingRoleArn: js.UndefOr[AutoScalingRoleArn] = js.undefined
    /**
      * The maximum capacity units that a global table or global secondary index should be scaled up to.
      */
    var MaximumUnits: js.UndefOr[PositiveLongObject] = js.undefined
    /**
      * The minimum capacity units that a global table or global secondary index should be scaled down to.
      */
    var MinimumUnits: js.UndefOr[PositiveLongObject] = js.undefined
    /**
      * The scaling policy to apply for scaling target global table or global secondary index capacity units.
      */
    var ScalingPolicyUpdate: js.UndefOr[AutoScalingPolicyUpdate] = js.undefined
  }
  
  trait AutoScalingTargetTrackingScalingPolicyConfigurationDescription extends js.Object {
    /**
      * Indicates whether scale in by the target tracking policy is disabled. If the value is true, scale in is disabled and the target tracking policy won't remove capacity from the scalable resource. Otherwise, scale in is enabled and the target tracking policy can remove capacity from the scalable resource. The default value is false.
      */
    var DisableScaleIn: js.UndefOr[BooleanObject] = js.undefined
    /**
      * The amount of time, in seconds, after a scale in activity completes before another scale in activity can start. The cooldown period is used to block subsequent scale in requests until it has expired. You should scale in conservatively to protect your application's availability. However, if another alarm triggers a scale out policy during the cooldown period after a scale-in, application autoscaling scales out your scalable target immediately. 
      */
    var ScaleInCooldown: js.UndefOr[IntegerObject] = js.undefined
    /**
      * The amount of time, in seconds, after a scale out activity completes before another scale out activity can start. While the cooldown period is in effect, the capacity that has been added by the previous scale out event that initiated the cooldown is calculated as part of the desired capacity for the next scale out. You should continuously (but not excessively) scale out.
      */
    var ScaleOutCooldown: js.UndefOr[IntegerObject] = js.undefined
    /**
      * The target value for the metric. The range is 8.515920e-109 to 1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base 2).
      */
    var TargetValue: Double
  }
  
  trait AutoScalingTargetTrackingScalingPolicyConfigurationUpdate extends js.Object {
    /**
      * Indicates whether scale in by the target tracking policy is disabled. If the value is true, scale in is disabled and the target tracking policy won't remove capacity from the scalable resource. Otherwise, scale in is enabled and the target tracking policy can remove capacity from the scalable resource. The default value is false.
      */
    var DisableScaleIn: js.UndefOr[BooleanObject] = js.undefined
    /**
      * The amount of time, in seconds, after a scale in activity completes before another scale in activity can start. The cooldown period is used to block subsequent scale in requests until it has expired. You should scale in conservatively to protect your application's availability. However, if another alarm triggers a scale out policy during the cooldown period after a scale-in, application autoscaling scales out your scalable target immediately. 
      */
    var ScaleInCooldown: js.UndefOr[IntegerObject] = js.undefined
    /**
      * The amount of time, in seconds, after a scale out activity completes before another scale out activity can start. While the cooldown period is in effect, the capacity that has been added by the previous scale out event that initiated the cooldown is calculated as part of the desired capacity for the next scale out. You should continuously (but not excessively) scale out.
      */
    var ScaleOutCooldown: js.UndefOr[IntegerObject] = js.undefined
    /**
      * The target value for the metric. The range is 8.515920e-109 to 1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base 2).
      */
    var TargetValue: Double
  }
  
  trait BackupDescription extends js.Object {
    /**
      * Contains the details of the backup created for the table. 
      */
    var BackupDetails: js.UndefOr[BackupDetails] = js.undefined
    /**
      * Contains the details of the table when the backup was created. 
      */
    var SourceTableDetails: js.UndefOr[SourceTableDetails] = js.undefined
    /**
      * Contains the details of the features enabled on the table when the backup was created. For example, LSIs, GSIs, streams, TTL.
      */
    var SourceTableFeatureDetails: js.UndefOr[SourceTableFeatureDetails] = js.undefined
  }
  
  trait BackupDetails extends js.Object {
    /**
      * ARN associated with the backup.
      */
    var BackupArn: BackupArn
    /**
      * Time at which the backup was created. This is the request time of the backup. 
      */
    var BackupCreationDateTime: BackupCreationDateTime
    /**
      * Time at which the automatic on-demand backup created by DynamoDB will expire. This SYSTEM on-demand backup expires automatically 35 days after its creation.
      */
    var BackupExpiryDateTime: js.UndefOr[_Date] = js.undefined
    /**
      * Name of the requested backup.
      */
    var BackupName: BackupName
    /**
      * Size of the backup in bytes.
      */
    var BackupSizeBytes: js.UndefOr[BackupSizeBytes] = js.undefined
    /**
      * Backup can be in one of the following states: CREATING, ACTIVE, DELETED. 
      */
    var BackupStatus: BackupStatus
    /**
      * BackupType:    USER - You create and manage these using the on-demand backup feature.    SYSTEM - If you delete a table with point-in-time recovery enabled, a SYSTEM backup is automatically created and is retained for 35 days (at no additional cost). System backups allow you to restore the deleted table to the state it was in just before the point of deletion.   
      */
    var BackupType: BackupType
  }
  
  trait BackupSummary extends js.Object {
    /**
      * ARN associated with the backup.
      */
    var BackupArn: js.UndefOr[BackupArn] = js.undefined
    /**
      * Time at which the backup was created.
      */
    var BackupCreationDateTime: js.UndefOr[BackupCreationDateTime] = js.undefined
    /**
      * Time at which the automatic on-demand backup created by DynamoDB will expire. This SYSTEM on-demand backup expires automatically 35 days after its creation.
      */
    var BackupExpiryDateTime: js.UndefOr[_Date] = js.undefined
    /**
      * Name of the specified backup.
      */
    var BackupName: js.UndefOr[BackupName] = js.undefined
    /**
      * Size of the backup in bytes.
      */
    var BackupSizeBytes: js.UndefOr[BackupSizeBytes] = js.undefined
    /**
      * Backup can be in one of the following states: CREATING, ACTIVE, DELETED.
      */
    var BackupStatus: js.UndefOr[BackupStatus] = js.undefined
    /**
      * BackupType:    USER - You create and manage these using the on-demand backup feature.    SYSTEM - If you delete a table with point-in-time recovery enabled, a SYSTEM backup is automatically created and is retained for 35 days (at no additional cost). System backups allow you to restore the deleted table to the state it was in just before the point of deletion.   
      */
    var BackupType: js.UndefOr[BackupType] = js.undefined
    /**
      * ARN associated with the table.
      */
    var TableArn: js.UndefOr[TableArn] = js.undefined
    /**
      * Unique identifier for the table.
      */
    var TableId: js.UndefOr[TableId] = js.undefined
    /**
      * Name of the table.
      */
    var TableName: js.UndefOr[TableName] = js.undefined
  }
  
  trait BatchGetItemInput extends js.Object {
    /**
      * A map of one or more table names and, for each table, a map that describes one or more items to retrieve from that table. Each table name can be used only once per BatchGetItem request. Each element in the map of items to retrieve consists of the following:    ConsistentRead - If true, a strongly consistent read is used; if false (the default), an eventually consistent read is used.    ExpressionAttributeNames - One or more substitution tokens for attribute names in the ProjectionExpression parameter. The following are some use cases for using ExpressionAttributeNames:   To access an attribute whose name conflicts with a DynamoDB reserved word.   To create a placeholder for repeating occurrences of an attribute name in an expression.   To prevent special characters in an attribute name from being misinterpreted in an expression.   Use the # character in an expression to dereference an attribute name. For example, consider the following attribute name:    Percentile    The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression. (For the complete list of reserved words, see Reserved Words in the Amazon DynamoDB Developer Guide). To work around this, you could specify the following for ExpressionAttributeNames:    {"#P":"Percentile"}    You could then use this substitution in an expression, as in this example:    #P = :val     Tokens that begin with the : character are expression attribute values, which are placeholders for the actual value at runtime.  For more information on expression attribute names, see Accessing Item Attributes in the Amazon DynamoDB Developer Guide.    Keys - An array of primary key attribute values that define specific items in the table. For each primary key, you must provide all of the key attributes. For example, with a simple primary key, you only need to provide the partition key value. For a composite key, you must provide both the partition key value and the sort key value.    ProjectionExpression - A string that identifies one or more attributes to retrieve from the table. These attributes can include scalars, sets, or elements of a JSON document. The attributes in the expression must be separated by commas. If no attribute names are specified, then all attributes will be returned. If any of the requested attributes are not found, they will not appear in the result. For more information, see Accessing Item Attributes in the Amazon DynamoDB Developer Guide.    AttributesToGet - This is a legacy parameter. Use ProjectionExpression instead. For more information, see AttributesToGet in the Amazon DynamoDB Developer Guide.   
      */
    var RequestItems: BatchGetRequestMap
    var ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity] = js.undefined
  }
  
  trait BatchGetItemOutput extends js.Object {
    /**
      * The read capacity units consumed by the entire BatchGetItem operation. Each element consists of:    TableName - The table that consumed the provisioned throughput.    CapacityUnits - The total number of capacity units consumed.  
      */
    var ConsumedCapacity: js.UndefOr[ConsumedCapacityMultiple] = js.undefined
    /**
      * A map of table name to a list of items. Each object in Responses consists of a table name, along with a map of attribute data consisting of the data type and attribute value.
      */
    var Responses: js.UndefOr[BatchGetResponseMap] = js.undefined
    /**
      * A map of tables and their respective keys that were not processed with the current response. The UnprocessedKeys value is in the same form as RequestItems, so the value can be provided directly to a subsequent BatchGetItem operation. For more information, see RequestItems in the Request Parameters section. Each element consists of:    Keys - An array of primary key attribute values that define specific items in the table.    ProjectionExpression - One or more attributes to be retrieved from the table or index. By default, all attributes are returned. If a requested attribute is not found, it does not appear in the result.    ConsistentRead - The consistency of a read operation. If set to true, then a strongly consistent read is used; otherwise, an eventually consistent read is used.   If there are no unprocessed keys remaining, the response contains an empty UnprocessedKeys map.
      */
    var UnprocessedKeys: js.UndefOr[BatchGetRequestMap] = js.undefined
  }
  
  trait BatchGetRequestMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[KeysAndAttributes]
  
  trait BatchGetResponseMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[ItemList]
  
  trait BatchWriteItemInput extends js.Object {
    /**
      * A map of one or more table names and, for each table, a list of operations to be performed (DeleteRequest or PutRequest). Each element in the map consists of the following:    DeleteRequest - Perform a DeleteItem operation on the specified item. The item to be deleted is identified by a Key subelement:    Key - A map of primary key attribute values that uniquely identify the item. Each entry in this map consists of an attribute name and an attribute value. For each primary key, you must provide all of the key attributes. For example, with a simple primary key, you only need to provide a value for the partition key. For a composite primary key, you must provide values for both the partition key and the sort key.      PutRequest - Perform a PutItem operation on the specified item. The item to be put is identified by an Item subelement:    Item - A map of attributes and their values. Each entry in this map consists of an attribute name and an attribute value. Attribute values must not be null; string and binary type attributes must have lengths greater than zero; and set type attributes must not be empty. Requests that contain empty values will be rejected with a ValidationException exception. If you specify any attributes that are part of an index key, then the data types for those attributes must match those of the schema in the table's attribute definition.    
      */
    var RequestItems: BatchWriteItemRequestMap
    var ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity] = js.undefined
    /**
      * Determines whether item collection metrics are returned. If set to SIZE, the response includes statistics about item collections, if any, that were modified during the operation are returned in the response. If set to NONE (the default), no statistics are returned.
      */
    var ReturnItemCollectionMetrics: js.UndefOr[ReturnItemCollectionMetrics] = js.undefined
  }
  
  trait BatchWriteItemOutput extends js.Object {
    /**
      * The capacity units consumed by the entire BatchWriteItem operation. Each element consists of:    TableName - The table that consumed the provisioned throughput.    CapacityUnits - The total number of capacity units consumed.  
      */
    var ConsumedCapacity: js.UndefOr[ConsumedCapacityMultiple] = js.undefined
    /**
      * A list of tables that were processed by BatchWriteItem and, for each table, information about any item collections that were affected by individual DeleteItem or PutItem operations. Each entry consists of the following subelements:    ItemCollectionKey - The partition key value of the item collection. This is the same as the partition key value of the item.    SizeEstimateRangeGB - An estimate of item collection size, expressed in GB. This is a two-element array containing a lower bound and an upper bound for the estimate. The estimate includes the size of all the items in the table, plus the size of all attributes projected into all of the local secondary indexes on the table. Use this estimate to measure whether a local secondary index is approaching its size limit. The estimate is subject to change over time; therefore, do not rely on the precision or accuracy of the estimate.  
      */
    var ItemCollectionMetrics: js.UndefOr[ItemCollectionMetricsPerTable] = js.undefined
    /**
      * A map of tables and requests against those tables that were not processed. The UnprocessedItems value is in the same form as RequestItems, so you can provide this value directly to a subsequent BatchGetItem operation. For more information, see RequestItems in the Request Parameters section. Each UnprocessedItems entry consists of a table name and, for that table, a list of operations to perform (DeleteRequest or PutRequest).    DeleteRequest - Perform a DeleteItem operation on the specified item. The item to be deleted is identified by a Key subelement:    Key - A map of primary key attribute values that uniquely identify the item. Each entry in this map consists of an attribute name and an attribute value.      PutRequest - Perform a PutItem operation on the specified item. The item to be put is identified by an Item subelement:    Item - A map of attributes and their values. Each entry in this map consists of an attribute name and an attribute value. Attribute values must not be null; string and binary type attributes must have lengths greater than zero; and set type attributes must not be empty. Requests that contain empty values will be rejected with a ValidationException exception. If you specify any attributes that are part of an index key, then the data types for those attributes must match those of the schema in the table's attribute definition.     If there are no unprocessed items remaining, the response contains an empty UnprocessedItems map.
      */
    var UnprocessedItems: js.UndefOr[BatchWriteItemRequestMap] = js.undefined
  }
  
  trait BatchWriteItemRequestMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[WriteRequests]
  
  trait BillingModeSummary extends js.Object {
    /**
      * Controls how you are charged for read and write throughput and how you manage capacity. This setting can be changed later.    PROVISIONED - Sets the read/write capacity mode to PROVISIONED. We recommend using PROVISIONED for predictable workloads.    PAY_PER_REQUEST - Sets the read/write capacity mode to PAY_PER_REQUEST. We recommend using PAY_PER_REQUEST for unpredictable workloads.   
      */
    var BillingMode: js.UndefOr[BillingMode] = js.undefined
    /**
      * Represents the time when PAY_PER_REQUEST was last set as the read/write capacity mode.
      */
    var LastUpdateToPayPerRequestDateTime: js.UndefOr[_Date] = js.undefined
  }
  
  trait Capacity extends js.Object {
    /**
      * The total number of capacity units consumed on a table or an index.
      */
    var CapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.undefined
    /**
      * The total number of read capacity units consumed on a table or an index.
      */
    var ReadCapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.undefined
    /**
      * The total number of write capacity units consumed on a table or an index.
      */
    var WriteCapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.undefined
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait Condition extends js.Object {
    /**
      * One or more values to evaluate against the supplied attribute. The number of values in the list depends on the ComparisonOperator being used. For type Number, value comparisons are numeric. String value comparisons for greater than, equals, or less than are based on ASCII character code values. For example, a is greater than A, and a is greater than B. For a list of code values, see http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters. For Binary, DynamoDB treats each byte of the binary data as unsigned when it compares binary values.
      */
    var AttributeValueList: js.UndefOr[AttributeValueList] = js.undefined
    /**
      * A comparator for evaluating attributes. For example, equals, greater than, less than, etc. The following comparison operators are available:  EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN  The following are descriptions of each comparison operator.    EQ : Equal. EQ is supported for all data types, including lists and maps.  AttributeValueList can contain only one AttributeValue element of type String, Number, Binary, String Set, Number Set, or Binary Set. If an item contains an AttributeValue element of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not equal {"NS":["6", "2", "1"]}.     NE : Not equal. NE is supported for all data types, including lists and maps.  AttributeValueList can contain only one AttributeValue of type String, Number, Binary, String Set, Number Set, or Binary Set. If an item contains an AttributeValue of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not equal {"NS":["6", "2", "1"]}.     LE : Less than or equal.   AttributeValueList can contain only one AttributeValue element of type String, Number, or Binary (not a set type). If an item contains an AttributeValue element of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not compare to {"NS":["6", "2", "1"]}.     LT : Less than.   AttributeValueList can contain only one AttributeValue of type String, Number, or Binary (not a set type). If an item contains an AttributeValue element of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not compare to {"NS":["6", "2", "1"]}.     GE : Greater than or equal.   AttributeValueList can contain only one AttributeValue element of type String, Number, or Binary (not a set type). If an item contains an AttributeValue element of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not compare to {"NS":["6", "2", "1"]}.     GT : Greater than.   AttributeValueList can contain only one AttributeValue element of type String, Number, or Binary (not a set type). If an item contains an AttributeValue element of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not compare to {"NS":["6", "2", "1"]}.     NOT_NULL : The attribute exists. NOT_NULL is supported for all data types, including lists and maps.  This operator tests for the existence of an attribute, not its data type. If the data type of attribute "a" is null, and you evaluate it using NOT_NULL, the result is a Boolean true. This result is because the attribute "a" exists; its data type is not relevant to the NOT_NULL comparison operator.     NULL : The attribute does not exist. NULL is supported for all data types, including lists and maps.  This operator tests for the nonexistence of an attribute, not its data type. If the data type of attribute "a" is null, and you evaluate it using NULL, the result is a Boolean false. This is because the attribute "a" exists; its data type is not relevant to the NULL comparison operator.     CONTAINS : Checks for a subsequence, or value in a set.  AttributeValueList can contain only one AttributeValue element of type String, Number, or Binary (not a set type). If the target attribute of the comparison is of type String, then the operator checks for a substring match. If the target attribute of the comparison is of type Binary, then the operator looks for a subsequence of the target that matches the input. If the target attribute of the comparison is a set ("SS", "NS", or "BS"), then the operator evaluates to true if it finds an exact match with any member of the set. CONTAINS is supported for lists: When evaluating "a CONTAINS b", "a" can be a list; however, "b" cannot be a set, a map, or a list.    NOT_CONTAINS : Checks for absence of a subsequence, or absence of a value in a set.  AttributeValueList can contain only one AttributeValue element of type String, Number, or Binary (not a set type). If the target attribute of the comparison is a String, then the operator checks for the absence of a substring match. If the target attribute of the comparison is Binary, then the operator checks for the absence of a subsequence of the target that matches the input. If the target attribute of the comparison is a set ("SS", "NS", or "BS"), then the operator evaluates to true if it does not find an exact match with any member of the set. NOT_CONTAINS is supported for lists: When evaluating "a NOT CONTAINS b", "a" can be a list; however, "b" cannot be a set, a map, or a list.    BEGINS_WITH : Checks for a prefix.   AttributeValueList can contain only one AttributeValue of type String or Binary (not a Number or a set type). The target attribute of the comparison must be of type String or Binary (not a Number or a set type).     IN : Checks for matching elements in a list.  AttributeValueList can contain one or more AttributeValue elements of type String, Number, or Binary. These attributes are compared against an existing attribute of an item. If any elements of the input are equal to the item attribute, the expression evaluates to true.    BETWEEN : Greater than or equal to the first value, and less than or equal to the second value.   AttributeValueList must contain two AttributeValue elements of the same type, either String, Number, or Binary (not a set type). A target attribute matches if the target value is greater than, or equal to, the first element and less than, or equal to, the second element. If an item contains an AttributeValue element of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not compare to {"N":"6"}. Also, {"N":"6"} does not compare to {"NS":["6", "2", "1"]}    For usage examples of AttributeValueList and ComparisonOperator, see Legacy Conditional Parameters in the Amazon DynamoDB Developer Guide.
      */
    var ComparisonOperator: ComparisonOperator
  }
  
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
  
  trait ConsumedCapacity extends js.Object {
    /**
      * The total number of capacity units consumed by the operation.
      */
    var CapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.undefined
    /**
      * The amount of throughput consumed on each global index affected by the operation.
      */
    var GlobalSecondaryIndexes: js.UndefOr[SecondaryIndexesCapacityMap] = js.undefined
    /**
      * The amount of throughput consumed on each local index affected by the operation.
      */
    var LocalSecondaryIndexes: js.UndefOr[SecondaryIndexesCapacityMap] = js.undefined
    /**
      * The total number of read capacity units consumed by the operation.
      */
    var ReadCapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.undefined
    /**
      * The amount of throughput consumed on the table affected by the operation.
      */
    var Table: js.UndefOr[Capacity] = js.undefined
    /**
      * The name of the table that was affected by the operation.
      */
    var TableName: js.UndefOr[TableName] = js.undefined
    /**
      * The total number of write capacity units consumed by the operation.
      */
    var WriteCapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.undefined
  }
  
  trait ContinuousBackupsDescription extends js.Object {
    /**
      *  ContinuousBackupsStatus can be one of the following states: ENABLED, DISABLED
      */
    var ContinuousBackupsStatus: ContinuousBackupsStatus
    /**
      * The description of the point in time recovery settings applied to the table.
      */
    var PointInTimeRecoveryDescription: js.UndefOr[PointInTimeRecoveryDescription] = js.undefined
  }
  
  @js.native
  class Converter () extends js.Object
  
  trait CreateBackupInput extends js.Object {
    /**
      * Specified name for the backup.
      */
    var BackupName: BackupName
    /**
      * The name of the table.
      */
    var TableName: TableName
  }
  
  trait CreateBackupOutput extends js.Object {
    /**
      * Contains the details of the backup created for the table.
      */
    var BackupDetails: js.UndefOr[BackupDetails] = js.undefined
  }
  
  trait CreateGlobalSecondaryIndexAction extends js.Object {
    /**
      * The name of the global secondary index to be created.
      */
    var IndexName: IndexName
    /**
      * The key schema for the global secondary index.
      */
    var KeySchema: KeySchema
    /**
      * Represents attributes that are copied (projected) from the table into an index. These are in addition to the primary key attributes and index key attributes, which are automatically projected.
      */
    var Projection: Projection
    /**
      * Represents the provisioned throughput settings for the specified global secondary index. For current minimum and maximum provisioned throughput values, see Limits in the Amazon DynamoDB Developer Guide.
      */
    var ProvisionedThroughput: js.UndefOr[ProvisionedThroughput] = js.undefined
  }
  
  trait CreateGlobalTableInput extends js.Object {
    /**
      * The global table name.
      */
    var GlobalTableName: TableName
    /**
      * The regions where the global table needs to be created.
      */
    var ReplicationGroup: ReplicaList
  }
  
  trait CreateGlobalTableOutput extends js.Object {
    /**
      * Contains the details of the global table.
      */
    var GlobalTableDescription: js.UndefOr[GlobalTableDescription] = js.undefined
  }
  
  trait CreateReplicaAction extends js.Object {
    /**
      * The region of the replica to be added.
      */
    var RegionName: RegionName
  }
  
  trait CreateTableInput extends js.Object {
    /**
      * An array of attributes that describe the key schema for the table and indexes.
      */
    var AttributeDefinitions: AttributeDefinitions
    /**
      * Controls how you are charged for read and write throughput and how you manage capacity. This setting can be changed later.    PROVISIONED - Sets the billing mode to PROVISIONED. We recommend using PROVISIONED for predictable workloads.    PAY_PER_REQUEST - Sets the billing mode to PAY_PER_REQUEST. We recommend using PAY_PER_REQUEST for unpredictable workloads.   
      */
    var BillingMode: js.UndefOr[BillingMode] = js.undefined
    /**
      * One or more global secondary indexes (the maximum is five) to be created on the table. Each global secondary index in the array includes the following:    IndexName - The name of the global secondary index. Must be unique only for this table.     KeySchema - Specifies the key schema for the global secondary index.    Projection - Specifies attributes that are copied (projected) from the table into the index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. Each attribute specification is composed of:    ProjectionType - One of the following:    KEYS_ONLY - Only the index and primary keys are projected into the index.    INCLUDE - Only the specified table attributes are projected into the index. The list of projected attributes are in NonKeyAttributes.    ALL - All of the table attributes are projected into the index.      NonKeyAttributes - A list of one or more non-key attribute names that are projected into the secondary index. The total count of attributes provided in NonKeyAttributes, summed across all of the secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts as two distinct attributes when determining the total.      ProvisionedThroughput - The provisioned throughput settings for the global secondary index, consisting of read and write capacity units.  
      */
    var GlobalSecondaryIndexes: js.UndefOr[GlobalSecondaryIndexList] = js.undefined
    /**
      * Specifies the attributes that make up the primary key for a table or an index. The attributes in KeySchema must also be defined in the AttributeDefinitions array. For more information, see Data Model in the Amazon DynamoDB Developer Guide. Each KeySchemaElement in the array is composed of:    AttributeName - The name of this key attribute.    KeyType - The role that the key attribute will assume:    HASH - partition key    RANGE - sort key      The partition key of an item is also known as its hash attribute. The term "hash attribute" derives from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values. The sort key of an item is also known as its range attribute. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value.  For a simple primary key (partition key), you must provide exactly one element with a KeyType of HASH. For a composite primary key (partition key and sort key), you must provide exactly two elements, in this order: The first element must have a KeyType of HASH, and the second element must have a KeyType of RANGE. For more information, see Specifying the Primary Key in the Amazon DynamoDB Developer Guide.
      */
    var KeySchema: KeySchema
    /**
      * One or more local secondary indexes (the maximum is five) to be created on the table. Each index is scoped to a given partition key value. There is a 10 GB size limit per partition key value; otherwise, the size of a local secondary index is unconstrained. Each local secondary index in the array includes the following:    IndexName - The name of the local secondary index. Must be unique only for this table.     KeySchema - Specifies the key schema for the local secondary index. The key schema must begin with the same partition key as the table.    Projection - Specifies attributes that are copied (projected) from the table into the index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. Each attribute specification is composed of:    ProjectionType - One of the following:    KEYS_ONLY - Only the index and primary keys are projected into the index.    INCLUDE - Only the specified table attributes are projected into the index. The list of projected attributes are in NonKeyAttributes.    ALL - All of the table attributes are projected into the index.      NonKeyAttributes - A list of one or more non-key attribute names that are projected into the secondary index. The total count of attributes provided in NonKeyAttributes, summed across all of the secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts as two distinct attributes when determining the total.    
      */
    var LocalSecondaryIndexes: js.UndefOr[LocalSecondaryIndexList] = js.undefined
    /**
      * Represents the provisioned throughput settings for a specified table or index. The settings can be modified using the UpdateTable operation.  If you set BillingMode as PROVISIONED, you must specify this property. If you set BillingMode as PAY_PER_REQUEST, you cannot specify this property.  For current minimum and maximum provisioned throughput values, see Limits in the Amazon DynamoDB Developer Guide.
      */
    var ProvisionedThroughput: js.UndefOr[ProvisionedThroughput] = js.undefined
    /**
      * Represents the settings used to enable server-side encryption.
      */
    var SSESpecification: js.UndefOr[SSESpecification] = js.undefined
    /**
      * The settings for DynamoDB Streams on the table. These settings consist of:    StreamEnabled - Indicates whether Streams is to be enabled (true) or disabled (false).    StreamViewType - When an item in the table is modified, StreamViewType determines what information is written to the table's stream. Valid values for StreamViewType are:    KEYS_ONLY - Only the key attributes of the modified item are written to the stream.    NEW_IMAGE - The entire item, as it appears after it was modified, is written to the stream.    OLD_IMAGE - The entire item, as it appeared before it was modified, is written to the stream.    NEW_AND_OLD_IMAGES - Both the new and the old item images of the item are written to the stream.    
      */
    var StreamSpecification: js.UndefOr[StreamSpecification] = js.undefined
    /**
      * The name of the table to create.
      */
    var TableName: TableName
  }
  
  trait CreateTableOutput extends js.Object {
    /**
      * Represents the properties of the table.
      */
    var TableDescription: js.UndefOr[TableDescription] = js.undefined
  }
  
  trait Delete extends js.Object {
    /**
      * A condition that must be satisfied in order for a conditional delete to succeed.
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
      * The primary key of the item to be deleted. Each element consists of an attribute name and a value for that attribute.
      */
    var Key: Key
    /**
      * Use ReturnValuesOnConditionCheckFailure to get the item attributes if the Delete condition fails. For ReturnValuesOnConditionCheckFailure, the valid values are: NONE and ALL_OLD.
      */
    var ReturnValuesOnConditionCheckFailure: js.UndefOr[ReturnValuesOnConditionCheckFailure] = js.undefined
    /**
      * Name of the table in which the item to be deleted resides.
      */
    var TableName: TableName
  }
  
  trait DeleteBackupInput extends js.Object {
    /**
      * The ARN associated with the backup.
      */
    var BackupArn: BackupArn
  }
  
  trait DeleteBackupOutput extends js.Object {
    /**
      * Contains the description of the backup created for the table.
      */
    var BackupDescription: js.UndefOr[BackupDescription] = js.undefined
  }
  
  trait DeleteGlobalSecondaryIndexAction extends js.Object {
    /**
      * The name of the global secondary index to be deleted.
      */
    var IndexName: IndexName
  }
  
  trait DeleteItemInput extends js.Object {
    /**
      * A condition that must be satisfied in order for a conditional DeleteItem to succeed. An expression can contain any of the following:   Functions: attribute_exists | attribute_not_exists | attribute_type | contains | begins_with | size  These function names are case-sensitive.   Comparison operators: = | &lt;&gt; | &lt; | &gt; | &lt;= | &gt;= | BETWEEN | IN      Logical operators: AND | OR | NOT    For more information on condition expressions, see Specifying Conditions in the Amazon DynamoDB Developer Guide.
      */
    var ConditionExpression: js.UndefOr[ConditionExpression] = js.undefined
    /**
      * This is a legacy parameter. Use ConditionExpression instead. For more information, see ConditionalOperator in the Amazon DynamoDB Developer Guide.
      */
    var ConditionalOperator: js.UndefOr[ConditionalOperator] = js.undefined
    /**
      * This is a legacy parameter. Use ConditionExpression instead. For more information, see Expected in the Amazon DynamoDB Developer Guide.
      */
    var Expected: js.UndefOr[ExpectedAttributeMap] = js.undefined
    /**
      * One or more substitution tokens for attribute names in an expression. The following are some use cases for using ExpressionAttributeNames:   To access an attribute whose name conflicts with a DynamoDB reserved word.   To create a placeholder for repeating occurrences of an attribute name in an expression.   To prevent special characters in an attribute name from being misinterpreted in an expression.   Use the # character in an expression to dereference an attribute name. For example, consider the following attribute name:    Percentile    The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression. (For the complete list of reserved words, see Reserved Words in the Amazon DynamoDB Developer Guide). To work around this, you could specify the following for ExpressionAttributeNames:    {"#P":"Percentile"}    You could then use this substitution in an expression, as in this example:    #P = :val     Tokens that begin with the : character are expression attribute values, which are placeholders for the actual value at runtime.  For more information on expression attribute names, see Accessing Item Attributes in the Amazon DynamoDB Developer Guide.
      */
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined
    /**
      * One or more values that can be substituted in an expression. Use the : (colon) character in an expression to dereference an attribute value. For example, suppose that you wanted to check whether the value of the ProductStatus attribute was one of the following:   Available | Backordered | Discontinued  You would first need to specify ExpressionAttributeValues as follows:  { ":avail":{"S":"Available"}, ":back":{"S":"Backordered"}, ":disc":{"S":"Discontinued"} }  You could then use these values in an expression, such as this:  ProductStatus IN (:avail, :back, :disc)  For more information on expression attribute values, see Specifying Conditions in the Amazon DynamoDB Developer Guide.
      */
    var ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap] = js.undefined
    /**
      * A map of attribute names to AttributeValue objects, representing the primary key of the item to delete. For the primary key, you must provide all of the attributes. For example, with a simple primary key, you only need to provide a value for the partition key. For a composite primary key, you must provide values for both the partition key and the sort key.
      */
    var Key: Key
    var ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity] = js.undefined
    /**
      * Determines whether item collection metrics are returned. If set to SIZE, the response includes statistics about item collections, if any, that were modified during the operation are returned in the response. If set to NONE (the default), no statistics are returned.
      */
    var ReturnItemCollectionMetrics: js.UndefOr[ReturnItemCollectionMetrics] = js.undefined
    /**
      * Use ReturnValues if you want to get the item attributes as they appeared before they were deleted. For DeleteItem, the valid values are:    NONE - If ReturnValues is not specified, or if its value is NONE, then nothing is returned. (This setting is the default for ReturnValues.)    ALL_OLD - The content of the old item is returned.    The ReturnValues parameter is used by several DynamoDB operations; however, DeleteItem does not recognize any values other than NONE or ALL_OLD. 
      */
    var ReturnValues: js.UndefOr[ReturnValue] = js.undefined
    /**
      * The name of the table from which to delete the item.
      */
    var TableName: TableName
  }
  
  trait DeleteItemOutput extends js.Object {
    /**
      * A map of attribute names to AttributeValue objects, representing the item as it appeared before the DeleteItem operation. This map appears in the response only if ReturnValues was specified as ALL_OLD in the request.
      */
    var Attributes: js.UndefOr[AttributeMap] = js.undefined
    /**
      * The capacity units consumed by the DeleteItem operation. The data returned includes the total provisioned throughput consumed, along with statistics for the table and any indexes involved in the operation. ConsumedCapacity is only returned if the ReturnConsumedCapacity parameter was specified. For more information, see Provisioned Throughput in the Amazon DynamoDB Developer Guide.
      */
    var ConsumedCapacity: js.UndefOr[ConsumedCapacity] = js.undefined
    /**
      * Information about item collections, if any, that were affected by the DeleteItem operation. ItemCollectionMetrics is only returned if the ReturnItemCollectionMetrics parameter was specified. If the table does not have any local secondary indexes, this information is not returned in the response. Each ItemCollectionMetrics element consists of:    ItemCollectionKey - The partition key value of the item collection. This is the same as the partition key value of the item itself.    SizeEstimateRangeGB - An estimate of item collection size, in gigabytes. This value is a two-element array containing a lower bound and an upper bound for the estimate. The estimate includes the size of all the items in the table, plus the size of all attributes projected into all of the local secondary indexes on that table. Use this estimate to measure whether a local secondary index is approaching its size limit. The estimate is subject to change over time; therefore, do not rely on the precision or accuracy of the estimate.  
      */
    var ItemCollectionMetrics: js.UndefOr[ItemCollectionMetrics] = js.undefined
  }
  
  trait DeleteReplicaAction extends js.Object {
    /**
      * The region of the replica to be removed.
      */
    var RegionName: RegionName
  }
  
  trait DeleteRequest extends js.Object {
    /**
      * A map of attribute name to attribute values, representing the primary key of the item to delete. All of the table's primary key attributes must be specified, and their data types must match those of the table's key schema.
      */
    var Key: Key
  }
  
  trait DeleteTableInput extends js.Object {
    /**
      * The name of the table to delete.
      */
    var TableName: TableName
  }
  
  trait DeleteTableOutput extends js.Object {
    /**
      * Represents the properties of a table.
      */
    var TableDescription: js.UndefOr[TableDescription] = js.undefined
  }
  
  trait DescribeBackupInput extends js.Object {
    /**
      * The ARN associated with the backup.
      */
    var BackupArn: BackupArn
  }
  
  trait DescribeBackupOutput extends js.Object {
    /**
      * Contains the description of the backup created for the table.
      */
    var BackupDescription: js.UndefOr[BackupDescription] = js.undefined
  }
  
  trait DescribeContinuousBackupsInput extends js.Object {
    /**
      * Name of the table for which the customer wants to check the continuous backups and point in time recovery settings.
      */
    var TableName: TableName
  }
  
  trait DescribeContinuousBackupsOutput extends js.Object {
    /**
      * Represents the continuous backups and point in time recovery settings on the table.
      */
    var ContinuousBackupsDescription: js.UndefOr[ContinuousBackupsDescription] = js.undefined
  }
  
  trait DescribeEndpointsRequest extends js.Object
  
  trait DescribeEndpointsResponse extends js.Object {
    var Endpoints: Endpoints
  }
  
  trait DescribeGlobalTableInput extends js.Object {
    /**
      * The name of the global table.
      */
    var GlobalTableName: TableName
  }
  
  trait DescribeGlobalTableOutput extends js.Object {
    /**
      * Contains the details of the global table.
      */
    var GlobalTableDescription: js.UndefOr[GlobalTableDescription] = js.undefined
  }
  
  trait DescribeGlobalTableSettingsInput extends js.Object {
    /**
      * The name of the global table to describe.
      */
    var GlobalTableName: TableName
  }
  
  trait DescribeGlobalTableSettingsOutput extends js.Object {
    /**
      * The name of the global table.
      */
    var GlobalTableName: js.UndefOr[TableName] = js.undefined
    /**
      * The region specific settings for the global table.
      */
    var ReplicaSettings: js.UndefOr[ReplicaSettingsDescriptionList] = js.undefined
  }
  
  trait DescribeLimitsInput extends js.Object
  
  trait DescribeLimitsOutput extends js.Object {
    /**
      * The maximum total read capacity units that your account allows you to provision across all of your tables in this region.
      */
    var AccountMaxReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined
    /**
      * The maximum total write capacity units that your account allows you to provision across all of your tables in this region.
      */
    var AccountMaxWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined
    /**
      * The maximum read capacity units that your account allows you to provision for a new table that you are creating in this region, including the read capacity units provisioned for its global secondary indexes (GSIs).
      */
    var TableMaxReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined
    /**
      * The maximum write capacity units that your account allows you to provision for a new table that you are creating in this region, including the write capacity units provisioned for its global secondary indexes (GSIs).
      */
    var TableMaxWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined
  }
  
  trait DescribeTableInput extends js.Object {
    /**
      * The name of the table to describe.
      */
    var TableName: TableName
  }
  
  trait DescribeTableOutput extends js.Object {
    /**
      * The properties of the table.
      */
    var Table: js.UndefOr[TableDescription] = js.undefined
  }
  
  trait DescribeTimeToLiveInput extends js.Object {
    /**
      * The name of the table to be described.
      */
    var TableName: TableName
  }
  
  trait DescribeTimeToLiveOutput extends js.Object {
    /**
      * 
      */
    var TimeToLiveDescription: js.UndefOr[TimeToLiveDescription] = js.undefined
  }
  
  @js.native
  /**
    * Creates a DynamoDB document client with a set of configuration options.
    */
  class DocumentClient () extends js.Object {
    def this(options: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.DocumentClientOptions with ClientConfiguration) = this()
    /**
      * Returns the attributes of one or more items from one or more tables by delegating to AWS.DynamoDB.batchGetItem().
      */
    def batchGet(params: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BatchGetItemInput): awsDashSdkLib.libRequestMod.Request[
        awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BatchGetItemOutput, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
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
          scala.Double | java.lang.String | awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.binaryType
        ]
    ): awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.DynamoDbSet = js.native
    def createSet(
      list: js.Array[
          scala.Double | java.lang.String | awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.binaryType
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
    def transactGet(params: TransactGetItemsInput): awsDashSdkLib.libRequestMod.Request[TransactGetItemsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def transactGet(
      params: TransactGetItemsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TransactGetItemsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TransactGetItemsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Synchronous write operation that groups up to 10 action requests
      */
    def transactWrite(params: TransactWriteItemsInput): awsDashSdkLib.libRequestMod.Request[TransactWriteItemsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def transactWrite(
      params: TransactWriteItemsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TransactWriteItemsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TransactWriteItemsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Edits an existing item's attributes, or adds a new item to the table if it does not already exist by delegating to AWS.DynamoDB.updateItem().
      */
    def update(params: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.UpdateItemInput): awsDashSdkLib.libRequestMod.Request[
        awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.UpdateItemOutput, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
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
  
  trait Endpoint extends js.Object {
    var Address: String
    var CachePeriodInMinutes: Long
  }
  
  trait ExpectedAttributeMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[ExpectedAttributeValue]
  
  trait ExpectedAttributeValue extends js.Object {
    /**
      * One or more values to evaluate against the supplied attribute. The number of values in the list depends on the ComparisonOperator being used. For type Number, value comparisons are numeric. String value comparisons for greater than, equals, or less than are based on ASCII character code values. For example, a is greater than A, and a is greater than B. For a list of code values, see http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters. For Binary, DynamoDB treats each byte of the binary data as unsigned when it compares binary values. For information on specifying data types in JSON, see JSON Data Format in the Amazon DynamoDB Developer Guide.
      */
    var AttributeValueList: js.UndefOr[AttributeValueList] = js.undefined
    /**
      * A comparator for evaluating attributes in the AttributeValueList. For example, equals, greater than, less than, etc. The following comparison operators are available:  EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN  The following are descriptions of each comparison operator.    EQ : Equal. EQ is supported for all data types, including lists and maps.  AttributeValueList can contain only one AttributeValue element of type String, Number, Binary, String Set, Number Set, or Binary Set. If an item contains an AttributeValue element of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not equal {"NS":["6", "2", "1"]}.     NE : Not equal. NE is supported for all data types, including lists and maps.  AttributeValueList can contain only one AttributeValue of type String, Number, Binary, String Set, Number Set, or Binary Set. If an item contains an AttributeValue of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not equal {"NS":["6", "2", "1"]}.     LE : Less than or equal.   AttributeValueList can contain only one AttributeValue element of type String, Number, or Binary (not a set type). If an item contains an AttributeValue element of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not compare to {"NS":["6", "2", "1"]}.     LT : Less than.   AttributeValueList can contain only one AttributeValue of type String, Number, or Binary (not a set type). If an item contains an AttributeValue element of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not compare to {"NS":["6", "2", "1"]}.     GE : Greater than or equal.   AttributeValueList can contain only one AttributeValue element of type String, Number, or Binary (not a set type). If an item contains an AttributeValue element of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not compare to {"NS":["6", "2", "1"]}.     GT : Greater than.   AttributeValueList can contain only one AttributeValue element of type String, Number, or Binary (not a set type). If an item contains an AttributeValue element of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not compare to {"NS":["6", "2", "1"]}.     NOT_NULL : The attribute exists. NOT_NULL is supported for all data types, including lists and maps.  This operator tests for the existence of an attribute, not its data type. If the data type of attribute "a" is null, and you evaluate it using NOT_NULL, the result is a Boolean true. This result is because the attribute "a" exists; its data type is not relevant to the NOT_NULL comparison operator.     NULL : The attribute does not exist. NULL is supported for all data types, including lists and maps.  This operator tests for the nonexistence of an attribute, not its data type. If the data type of attribute "a" is null, and you evaluate it using NULL, the result is a Boolean false. This is because the attribute "a" exists; its data type is not relevant to the NULL comparison operator.     CONTAINS : Checks for a subsequence, or value in a set.  AttributeValueList can contain only one AttributeValue element of type String, Number, or Binary (not a set type). If the target attribute of the comparison is of type String, then the operator checks for a substring match. If the target attribute of the comparison is of type Binary, then the operator looks for a subsequence of the target that matches the input. If the target attribute of the comparison is a set ("SS", "NS", or "BS"), then the operator evaluates to true if it finds an exact match with any member of the set. CONTAINS is supported for lists: When evaluating "a CONTAINS b", "a" can be a list; however, "b" cannot be a set, a map, or a list.    NOT_CONTAINS : Checks for absence of a subsequence, or absence of a value in a set.  AttributeValueList can contain only one AttributeValue element of type String, Number, or Binary (not a set type). If the target attribute of the comparison is a String, then the operator checks for the absence of a substring match. If the target attribute of the comparison is Binary, then the operator checks for the absence of a subsequence of the target that matches the input. If the target attribute of the comparison is a set ("SS", "NS", or "BS"), then the operator evaluates to true if it does not find an exact match with any member of the set. NOT_CONTAINS is supported for lists: When evaluating "a NOT CONTAINS b", "a" can be a list; however, "b" cannot be a set, a map, or a list.    BEGINS_WITH : Checks for a prefix.   AttributeValueList can contain only one AttributeValue of type String or Binary (not a Number or a set type). The target attribute of the comparison must be of type String or Binary (not a Number or a set type).     IN : Checks for matching elements in a list.  AttributeValueList can contain one or more AttributeValue elements of type String, Number, or Binary. These attributes are compared against an existing attribute of an item. If any elements of the input are equal to the item attribute, the expression evaluates to true.    BETWEEN : Greater than or equal to the first value, and less than or equal to the second value.   AttributeValueList must contain two AttributeValue elements of the same type, either String, Number, or Binary (not a set type). A target attribute matches if the target value is greater than, or equal to, the first element and less than, or equal to, the second element. If an item contains an AttributeValue element of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not compare to {"N":"6"}. Also, {"N":"6"} does not compare to {"NS":["6", "2", "1"]}   
      */
    var ComparisonOperator: js.UndefOr[ComparisonOperator] = js.undefined
    /**
      * Causes DynamoDB to evaluate the value before attempting a conditional operation:   If Exists is true, DynamoDB will check to see if that attribute value already exists in the table. If it is found, then the operation succeeds. If it is not found, the operation fails with a ConditionCheckFailedException.   If Exists is false, DynamoDB assumes that the attribute value does not exist in the table. If in fact the value does not exist, then the assumption is valid and the operation succeeds. If the value is found, despite the assumption that it does not exist, the operation fails with a ConditionCheckFailedException.   The default setting for Exists is true. If you supply a Value all by itself, DynamoDB assumes the attribute exists: You don't have to set Exists to true, because it is implied. DynamoDB returns a ValidationException if:    Exists is true but there is no Value to check. (You expect a value to exist, but don't specify what that value is.)    Exists is false but you also provide a Value. (You cannot expect an attribute to have a value, while also expecting it not to exist.)  
      */
    var Exists: js.UndefOr[BooleanObject] = js.undefined
    /**
      * Represents the data for the expected attribute. Each attribute value is described as a name-value pair. The name is the data type, and the value is the data itself. For more information, see Data Types in the Amazon DynamoDB Developer Guide.
      */
    var Value: js.UndefOr[AttributeValue] = js.undefined
  }
  
  trait ExpressionAttributeNameMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[AttributeName]
  
  trait ExpressionAttributeValueMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[AttributeValue]
  
  trait FilterConditionMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[Condition]
  
  trait Get extends js.Object {
    /**
      * One or more substitution tokens for attribute names in the ProjectionExpression parameter.
      */
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined
    /**
      * A map of attribute names to AttributeValue objects that specifies the primary key of the item to retrieve.
      */
    var Key: Key
    /**
      * A string that identifies one or more attributes of the specified item to retrieve from the table. The attributes in the expression must be separated by commas. If no attribute names are specified, then all attributes of the specified item are returned. If any of the requested attributes are not found, they do not appear in the result.
      */
    var ProjectionExpression: js.UndefOr[ProjectionExpression] = js.undefined
    /**
      * The name of the table from which to retrieve the specified item.
      */
    var TableName: TableName
  }
  
  trait GetItemInput extends js.Object {
    /**
      * This is a legacy parameter. Use ProjectionExpression instead. For more information, see AttributesToGet in the Amazon DynamoDB Developer Guide.
      */
    var AttributesToGet: js.UndefOr[AttributeNameList] = js.undefined
    /**
      * Determines the read consistency model: If set to true, then the operation uses strongly consistent reads; otherwise, the operation uses eventually consistent reads.
      */
    var ConsistentRead: js.UndefOr[ConsistentRead] = js.undefined
    /**
      * One or more substitution tokens for attribute names in an expression. The following are some use cases for using ExpressionAttributeNames:   To access an attribute whose name conflicts with a DynamoDB reserved word.   To create a placeholder for repeating occurrences of an attribute name in an expression.   To prevent special characters in an attribute name from being misinterpreted in an expression.   Use the # character in an expression to dereference an attribute name. For example, consider the following attribute name:    Percentile    The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression. (For the complete list of reserved words, see Reserved Words in the Amazon DynamoDB Developer Guide). To work around this, you could specify the following for ExpressionAttributeNames:    {"#P":"Percentile"}    You could then use this substitution in an expression, as in this example:    #P = :val     Tokens that begin with the : character are expression attribute values, which are placeholders for the actual value at runtime.  For more information on expression attribute names, see Accessing Item Attributes in the Amazon DynamoDB Developer Guide.
      */
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined
    /**
      * A map of attribute names to AttributeValue objects, representing the primary key of the item to retrieve. For the primary key, you must provide all of the attributes. For example, with a simple primary key, you only need to provide a value for the partition key. For a composite primary key, you must provide values for both the partition key and the sort key.
      */
    var Key: Key
    /**
      * A string that identifies one or more attributes to retrieve from the table. These attributes can include scalars, sets, or elements of a JSON document. The attributes in the expression must be separated by commas. If no attribute names are specified, then all attributes will be returned. If any of the requested attributes are not found, they will not appear in the result. For more information, see Accessing Item Attributes in the Amazon DynamoDB Developer Guide.
      */
    var ProjectionExpression: js.UndefOr[ProjectionExpression] = js.undefined
    var ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity] = js.undefined
    /**
      * The name of the table containing the requested item.
      */
    var TableName: TableName
  }
  
  trait GetItemOutput extends js.Object {
    /**
      * The capacity units consumed by the GetItem operation. The data returned includes the total provisioned throughput consumed, along with statistics for the table and any indexes involved in the operation. ConsumedCapacity is only returned if the ReturnConsumedCapacity parameter was specified. For more information, see Provisioned Throughput in the Amazon DynamoDB Developer Guide.
      */
    var ConsumedCapacity: js.UndefOr[ConsumedCapacity] = js.undefined
    /**
      * A map of attribute names to AttributeValue objects, as specified by ProjectionExpression.
      */
    var Item: js.UndefOr[AttributeMap] = js.undefined
  }
  
  trait GlobalSecondaryIndex extends js.Object {
    /**
      * The name of the global secondary index. The name must be unique among all other indexes on this table.
      */
    var IndexName: IndexName
    /**
      * The complete key schema for a global secondary index, which consists of one or more pairs of attribute names and key types:    HASH - partition key    RANGE - sort key    The partition key of an item is also known as its hash attribute. The term "hash attribute" derives from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values. The sort key of an item is also known as its range attribute. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value. 
      */
    var KeySchema: KeySchema
    /**
      * Represents attributes that are copied (projected) from the table into the global secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. 
      */
    var Projection: Projection
    /**
      * Represents the provisioned throughput settings for the specified global secondary index. For current minimum and maximum provisioned throughput values, see Limits in the Amazon DynamoDB Developer Guide.
      */
    var ProvisionedThroughput: js.UndefOr[ProvisionedThroughput] = js.undefined
  }
  
  trait GlobalSecondaryIndexDescription extends js.Object {
    /**
      * Indicates whether the index is currently backfilling. Backfilling is the process of reading items from the table and determining whether they can be added to the index. (Not all items will qualify: For example, a partition key cannot have any duplicate values.) If an item can be added to the index, DynamoDB will do so. After all items have been processed, the backfilling operation is complete and Backfilling is false.  For indexes that were created during a CreateTable operation, the Backfilling attribute does not appear in the DescribeTable output. 
      */
    var Backfilling: js.UndefOr[Backfilling] = js.undefined
    /**
      * The Amazon Resource Name (ARN) that uniquely identifies the index.
      */
    var IndexArn: js.UndefOr[String] = js.undefined
    /**
      * The name of the global secondary index.
      */
    var IndexName: js.UndefOr[IndexName] = js.undefined
    /**
      * The total size of the specified index, in bytes. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.
      */
    var IndexSizeBytes: js.UndefOr[Long] = js.undefined
    /**
      * The current state of the global secondary index:    CREATING - The index is being created.    UPDATING - The index is being updated.    DELETING - The index is being deleted.    ACTIVE - The index is ready for use.  
      */
    var IndexStatus: js.UndefOr[IndexStatus] = js.undefined
    /**
      * The number of items in the specified index. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.
      */
    var ItemCount: js.UndefOr[Long] = js.undefined
    /**
      * The complete key schema for a global secondary index, which consists of one or more pairs of attribute names and key types:    HASH - partition key    RANGE - sort key    The partition key of an item is also known as its hash attribute. The term "hash attribute" derives from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values. The sort key of an item is also known as its range attribute. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value. 
      */
    var KeySchema: js.UndefOr[KeySchema] = js.undefined
    /**
      * Represents attributes that are copied (projected) from the table into the global secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. 
      */
    var Projection: js.UndefOr[Projection] = js.undefined
    /**
      * Represents the provisioned throughput settings for the specified global secondary index. For current minimum and maximum provisioned throughput values, see Limits in the Amazon DynamoDB Developer Guide.
      */
    var ProvisionedThroughput: js.UndefOr[ProvisionedThroughputDescription] = js.undefined
  }
  
  trait GlobalSecondaryIndexInfo extends js.Object {
    /**
      * The name of the global secondary index.
      */
    var IndexName: js.UndefOr[IndexName] = js.undefined
    /**
      * The complete key schema for a global secondary index, which consists of one or more pairs of attribute names and key types:    HASH - partition key    RANGE - sort key    The partition key of an item is also known as its hash attribute. The term "hash attribute" derives from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values. The sort key of an item is also known as its range attribute. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value. 
      */
    var KeySchema: js.UndefOr[KeySchema] = js.undefined
    /**
      * Represents attributes that are copied (projected) from the table into the global secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. 
      */
    var Projection: js.UndefOr[Projection] = js.undefined
    /**
      * Represents the provisioned throughput settings for the specified global secondary index. 
      */
    var ProvisionedThroughput: js.UndefOr[ProvisionedThroughput] = js.undefined
  }
  
  trait GlobalSecondaryIndexUpdate extends js.Object {
    /**
      * The parameters required for creating a global secondary index on an existing table:    IndexName      KeySchema      AttributeDefinitions      Projection      ProvisionedThroughput    
      */
    var Create: js.UndefOr[CreateGlobalSecondaryIndexAction] = js.undefined
    /**
      * The name of an existing global secondary index to be removed.
      */
    var Delete: js.UndefOr[DeleteGlobalSecondaryIndexAction] = js.undefined
    /**
      * The name of an existing global secondary index, along with new provisioned throughput settings to be applied to that index.
      */
    var Update: js.UndefOr[UpdateGlobalSecondaryIndexAction] = js.undefined
  }
  
  trait GlobalTable extends js.Object {
    /**
      * The global table name.
      */
    var GlobalTableName: js.UndefOr[TableName] = js.undefined
    /**
      * The regions where the global table has replicas.
      */
    var ReplicationGroup: js.UndefOr[ReplicaList] = js.undefined
  }
  
  trait GlobalTableDescription extends js.Object {
    /**
      * The creation time of the global table.
      */
    var CreationDateTime: js.UndefOr[_Date] = js.undefined
    /**
      * The unique identifier of the global table.
      */
    var GlobalTableArn: js.UndefOr[GlobalTableArnString] = js.undefined
    /**
      * The global table name.
      */
    var GlobalTableName: js.UndefOr[TableName] = js.undefined
    /**
      * The current state of the global table:    CREATING - The global table is being created.    UPDATING - The global table is being updated.    DELETING - The global table is being deleted.    ACTIVE - The global table is ready for use.  
      */
    var GlobalTableStatus: js.UndefOr[GlobalTableStatus] = js.undefined
    /**
      * The regions where the global table has replicas.
      */
    var ReplicationGroup: js.UndefOr[ReplicaDescriptionList] = js.undefined
  }
  
  trait GlobalTableGlobalSecondaryIndexSettingsUpdate extends js.Object {
    /**
      * The name of the global secondary index. The name must be unique among all other indexes on this table.
      */
    var IndexName: IndexName
    /**
      * AutoScaling settings for managing a global secondary index's write capacity units.
      */
    var ProvisionedWriteCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.undefined
    /**
      * The maximum number of writes consumed per second before DynamoDB returns a ThrottlingException. 
      */
    var ProvisionedWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined
  }
  
  trait ItemCollectionKeyAttributeMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[AttributeValue]
  
  trait ItemCollectionMetrics extends js.Object {
    /**
      * The partition key value of the item collection. This value is the same as the partition key value of the item.
      */
    var ItemCollectionKey: js.UndefOr[ItemCollectionKeyAttributeMap] = js.undefined
    /**
      * An estimate of item collection size, in gigabytes. This value is a two-element array containing a lower bound and an upper bound for the estimate. The estimate includes the size of all the items in the table, plus the size of all attributes projected into all of the local secondary indexes on that table. Use this estimate to measure whether a local secondary index is approaching its size limit. The estimate is subject to change over time; therefore, do not rely on the precision or accuracy of the estimate.
      */
    var SizeEstimateRangeGB: js.UndefOr[ItemCollectionSizeEstimateRange] = js.undefined
  }
  
  trait ItemCollectionMetricsPerTable
    extends /* key */ org.scalablytyped.runtime.StringDictionary[ItemCollectionMetricsMultiple]
  
  trait ItemResponse extends js.Object {
    /**
      * Map of attribute data consisting of the data type and attribute value.
      */
    var Item: js.UndefOr[AttributeMap] = js.undefined
  }
  
  trait Key
    extends /* key */ org.scalablytyped.runtime.StringDictionary[AttributeValue]
  
  trait KeyConditions
    extends /* key */ org.scalablytyped.runtime.StringDictionary[Condition]
  
  trait KeySchemaElement extends js.Object {
    /**
      * The name of a key attribute.
      */
    var AttributeName: KeySchemaAttributeName
    /**
      * The role that this key attribute will assume:    HASH - partition key    RANGE - sort key    The partition key of an item is also known as its hash attribute. The term "hash attribute" derives from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values. The sort key of an item is also known as its range attribute. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value. 
      */
    var KeyType: KeyType
  }
  
  trait KeysAndAttributes extends js.Object {
    /**
      * This is a legacy parameter. Use ProjectionExpression instead. For more information, see Legacy Conditional Parameters in the Amazon DynamoDB Developer Guide.
      */
    var AttributesToGet: js.UndefOr[AttributeNameList] = js.undefined
    /**
      * The consistency of a read operation. If set to true, then a strongly consistent read is used; otherwise, an eventually consistent read is used.
      */
    var ConsistentRead: js.UndefOr[ConsistentRead] = js.undefined
    /**
      * One or more substitution tokens for attribute names in an expression. The following are some use cases for using ExpressionAttributeNames:   To access an attribute whose name conflicts with a DynamoDB reserved word.   To create a placeholder for repeating occurrences of an attribute name in an expression.   To prevent special characters in an attribute name from being misinterpreted in an expression.   Use the # character in an expression to dereference an attribute name. For example, consider the following attribute name:    Percentile    The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression. (For the complete list of reserved words, see Reserved Words in the Amazon DynamoDB Developer Guide). To work around this, you could specify the following for ExpressionAttributeNames:    {"#P":"Percentile"}    You could then use this substitution in an expression, as in this example:    #P = :val     Tokens that begin with the : character are expression attribute values, which are placeholders for the actual value at runtime.  For more information on expression attribute names, see Accessing Item Attributes in the Amazon DynamoDB Developer Guide.
      */
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined
    /**
      * The primary key attribute values that define the items and the attributes associated with the items.
      */
    var Keys: KeyList
    /**
      * A string that identifies one or more attributes to retrieve from the table. These attributes can include scalars, sets, or elements of a JSON document. The attributes in the ProjectionExpression must be separated by commas. If no attribute names are specified, then all attributes will be returned. If any of the requested attributes are not found, they will not appear in the result. For more information, see Accessing Item Attributes in the Amazon DynamoDB Developer Guide.
      */
    var ProjectionExpression: js.UndefOr[ProjectionExpression] = js.undefined
  }
  
  trait ListBackupsInput extends js.Object {
    /**
      * The backups from the table specified by BackupType are listed. Where BackupType can be:    USER - On-demand backup created by you.    SYSTEM - On-demand backup automatically created by DynamoDB.    ALL - All types of on-demand backups (USER and SYSTEM).  
      */
    var BackupType: js.UndefOr[BackupTypeFilter] = js.undefined
    /**
      *  LastEvaluatedBackupArn is the ARN of the backup last evaluated when the current page of results was returned, inclusive of the current page of results. This value may be specified as the ExclusiveStartBackupArn of a new ListBackups operation in order to fetch the next page of results. 
      */
    var ExclusiveStartBackupArn: js.UndefOr[BackupArn] = js.undefined
    /**
      * Maximum number of backups to return at once.
      */
    var Limit: js.UndefOr[BackupsInputLimit] = js.undefined
    /**
      * The backups from the table specified by TableName are listed. 
      */
    var TableName: js.UndefOr[TableName] = js.undefined
    /**
      * Only backups created after this time are listed. TimeRangeLowerBound is inclusive.
      */
    var TimeRangeLowerBound: js.UndefOr[TimeRangeLowerBound] = js.undefined
    /**
      * Only backups created before this time are listed. TimeRangeUpperBound is exclusive. 
      */
    var TimeRangeUpperBound: js.UndefOr[TimeRangeUpperBound] = js.undefined
  }
  
  trait ListBackupsOutput extends js.Object {
    /**
      * List of BackupSummary objects.
      */
    var BackupSummaries: js.UndefOr[BackupSummaries] = js.undefined
    /**
      *  The ARN of the backup last evaluated when the current page of results was returned, inclusive of the current page of results. This value may be specified as the ExclusiveStartBackupArn of a new ListBackups operation in order to fetch the next page of results.   If LastEvaluatedBackupArn is empty, then the last page of results has been processed and there are no more results to be retrieved.   If LastEvaluatedBackupArn is not empty, this may or may not indicate there is more data to be returned. All results are guaranteed to have been returned if and only if no value for LastEvaluatedBackupArn is returned. 
      */
    var LastEvaluatedBackupArn: js.UndefOr[BackupArn] = js.undefined
  }
  
  trait ListGlobalTablesInput extends js.Object {
    /**
      * The first global table name that this operation will evaluate.
      */
    var ExclusiveStartGlobalTableName: js.UndefOr[TableName] = js.undefined
    /**
      * The maximum number of table names to return.
      */
    var Limit: js.UndefOr[PositiveIntegerObject] = js.undefined
    /**
      * Lists the global tables in a specific region.
      */
    var RegionName: js.UndefOr[RegionName] = js.undefined
  }
  
  trait ListGlobalTablesOutput extends js.Object {
    /**
      * List of global table names.
      */
    var GlobalTables: js.UndefOr[GlobalTableList] = js.undefined
    /**
      * Last evaluated global table name.
      */
    var LastEvaluatedGlobalTableName: js.UndefOr[TableName] = js.undefined
  }
  
  trait ListTablesInput extends js.Object {
    /**
      * The first table name that this operation will evaluate. Use the value that was returned for LastEvaluatedTableName in a previous operation, so that you can obtain the next page of results.
      */
    var ExclusiveStartTableName: js.UndefOr[TableName] = js.undefined
    /**
      * A maximum number of table names to return. If this parameter is not specified, the limit is 100.
      */
    var Limit: js.UndefOr[ListTablesInputLimit] = js.undefined
  }
  
  trait ListTablesOutput extends js.Object {
    /**
      * The name of the last table in the current page of results. Use this value as the ExclusiveStartTableName in a new request to obtain the next page of results, until all the table names are returned. If you do not receive a LastEvaluatedTableName value in the response, this means that there are no more table names to be retrieved.
      */
    var LastEvaluatedTableName: js.UndefOr[TableName] = js.undefined
    /**
      * The names of the tables associated with the current account at the current endpoint. The maximum size of this array is 100. If LastEvaluatedTableName also appears in the output, you can use this value as the ExclusiveStartTableName parameter in a subsequent ListTables request and obtain the next page of results.
      */
    var TableNames: js.UndefOr[TableNameList] = js.undefined
  }
  
  trait ListTagsOfResourceInput extends js.Object {
    /**
      * An optional string that, if supplied, must be copied from the output of a previous call to ListTagOfResource. When provided in this manner, this API fetches the next page of results.
      */
    var NextToken: js.UndefOr[NextTokenString] = js.undefined
    /**
      * The Amazon DynamoDB resource with tags to be listed. This value is an Amazon Resource Name (ARN).
      */
    var ResourceArn: ResourceArnString
  }
  
  trait ListTagsOfResourceOutput extends js.Object {
    /**
      * If this value is returned, there are additional results to be displayed. To retrieve them, call ListTagsOfResource again, with NextToken set to this value.
      */
    var NextToken: js.UndefOr[NextTokenString] = js.undefined
    /**
      * The tags currently associated with the Amazon DynamoDB resource.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait LocalSecondaryIndex extends js.Object {
    /**
      * The name of the local secondary index. The name must be unique among all other indexes on this table.
      */
    var IndexName: IndexName
    /**
      * The complete key schema for the local secondary index, consisting of one or more pairs of attribute names and key types:    HASH - partition key    RANGE - sort key    The partition key of an item is also known as its hash attribute. The term "hash attribute" derives from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values. The sort key of an item is also known as its range attribute. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value. 
      */
    var KeySchema: KeySchema
    /**
      * Represents attributes that are copied (projected) from the table into the local secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. 
      */
    var Projection: Projection
  }
  
  trait LocalSecondaryIndexDescription extends js.Object {
    /**
      * The Amazon Resource Name (ARN) that uniquely identifies the index.
      */
    var IndexArn: js.UndefOr[String] = js.undefined
    /**
      * Represents the name of the local secondary index.
      */
    var IndexName: js.UndefOr[IndexName] = js.undefined
    /**
      * The total size of the specified index, in bytes. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.
      */
    var IndexSizeBytes: js.UndefOr[Long] = js.undefined
    /**
      * The number of items in the specified index. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.
      */
    var ItemCount: js.UndefOr[Long] = js.undefined
    /**
      * The complete key schema for the local secondary index, consisting of one or more pairs of attribute names and key types:    HASH - partition key    RANGE - sort key    The partition key of an item is also known as its hash attribute. The term "hash attribute" derives from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values. The sort key of an item is also known as its range attribute. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value. 
      */
    var KeySchema: js.UndefOr[KeySchema] = js.undefined
    /**
      * Represents attributes that are copied (projected) from the table into the global secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. 
      */
    var Projection: js.UndefOr[Projection] = js.undefined
  }
  
  trait LocalSecondaryIndexInfo extends js.Object {
    /**
      * Represents the name of the local secondary index.
      */
    var IndexName: js.UndefOr[IndexName] = js.undefined
    /**
      * The complete key schema for a local secondary index, which consists of one or more pairs of attribute names and key types:    HASH - partition key    RANGE - sort key    The partition key of an item is also known as its hash attribute. The term "hash attribute" derives from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values. The sort key of an item is also known as its range attribute. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value. 
      */
    var KeySchema: js.UndefOr[KeySchema] = js.undefined
    /**
      * Represents attributes that are copied (projected) from the table into the global secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. 
      */
    var Projection: js.UndefOr[Projection] = js.undefined
  }
  
  trait MapAttributeValue
    extends /* key */ org.scalablytyped.runtime.StringDictionary[AttributeValue]
  
  trait PointInTimeRecoveryDescription extends js.Object {
    /**
      * Specifies the earliest point in time you can restore your table to. It You can restore your table to any point in time during the last 35 days. 
      */
    var EarliestRestorableDateTime: js.UndefOr[_Date] = js.undefined
    /**
      *  LatestRestorableDateTime is typically 5 minutes before the current time. 
      */
    var LatestRestorableDateTime: js.UndefOr[_Date] = js.undefined
    /**
      * The current state of point in time recovery:    ENABLING - Point in time recovery is being enabled.    ENABLED - Point in time recovery is enabled.    DISABLED - Point in time recovery is disabled.  
      */
    var PointInTimeRecoveryStatus: js.UndefOr[PointInTimeRecoveryStatus] = js.undefined
  }
  
  trait PointInTimeRecoverySpecification extends js.Object {
    /**
      * Indicates whether point in time recovery is enabled (true) or disabled (false) on the table.
      */
    var PointInTimeRecoveryEnabled: BooleanObject
  }
  
  trait Projection extends js.Object {
    /**
      * Represents the non-key attribute names which will be projected into the index. For local secondary indexes, the total count of NonKeyAttributes summed across all of the local secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts as two distinct attributes when determining the total.
      */
    var NonKeyAttributes: js.UndefOr[NonKeyAttributeNameList] = js.undefined
    /**
      * The set of attributes that are projected into the index:    KEYS_ONLY - Only the index and primary keys are projected into the index.    INCLUDE - Only the specified table attributes are projected into the index. The list of projected attributes are in NonKeyAttributes.    ALL - All of the table attributes are projected into the index.  
      */
    var ProjectionType: js.UndefOr[ProjectionType] = js.undefined
  }
  
  trait ProvisionedThroughput extends js.Object {
    /**
      * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a ThrottlingException. For more information, see Specifying Read and Write Requirements in the Amazon DynamoDB Developer Guide. If read/write capacity mode is PAY_PER_REQUEST the value is set to 0.
      */
    var ReadCapacityUnits: PositiveLongObject
    /**
      * The maximum number of writes consumed per second before DynamoDB returns a ThrottlingException. For more information, see Specifying Read and Write Requirements in the Amazon DynamoDB Developer Guide. If read/write capacity mode is PAY_PER_REQUEST the value is set to 0.
      */
    var WriteCapacityUnits: PositiveLongObject
  }
  
  trait ProvisionedThroughputDescription extends js.Object {
    /**
      * The date and time of the last provisioned throughput decrease for this table.
      */
    var LastDecreaseDateTime: js.UndefOr[_Date] = js.undefined
    /**
      * The date and time of the last provisioned throughput increase for this table.
      */
    var LastIncreaseDateTime: js.UndefOr[_Date] = js.undefined
    /**
      * The number of provisioned throughput decreases for this table during this UTC calendar day. For current maximums on provisioned throughput decreases, see Limits in the Amazon DynamoDB Developer Guide.
      */
    var NumberOfDecreasesToday: js.UndefOr[PositiveLongObject] = js.undefined
    /**
      * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a ThrottlingException. Eventually consistent reads require less effort than strongly consistent reads, so a setting of 50 ReadCapacityUnits per second provides 100 eventually consistent ReadCapacityUnits per second.
      */
    var ReadCapacityUnits: js.UndefOr[NonNegativeLongObject] = js.undefined
    /**
      * The maximum number of writes consumed per second before DynamoDB returns a ThrottlingException.
      */
    var WriteCapacityUnits: js.UndefOr[NonNegativeLongObject] = js.undefined
  }
  
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
  
  trait PutItemInput extends js.Object {
    /**
      * A condition that must be satisfied in order for a conditional PutItem operation to succeed. An expression can contain any of the following:   Functions: attribute_exists | attribute_not_exists | attribute_type | contains | begins_with | size  These function names are case-sensitive.   Comparison operators: = | &lt;&gt; | &lt; | &gt; | &lt;= | &gt;= | BETWEEN | IN      Logical operators: AND | OR | NOT    For more information on condition expressions, see Specifying Conditions in the Amazon DynamoDB Developer Guide.
      */
    var ConditionExpression: js.UndefOr[ConditionExpression] = js.undefined
    /**
      * This is a legacy parameter. Use ConditionExpression instead. For more information, see ConditionalOperator in the Amazon DynamoDB Developer Guide.
      */
    var ConditionalOperator: js.UndefOr[ConditionalOperator] = js.undefined
    /**
      * This is a legacy parameter. Use ConditionExpression instead. For more information, see Expected in the Amazon DynamoDB Developer Guide.
      */
    var Expected: js.UndefOr[ExpectedAttributeMap] = js.undefined
    /**
      * One or more substitution tokens for attribute names in an expression. The following are some use cases for using ExpressionAttributeNames:   To access an attribute whose name conflicts with a DynamoDB reserved word.   To create a placeholder for repeating occurrences of an attribute name in an expression.   To prevent special characters in an attribute name from being misinterpreted in an expression.   Use the # character in an expression to dereference an attribute name. For example, consider the following attribute name:    Percentile    The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression. (For the complete list of reserved words, see Reserved Words in the Amazon DynamoDB Developer Guide). To work around this, you could specify the following for ExpressionAttributeNames:    {"#P":"Percentile"}    You could then use this substitution in an expression, as in this example:    #P = :val     Tokens that begin with the : character are expression attribute values, which are placeholders for the actual value at runtime.  For more information on expression attribute names, see Accessing Item Attributes in the Amazon DynamoDB Developer Guide.
      */
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined
    /**
      * One or more values that can be substituted in an expression. Use the : (colon) character in an expression to dereference an attribute value. For example, suppose that you wanted to check whether the value of the ProductStatus attribute was one of the following:   Available | Backordered | Discontinued  You would first need to specify ExpressionAttributeValues as follows:  { ":avail":{"S":"Available"}, ":back":{"S":"Backordered"}, ":disc":{"S":"Discontinued"} }  You could then use these values in an expression, such as this:  ProductStatus IN (:avail, :back, :disc)  For more information on expression attribute values, see Specifying Conditions in the Amazon DynamoDB Developer Guide.
      */
    var ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap] = js.undefined
    /**
      * A map of attribute name/value pairs, one for each attribute. Only the primary key attributes are required; you can optionally provide other attribute name-value pairs for the item. You must provide all of the attributes for the primary key. For example, with a simple primary key, you only need to provide a value for the partition key. For a composite primary key, you must provide both values for both the partition key and the sort key. If you specify any attributes that are part of an index key, then the data types for those attributes must match those of the schema in the table's attribute definition. For more information about primary keys, see Primary Key in the Amazon DynamoDB Developer Guide. Each element in the Item map is an AttributeValue object.
      */
    var Item: PutItemInputAttributeMap
    var ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity] = js.undefined
    /**
      * Determines whether item collection metrics are returned. If set to SIZE, the response includes statistics about item collections, if any, that were modified during the operation are returned in the response. If set to NONE (the default), no statistics are returned.
      */
    var ReturnItemCollectionMetrics: js.UndefOr[ReturnItemCollectionMetrics] = js.undefined
    /**
      * Use ReturnValues if you want to get the item attributes as they appeared before they were updated with the PutItem request. For PutItem, the valid values are:    NONE - If ReturnValues is not specified, or if its value is NONE, then nothing is returned. (This setting is the default for ReturnValues.)    ALL_OLD - If PutItem overwrote an attribute name-value pair, then the content of the old item is returned.    The ReturnValues parameter is used by several DynamoDB operations; however, PutItem does not recognize any values other than NONE or ALL_OLD. 
      */
    var ReturnValues: js.UndefOr[ReturnValue] = js.undefined
    /**
      * The name of the table to contain the item.
      */
    var TableName: TableName
  }
  
  trait PutItemInputAttributeMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[AttributeValue]
  
  trait PutItemOutput extends js.Object {
    /**
      * The attribute values as they appeared before the PutItem operation, but only if ReturnValues is specified as ALL_OLD in the request. Each element consists of an attribute name and an attribute value.
      */
    var Attributes: js.UndefOr[AttributeMap] = js.undefined
    /**
      * The capacity units consumed by the PutItem operation. The data returned includes the total provisioned throughput consumed, along with statistics for the table and any indexes involved in the operation. ConsumedCapacity is only returned if the ReturnConsumedCapacity parameter was specified. For more information, see Provisioned Throughput in the Amazon DynamoDB Developer Guide.
      */
    var ConsumedCapacity: js.UndefOr[ConsumedCapacity] = js.undefined
    /**
      * Information about item collections, if any, that were affected by the PutItem operation. ItemCollectionMetrics is only returned if the ReturnItemCollectionMetrics parameter was specified. If the table does not have any local secondary indexes, this information is not returned in the response. Each ItemCollectionMetrics element consists of:    ItemCollectionKey - The partition key value of the item collection. This is the same as the partition key value of the item itself.    SizeEstimateRangeGB - An estimate of item collection size, in gigabytes. This value is a two-element array containing a lower bound and an upper bound for the estimate. The estimate includes the size of all the items in the table, plus the size of all attributes projected into all of the local secondary indexes on that table. Use this estimate to measure whether a local secondary index is approaching its size limit. The estimate is subject to change over time; therefore, do not rely on the precision or accuracy of the estimate.  
      */
    var ItemCollectionMetrics: js.UndefOr[ItemCollectionMetrics] = js.undefined
  }
  
  trait PutRequest extends js.Object {
    /**
      * A map of attribute name to attribute values, representing the primary key of an item to be processed by PutItem. All of the table's primary key attributes must be specified, and their data types must match those of the table's key schema. If any attributes are present in the item which are part of an index key schema for the table, their types must match the index key schema.
      */
    var Item: PutItemInputAttributeMap
  }
  
  trait QueryInput extends js.Object {
    /**
      * This is a legacy parameter. Use ProjectionExpression instead. For more information, see AttributesToGet in the Amazon DynamoDB Developer Guide.
      */
    var AttributesToGet: js.UndefOr[AttributeNameList] = js.undefined
    /**
      * This is a legacy parameter. Use FilterExpression instead. For more information, see ConditionalOperator in the Amazon DynamoDB Developer Guide.
      */
    var ConditionalOperator: js.UndefOr[ConditionalOperator] = js.undefined
    /**
      * Determines the read consistency model: If set to true, then the operation uses strongly consistent reads; otherwise, the operation uses eventually consistent reads. Strongly consistent reads are not supported on global secondary indexes. If you query a global secondary index with ConsistentRead set to true, you will receive a ValidationException.
      */
    var ConsistentRead: js.UndefOr[ConsistentRead] = js.undefined
    /**
      * The primary key of the first item that this operation will evaluate. Use the value that was returned for LastEvaluatedKey in the previous operation. The data type for ExclusiveStartKey must be String, Number or Binary. No set data types are allowed.
      */
    var ExclusiveStartKey: js.UndefOr[Key] = js.undefined
    /**
      * One or more substitution tokens for attribute names in an expression. The following are some use cases for using ExpressionAttributeNames:   To access an attribute whose name conflicts with a DynamoDB reserved word.   To create a placeholder for repeating occurrences of an attribute name in an expression.   To prevent special characters in an attribute name from being misinterpreted in an expression.   Use the # character in an expression to dereference an attribute name. For example, consider the following attribute name:    Percentile    The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression. (For the complete list of reserved words, see Reserved Words in the Amazon DynamoDB Developer Guide). To work around this, you could specify the following for ExpressionAttributeNames:    {"#P":"Percentile"}    You could then use this substitution in an expression, as in this example:    #P = :val     Tokens that begin with the : character are expression attribute values, which are placeholders for the actual value at runtime.  For more information on expression attribute names, see Accessing Item Attributes in the Amazon DynamoDB Developer Guide.
      */
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined
    /**
      * One or more values that can be substituted in an expression. Use the : (colon) character in an expression to dereference an attribute value. For example, suppose that you wanted to check whether the value of the ProductStatus attribute was one of the following:   Available | Backordered | Discontinued  You would first need to specify ExpressionAttributeValues as follows:  { ":avail":{"S":"Available"}, ":back":{"S":"Backordered"}, ":disc":{"S":"Discontinued"} }  You could then use these values in an expression, such as this:  ProductStatus IN (:avail, :back, :disc)  For more information on expression attribute values, see Specifying Conditions in the Amazon DynamoDB Developer Guide.
      */
    var ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap] = js.undefined
    /**
      * A string that contains conditions that DynamoDB applies after the Query operation, but before the data is returned to you. Items that do not satisfy the FilterExpression criteria are not returned. A FilterExpression does not allow key attributes. You cannot define a filter expression based on a partition key or a sort key.  A FilterExpression is applied after the items have already been read; the process of filtering does not consume any additional read capacity units.  For more information, see Filter Expressions in the Amazon DynamoDB Developer Guide.
      */
    var FilterExpression: js.UndefOr[ConditionExpression] = js.undefined
    /**
      * The name of an index to query. This index can be any local secondary index or global secondary index on the table. Note that if you use the IndexName parameter, you must also provide TableName. 
      */
    var IndexName: js.UndefOr[IndexName] = js.undefined
    /**
      * The condition that specifies the key value(s) for items to be retrieved by the Query action. The condition must perform an equality test on a single partition key value. The condition can optionally perform one of several comparison tests on a single sort key value. This allows Query to retrieve one item with a given partition key value and sort key value, or several items that have the same partition key value but different sort key values. The partition key equality test is required, and must be specified in the following format:  partitionKeyName = :partitionkeyval  If you also want to provide a condition for the sort key, it must be combined using AND with the condition for the sort key. Following is an example, using the = comparison operator for the sort key:  partitionKeyName = :partitionkeyval AND sortKeyName = :sortkeyval  Valid comparisons for the sort key condition are as follows:    sortKeyName = :sortkeyval - true if the sort key value is equal to :sortkeyval.    sortKeyName &lt; :sortkeyval - true if the sort key value is less than :sortkeyval.    sortKeyName &lt;= :sortkeyval - true if the sort key value is less than or equal to :sortkeyval.    sortKeyName &gt; :sortkeyval - true if the sort key value is greater than :sortkeyval.    sortKeyName &gt;=  :sortkeyval - true if the sort key value is greater than or equal to :sortkeyval.    sortKeyName BETWEEN :sortkeyval1 AND :sortkeyval2 - true if the sort key value is greater than or equal to :sortkeyval1, and less than or equal to :sortkeyval2.    begins_with ( sortKeyName, :sortkeyval ) - true if the sort key value begins with a particular operand. (You cannot use this function with a sort key that is of type Number.) Note that the function name begins_with is case-sensitive.   Use the ExpressionAttributeValues parameter to replace tokens such as :partitionval and :sortval with actual values at runtime. You can optionally use the ExpressionAttributeNames parameter to replace the names of the partition key and sort key with placeholder tokens. This option might be necessary if an attribute name conflicts with a DynamoDB reserved word. For example, the following KeyConditionExpression parameter causes an error because Size is a reserved word:    Size = :myval    To work around this, define a placeholder (such a #S) to represent the attribute name Size. KeyConditionExpression then is as follows:    #S = :myval    For a list of reserved words, see Reserved Words in the Amazon DynamoDB Developer Guide. For more information on ExpressionAttributeNames and ExpressionAttributeValues, see Using Placeholders for Attribute Names and Values in the Amazon DynamoDB Developer Guide.
      */
    var KeyConditionExpression: js.UndefOr[KeyExpression] = js.undefined
    /**
      * This is a legacy parameter. Use KeyConditionExpression instead. For more information, see KeyConditions in the Amazon DynamoDB Developer Guide.
      */
    var KeyConditions: js.UndefOr[KeyConditions] = js.undefined
    /**
      * The maximum number of items to evaluate (not necessarily the number of matching items). If DynamoDB processes the number of items up to the limit while processing the results, it stops the operation and returns the matching values up to that point, and a key in LastEvaluatedKey to apply in a subsequent operation, so that you can pick up where you left off. Also, if the processed data set size exceeds 1 MB before DynamoDB reaches this limit, it stops the operation and returns the matching values up to the limit, and a key in LastEvaluatedKey to apply in a subsequent operation to continue the operation. For more information, see Query and Scan in the Amazon DynamoDB Developer Guide.
      */
    var Limit: js.UndefOr[PositiveIntegerObject] = js.undefined
    /**
      * A string that identifies one or more attributes to retrieve from the table. These attributes can include scalars, sets, or elements of a JSON document. The attributes in the expression must be separated by commas. If no attribute names are specified, then all attributes will be returned. If any of the requested attributes are not found, they will not appear in the result. For more information, see Accessing Item Attributes in the Amazon DynamoDB Developer Guide.
      */
    var ProjectionExpression: js.UndefOr[ProjectionExpression] = js.undefined
    /**
      * This is a legacy parameter. Use FilterExpression instead. For more information, see QueryFilter in the Amazon DynamoDB Developer Guide.
      */
    var QueryFilter: js.UndefOr[FilterConditionMap] = js.undefined
    var ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity] = js.undefined
    /**
      * Specifies the order for index traversal: If true (default), the traversal is performed in ascending order; if false, the traversal is performed in descending order.  Items with the same partition key value are stored in sorted order by sort key. If the sort key data type is Number, the results are stored in numeric order. For type String, the results are stored in order of UTF-8 bytes. For type Binary, DynamoDB treats each byte of the binary data as unsigned. If ScanIndexForward is true, DynamoDB returns the results in the order in which they are stored (by sort key value). This is the default behavior. If ScanIndexForward is false, DynamoDB reads the results in reverse order by sort key value, and then returns the results to the client.
      */
    var ScanIndexForward: js.UndefOr[BooleanObject] = js.undefined
    /**
      * The attributes to be returned in the result. You can retrieve all item attributes, specific item attributes, the count of matching items, or in the case of an index, some or all of the attributes projected into the index.    ALL_ATTRIBUTES - Returns all of the item attributes from the specified table or index. If you query a local secondary index, then for each matching item in the index DynamoDB will fetch the entire item from the parent table. If the index is configured to project all item attributes, then all of the data can be obtained from the local secondary index, and no fetching is required.    ALL_PROJECTED_ATTRIBUTES - Allowed only when querying an index. Retrieves all attributes that have been projected into the index. If the index is configured to project all attributes, this return value is equivalent to specifying ALL_ATTRIBUTES.    COUNT - Returns the number of matching items, rather than the matching items themselves.    SPECIFIC_ATTRIBUTES - Returns only the attributes listed in AttributesToGet. This return value is equivalent to specifying AttributesToGet without specifying any value for Select. If you query or scan a local secondary index and request only attributes that are projected into that index, the operation will read only the index and not the table. If any of the requested attributes are not projected into the local secondary index, DynamoDB will fetch each of these attributes from the parent table. This extra fetching incurs additional throughput cost and latency. If you query or scan a global secondary index, you can only request attributes that are projected into the index. Global secondary index queries cannot fetch attributes from the parent table.   If neither Select nor AttributesToGet are specified, DynamoDB defaults to ALL_ATTRIBUTES when accessing a table, and ALL_PROJECTED_ATTRIBUTES when accessing an index. You cannot use both Select and AttributesToGet together in a single request, unless the value for Select is SPECIFIC_ATTRIBUTES. (This usage is equivalent to specifying AttributesToGet without any value for Select.)  If you use the ProjectionExpression parameter, then the value for Select can only be SPECIFIC_ATTRIBUTES. Any other value for Select will return an error. 
      */
    var Select: js.UndefOr[Select] = js.undefined
    /**
      * The name of the table containing the requested items.
      */
    var TableName: TableName
  }
  
  trait QueryOutput extends js.Object {
    /**
      * The capacity units consumed by the Query operation. The data returned includes the total provisioned throughput consumed, along with statistics for the table and any indexes involved in the operation. ConsumedCapacity is only returned if the ReturnConsumedCapacity parameter was specified For more information, see Provisioned Throughput in the Amazon DynamoDB Developer Guide.
      */
    var ConsumedCapacity: js.UndefOr[ConsumedCapacity] = js.undefined
    /**
      * The number of items in the response. If you used a QueryFilter in the request, then Count is the number of items returned after the filter was applied, and ScannedCount is the number of matching items before the filter was applied. If you did not use a filter in the request, then Count and ScannedCount are the same.
      */
    var Count: js.UndefOr[Integer] = js.undefined
    /**
      * An array of item attributes that match the query criteria. Each element in this array consists of an attribute name and the value for that attribute.
      */
    var Items: js.UndefOr[ItemList] = js.undefined
    /**
      * The primary key of the item where the operation stopped, inclusive of the previous result set. Use this value to start a new operation, excluding this value in the new request. If LastEvaluatedKey is empty, then the "last page" of results has been processed and there is no more data to be retrieved. If LastEvaluatedKey is not empty, it does not necessarily mean that there is more data in the result set. The only way to know when you have reached the end of the result set is when LastEvaluatedKey is empty.
      */
    var LastEvaluatedKey: js.UndefOr[Key] = js.undefined
    /**
      * The number of items evaluated, before any QueryFilter is applied. A high ScannedCount value with few, or no, Count results indicates an inefficient Query operation. For more information, see Count and ScannedCount in the Amazon DynamoDB Developer Guide. If you did not use a filter in the request, then ScannedCount is the same as Count.
      */
    var ScannedCount: js.UndefOr[Integer] = js.undefined
  }
  
  trait Replica extends js.Object {
    /**
      * The region where the replica needs to be created.
      */
    var RegionName: js.UndefOr[RegionName] = js.undefined
  }
  
  trait ReplicaDescription extends js.Object {
    /**
      * The name of the region.
      */
    var RegionName: js.UndefOr[RegionName] = js.undefined
  }
  
  trait ReplicaGlobalSecondaryIndexSettingsDescription extends js.Object {
    /**
      * The name of the global secondary index. The name must be unique among all other indexes on this table.
      */
    var IndexName: IndexName
    /**
      *  The current status of the global secondary index:    CREATING - The global secondary index is being created.    UPDATING - The global secondary index is being updated.    DELETING - The global secondary index is being deleted.    ACTIVE - The global secondary index is ready for use.  
      */
    var IndexStatus: js.UndefOr[IndexStatus] = js.undefined
    /**
      * Autoscaling settings for a global secondary index replica's read capacity units.
      */
    var ProvisionedReadCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.undefined
    /**
      * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a ThrottlingException.
      */
    var ProvisionedReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined
    /**
      * AutoScaling settings for a global secondary index replica's write capacity units.
      */
    var ProvisionedWriteCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.undefined
    /**
      * The maximum number of writes consumed per second before DynamoDB returns a ThrottlingException.
      */
    var ProvisionedWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined
  }
  
  trait ReplicaGlobalSecondaryIndexSettingsUpdate extends js.Object {
    /**
      * The name of the global secondary index. The name must be unique among all other indexes on this table.
      */
    var IndexName: IndexName
    /**
      * Autoscaling settings for managing a global secondary index replica's read capacity units.
      */
    var ProvisionedReadCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.undefined
    /**
      * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a ThrottlingException.
      */
    var ProvisionedReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined
  }
  
  trait ReplicaSettingsDescription extends js.Object {
    /**
      * The region name of the replica.
      */
    var RegionName: RegionName
    /**
      * The read/write capacity mode of the replica.
      */
    var ReplicaBillingModeSummary: js.UndefOr[BillingModeSummary] = js.undefined
    /**
      * Replica global secondary index settings for the global table.
      */
    var ReplicaGlobalSecondaryIndexSettings: js.UndefOr[ReplicaGlobalSecondaryIndexSettingsDescriptionList] = js.undefined
    /**
      * Autoscaling settings for a global table replica's read capacity units.
      */
    var ReplicaProvisionedReadCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.undefined
    /**
      * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a ThrottlingException. For more information, see Specifying Read and Write Requirements in the Amazon DynamoDB Developer Guide. 
      */
    var ReplicaProvisionedReadCapacityUnits: js.UndefOr[NonNegativeLongObject] = js.undefined
    /**
      * AutoScaling settings for a global table replica's write capacity units.
      */
    var ReplicaProvisionedWriteCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.undefined
    /**
      * The maximum number of writes consumed per second before DynamoDB returns a ThrottlingException. For more information, see Specifying Read and Write Requirements in the Amazon DynamoDB Developer Guide.
      */
    var ReplicaProvisionedWriteCapacityUnits: js.UndefOr[NonNegativeLongObject] = js.undefined
    /**
      * The current state of the region:    CREATING - The region is being created.    UPDATING - The region is being updated.    DELETING - The region is being deleted.    ACTIVE - The region is ready for use.  
      */
    var ReplicaStatus: js.UndefOr[ReplicaStatus] = js.undefined
  }
  
  trait ReplicaSettingsUpdate extends js.Object {
    /**
      * The region of the replica to be added.
      */
    var RegionName: RegionName
    /**
      * Represents the settings of a global secondary index for a global table that will be modified.
      */
    var ReplicaGlobalSecondaryIndexSettingsUpdate: js.UndefOr[ReplicaGlobalSecondaryIndexSettingsUpdateList] = js.undefined
    /**
      * Autoscaling settings for managing a global table replica's read capacity units.
      */
    var ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.undefined
    /**
      * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a ThrottlingException. For more information, see Specifying Read and Write Requirements in the Amazon DynamoDB Developer Guide. 
      */
    var ReplicaProvisionedReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined
  }
  
  trait ReplicaUpdate extends js.Object {
    /**
      * The parameters required for creating a replica on an existing global table.
      */
    var Create: js.UndefOr[CreateReplicaAction] = js.undefined
    /**
      * The name of the existing replica to be removed.
      */
    var Delete: js.UndefOr[DeleteReplicaAction] = js.undefined
  }
  
  trait RestoreSummary extends js.Object {
    /**
      * Point in time or source backup time.
      */
    var RestoreDateTime: _Date
    /**
      * Indicates if a restore is in progress or not.
      */
    var RestoreInProgress: RestoreInProgress
    /**
      * ARN of the backup from which the table was restored.
      */
    var SourceBackupArn: js.UndefOr[BackupArn] = js.undefined
    /**
      * ARN of the source table of the backup that is being restored.
      */
    var SourceTableArn: js.UndefOr[TableArn] = js.undefined
  }
  
  trait RestoreTableFromBackupInput extends js.Object {
    /**
      * The ARN associated with the backup.
      */
    var BackupArn: BackupArn
    /**
      * The name of the new table to which the backup must be restored.
      */
    var TargetTableName: TableName
  }
  
  trait RestoreTableFromBackupOutput extends js.Object {
    /**
      * The description of the table created from an existing backup.
      */
    var TableDescription: js.UndefOr[TableDescription] = js.undefined
  }
  
  trait RestoreTableToPointInTimeInput extends js.Object {
    /**
      * Time in the past to restore the table to.
      */
    var RestoreDateTime: js.UndefOr[_Date] = js.undefined
    /**
      * Name of the source table that is being restored.
      */
    var SourceTableName: TableName
    /**
      * The name of the new table to which it must be restored to.
      */
    var TargetTableName: TableName
    /**
      * Restore the table to the latest possible time. LatestRestorableDateTime is typically 5 minutes before the current time. 
      */
    var UseLatestRestorableTime: js.UndefOr[BooleanObject] = js.undefined
  }
  
  trait RestoreTableToPointInTimeOutput extends js.Object {
    /**
      * Represents the properties of a table.
      */
    var TableDescription: js.UndefOr[TableDescription] = js.undefined
  }
  
  trait SSEDescription extends js.Object {
    /**
      * The KMS master key ARN used for the KMS encryption.
      */
    var KMSMasterKeyArn: js.UndefOr[KMSMasterKeyArn] = js.undefined
    /**
      * Server-side encryption type:    AES256 - Server-side encryption which uses the AES256 algorithm (not applicable).    KMS - Server-side encryption which uses AWS Key Management Service. Key is stored in your account and is managed by AWS KMS (KMS charges apply).  
      */
    var SSEType: js.UndefOr[SSEType] = js.undefined
    /**
      * The current state of server-side encryption:    ENABLING - Server-side encryption is being enabled.    ENABLED - Server-side encryption is enabled.    DISABLING - Server-side encryption is being disabled.    DISABLED - Server-side encryption is disabled.    UPDATING - Server-side encryption is being updated.  
      */
    var Status: js.UndefOr[SSEStatus] = js.undefined
  }
  
  trait SSESpecification extends js.Object {
    /**
      * Indicates whether server-side encryption is enabled (true) or disabled (false) on the table. If enabled (true), server-side encryption type is set to KMS. If disabled (false) or not specified, server-side encryption is set to AWS owned CMK.
      */
    var Enabled: js.UndefOr[SSEEnabled] = js.undefined
    /**
      * The KMS Master Key (CMK) which should be used for the KMS encryption. To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. Note that you should only provide this parameter if the key is different from the default DynamoDB KMS Master Key alias/aws/dynamodb.
      */
    var KMSMasterKeyId: js.UndefOr[KMSMasterKeyId] = js.undefined
    /**
      * Server-side encryption type:    AES256 - Server-side encryption which uses the AES256 algorithm (not applicable).    KMS - Server-side encryption which uses AWS Key Management Service. Key is stored in your account and is managed by AWS KMS (KMS charges apply).  
      */
    var SSEType: js.UndefOr[SSEType] = js.undefined
  }
  
  trait ScanInput extends js.Object {
    /**
      * This is a legacy parameter. Use ProjectionExpression instead. For more information, see AttributesToGet in the Amazon DynamoDB Developer Guide.
      */
    var AttributesToGet: js.UndefOr[AttributeNameList] = js.undefined
    /**
      * This is a legacy parameter. Use FilterExpression instead. For more information, see ConditionalOperator in the Amazon DynamoDB Developer Guide.
      */
    var ConditionalOperator: js.UndefOr[ConditionalOperator] = js.undefined
    /**
      * A Boolean value that determines the read consistency model during the scan:   If ConsistentRead is false, then the data returned from Scan might not contain the results from other recently completed write operations (PutItem, UpdateItem or DeleteItem).   If ConsistentRead is true, then all of the write operations that completed before the Scan began are guaranteed to be contained in the Scan response.   The default setting for ConsistentRead is false. The ConsistentRead parameter is not supported on global secondary indexes. If you scan a global secondary index with ConsistentRead set to true, you will receive a ValidationException.
      */
    var ConsistentRead: js.UndefOr[ConsistentRead] = js.undefined
    /**
      * The primary key of the first item that this operation will evaluate. Use the value that was returned for LastEvaluatedKey in the previous operation. The data type for ExclusiveStartKey must be String, Number or Binary. No set data types are allowed. In a parallel scan, a Scan request that includes ExclusiveStartKey must specify the same segment whose previous Scan returned the corresponding value of LastEvaluatedKey.
      */
    var ExclusiveStartKey: js.UndefOr[Key] = js.undefined
    /**
      * One or more substitution tokens for attribute names in an expression. The following are some use cases for using ExpressionAttributeNames:   To access an attribute whose name conflicts with a DynamoDB reserved word.   To create a placeholder for repeating occurrences of an attribute name in an expression.   To prevent special characters in an attribute name from being misinterpreted in an expression.   Use the # character in an expression to dereference an attribute name. For example, consider the following attribute name:    Percentile    The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression. (For the complete list of reserved words, see Reserved Words in the Amazon DynamoDB Developer Guide). To work around this, you could specify the following for ExpressionAttributeNames:    {"#P":"Percentile"}    You could then use this substitution in an expression, as in this example:    #P = :val     Tokens that begin with the : character are expression attribute values, which are placeholders for the actual value at runtime.  For more information on expression attribute names, see Accessing Item Attributes in the Amazon DynamoDB Developer Guide.
      */
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined
    /**
      * One or more values that can be substituted in an expression. Use the : (colon) character in an expression to dereference an attribute value. For example, suppose that you wanted to check whether the value of the ProductStatus attribute was one of the following:   Available | Backordered | Discontinued  You would first need to specify ExpressionAttributeValues as follows:  { ":avail":{"S":"Available"}, ":back":{"S":"Backordered"}, ":disc":{"S":"Discontinued"} }  You could then use these values in an expression, such as this:  ProductStatus IN (:avail, :back, :disc)  For more information on expression attribute values, see Specifying Conditions in the Amazon DynamoDB Developer Guide.
      */
    var ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap] = js.undefined
    /**
      * A string that contains conditions that DynamoDB applies after the Scan operation, but before the data is returned to you. Items that do not satisfy the FilterExpression criteria are not returned.  A FilterExpression is applied after the items have already been read; the process of filtering does not consume any additional read capacity units.  For more information, see Filter Expressions in the Amazon DynamoDB Developer Guide.
      */
    var FilterExpression: js.UndefOr[ConditionExpression] = js.undefined
    /**
      * The name of a secondary index to scan. This index can be any local secondary index or global secondary index. Note that if you use the IndexName parameter, you must also provide TableName.
      */
    var IndexName: js.UndefOr[IndexName] = js.undefined
    /**
      * The maximum number of items to evaluate (not necessarily the number of matching items). If DynamoDB processes the number of items up to the limit while processing the results, it stops the operation and returns the matching values up to that point, and a key in LastEvaluatedKey to apply in a subsequent operation, so that you can pick up where you left off. Also, if the processed data set size exceeds 1 MB before DynamoDB reaches this limit, it stops the operation and returns the matching values up to the limit, and a key in LastEvaluatedKey to apply in a subsequent operation to continue the operation. For more information, see Query and Scan in the Amazon DynamoDB Developer Guide.
      */
    var Limit: js.UndefOr[PositiveIntegerObject] = js.undefined
    /**
      * A string that identifies one or more attributes to retrieve from the specified table or index. These attributes can include scalars, sets, or elements of a JSON document. The attributes in the expression must be separated by commas. If no attribute names are specified, then all attributes will be returned. If any of the requested attributes are not found, they will not appear in the result. For more information, see Accessing Item Attributes in the Amazon DynamoDB Developer Guide.
      */
    var ProjectionExpression: js.UndefOr[ProjectionExpression] = js.undefined
    var ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity] = js.undefined
    /**
      * This is a legacy parameter. Use FilterExpression instead. For more information, see ScanFilter in the Amazon DynamoDB Developer Guide.
      */
    var ScanFilter: js.UndefOr[FilterConditionMap] = js.undefined
    /**
      * For a parallel Scan request, Segment identifies an individual segment to be scanned by an application worker. Segment IDs are zero-based, so the first segment is always 0. For example, if you want to use four application threads to scan a table or an index, then the first thread specifies a Segment value of 0, the second thread specifies 1, and so on. The value of LastEvaluatedKey returned from a parallel Scan request must be used as ExclusiveStartKey with the same segment ID in a subsequent Scan operation. The value for Segment must be greater than or equal to 0, and less than the value provided for TotalSegments. If you provide Segment, you must also provide TotalSegments.
      */
    var Segment: js.UndefOr[ScanSegment] = js.undefined
    /**
      * The attributes to be returned in the result. You can retrieve all item attributes, specific item attributes, the count of matching items, or in the case of an index, some or all of the attributes projected into the index.    ALL_ATTRIBUTES - Returns all of the item attributes from the specified table or index. If you query a local secondary index, then for each matching item in the index DynamoDB will fetch the entire item from the parent table. If the index is configured to project all item attributes, then all of the data can be obtained from the local secondary index, and no fetching is required.    ALL_PROJECTED_ATTRIBUTES - Allowed only when querying an index. Retrieves all attributes that have been projected into the index. If the index is configured to project all attributes, this return value is equivalent to specifying ALL_ATTRIBUTES.    COUNT - Returns the number of matching items, rather than the matching items themselves.    SPECIFIC_ATTRIBUTES - Returns only the attributes listed in AttributesToGet. This return value is equivalent to specifying AttributesToGet without specifying any value for Select. If you query or scan a local secondary index and request only attributes that are projected into that index, the operation will read only the index and not the table. If any of the requested attributes are not projected into the local secondary index, DynamoDB will fetch each of these attributes from the parent table. This extra fetching incurs additional throughput cost and latency. If you query or scan a global secondary index, you can only request attributes that are projected into the index. Global secondary index queries cannot fetch attributes from the parent table.   If neither Select nor AttributesToGet are specified, DynamoDB defaults to ALL_ATTRIBUTES when accessing a table, and ALL_PROJECTED_ATTRIBUTES when accessing an index. You cannot use both Select and AttributesToGet together in a single request, unless the value for Select is SPECIFIC_ATTRIBUTES. (This usage is equivalent to specifying AttributesToGet without any value for Select.)  If you use the ProjectionExpression parameter, then the value for Select can only be SPECIFIC_ATTRIBUTES. Any other value for Select will return an error. 
      */
    var Select: js.UndefOr[Select] = js.undefined
    /**
      * The name of the table containing the requested items; or, if you provide IndexName, the name of the table to which that index belongs.
      */
    var TableName: TableName
    /**
      * For a parallel Scan request, TotalSegments represents the total number of segments into which the Scan operation will be divided. The value of TotalSegments corresponds to the number of application workers that will perform the parallel scan. For example, if you want to use four application threads to scan a table or an index, specify a TotalSegments value of 4. The value for TotalSegments must be greater than or equal to 1, and less than or equal to 1000000. If you specify a TotalSegments value of 1, the Scan operation will be sequential rather than parallel. If you specify TotalSegments, you must also specify Segment.
      */
    var TotalSegments: js.UndefOr[ScanTotalSegments] = js.undefined
  }
  
  trait ScanOutput extends js.Object {
    /**
      * The capacity units consumed by the Scan operation. The data returned includes the total provisioned throughput consumed, along with statistics for the table and any indexes involved in the operation. ConsumedCapacity is only returned if the ReturnConsumedCapacity parameter was specified. For more information, see Provisioned Throughput in the Amazon DynamoDB Developer Guide.
      */
    var ConsumedCapacity: js.UndefOr[ConsumedCapacity] = js.undefined
    /**
      * The number of items in the response. If you set ScanFilter in the request, then Count is the number of items returned after the filter was applied, and ScannedCount is the number of matching items before the filter was applied. If you did not use a filter in the request, then Count is the same as ScannedCount.
      */
    var Count: js.UndefOr[Integer] = js.undefined
    /**
      * An array of item attributes that match the scan criteria. Each element in this array consists of an attribute name and the value for that attribute.
      */
    var Items: js.UndefOr[ItemList] = js.undefined
    /**
      * The primary key of the item where the operation stopped, inclusive of the previous result set. Use this value to start a new operation, excluding this value in the new request. If LastEvaluatedKey is empty, then the "last page" of results has been processed and there is no more data to be retrieved. If LastEvaluatedKey is not empty, it does not necessarily mean that there is more data in the result set. The only way to know when you have reached the end of the result set is when LastEvaluatedKey is empty.
      */
    var LastEvaluatedKey: js.UndefOr[Key] = js.undefined
    /**
      * The number of items evaluated, before any ScanFilter is applied. A high ScannedCount value with few, or no, Count results indicates an inefficient Scan operation. For more information, see Count and ScannedCount in the Amazon DynamoDB Developer Guide. If you did not use a filter in the request, then ScannedCount is the same as Count.
      */
    var ScannedCount: js.UndefOr[Integer] = js.undefined
  }
  
  trait SecondaryIndexesCapacityMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[Capacity]
  
  trait SourceTableDetails extends js.Object {
    /**
      * Controls how you are charged for read and write throughput and how you manage capacity. This setting can be changed later.    PROVISIONED - Sets the read/write capacity mode to PROVISIONED. We recommend using PROVISIONED for predictable workloads.    PAY_PER_REQUEST - Sets the read/write capacity mode to PAY_PER_REQUEST. We recommend using PAY_PER_REQUEST for unpredictable workloads.   
      */
    var BillingMode: js.UndefOr[BillingMode] = js.undefined
    /**
      * Number of items in the table. Please note this is an approximate value. 
      */
    var ItemCount: js.UndefOr[ItemCount] = js.undefined
    /**
      * Schema of the table. 
      */
    var KeySchema: KeySchema
    /**
      * Read IOPs and Write IOPS on the table when the backup was created.
      */
    var ProvisionedThroughput: ProvisionedThroughput
    /**
      * ARN of the table for which backup was created. 
      */
    var TableArn: js.UndefOr[TableArn] = js.undefined
    /**
      * Time when the source table was created. 
      */
    var TableCreationDateTime: TableCreationDateTime
    /**
      * Unique identifier for the table for which the backup was created. 
      */
    var TableId: TableId
    /**
      * The name of the table for which the backup was created. 
      */
    var TableName: TableName
    /**
      * Size of the table in bytes. Please note this is an approximate value.
      */
    var TableSizeBytes: js.UndefOr[Long] = js.undefined
  }
  
  trait SourceTableFeatureDetails extends js.Object {
    /**
      * Represents the GSI properties for the table when the backup was created. It includes the IndexName, KeySchema, Projection and ProvisionedThroughput for the GSIs on the table at the time of backup. 
      */
    var GlobalSecondaryIndexes: js.UndefOr[GlobalSecondaryIndexes] = js.undefined
    /**
      * Represents the LSI properties for the table when the backup was created. It includes the IndexName, KeySchema and Projection for the LSIs on the table at the time of backup. 
      */
    var LocalSecondaryIndexes: js.UndefOr[LocalSecondaryIndexes] = js.undefined
    /**
      * The description of the server-side encryption status on the table when the backup was created.
      */
    var SSEDescription: js.UndefOr[SSEDescription] = js.undefined
    /**
      * Stream settings on the table when the backup was created.
      */
    var StreamDescription: js.UndefOr[StreamSpecification] = js.undefined
    /**
      * Time to Live settings on the table when the backup was created.
      */
    var TimeToLiveDescription: js.UndefOr[TimeToLiveDescription] = js.undefined
  }
  
  trait StreamSpecification extends js.Object {
    /**
      * Indicates whether DynamoDB Streams is enabled (true) or disabled (false) on the table.
      */
    var StreamEnabled: js.UndefOr[StreamEnabled] = js.undefined
    /**
      *  When an item in the table is modified, StreamViewType determines what information is written to the stream for this table. Valid values for StreamViewType are:    KEYS_ONLY - Only the key attributes of the modified item are written to the stream.    NEW_IMAGE - The entire item, as it appears after it was modified, is written to the stream.    OLD_IMAGE - The entire item, as it appeared before it was modified, is written to the stream.    NEW_AND_OLD_IMAGES - Both the new and the old item images of the item are written to the stream.  
      */
    var StreamViewType: js.UndefOr[StreamViewType] = js.undefined
  }
  
  trait TableDescription extends js.Object {
    /**
      * An array of AttributeDefinition objects. Each of these objects describes one attribute in the table and index key schema. Each AttributeDefinition object in this array is composed of:    AttributeName - The name of the attribute.    AttributeType - The data type for the attribute.  
      */
    var AttributeDefinitions: js.UndefOr[AttributeDefinitions] = js.undefined
    /**
      * Contains the details for the read/write capacity mode.
      */
    var BillingModeSummary: js.UndefOr[BillingModeSummary] = js.undefined
    /**
      * The date and time when the table was created, in UNIX epoch time format.
      */
    var CreationDateTime: js.UndefOr[_Date] = js.undefined
    /**
      * The global secondary indexes, if any, on the table. Each index is scoped to a given partition key value. Each element is composed of:    Backfilling - If true, then the index is currently in the backfilling phase. Backfilling occurs only when a new global secondary index is added to the table; it is the process by which DynamoDB populates the new index with data from the table. (This attribute does not appear for indexes that were created during a CreateTable operation.)    IndexName - The name of the global secondary index.    IndexSizeBytes - The total size of the global secondary index, in bytes. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.     IndexStatus - The current status of the global secondary index:    CREATING - The index is being created.    UPDATING - The index is being updated.    DELETING - The index is being deleted.    ACTIVE - The index is ready for use.      ItemCount - The number of items in the global secondary index. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.     KeySchema - Specifies the complete index key schema. The attribute names in the key schema must be between 1 and 255 characters (inclusive). The key schema must begin with the same partition key as the table.    Projection - Specifies attributes that are copied (projected) from the table into the index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. Each attribute specification is composed of:    ProjectionType - One of the following:    KEYS_ONLY - Only the index and primary keys are projected into the index.    INCLUDE - Only the specified table attributes are projected into the index. The list of projected attributes are in NonKeyAttributes.    ALL - All of the table attributes are projected into the index.      NonKeyAttributes - A list of one or more non-key attribute names that are projected into the secondary index. The total count of attributes provided in NonKeyAttributes, summed across all of the secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts as two distinct attributes when determining the total.      ProvisionedThroughput - The provisioned throughput settings for the global secondary index, consisting of read and write capacity units, along with data about increases and decreases.    If the table is in the DELETING state, no information about indexes will be returned.
      */
    var GlobalSecondaryIndexes: js.UndefOr[GlobalSecondaryIndexDescriptionList] = js.undefined
    /**
      * The number of items in the specified table. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.
      */
    var ItemCount: js.UndefOr[Long] = js.undefined
    /**
      * The primary key structure for the table. Each KeySchemaElement consists of:    AttributeName - The name of the attribute.    KeyType - The role of the attribute:    HASH - partition key    RANGE - sort key    The partition key of an item is also known as its hash attribute. The term "hash attribute" derives from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values. The sort key of an item is also known as its range attribute. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value.    For more information about primary keys, see Primary Key in the Amazon DynamoDB Developer Guide.
      */
    var KeySchema: js.UndefOr[KeySchema] = js.undefined
    /**
      * The Amazon Resource Name (ARN) that uniquely identifies the latest stream for this table.
      */
    var LatestStreamArn: js.UndefOr[StreamArn] = js.undefined
    /**
      * A timestamp, in ISO 8601 format, for this stream. Note that LatestStreamLabel is not a unique identifier for the stream, because it is possible that a stream from another table might have the same timestamp. However, the combination of the following three elements is guaranteed to be unique:   the AWS customer ID.   the table name.   the StreamLabel.  
      */
    var LatestStreamLabel: js.UndefOr[String] = js.undefined
    /**
      * Represents one or more local secondary indexes on the table. Each index is scoped to a given partition key value. Tables with one or more local secondary indexes are subject to an item collection size limit, where the amount of data within a given item collection cannot exceed 10 GB. Each element is composed of:    IndexName - The name of the local secondary index.    KeySchema - Specifies the complete index key schema. The attribute names in the key schema must be between 1 and 255 characters (inclusive). The key schema must begin with the same partition key as the table.    Projection - Specifies attributes that are copied (projected) from the table into the index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. Each attribute specification is composed of:    ProjectionType - One of the following:    KEYS_ONLY - Only the index and primary keys are projected into the index.    INCLUDE - Only the specified table attributes are projected into the index. The list of projected attributes are in NonKeyAttributes.    ALL - All of the table attributes are projected into the index.      NonKeyAttributes - A list of one or more non-key attribute names that are projected into the secondary index. The total count of attributes provided in NonKeyAttributes, summed across all of the secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts as two distinct attributes when determining the total.      IndexSizeBytes - Represents the total size of the index, in bytes. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.    ItemCount - Represents the number of items in the index. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.   If the table is in the DELETING state, no information about indexes will be returned.
      */
    var LocalSecondaryIndexes: js.UndefOr[LocalSecondaryIndexDescriptionList] = js.undefined
    /**
      * The provisioned throughput settings for the table, consisting of read and write capacity units, along with data about increases and decreases.
      */
    var ProvisionedThroughput: js.UndefOr[ProvisionedThroughputDescription] = js.undefined
    /**
      * Contains details for the restore.
      */
    var RestoreSummary: js.UndefOr[RestoreSummary] = js.undefined
    /**
      * The description of the server-side encryption status on the specified table.
      */
    var SSEDescription: js.UndefOr[SSEDescription] = js.undefined
    /**
      * The current DynamoDB Streams configuration for the table.
      */
    var StreamSpecification: js.UndefOr[StreamSpecification] = js.undefined
    /**
      * The Amazon Resource Name (ARN) that uniquely identifies the table.
      */
    var TableArn: js.UndefOr[String] = js.undefined
    /**
      * Unique identifier for the table for which the backup was created. 
      */
    var TableId: js.UndefOr[TableId] = js.undefined
    /**
      * The name of the table.
      */
    var TableName: js.UndefOr[TableName] = js.undefined
    /**
      * The total size of the specified table, in bytes. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.
      */
    var TableSizeBytes: js.UndefOr[Long] = js.undefined
    /**
      * The current state of the table:    CREATING - The table is being created.    UPDATING - The table is being updated.    DELETING - The table is being deleted.    ACTIVE - The table is ready for use.  
      */
    var TableStatus: js.UndefOr[TableStatus] = js.undefined
  }
  
  trait Tag extends js.Object {
    /**
      * The key of the tag.Tag keys are case sensitive. Each DynamoDB table can only have up to one tag with the same key. If you try to add an existing tag (same key), the existing tag value will be updated to the new value. 
      */
    var Key: TagKeyString
    /**
      * The value of the tag. Tag values are case-sensitive and can be null.
      */
    var Value: TagValueString
  }
  
  trait TagResourceInput extends js.Object {
    /**
      * Identifies the Amazon DynamoDB resource to which tags should be added. This value is an Amazon Resource Name (ARN).
      */
    var ResourceArn: ResourceArnString
    /**
      * The tags to be assigned to the Amazon DynamoDB resource.
      */
    var Tags: TagList
  }
  
  trait TimeToLiveDescription extends js.Object {
    /**
      *  The name of the Time to Live attribute for items in the table.
      */
    var AttributeName: js.UndefOr[TimeToLiveAttributeName] = js.undefined
    /**
      *  The Time to Live status for the table.
      */
    var TimeToLiveStatus: js.UndefOr[TimeToLiveStatus] = js.undefined
  }
  
  trait TimeToLiveSpecification extends js.Object {
    /**
      * The name of the Time to Live attribute used to store the expiration time for items in the table.
      */
    var AttributeName: TimeToLiveAttributeName
    /**
      * Indicates whether Time To Live is to be enabled (true) or disabled (false) on the table.
      */
    var Enabled: TimeToLiveEnabled
  }
  
  trait TransactGetItem extends js.Object {
    /**
      * Contains the primary key that identifies the item to get, together with the name of the table that contains the item, and optionally the specific attributes of the item to retrieve.
      */
    var Get: Get
  }
  
  trait TransactGetItemsInput extends js.Object {
    /**
      * A value of TOTAL causes consumed capacity information to be returned, and a value of NONE prevents that information from being returned. No other value is valid.
      */
    var ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity] = js.undefined
    /**
      * An ordered array of up to 10 TransactGetItem objects, each of which contains a Get structure.
      */
    var TransactItems: TransactGetItemList
  }
  
  trait TransactGetItemsOutput extends js.Object {
    /**
      * If the ReturnConsumedCapacity value was TOTAL, this is an array of ConsumedCapacity objects, one for each table addressed by TransactGetItem objects in the TransactItems parameter. These ConsumedCapacity objects report the read-capacity units consumed by the TransactGetItems call in that table.
      */
    var ConsumedCapacity: js.UndefOr[ConsumedCapacityMultiple] = js.undefined
    /**
      * An ordered array of up to 10 ItemResponse objects, each of which corresponds to the TransactGetItem object in the same position in the TransactItems array. Each ItemResponse object contains a Map of the name-value pairs that are the projected attributes of the requested item. If a requested item could not be retrieved, the corresponding ItemResponse object is Null, or if the requested item has no projected attributes, the corresponding ItemResponse object is an empty Map. 
      */
    var Responses: js.UndefOr[ItemResponseList] = js.undefined
  }
  
  trait TransactWriteItem extends js.Object {
    /**
      * A request to perform a check item operation.
      */
    var ConditionCheck: js.UndefOr[ConditionCheck] = js.undefined
    /**
      * A request to perform a DeleteItem operation.
      */
    var Delete: js.UndefOr[Delete] = js.undefined
    /**
      * A request to perform a PutItem operation.
      */
    var Put: js.UndefOr[Put] = js.undefined
    /**
      * A request to perform an UpdateItem operation.
      */
    var Update: js.UndefOr[Update] = js.undefined
  }
  
  trait TransactWriteItemsInput extends js.Object {
    /**
      * Providing a ClientRequestToken makes the call to TransactWriteItems idempotent, meaning that multiple identical calls have the same effect as one single call. Although multiple identical calls using the same client request token produce the same result on the server (no side effects), the responses to the calls may not be the same. If the ReturnConsumedCapacity&gt; parameter is set, then the initial TransactWriteItems call returns the amount of write capacity units consumed in making the changes, and subsequent TransactWriteItems calls with the same client token return the amount of read capacity units consumed in reading the item. A client request token is valid for 10 minutes after the first request that uses it completes. After 10 minutes, any request with the same client token is treated as a new request. Do not resubmit the same request with the same client token for more than 10 minutes or the result may not be idempotent. If you submit a request with the same client token but a change in other parameters within the 10 minute idempotency window, DynamoDB returns an IdempotentParameterMismatch exception.
      */
    var ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
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
  
  trait TransactWriteItemsOutput extends js.Object {
    /**
      * The capacity units consumed by the entire TransactWriteItems operation. The values of the list are ordered according to the ordering of the TransactItems request parameter. 
      */
    var ConsumedCapacity: js.UndefOr[ConsumedCapacityMultiple] = js.undefined
    /**
      * A list of tables that were processed by TransactWriteItems and, for each table, information about any item collections that were affected by individual UpdateItem, PutItem or DeleteItem operations. 
      */
    var ItemCollectionMetrics: js.UndefOr[ItemCollectionMetricsPerTable] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServicesDynamodbMod.DynamoDBCustomizations {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * The BatchGetItem operation returns the attributes of one or more items from one or more tables. You identify requested items by primary key. A single operation can retrieve up to 16 MB of data, which can contain as many as 100 items. BatchGetItem will return a partial result if the response size limit is exceeded, the table's provisioned throughput is exceeded, or an internal processing failure occurs. If a partial result is returned, the operation returns a value for UnprocessedKeys. You can use this value to retry the operation starting with the next item to get.  If you request more than 100 items BatchGetItem will return a ValidationException with the message "Too many items requested for the BatchGetItem call".  For example, if you ask to retrieve 100 items, but each individual item is 300 KB in size, the system returns 52 items (so as not to exceed the 16 MB limit). It also returns an appropriate UnprocessedKeys value so you can get the next page of results. If desired, your application can include its own logic to assemble the pages of results into one data set. If none of the items can be processed due to insufficient provisioned throughput on all of the tables in the request, then BatchGetItem will return a ProvisionedThroughputExceededException. If at least one of the items is successfully processed, then BatchGetItem completes successfully, while returning the keys of the unread items in UnprocessedKeys.  If DynamoDB returns any unprocessed items, you should retry the batch operation on those items. However, we strongly recommend that you use an exponential backoff algorithm. If you retry the batch operation immediately, the underlying read or write requests can still fail due to throttling on the individual tables. If you delay the batch operation using exponential backoff, the individual requests in the batch are much more likely to succeed. For more information, see Batch Operations and Error Handling in the Amazon DynamoDB Developer Guide.  By default, BatchGetItem performs eventually consistent reads on every table in the request. If you want strongly consistent reads instead, you can set ConsistentRead to true for any or all tables. In order to minimize response latency, BatchGetItem retrieves items in parallel. When designing your application, keep in mind that DynamoDB does not return items in any particular order. To help parse the response by item, include the primary key values for the items in your request in the ProjectionExpression parameter. If a requested item does not exist, it is not returned in the result. Requests for nonexistent items consume the minimum read capacity units according to the type of read. For more information, see Capacity Units Calculations in the Amazon DynamoDB Developer Guide.
      */
    def batchGetItem(): awsDashSdkLib.libRequestMod.Request[BatchGetItemOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchGetItem(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchGetItemOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchGetItemOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * The BatchGetItem operation returns the attributes of one or more items from one or more tables. You identify requested items by primary key. A single operation can retrieve up to 16 MB of data, which can contain as many as 100 items. BatchGetItem will return a partial result if the response size limit is exceeded, the table's provisioned throughput is exceeded, or an internal processing failure occurs. If a partial result is returned, the operation returns a value for UnprocessedKeys. You can use this value to retry the operation starting with the next item to get.  If you request more than 100 items BatchGetItem will return a ValidationException with the message "Too many items requested for the BatchGetItem call".  For example, if you ask to retrieve 100 items, but each individual item is 300 KB in size, the system returns 52 items (so as not to exceed the 16 MB limit). It also returns an appropriate UnprocessedKeys value so you can get the next page of results. If desired, your application can include its own logic to assemble the pages of results into one data set. If none of the items can be processed due to insufficient provisioned throughput on all of the tables in the request, then BatchGetItem will return a ProvisionedThroughputExceededException. If at least one of the items is successfully processed, then BatchGetItem completes successfully, while returning the keys of the unread items in UnprocessedKeys.  If DynamoDB returns any unprocessed items, you should retry the batch operation on those items. However, we strongly recommend that you use an exponential backoff algorithm. If you retry the batch operation immediately, the underlying read or write requests can still fail due to throttling on the individual tables. If you delay the batch operation using exponential backoff, the individual requests in the batch are much more likely to succeed. For more information, see Batch Operations and Error Handling in the Amazon DynamoDB Developer Guide.  By default, BatchGetItem performs eventually consistent reads on every table in the request. If you want strongly consistent reads instead, you can set ConsistentRead to true for any or all tables. In order to minimize response latency, BatchGetItem retrieves items in parallel. When designing your application, keep in mind that DynamoDB does not return items in any particular order. To help parse the response by item, include the primary key values for the items in your request in the ProjectionExpression parameter. If a requested item does not exist, it is not returned in the result. Requests for nonexistent items consume the minimum read capacity units according to the type of read. For more information, see Capacity Units Calculations in the Amazon DynamoDB Developer Guide.
      */
    def batchGetItem(params: BatchGetItemInput): awsDashSdkLib.libRequestMod.Request[BatchGetItemOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchGetItem(
      params: BatchGetItemInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchGetItemOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchGetItemOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * The BatchWriteItem operation puts or deletes multiple items in one or more tables. A single call to BatchWriteItem can write up to 16 MB of data, which can comprise as many as 25 put or delete requests. Individual items to be written can be as large as 400 KB.   BatchWriteItem cannot update items. To update items, use the UpdateItem action.  The individual PutItem and DeleteItem operations specified in BatchWriteItem are atomic; however BatchWriteItem as a whole is not. If any requested operations fail because the table's provisioned throughput is exceeded or an internal processing failure occurs, the failed operations are returned in the UnprocessedItems response parameter. You can investigate and optionally resend the requests. Typically, you would call BatchWriteItem in a loop. Each iteration would check for unprocessed items and submit a new BatchWriteItem request with those unprocessed items until all items have been processed. Note that if none of the items can be processed due to insufficient provisioned throughput on all of the tables in the request, then BatchWriteItem will return a ProvisionedThroughputExceededException.  If DynamoDB returns any unprocessed items, you should retry the batch operation on those items. However, we strongly recommend that you use an exponential backoff algorithm. If you retry the batch operation immediately, the underlying read or write requests can still fail due to throttling on the individual tables. If you delay the batch operation using exponential backoff, the individual requests in the batch are much more likely to succeed. For more information, see Batch Operations and Error Handling in the Amazon DynamoDB Developer Guide.  With BatchWriteItem, you can efficiently write or delete large amounts of data, such as from Amazon Elastic MapReduce (EMR), or copy data from another database into DynamoDB. In order to improve performance with these large-scale operations, BatchWriteItem does not behave in the same way as individual PutItem and DeleteItem calls would. For example, you cannot specify conditions on individual put and delete requests, and BatchWriteItem does not return deleted items in the response. If you use a programming language that supports concurrency, you can use threads to write items in parallel. Your application must include the necessary logic to manage the threads. With languages that don't support threading, you must update or delete the specified items one at a time. In both situations, BatchWriteItem performs the specified put and delete operations in parallel, giving you the power of the thread pool approach without having to introduce complexity into your application. Parallel processing reduces latency, but each specified put and delete request consumes the same number of write capacity units whether it is processed in parallel or not. Delete operations on nonexistent items consume one write capacity unit. If one or more of the following is true, DynamoDB rejects the entire batch write operation:   One or more tables specified in the BatchWriteItem request does not exist.   Primary key attributes specified on an item in the request do not match those in the corresponding table's primary key schema.   You try to perform multiple operations on the same item in the same BatchWriteItem request. For example, you cannot put and delete the same item in the same BatchWriteItem request.     Your request contains at least two items with identical hash and range keys (which essentially is two put operations).    There are more than 25 requests in the batch.   Any individual item in a batch exceeds 400 KB.   The total request size exceeds 16 MB.  
      */
    def batchWriteItem(): awsDashSdkLib.libRequestMod.Request[BatchWriteItemOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchWriteItem(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchWriteItemOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchWriteItemOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * The BatchWriteItem operation puts or deletes multiple items in one or more tables. A single call to BatchWriteItem can write up to 16 MB of data, which can comprise as many as 25 put or delete requests. Individual items to be written can be as large as 400 KB.   BatchWriteItem cannot update items. To update items, use the UpdateItem action.  The individual PutItem and DeleteItem operations specified in BatchWriteItem are atomic; however BatchWriteItem as a whole is not. If any requested operations fail because the table's provisioned throughput is exceeded or an internal processing failure occurs, the failed operations are returned in the UnprocessedItems response parameter. You can investigate and optionally resend the requests. Typically, you would call BatchWriteItem in a loop. Each iteration would check for unprocessed items and submit a new BatchWriteItem request with those unprocessed items until all items have been processed. Note that if none of the items can be processed due to insufficient provisioned throughput on all of the tables in the request, then BatchWriteItem will return a ProvisionedThroughputExceededException.  If DynamoDB returns any unprocessed items, you should retry the batch operation on those items. However, we strongly recommend that you use an exponential backoff algorithm. If you retry the batch operation immediately, the underlying read or write requests can still fail due to throttling on the individual tables. If you delay the batch operation using exponential backoff, the individual requests in the batch are much more likely to succeed. For more information, see Batch Operations and Error Handling in the Amazon DynamoDB Developer Guide.  With BatchWriteItem, you can efficiently write or delete large amounts of data, such as from Amazon Elastic MapReduce (EMR), or copy data from another database into DynamoDB. In order to improve performance with these large-scale operations, BatchWriteItem does not behave in the same way as individual PutItem and DeleteItem calls would. For example, you cannot specify conditions on individual put and delete requests, and BatchWriteItem does not return deleted items in the response. If you use a programming language that supports concurrency, you can use threads to write items in parallel. Your application must include the necessary logic to manage the threads. With languages that don't support threading, you must update or delete the specified items one at a time. In both situations, BatchWriteItem performs the specified put and delete operations in parallel, giving you the power of the thread pool approach without having to introduce complexity into your application. Parallel processing reduces latency, but each specified put and delete request consumes the same number of write capacity units whether it is processed in parallel or not. Delete operations on nonexistent items consume one write capacity unit. If one or more of the following is true, DynamoDB rejects the entire batch write operation:   One or more tables specified in the BatchWriteItem request does not exist.   Primary key attributes specified on an item in the request do not match those in the corresponding table's primary key schema.   You try to perform multiple operations on the same item in the same BatchWriteItem request. For example, you cannot put and delete the same item in the same BatchWriteItem request.     Your request contains at least two items with identical hash and range keys (which essentially is two put operations).    There are more than 25 requests in the batch.   Any individual item in a batch exceeds 400 KB.   The total request size exceeds 16 MB.  
      */
    def batchWriteItem(params: BatchWriteItemInput): awsDashSdkLib.libRequestMod.Request[BatchWriteItemOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchWriteItem(
      params: BatchWriteItemInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchWriteItemOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchWriteItemOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a backup for an existing table.  Each time you create an On-Demand Backup, the entire table data is backed up. There is no limit to the number of on-demand backups that can be taken.   When you create an On-Demand Backup, a time marker of the request is cataloged, and the backup is created asynchronously, by applying all changes until the time of the request to the last full table snapshot. Backup requests are processed instantaneously and become available for restore within minutes.  You can call CreateBackup at a maximum rate of 50 times per second. All backups in DynamoDB work without consuming any provisioned throughput on the table.  If you submit a backup request on 2018-12-14 at 14:25:00, the backup is guaranteed to contain all data committed to the table up to 14:24:00, and data committed after 14:26:00 will not be. The backup may or may not contain data modifications made between 14:24:00 and 14:26:00. On-Demand Backup does not support causal consistency.   Along with data, the following are also included on the backups:    Global secondary indexes (GSIs)   Local secondary indexes (LSIs)   Streams   Provisioned read and write capacity  
      */
    def createBackup(): awsDashSdkLib.libRequestMod.Request[CreateBackupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createBackup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateBackupOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateBackupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a backup for an existing table.  Each time you create an On-Demand Backup, the entire table data is backed up. There is no limit to the number of on-demand backups that can be taken.   When you create an On-Demand Backup, a time marker of the request is cataloged, and the backup is created asynchronously, by applying all changes until the time of the request to the last full table snapshot. Backup requests are processed instantaneously and become available for restore within minutes.  You can call CreateBackup at a maximum rate of 50 times per second. All backups in DynamoDB work without consuming any provisioned throughput on the table.  If you submit a backup request on 2018-12-14 at 14:25:00, the backup is guaranteed to contain all data committed to the table up to 14:24:00, and data committed after 14:26:00 will not be. The backup may or may not contain data modifications made between 14:24:00 and 14:26:00. On-Demand Backup does not support causal consistency.   Along with data, the following are also included on the backups:    Global secondary indexes (GSIs)   Local secondary indexes (LSIs)   Streams   Provisioned read and write capacity  
      */
    def createBackup(params: CreateBackupInput): awsDashSdkLib.libRequestMod.Request[CreateBackupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createBackup(
      params: CreateBackupInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateBackupOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateBackupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a global table from an existing table. A global table creates a replication relationship between two or more DynamoDB tables with the same table name in the provided regions.  If you want to add a new replica table to a global table, each of the following conditions must be true:   The table must have the same primary key as all of the other replicas.   The table must have the same name as all of the other replicas.   The table must have DynamoDB Streams enabled, with the stream containing both the new and the old images of the item.   None of the replica tables in the global table can contain any data.    If global secondary indexes are specified, then the following conditions must also be met:     The global secondary indexes must have the same name.     The global secondary indexes must have the same hash key and sort key (if present).      Write capacity settings should be set consistently across your replica tables and secondary indexes. DynamoDB strongly recommends enabling auto scaling to manage the write capacity settings for all of your global tables replicas and indexes.   If you prefer to manage write capacity settings manually, you should provision equal replicated write capacity units to your replica tables. You should also provision equal replicated write capacity units to matching secondary indexes across your global table.  
      */
    def createGlobalTable(): awsDashSdkLib.libRequestMod.Request[CreateGlobalTableOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createGlobalTable(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateGlobalTableOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateGlobalTableOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a global table from an existing table. A global table creates a replication relationship between two or more DynamoDB tables with the same table name in the provided regions.  If you want to add a new replica table to a global table, each of the following conditions must be true:   The table must have the same primary key as all of the other replicas.   The table must have the same name as all of the other replicas.   The table must have DynamoDB Streams enabled, with the stream containing both the new and the old images of the item.   None of the replica tables in the global table can contain any data.    If global secondary indexes are specified, then the following conditions must also be met:     The global secondary indexes must have the same name.     The global secondary indexes must have the same hash key and sort key (if present).      Write capacity settings should be set consistently across your replica tables and secondary indexes. DynamoDB strongly recommends enabling auto scaling to manage the write capacity settings for all of your global tables replicas and indexes.   If you prefer to manage write capacity settings manually, you should provision equal replicated write capacity units to your replica tables. You should also provision equal replicated write capacity units to matching secondary indexes across your global table.  
      */
    def createGlobalTable(params: CreateGlobalTableInput): awsDashSdkLib.libRequestMod.Request[CreateGlobalTableOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createGlobalTable(
      params: CreateGlobalTableInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateGlobalTableOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateGlobalTableOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * The CreateTable operation adds a new table to your account. In an AWS account, table names must be unique within each region. That is, you can have two tables with same name if you create the tables in different regions.  CreateTable is an asynchronous operation. Upon receiving a CreateTable request, DynamoDB immediately returns a response with a TableStatus of CREATING. After the table is created, DynamoDB sets the TableStatus to ACTIVE. You can perform read and write operations only on an ACTIVE table.  You can optionally define secondary indexes on the new table, as part of the CreateTable operation. If you want to create multiple tables with secondary indexes on them, you must create the tables sequentially. Only one table with secondary indexes can be in the CREATING state at any given time. You can use the DescribeTable action to check the table status.
      */
    def createTable(): awsDashSdkLib.libRequestMod.Request[CreateTableOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createTable(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateTableOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateTableOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * The CreateTable operation adds a new table to your account. In an AWS account, table names must be unique within each region. That is, you can have two tables with same name if you create the tables in different regions.  CreateTable is an asynchronous operation. Upon receiving a CreateTable request, DynamoDB immediately returns a response with a TableStatus of CREATING. After the table is created, DynamoDB sets the TableStatus to ACTIVE. You can perform read and write operations only on an ACTIVE table.  You can optionally define secondary indexes on the new table, as part of the CreateTable operation. If you want to create multiple tables with secondary indexes on them, you must create the tables sequentially. Only one table with secondary indexes can be in the CREATING state at any given time. You can use the DescribeTable action to check the table status.
      */
    def createTable(params: CreateTableInput): awsDashSdkLib.libRequestMod.Request[CreateTableOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createTable(
      params: CreateTableInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateTableOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateTableOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an existing backup of a table. You can call DeleteBackup at a maximum rate of 10 times per second.
      */
    def deleteBackup(): awsDashSdkLib.libRequestMod.Request[DeleteBackupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBackup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteBackupOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteBackupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an existing backup of a table. You can call DeleteBackup at a maximum rate of 10 times per second.
      */
    def deleteBackup(params: DeleteBackupInput): awsDashSdkLib.libRequestMod.Request[DeleteBackupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBackup(
      params: DeleteBackupInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteBackupOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteBackupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a single item in a table by primary key. You can perform a conditional delete operation that deletes the item if it exists, or if it has an expected attribute value. In addition to deleting an item, you can also return the item's attribute values in the same operation, using the ReturnValues parameter. Unless you specify conditions, the DeleteItem is an idempotent operation; running it multiple times on the same item or attribute does not result in an error response. Conditional deletes are useful for deleting items only if specific conditions are met. If those conditions are met, DynamoDB performs the delete. Otherwise, the item is not deleted.
      */
    def deleteItem(): awsDashSdkLib.libRequestMod.Request[DeleteItemOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteItem(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteItemOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteItemOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a single item in a table by primary key. You can perform a conditional delete operation that deletes the item if it exists, or if it has an expected attribute value. In addition to deleting an item, you can also return the item's attribute values in the same operation, using the ReturnValues parameter. Unless you specify conditions, the DeleteItem is an idempotent operation; running it multiple times on the same item or attribute does not result in an error response. Conditional deletes are useful for deleting items only if specific conditions are met. If those conditions are met, DynamoDB performs the delete. Otherwise, the item is not deleted.
      */
    def deleteItem(params: DeleteItemInput): awsDashSdkLib.libRequestMod.Request[DeleteItemOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteItem(
      params: DeleteItemInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteItemOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteItemOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * The DeleteTable operation deletes a table and all of its items. After a DeleteTable request, the specified table is in the DELETING state until DynamoDB completes the deletion. If the table is in the ACTIVE state, you can delete it. If a table is in CREATING or UPDATING states, then DynamoDB returns a ResourceInUseException. If the specified table does not exist, DynamoDB returns a ResourceNotFoundException. If table is already in the DELETING state, no error is returned.   DynamoDB might continue to accept data read and write operations, such as GetItem and PutItem, on a table in the DELETING state until the table deletion is complete.  When you delete a table, any indexes on that table are also deleted. If you have DynamoDB Streams enabled on the table, then the corresponding stream on that table goes into the DISABLED state, and the stream is automatically deleted after 24 hours. Use the DescribeTable action to check the status of the table. 
      */
    def deleteTable(): awsDashSdkLib.libRequestMod.Request[DeleteTableOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteTable(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteTableOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteTableOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * The DeleteTable operation deletes a table and all of its items. After a DeleteTable request, the specified table is in the DELETING state until DynamoDB completes the deletion. If the table is in the ACTIVE state, you can delete it. If a table is in CREATING or UPDATING states, then DynamoDB returns a ResourceInUseException. If the specified table does not exist, DynamoDB returns a ResourceNotFoundException. If table is already in the DELETING state, no error is returned.   DynamoDB might continue to accept data read and write operations, such as GetItem and PutItem, on a table in the DELETING state until the table deletion is complete.  When you delete a table, any indexes on that table are also deleted. If you have DynamoDB Streams enabled on the table, then the corresponding stream on that table goes into the DISABLED state, and the stream is automatically deleted after 24 hours. Use the DescribeTable action to check the status of the table. 
      */
    def deleteTable(params: DeleteTableInput): awsDashSdkLib.libRequestMod.Request[DeleteTableOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteTable(
      params: DeleteTableInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteTableOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteTableOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes an existing backup of a table. You can call DescribeBackup at a maximum rate of 10 times per second.
      */
    def describeBackup(): awsDashSdkLib.libRequestMod.Request[DescribeBackupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeBackup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeBackupOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeBackupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes an existing backup of a table. You can call DescribeBackup at a maximum rate of 10 times per second.
      */
    def describeBackup(params: DescribeBackupInput): awsDashSdkLib.libRequestMod.Request[DescribeBackupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeBackup(
      params: DescribeBackupInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeBackupOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeBackupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Checks the status of continuous backups and point in time recovery on the specified table. Continuous backups are ENABLED on all tables at table creation. If point in time recovery is enabled, PointInTimeRecoveryStatus will be set to ENABLED.  Once continuous backups and point in time recovery are enabled, you can restore to any point in time within EarliestRestorableDateTime and LatestRestorableDateTime.   LatestRestorableDateTime is typically 5 minutes before the current time. You can restore your table to any point in time during the last 35 days.  You can call DescribeContinuousBackups at a maximum rate of 10 times per second.
      */
    def describeContinuousBackups(): awsDashSdkLib.libRequestMod.Request[DescribeContinuousBackupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeContinuousBackups(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeContinuousBackupsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeContinuousBackupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Checks the status of continuous backups and point in time recovery on the specified table. Continuous backups are ENABLED on all tables at table creation. If point in time recovery is enabled, PointInTimeRecoveryStatus will be set to ENABLED.  Once continuous backups and point in time recovery are enabled, you can restore to any point in time within EarliestRestorableDateTime and LatestRestorableDateTime.   LatestRestorableDateTime is typically 5 minutes before the current time. You can restore your table to any point in time during the last 35 days.  You can call DescribeContinuousBackups at a maximum rate of 10 times per second.
      */
    def describeContinuousBackups(params: DescribeContinuousBackupsInput): awsDashSdkLib.libRequestMod.Request[DescribeContinuousBackupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeContinuousBackups(
      params: DescribeContinuousBackupsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeContinuousBackupsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeContinuousBackupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * 
      */
    def describeEndpoints(): awsDashSdkLib.libRequestMod.Request[DescribeEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEndpoints(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEndpointsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * 
      */
    def describeEndpoints(params: DescribeEndpointsRequest): awsDashSdkLib.libRequestMod.Request[DescribeEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEndpoints(
      params: DescribeEndpointsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEndpointsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the specified global table.
      */
    def describeGlobalTable(): awsDashSdkLib.libRequestMod.Request[DescribeGlobalTableOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeGlobalTable(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeGlobalTableOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeGlobalTableOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the specified global table.
      */
    def describeGlobalTable(params: DescribeGlobalTableInput): awsDashSdkLib.libRequestMod.Request[DescribeGlobalTableOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeGlobalTable(
      params: DescribeGlobalTableInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeGlobalTableOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeGlobalTableOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes region specific settings for a global table.
      */
    def describeGlobalTableSettings(): awsDashSdkLib.libRequestMod.Request[DescribeGlobalTableSettingsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeGlobalTableSettings(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeGlobalTableSettingsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeGlobalTableSettingsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes region specific settings for a global table.
      */
    def describeGlobalTableSettings(params: DescribeGlobalTableSettingsInput): awsDashSdkLib.libRequestMod.Request[DescribeGlobalTableSettingsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeGlobalTableSettings(
      params: DescribeGlobalTableSettingsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeGlobalTableSettingsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeGlobalTableSettingsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the current provisioned-capacity limits for your AWS account in a region, both for the region as a whole and for any one DynamoDB table that you create there. When you establish an AWS account, the account has initial limits on the maximum read capacity units and write capacity units that you can provision across all of your DynamoDB tables in a given region. Also, there are per-table limits that apply when you create a table there. For more information, see Limits page in the Amazon DynamoDB Developer Guide. Although you can increase these limits by filing a case at AWS Support Center, obtaining the increase is not instantaneous. The DescribeLimits action lets you write code to compare the capacity you are currently using to those limits imposed by your account so that you have enough time to apply for an increase before you hit a limit. For example, you could use one of the AWS SDKs to do the following:   Call DescribeLimits for a particular region to obtain your current account limits on provisioned capacity there.   Create a variable to hold the aggregate read capacity units provisioned for all your tables in that region, and one to hold the aggregate write capacity units. Zero them both.   Call ListTables to obtain a list of all your DynamoDB tables.   For each table name listed by ListTables, do the following:   Call DescribeTable with the table name.   Use the data returned by DescribeTable to add the read capacity units and write capacity units provisioned for the table itself to your variables.   If the table has one or more global secondary indexes (GSIs), loop over these GSIs and add their provisioned capacity values to your variables as well.     Report the account limits for that region returned by DescribeLimits, along with the total current provisioned capacity levels you have calculated.   This will let you see whether you are getting close to your account-level limits. The per-table limits apply only when you are creating a new table. They restrict the sum of the provisioned capacity of the new table itself and all its global secondary indexes. For existing tables and their GSIs, DynamoDB will not let you increase provisioned capacity extremely rapidly, but the only upper limit that applies is that the aggregate provisioned capacity over all your tables and GSIs cannot exceed either of the per-account limits.   DescribeLimits should only be called periodically. You can expect throttling errors if you call it more than once in a minute.  The DescribeLimits Request element has no content.
      */
    def describeLimits(): awsDashSdkLib.libRequestMod.Request[DescribeLimitsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeLimits(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeLimitsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeLimitsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the current provisioned-capacity limits for your AWS account in a region, both for the region as a whole and for any one DynamoDB table that you create there. When you establish an AWS account, the account has initial limits on the maximum read capacity units and write capacity units that you can provision across all of your DynamoDB tables in a given region. Also, there are per-table limits that apply when you create a table there. For more information, see Limits page in the Amazon DynamoDB Developer Guide. Although you can increase these limits by filing a case at AWS Support Center, obtaining the increase is not instantaneous. The DescribeLimits action lets you write code to compare the capacity you are currently using to those limits imposed by your account so that you have enough time to apply for an increase before you hit a limit. For example, you could use one of the AWS SDKs to do the following:   Call DescribeLimits for a particular region to obtain your current account limits on provisioned capacity there.   Create a variable to hold the aggregate read capacity units provisioned for all your tables in that region, and one to hold the aggregate write capacity units. Zero them both.   Call ListTables to obtain a list of all your DynamoDB tables.   For each table name listed by ListTables, do the following:   Call DescribeTable with the table name.   Use the data returned by DescribeTable to add the read capacity units and write capacity units provisioned for the table itself to your variables.   If the table has one or more global secondary indexes (GSIs), loop over these GSIs and add their provisioned capacity values to your variables as well.     Report the account limits for that region returned by DescribeLimits, along with the total current provisioned capacity levels you have calculated.   This will let you see whether you are getting close to your account-level limits. The per-table limits apply only when you are creating a new table. They restrict the sum of the provisioned capacity of the new table itself and all its global secondary indexes. For existing tables and their GSIs, DynamoDB will not let you increase provisioned capacity extremely rapidly, but the only upper limit that applies is that the aggregate provisioned capacity over all your tables and GSIs cannot exceed either of the per-account limits.   DescribeLimits should only be called periodically. You can expect throttling errors if you call it more than once in a minute.  The DescribeLimits Request element has no content.
      */
    def describeLimits(params: DescribeLimitsInput): awsDashSdkLib.libRequestMod.Request[DescribeLimitsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeLimits(
      params: DescribeLimitsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeLimitsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeLimitsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the table, including the current status of the table, when it was created, the primary key schema, and any indexes on the table.  If you issue a DescribeTable request immediately after a CreateTable request, DynamoDB might return a ResourceNotFoundException. This is because DescribeTable uses an eventually consistent query, and the metadata for your table might not be available at that moment. Wait for a few seconds, and then try the DescribeTable request again. 
      */
    def describeTable(): awsDashSdkLib.libRequestMod.Request[DescribeTableOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeTable(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeTableOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeTableOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the table, including the current status of the table, when it was created, the primary key schema, and any indexes on the table.  If you issue a DescribeTable request immediately after a CreateTable request, DynamoDB might return a ResourceNotFoundException. This is because DescribeTable uses an eventually consistent query, and the metadata for your table might not be available at that moment. Wait for a few seconds, and then try the DescribeTable request again. 
      */
    def describeTable(params: DescribeTableInput): awsDashSdkLib.libRequestMod.Request[DescribeTableOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeTable(
      params: DescribeTableInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeTableOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeTableOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gives a description of the Time to Live (TTL) status on the specified table. 
      */
    def describeTimeToLive(): awsDashSdkLib.libRequestMod.Request[DescribeTimeToLiveOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeTimeToLive(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeTimeToLiveOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeTimeToLiveOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gives a description of the Time to Live (TTL) status on the specified table. 
      */
    def describeTimeToLive(params: DescribeTimeToLiveInput): awsDashSdkLib.libRequestMod.Request[DescribeTimeToLiveOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeTimeToLive(
      params: DescribeTimeToLiveInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeTimeToLiveOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeTimeToLiveOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * The GetItem operation returns a set of attributes for the item with the given primary key. If there is no matching item, GetItem does not return any data and there will be no Item element in the response.  GetItem provides an eventually consistent read by default. If your application requires a strongly consistent read, set ConsistentRead to true. Although a strongly consistent read might take more time than an eventually consistent read, it always returns the last updated value.
      */
    def getItem(): awsDashSdkLib.libRequestMod.Request[GetItemOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getItem(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetItemOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetItemOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * The GetItem operation returns a set of attributes for the item with the given primary key. If there is no matching item, GetItem does not return any data and there will be no Item element in the response.  GetItem provides an eventually consistent read by default. If your application requires a strongly consistent read, set ConsistentRead to true. Although a strongly consistent read might take more time than an eventually consistent read, it always returns the last updated value.
      */
    def getItem(params: GetItemInput): awsDashSdkLib.libRequestMod.Request[GetItemOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getItem(
      params: GetItemInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetItemOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetItemOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * List backups associated with an AWS account. To list backups for a given table, specify TableName. ListBackups returns a paginated list of results with at most 1MB worth of items in a page. You can also specify a limit for the maximum number of entries to be returned in a page.  In the request, start time is inclusive but end time is exclusive. Note that these limits are for the time at which the original backup was requested. You can call ListBackups a maximum of 5 times per second.
      */
    def listBackups(): awsDashSdkLib.libRequestMod.Request[ListBackupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listBackups(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListBackupsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListBackupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * List backups associated with an AWS account. To list backups for a given table, specify TableName. ListBackups returns a paginated list of results with at most 1MB worth of items in a page. You can also specify a limit for the maximum number of entries to be returned in a page.  In the request, start time is inclusive but end time is exclusive. Note that these limits are for the time at which the original backup was requested. You can call ListBackups a maximum of 5 times per second.
      */
    def listBackups(params: ListBackupsInput): awsDashSdkLib.libRequestMod.Request[ListBackupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listBackups(
      params: ListBackupsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListBackupsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListBackupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all global tables that have a replica in the specified region.
      */
    def listGlobalTables(): awsDashSdkLib.libRequestMod.Request[ListGlobalTablesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listGlobalTables(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListGlobalTablesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListGlobalTablesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all global tables that have a replica in the specified region.
      */
    def listGlobalTables(params: ListGlobalTablesInput): awsDashSdkLib.libRequestMod.Request[ListGlobalTablesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listGlobalTables(
      params: ListGlobalTablesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListGlobalTablesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListGlobalTablesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns an array of table names associated with the current account and endpoint. The output from ListTables is paginated, with each page returning a maximum of 100 table names.
      */
    def listTables(): awsDashSdkLib.libRequestMod.Request[ListTablesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTables(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTablesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTablesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns an array of table names associated with the current account and endpoint. The output from ListTables is paginated, with each page returning a maximum of 100 table names.
      */
    def listTables(params: ListTablesInput): awsDashSdkLib.libRequestMod.Request[ListTablesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTables(
      params: ListTablesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTablesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTablesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * List all tags on an Amazon DynamoDB resource. You can call ListTagsOfResource up to 10 times per second, per account. For an overview on tagging DynamoDB resources, see Tagging for DynamoDB in the Amazon DynamoDB Developer Guide.
      */
    def listTagsOfResource(): awsDashSdkLib.libRequestMod.Request[ListTagsOfResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTagsOfResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsOfResourceOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsOfResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * List all tags on an Amazon DynamoDB resource. You can call ListTagsOfResource up to 10 times per second, per account. For an overview on tagging DynamoDB resources, see Tagging for DynamoDB in the Amazon DynamoDB Developer Guide.
      */
    def listTagsOfResource(params: ListTagsOfResourceInput): awsDashSdkLib.libRequestMod.Request[ListTagsOfResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTagsOfResource(
      params: ListTagsOfResourceInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsOfResourceOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsOfResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new item, or replaces an old item with a new item. If an item that has the same primary key as the new item already exists in the specified table, the new item completely replaces the existing item. You can perform a conditional put operation (add a new item if one with the specified primary key doesn't exist), or replace an existing item if it has certain attribute values. You can return the item's attribute values in the same operation, using the ReturnValues parameter.  This topic provides general information about the PutItem API. For information on how to call the PutItem API using the AWS SDK in specific languages, see the following:     PutItem in the AWS Command Line Interface       PutItem in the AWS SDK for .NET       PutItem in the AWS SDK for C++       PutItem in the AWS SDK for Go       PutItem in the AWS SDK for Java       PutItem in the AWS SDK for JavaScript       PutItem in the AWS SDK for PHP V3       PutItem in the AWS SDK for Python       PutItem in the AWS SDK for Ruby V2      When you add an item, the primary key attribute(s) are the only required attributes. Attribute values cannot be null. String and Binary type attributes must have lengths greater than zero. Set type attributes cannot be empty. Requests with empty values will be rejected with a ValidationException exception.  To prevent a new item from replacing an existing item, use a conditional expression that contains the attribute_not_exists function with the name of the attribute being used as the partition key for the table. Since every record must contain that attribute, the attribute_not_exists function will only succeed if no matching item exists.  For more information about PutItem, see Working with Items in the Amazon DynamoDB Developer Guide.
      */
    def putItem(): awsDashSdkLib.libRequestMod.Request[PutItemOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putItem(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ PutItemOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[PutItemOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new item, or replaces an old item with a new item. If an item that has the same primary key as the new item already exists in the specified table, the new item completely replaces the existing item. You can perform a conditional put operation (add a new item if one with the specified primary key doesn't exist), or replace an existing item if it has certain attribute values. You can return the item's attribute values in the same operation, using the ReturnValues parameter.  This topic provides general information about the PutItem API. For information on how to call the PutItem API using the AWS SDK in specific languages, see the following:     PutItem in the AWS Command Line Interface       PutItem in the AWS SDK for .NET       PutItem in the AWS SDK for C++       PutItem in the AWS SDK for Go       PutItem in the AWS SDK for Java       PutItem in the AWS SDK for JavaScript       PutItem in the AWS SDK for PHP V3       PutItem in the AWS SDK for Python       PutItem in the AWS SDK for Ruby V2      When you add an item, the primary key attribute(s) are the only required attributes. Attribute values cannot be null. String and Binary type attributes must have lengths greater than zero. Set type attributes cannot be empty. Requests with empty values will be rejected with a ValidationException exception.  To prevent a new item from replacing an existing item, use a conditional expression that contains the attribute_not_exists function with the name of the attribute being used as the partition key for the table. Since every record must contain that attribute, the attribute_not_exists function will only succeed if no matching item exists.  For more information about PutItem, see Working with Items in the Amazon DynamoDB Developer Guide.
      */
    def putItem(params: PutItemInput): awsDashSdkLib.libRequestMod.Request[PutItemOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putItem(
      params: PutItemInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ PutItemOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[PutItemOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * The Query operation finds items based on primary key values. You can query any table or secondary index that has a composite primary key (a partition key and a sort key).  Use the KeyConditionExpression parameter to provide a specific value for the partition key. The Query operation will return all of the items from the table or index with that partition key value. You can optionally narrow the scope of the Query operation by specifying a sort key value and a comparison operator in KeyConditionExpression. To further refine the Query results, you can optionally provide a FilterExpression. A FilterExpression determines which items within the results should be returned to you. All of the other results are discarded.   A Query operation always returns a result set. If no matching items are found, the result set will be empty. Queries that do not return results consume the minimum number of read capacity units for that type of read operation.    DynamoDB calculates the number of read capacity units consumed based on item size, not on the amount of data that is returned to an application. The number of capacity units consumed will be the same whether you request all of the attributes (the default behavior) or just some of them (using a projection expression). The number will also be the same whether or not you use a FilterExpression.    Query results are always sorted by the sort key value. If the data type of the sort key is Number, the results are returned in numeric order; otherwise, the results are returned in order of UTF-8 bytes. By default, the sort order is ascending. To reverse the order, set the ScanIndexForward parameter to false.   A single Query operation will read up to the maximum number of items set (if using the Limit parameter) or a maximum of 1 MB of data and then apply any filtering to the results using FilterExpression. If LastEvaluatedKey is present in the response, you will need to paginate the result set. For more information, see Paginating the Results in the Amazon DynamoDB Developer Guide.   FilterExpression is applied after a Query finishes, but before the results are returned. A FilterExpression cannot contain partition key or sort key attributes. You need to specify those attributes in the KeyConditionExpression.    A Query operation can return an empty result set and a LastEvaluatedKey if all the items read for the page of results are filtered out.   You can query a table, a local secondary index, or a global secondary index. For a query on a table or on a local secondary index, you can set the ConsistentRead parameter to true and obtain a strongly consistent result. Global secondary indexes support eventually consistent reads only, so do not specify ConsistentRead when querying a global secondary index.
      */
    def query(): awsDashSdkLib.libRequestMod.Request[QueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def query(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ QueryOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[QueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * The Query operation finds items based on primary key values. You can query any table or secondary index that has a composite primary key (a partition key and a sort key).  Use the KeyConditionExpression parameter to provide a specific value for the partition key. The Query operation will return all of the items from the table or index with that partition key value. You can optionally narrow the scope of the Query operation by specifying a sort key value and a comparison operator in KeyConditionExpression. To further refine the Query results, you can optionally provide a FilterExpression. A FilterExpression determines which items within the results should be returned to you. All of the other results are discarded.   A Query operation always returns a result set. If no matching items are found, the result set will be empty. Queries that do not return results consume the minimum number of read capacity units for that type of read operation.    DynamoDB calculates the number of read capacity units consumed based on item size, not on the amount of data that is returned to an application. The number of capacity units consumed will be the same whether you request all of the attributes (the default behavior) or just some of them (using a projection expression). The number will also be the same whether or not you use a FilterExpression.    Query results are always sorted by the sort key value. If the data type of the sort key is Number, the results are returned in numeric order; otherwise, the results are returned in order of UTF-8 bytes. By default, the sort order is ascending. To reverse the order, set the ScanIndexForward parameter to false.   A single Query operation will read up to the maximum number of items set (if using the Limit parameter) or a maximum of 1 MB of data and then apply any filtering to the results using FilterExpression. If LastEvaluatedKey is present in the response, you will need to paginate the result set. For more information, see Paginating the Results in the Amazon DynamoDB Developer Guide.   FilterExpression is applied after a Query finishes, but before the results are returned. A FilterExpression cannot contain partition key or sort key attributes. You need to specify those attributes in the KeyConditionExpression.    A Query operation can return an empty result set and a LastEvaluatedKey if all the items read for the page of results are filtered out.   You can query a table, a local secondary index, or a global secondary index. For a query on a table or on a local secondary index, you can set the ConsistentRead parameter to true and obtain a strongly consistent result. Global secondary indexes support eventually consistent reads only, so do not specify ConsistentRead when querying a global secondary index.
      */
    def query(params: QueryInput): awsDashSdkLib.libRequestMod.Request[QueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def query(
      params: QueryInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ QueryOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[QueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new table from an existing backup. Any number of users can execute up to 4 concurrent restores (any type of restore) in a given account.  You can call RestoreTableFromBackup at a maximum rate of 10 times per second. You must manually set up the following on the restored table:   Auto scaling policies   IAM policies   Cloudwatch metrics and alarms   Tags   Stream settings   Time to Live (TTL) settings  
      */
    def restoreTableFromBackup(): awsDashSdkLib.libRequestMod.Request[RestoreTableFromBackupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def restoreTableFromBackup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RestoreTableFromBackupOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RestoreTableFromBackupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new table from an existing backup. Any number of users can execute up to 4 concurrent restores (any type of restore) in a given account.  You can call RestoreTableFromBackup at a maximum rate of 10 times per second. You must manually set up the following on the restored table:   Auto scaling policies   IAM policies   Cloudwatch metrics and alarms   Tags   Stream settings   Time to Live (TTL) settings  
      */
    def restoreTableFromBackup(params: RestoreTableFromBackupInput): awsDashSdkLib.libRequestMod.Request[RestoreTableFromBackupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def restoreTableFromBackup(
      params: RestoreTableFromBackupInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RestoreTableFromBackupOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RestoreTableFromBackupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Restores the specified table to the specified point in time within EarliestRestorableDateTime and LatestRestorableDateTime. You can restore your table to any point in time during the last 35 days. Any number of users can execute up to 4 concurrent restores (any type of restore) in a given account.   When you restore using point in time recovery, DynamoDB restores your table data to the state based on the selected date and time (day:hour:minute:second) to a new table.   Along with data, the following are also included on the new restored table using point in time recovery:    Global secondary indexes (GSIs)   Local secondary indexes (LSIs)   Provisioned read and write capacity   Encryption settings   All these settings come from the current settings of the source table at the time of restore.     You must manually set up the following on the restored table:   Auto scaling policies   IAM policies   Cloudwatch metrics and alarms   Tags   Stream settings   Time to Live (TTL) settings   Point in time recovery settings  
      */
    def restoreTableToPointInTime(): awsDashSdkLib.libRequestMod.Request[RestoreTableToPointInTimeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def restoreTableToPointInTime(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RestoreTableToPointInTimeOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RestoreTableToPointInTimeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Restores the specified table to the specified point in time within EarliestRestorableDateTime and LatestRestorableDateTime. You can restore your table to any point in time during the last 35 days. Any number of users can execute up to 4 concurrent restores (any type of restore) in a given account.   When you restore using point in time recovery, DynamoDB restores your table data to the state based on the selected date and time (day:hour:minute:second) to a new table.   Along with data, the following are also included on the new restored table using point in time recovery:    Global secondary indexes (GSIs)   Local secondary indexes (LSIs)   Provisioned read and write capacity   Encryption settings   All these settings come from the current settings of the source table at the time of restore.     You must manually set up the following on the restored table:   Auto scaling policies   IAM policies   Cloudwatch metrics and alarms   Tags   Stream settings   Time to Live (TTL) settings   Point in time recovery settings  
      */
    def restoreTableToPointInTime(params: RestoreTableToPointInTimeInput): awsDashSdkLib.libRequestMod.Request[RestoreTableToPointInTimeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def restoreTableToPointInTime(
      params: RestoreTableToPointInTimeInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RestoreTableToPointInTimeOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RestoreTableToPointInTimeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * The Scan operation returns one or more items and item attributes by accessing every item in a table or a secondary index. To have DynamoDB return fewer items, you can provide a FilterExpression operation. If the total number of scanned items exceeds the maximum data set size limit of 1 MB, the scan stops and results are returned to the user as a LastEvaluatedKey value to continue the scan in a subsequent operation. The results also include the number of items exceeding the limit. A scan can result in no table data meeting the filter criteria.  A single Scan operation will read up to the maximum number of items set (if using the Limit parameter) or a maximum of 1 MB of data and then apply any filtering to the results using FilterExpression. If LastEvaluatedKey is present in the response, you will need to paginate the result set. For more information, see Paginating the Results in the Amazon DynamoDB Developer Guide.   Scan operations proceed sequentially; however, for faster performance on a large table or secondary index, applications can request a parallel Scan operation by providing the Segment and TotalSegments parameters. For more information, see Parallel Scan in the Amazon DynamoDB Developer Guide.  Scan uses eventually consistent reads when accessing the data in a table; therefore, the result set might not include the changes to data in the table immediately before the operation began. If you need a consistent copy of the data, as of the time that the Scan begins, you can set the ConsistentRead parameter to true.
      */
    def scan(): awsDashSdkLib.libRequestMod.Request[ScanOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def scan(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ScanOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[ScanOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * The Scan operation returns one or more items and item attributes by accessing every item in a table or a secondary index. To have DynamoDB return fewer items, you can provide a FilterExpression operation. If the total number of scanned items exceeds the maximum data set size limit of 1 MB, the scan stops and results are returned to the user as a LastEvaluatedKey value to continue the scan in a subsequent operation. The results also include the number of items exceeding the limit. A scan can result in no table data meeting the filter criteria.  A single Scan operation will read up to the maximum number of items set (if using the Limit parameter) or a maximum of 1 MB of data and then apply any filtering to the results using FilterExpression. If LastEvaluatedKey is present in the response, you will need to paginate the result set. For more information, see Paginating the Results in the Amazon DynamoDB Developer Guide.   Scan operations proceed sequentially; however, for faster performance on a large table or secondary index, applications can request a parallel Scan operation by providing the Segment and TotalSegments parameters. For more information, see Parallel Scan in the Amazon DynamoDB Developer Guide.  Scan uses eventually consistent reads when accessing the data in a table; therefore, the result set might not include the changes to data in the table immediately before the operation began. If you need a consistent copy of the data, as of the time that the Scan begins, you can set the ConsistentRead parameter to true.
      */
    def scan(params: ScanInput): awsDashSdkLib.libRequestMod.Request[ScanOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def scan(
      params: ScanInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ScanOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[ScanOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Associate a set of tags with an Amazon DynamoDB resource. You can then activate these user-defined tags so that they appear on the Billing and Cost Management console for cost allocation tracking. You can call TagResource up to 5 times per second, per account.  For an overview on tagging DynamoDB resources, see Tagging for DynamoDB in the Amazon DynamoDB Developer Guide.
      */
    def tagResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def tagResource(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Associate a set of tags with an Amazon DynamoDB resource. You can then activate these user-defined tags so that they appear on the Billing and Cost Management console for cost allocation tracking. You can call TagResource up to 5 times per second, per account.  For an overview on tagging DynamoDB resources, see Tagging for DynamoDB in the Amazon DynamoDB Developer Guide.
      */
    def tagResource(params: TagResourceInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def tagResource(
      params: TagResourceInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  TransactGetItems is a synchronous operation that atomically retrieves multiple items from one or more tables (but not from indexes) in a single account and region. A TransactGetItems call can contain up to 10 TransactGetItem objects, each of which contains a Get structure that specifies an item to retrieve from a table in the account and region. A call to TransactGetItems cannot retrieve items from tables in more than one AWS account or region. DynamoDB rejects the entire TransactGetItems request if any of the following is true:   A conflicting operation is in the process of updating an item to be read.   There is insufficient provisioned capacity for the transaction to be completed.   There is a user error, such as an invalid data format.  
      */
    def transactGetItems(): awsDashSdkLib.libRequestMod.Request[TransactGetItemsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def transactGetItems(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TransactGetItemsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TransactGetItemsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  TransactGetItems is a synchronous operation that atomically retrieves multiple items from one or more tables (but not from indexes) in a single account and region. A TransactGetItems call can contain up to 10 TransactGetItem objects, each of which contains a Get structure that specifies an item to retrieve from a table in the account and region. A call to TransactGetItems cannot retrieve items from tables in more than one AWS account or region. DynamoDB rejects the entire TransactGetItems request if any of the following is true:   A conflicting operation is in the process of updating an item to be read.   There is insufficient provisioned capacity for the transaction to be completed.   There is a user error, such as an invalid data format.  
      */
    def transactGetItems(params: TransactGetItemsInput): awsDashSdkLib.libRequestMod.Request[TransactGetItemsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def transactGetItems(
      params: TransactGetItemsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TransactGetItemsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TransactGetItemsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  TransactWriteItems is a synchronous write operation that groups up to 10 action requests. These actions can target items in different tables, but not in different AWS accounts or regions, and no two actions can target the same item. For example, you cannot both ConditionCheck and Update the same item. The actions are completed atomically so that either all of them succeed, or all of them fail. They are defined by the following objects:    Put  &#x97;   Initiates a PutItem operation to write a new item. This structure specifies the primary key of the item to be written, the name of the table to write it in, an optional condition expression that must be satisfied for the write to succeed, a list of the item's attributes, and a field indicating whether or not to retrieve the item's attributes if the condition is not met.    Update  &#x97;   Initiates an UpdateItem operation to update an existing item. This structure specifies the primary key of the item to be updated, the name of the table where it resides, an optional condition expression that must be satisfied for the update to succeed, an expression that defines one or more attributes to be updated, and a field indicating whether or not to retrieve the item's attributes if the condition is not met.    Delete  &#x97;   Initiates a DeleteItem operation to delete an existing item. This structure specifies the primary key of the item to be deleted, the name of the table where it resides, an optional condition expression that must be satisfied for the deletion to succeed, and a field indicating whether or not to retrieve the item's attributes if the condition is not met.    ConditionCheck  &#x97;   Applies a condition to an item that is not being modified by the transaction. This structure specifies the primary key of the item to be checked, the name of the table where it resides, a condition expression that must be satisfied for the transaction to succeed, and a field indicating whether or not to retrieve the item's attributes if the condition is not met.   DynamoDB rejects the entire TransactWriteItems request if any of the following is true:   A condition in one of the condition expressions is not met.   A conflicting operation is in the process of updating the same item.   There is insufficient provisioned capacity for the transaction to be completed.   An item size becomes too large (bigger than 400 KB), a Local Secondary Index (LSI) becomes too large, or a similar validation error occurs because of changes made by the transaction.   There is a user error, such as an invalid data format.  
      */
    def transactWriteItems(): awsDashSdkLib.libRequestMod.Request[TransactWriteItemsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def transactWriteItems(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TransactWriteItemsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TransactWriteItemsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  TransactWriteItems is a synchronous write operation that groups up to 10 action requests. These actions can target items in different tables, but not in different AWS accounts or regions, and no two actions can target the same item. For example, you cannot both ConditionCheck and Update the same item. The actions are completed atomically so that either all of them succeed, or all of them fail. They are defined by the following objects:    Put  &#x97;   Initiates a PutItem operation to write a new item. This structure specifies the primary key of the item to be written, the name of the table to write it in, an optional condition expression that must be satisfied for the write to succeed, a list of the item's attributes, and a field indicating whether or not to retrieve the item's attributes if the condition is not met.    Update  &#x97;   Initiates an UpdateItem operation to update an existing item. This structure specifies the primary key of the item to be updated, the name of the table where it resides, an optional condition expression that must be satisfied for the update to succeed, an expression that defines one or more attributes to be updated, and a field indicating whether or not to retrieve the item's attributes if the condition is not met.    Delete  &#x97;   Initiates a DeleteItem operation to delete an existing item. This structure specifies the primary key of the item to be deleted, the name of the table where it resides, an optional condition expression that must be satisfied for the deletion to succeed, and a field indicating whether or not to retrieve the item's attributes if the condition is not met.    ConditionCheck  &#x97;   Applies a condition to an item that is not being modified by the transaction. This structure specifies the primary key of the item to be checked, the name of the table where it resides, a condition expression that must be satisfied for the transaction to succeed, and a field indicating whether or not to retrieve the item's attributes if the condition is not met.   DynamoDB rejects the entire TransactWriteItems request if any of the following is true:   A condition in one of the condition expressions is not met.   A conflicting operation is in the process of updating the same item.   There is insufficient provisioned capacity for the transaction to be completed.   An item size becomes too large (bigger than 400 KB), a Local Secondary Index (LSI) becomes too large, or a similar validation error occurs because of changes made by the transaction.   There is a user error, such as an invalid data format.  
      */
    def transactWriteItems(params: TransactWriteItemsInput): awsDashSdkLib.libRequestMod.Request[TransactWriteItemsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def transactWriteItems(
      params: TransactWriteItemsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TransactWriteItemsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TransactWriteItemsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the association of tags from an Amazon DynamoDB resource. You can call UntagResource up to 5 times per second, per account.  For an overview on tagging DynamoDB resources, see Tagging for DynamoDB in the Amazon DynamoDB Developer Guide.
      */
    def untagResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def untagResource(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the association of tags from an Amazon DynamoDB resource. You can call UntagResource up to 5 times per second, per account.  For an overview on tagging DynamoDB resources, see Tagging for DynamoDB in the Amazon DynamoDB Developer Guide.
      */
    def untagResource(params: UntagResourceInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def untagResource(
      params: UntagResourceInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  UpdateContinuousBackups enables or disables point in time recovery for the specified table. A successful UpdateContinuousBackups call returns the current ContinuousBackupsDescription. Continuous backups are ENABLED on all tables at table creation. If point in time recovery is enabled, PointInTimeRecoveryStatus will be set to ENABLED.  Once continuous backups and point in time recovery are enabled, you can restore to any point in time within EarliestRestorableDateTime and LatestRestorableDateTime.   LatestRestorableDateTime is typically 5 minutes before the current time. You can restore your table to any point in time during the last 35 days.. 
      */
    def updateContinuousBackups(): awsDashSdkLib.libRequestMod.Request[UpdateContinuousBackupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateContinuousBackups(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateContinuousBackupsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateContinuousBackupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  UpdateContinuousBackups enables or disables point in time recovery for the specified table. A successful UpdateContinuousBackups call returns the current ContinuousBackupsDescription. Continuous backups are ENABLED on all tables at table creation. If point in time recovery is enabled, PointInTimeRecoveryStatus will be set to ENABLED.  Once continuous backups and point in time recovery are enabled, you can restore to any point in time within EarliestRestorableDateTime and LatestRestorableDateTime.   LatestRestorableDateTime is typically 5 minutes before the current time. You can restore your table to any point in time during the last 35 days.. 
      */
    def updateContinuousBackups(params: UpdateContinuousBackupsInput): awsDashSdkLib.libRequestMod.Request[UpdateContinuousBackupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateContinuousBackups(
      params: UpdateContinuousBackupsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateContinuousBackupsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateContinuousBackupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds or removes replicas in the specified global table. The global table must already exist to be able to use this operation. Any replica to be added must be empty, must have the same name as the global table, must have the same key schema, and must have DynamoDB Streams enabled and must have same provisioned and maximum write capacity units.  Although you can use UpdateGlobalTable to add replicas and remove replicas in a single request, for simplicity we recommend that you issue separate requests for adding or removing replicas.   If global secondary indexes are specified, then the following conditions must also be met:     The global secondary indexes must have the same name.     The global secondary indexes must have the same hash key and sort key (if present).     The global secondary indexes must have the same provisioned and maximum write capacity units.   
      */
    def updateGlobalTable(): awsDashSdkLib.libRequestMod.Request[UpdateGlobalTableOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateGlobalTable(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateGlobalTableOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateGlobalTableOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds or removes replicas in the specified global table. The global table must already exist to be able to use this operation. Any replica to be added must be empty, must have the same name as the global table, must have the same key schema, and must have DynamoDB Streams enabled and must have same provisioned and maximum write capacity units.  Although you can use UpdateGlobalTable to add replicas and remove replicas in a single request, for simplicity we recommend that you issue separate requests for adding or removing replicas.   If global secondary indexes are specified, then the following conditions must also be met:     The global secondary indexes must have the same name.     The global secondary indexes must have the same hash key and sort key (if present).     The global secondary indexes must have the same provisioned and maximum write capacity units.   
      */
    def updateGlobalTable(params: UpdateGlobalTableInput): awsDashSdkLib.libRequestMod.Request[UpdateGlobalTableOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateGlobalTable(
      params: UpdateGlobalTableInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateGlobalTableOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateGlobalTableOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates settings for a global table.
      */
    def updateGlobalTableSettings(): awsDashSdkLib.libRequestMod.Request[UpdateGlobalTableSettingsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateGlobalTableSettings(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateGlobalTableSettingsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateGlobalTableSettingsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates settings for a global table.
      */
    def updateGlobalTableSettings(params: UpdateGlobalTableSettingsInput): awsDashSdkLib.libRequestMod.Request[UpdateGlobalTableSettingsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateGlobalTableSettings(
      params: UpdateGlobalTableSettingsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateGlobalTableSettingsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateGlobalTableSettingsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Edits an existing item's attributes, or adds a new item to the table if it does not already exist. You can put, delete, or add attribute values. You can also perform a conditional update on an existing item (insert a new attribute name-value pair if it doesn't exist, or replace an existing name-value pair if it has certain expected attribute values). You can also return the item's attribute values in the same UpdateItem operation using the ReturnValues parameter.
      */
    def updateItem(): awsDashSdkLib.libRequestMod.Request[UpdateItemOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateItem(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateItemOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateItemOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Edits an existing item's attributes, or adds a new item to the table if it does not already exist. You can put, delete, or add attribute values. You can also perform a conditional update on an existing item (insert a new attribute name-value pair if it doesn't exist, or replace an existing name-value pair if it has certain expected attribute values). You can also return the item's attribute values in the same UpdateItem operation using the ReturnValues parameter.
      */
    def updateItem(params: UpdateItemInput): awsDashSdkLib.libRequestMod.Request[UpdateItemOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateItem(
      params: UpdateItemInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateItemOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateItemOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies the provisioned throughput settings, global secondary indexes, or DynamoDB Streams settings for a given table. You can only perform one of the following operations at once:   Modify the provisioned throughput settings of the table.   Enable or disable Streams on the table.   Remove a global secondary index from the table.   Create a new global secondary index on the table. Once the index begins backfilling, you can use UpdateTable to perform other operations.    UpdateTable is an asynchronous operation; while it is executing, the table status changes from ACTIVE to UPDATING. While it is UPDATING, you cannot issue another UpdateTable request. When the table returns to the ACTIVE state, the UpdateTable operation is complete.
      */
    def updateTable(): awsDashSdkLib.libRequestMod.Request[UpdateTableOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateTable(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateTableOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateTableOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies the provisioned throughput settings, global secondary indexes, or DynamoDB Streams settings for a given table. You can only perform one of the following operations at once:   Modify the provisioned throughput settings of the table.   Enable or disable Streams on the table.   Remove a global secondary index from the table.   Create a new global secondary index on the table. Once the index begins backfilling, you can use UpdateTable to perform other operations.    UpdateTable is an asynchronous operation; while it is executing, the table status changes from ACTIVE to UPDATING. While it is UPDATING, you cannot issue another UpdateTable request. When the table returns to the ACTIVE state, the UpdateTable operation is complete.
      */
    def updateTable(params: UpdateTableInput): awsDashSdkLib.libRequestMod.Request[UpdateTableOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateTable(
      params: UpdateTableInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateTableOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateTableOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * The UpdateTimeToLive method will enable or disable TTL for the specified table. A successful UpdateTimeToLive call returns the current TimeToLiveSpecification; it may take up to one hour for the change to fully process. Any additional UpdateTimeToLive calls for the same table during this one hour duration result in a ValidationException.  TTL compares the current time in epoch time format to the time stored in the TTL attribute of an item. If the epoch time value stored in the attribute is less than the current time, the item is marked as expired and subsequently deleted.   The epoch time format is the number of seconds elapsed since 12:00:00 AM January 1st, 1970 UTC.   DynamoDB deletes expired items on a best-effort basis to ensure availability of throughput for other data operations.   DynamoDB typically deletes expired items within two days of expiration. The exact duration within which an item gets deleted after expiration is specific to the nature of the workload. Items that have expired and not been deleted will still show up in reads, queries, and scans.  As items are deleted, they are removed from any Local Secondary Index and Global Secondary Index immediately in the same eventually consistent way as a standard delete operation. For more information, see Time To Live in the Amazon DynamoDB Developer Guide. 
      */
    def updateTimeToLive(): awsDashSdkLib.libRequestMod.Request[UpdateTimeToLiveOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateTimeToLive(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateTimeToLiveOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateTimeToLiveOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * The UpdateTimeToLive method will enable or disable TTL for the specified table. A successful UpdateTimeToLive call returns the current TimeToLiveSpecification; it may take up to one hour for the change to fully process. Any additional UpdateTimeToLive calls for the same table during this one hour duration result in a ValidationException.  TTL compares the current time in epoch time format to the time stored in the TTL attribute of an item. If the epoch time value stored in the attribute is less than the current time, the item is marked as expired and subsequently deleted.   The epoch time format is the number of seconds elapsed since 12:00:00 AM January 1st, 1970 UTC.   DynamoDB deletes expired items on a best-effort basis to ensure availability of throughput for other data operations.   DynamoDB typically deletes expired items within two days of expiration. The exact duration within which an item gets deleted after expiration is specific to the nature of the workload. Items that have expired and not been deleted will still show up in reads, queries, and scans.  As items are deleted, they are removed from any Local Secondary Index and Global Secondary Index immediately in the same eventually consistent way as a standard delete operation. For more information, see Time To Live in the Amazon DynamoDB Developer Guide. 
      */
    def updateTimeToLive(params: UpdateTimeToLiveInput): awsDashSdkLib.libRequestMod.Request[UpdateTimeToLiveOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateTimeToLive(
      params: UpdateTimeToLiveInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateTimeToLiveOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateTimeToLiveOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the tableExists state by periodically calling the underlying DynamoDB.describeTableoperation every 20 seconds (at most 25 times).
      */
    @JSName("waitFor")
    def waitFor_tableExists(state: awsDashSdkLib.awsDashSdkLibStrings.tableExists): awsDashSdkLib.libRequestMod.Request[DescribeTableOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_tableExists(
      state: awsDashSdkLib.awsDashSdkLibStrings.tableExists,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeTableOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeTableOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the tableExists state by periodically calling the underlying DynamoDB.describeTableoperation every 20 seconds (at most 25 times).
      */
    @JSName("waitFor")
    def waitFor_tableExists(
      state: awsDashSdkLib.awsDashSdkLibStrings.tableExists,
      params: DescribeTableInput with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[DescribeTableOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_tableExists(
      state: awsDashSdkLib.awsDashSdkLibStrings.tableExists,
      params: DescribeTableInput with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeTableOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeTableOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the tableNotExists state by periodically calling the underlying DynamoDB.describeTableoperation every 20 seconds (at most 25 times).
      */
    @JSName("waitFor")
    def waitFor_tableNotExists(state: awsDashSdkLib.awsDashSdkLibStrings.tableNotExists): awsDashSdkLib.libRequestMod.Request[DescribeTableOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_tableNotExists(
      state: awsDashSdkLib.awsDashSdkLibStrings.tableNotExists,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeTableOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeTableOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the tableNotExists state by periodically calling the underlying DynamoDB.describeTableoperation every 20 seconds (at most 25 times).
      */
    @JSName("waitFor")
    def waitFor_tableNotExists(
      state: awsDashSdkLib.awsDashSdkLibStrings.tableNotExists,
      params: DescribeTableInput with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[DescribeTableOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_tableNotExists(
      state: awsDashSdkLib.awsDashSdkLibStrings.tableNotExists,
      params: DescribeTableInput with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeTableOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeTableOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UntagResourceInput extends js.Object {
    /**
      * The Amazon DyanamoDB resource the tags will be removed from. This value is an Amazon Resource Name (ARN).
      */
    var ResourceArn: ResourceArnString
    /**
      * A list of tag keys. Existing tags of the resource whose keys are members of this list will be removed from the Amazon DynamoDB resource.
      */
    var TagKeys: TagKeyList
  }
  
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
  
  trait UpdateContinuousBackupsInput extends js.Object {
    /**
      * Represents the settings used to enable point in time recovery.
      */
    var PointInTimeRecoverySpecification: PointInTimeRecoverySpecification
    /**
      * The name of the table.
      */
    var TableName: TableName
  }
  
  trait UpdateContinuousBackupsOutput extends js.Object {
    /**
      * Represents the continuous backups and point in time recovery settings on the table.
      */
    var ContinuousBackupsDescription: js.UndefOr[ContinuousBackupsDescription] = js.undefined
  }
  
  trait UpdateGlobalSecondaryIndexAction extends js.Object {
    /**
      * The name of the global secondary index to be updated.
      */
    var IndexName: IndexName
    /**
      * Represents the provisioned throughput settings for the specified global secondary index. For current minimum and maximum provisioned throughput values, see Limits in the Amazon DynamoDB Developer Guide.
      */
    var ProvisionedThroughput: ProvisionedThroughput
  }
  
  trait UpdateGlobalTableInput extends js.Object {
    /**
      * The global table name.
      */
    var GlobalTableName: TableName
    /**
      * A list of regions that should be added or removed from the global table.
      */
    var ReplicaUpdates: ReplicaUpdateList
  }
  
  trait UpdateGlobalTableOutput extends js.Object {
    /**
      * Contains the details of the global table.
      */
    var GlobalTableDescription: js.UndefOr[GlobalTableDescription] = js.undefined
  }
  
  trait UpdateGlobalTableSettingsInput extends js.Object {
    /**
      * The billing mode of the global table. If GlobalTableBillingMode is not specified, the global table defaults to PROVISIONED capacity billing mode.
      */
    var GlobalTableBillingMode: js.UndefOr[BillingMode] = js.undefined
    /**
      * Represents the settings of a global secondary index for a global table that will be modified.
      */
    var GlobalTableGlobalSecondaryIndexSettingsUpdate: js.UndefOr[GlobalTableGlobalSecondaryIndexSettingsUpdateList] = js.undefined
    /**
      * The name of the global table
      */
    var GlobalTableName: TableName
    /**
      * AutoScaling settings for managing provisioned write capacity for the global table.
      */
    var GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.undefined
    /**
      * The maximum number of writes consumed per second before DynamoDB returns a ThrottlingException. 
      */
    var GlobalTableProvisionedWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined
    /**
      * Represents the settings for a global table in a region that will be modified.
      */
    var ReplicaSettingsUpdate: js.UndefOr[ReplicaSettingsUpdateList] = js.undefined
  }
  
  trait UpdateGlobalTableSettingsOutput extends js.Object {
    /**
      * The name of the global table.
      */
    var GlobalTableName: js.UndefOr[TableName] = js.undefined
    /**
      * The region specific settings for the global table.
      */
    var ReplicaSettings: js.UndefOr[ReplicaSettingsDescriptionList] = js.undefined
  }
  
  trait UpdateItemInput extends js.Object {
    /**
      * This is a legacy parameter. Use UpdateExpression instead. For more information, see AttributeUpdates in the Amazon DynamoDB Developer Guide.
      */
    var AttributeUpdates: js.UndefOr[AttributeUpdates] = js.undefined
    /**
      * A condition that must be satisfied in order for a conditional update to succeed. An expression can contain any of the following:   Functions: attribute_exists | attribute_not_exists | attribute_type | contains | begins_with | size  These function names are case-sensitive.   Comparison operators: = | &lt;&gt; | &lt; | &gt; | &lt;= | &gt;= | BETWEEN | IN      Logical operators: AND | OR | NOT    For more information on condition expressions, see Specifying Conditions in the Amazon DynamoDB Developer Guide.
      */
    var ConditionExpression: js.UndefOr[ConditionExpression] = js.undefined
    /**
      * This is a legacy parameter. Use ConditionExpression instead. For more information, see ConditionalOperator in the Amazon DynamoDB Developer Guide.
      */
    var ConditionalOperator: js.UndefOr[ConditionalOperator] = js.undefined
    /**
      * This is a legacy parameter. Use ConditionExpression instead. For more information, see Expected in the Amazon DynamoDB Developer Guide.
      */
    var Expected: js.UndefOr[ExpectedAttributeMap] = js.undefined
    /**
      * One or more substitution tokens for attribute names in an expression. The following are some use cases for using ExpressionAttributeNames:   To access an attribute whose name conflicts with a DynamoDB reserved word.   To create a placeholder for repeating occurrences of an attribute name in an expression.   To prevent special characters in an attribute name from being misinterpreted in an expression.   Use the # character in an expression to dereference an attribute name. For example, consider the following attribute name:    Percentile    The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression. (For the complete list of reserved words, see Reserved Words in the Amazon DynamoDB Developer Guide). To work around this, you could specify the following for ExpressionAttributeNames:    {"#P":"Percentile"}    You could then use this substitution in an expression, as in this example:    #P = :val     Tokens that begin with the : character are expression attribute values, which are placeholders for the actual value at runtime.  For more information on expression attribute names, see Accessing Item Attributes in the Amazon DynamoDB Developer Guide.
      */
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined
    /**
      * One or more values that can be substituted in an expression. Use the : (colon) character in an expression to dereference an attribute value. For example, suppose that you wanted to check whether the value of the ProductStatus attribute was one of the following:   Available | Backordered | Discontinued  You would first need to specify ExpressionAttributeValues as follows:  { ":avail":{"S":"Available"}, ":back":{"S":"Backordered"}, ":disc":{"S":"Discontinued"} }  You could then use these values in an expression, such as this:  ProductStatus IN (:avail, :back, :disc)  For more information on expression attribute values, see Specifying Conditions in the Amazon DynamoDB Developer Guide.
      */
    var ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap] = js.undefined
    /**
      * The primary key of the item to be updated. Each element consists of an attribute name and a value for that attribute. For the primary key, you must provide all of the attributes. For example, with a simple primary key, you only need to provide a value for the partition key. For a composite primary key, you must provide values for both the partition key and the sort key.
      */
    var Key: Key
    var ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity] = js.undefined
    /**
      * Determines whether item collection metrics are returned. If set to SIZE, the response includes statistics about item collections, if any, that were modified during the operation are returned in the response. If set to NONE (the default), no statistics are returned.
      */
    var ReturnItemCollectionMetrics: js.UndefOr[ReturnItemCollectionMetrics] = js.undefined
    /**
      * Use ReturnValues if you want to get the item attributes as they appear before or after they are updated. For UpdateItem, the valid values are:    NONE - If ReturnValues is not specified, or if its value is NONE, then nothing is returned. (This setting is the default for ReturnValues.)    ALL_OLD - Returns all of the attributes of the item, as they appeared before the UpdateItem operation.    UPDATED_OLD - Returns only the updated attributes, as they appeared before the UpdateItem operation.    ALL_NEW - Returns all of the attributes of the item, as they appear after the UpdateItem operation.    UPDATED_NEW - Returns only the updated attributes, as they appear after the UpdateItem operation.   There is no additional cost associated with requesting a return value aside from the small network and processing overhead of receiving a larger response. No read capacity units are consumed. The values returned are strongly consistent.
      */
    var ReturnValues: js.UndefOr[ReturnValue] = js.undefined
    /**
      * The name of the table containing the item to update.
      */
    var TableName: TableName
    /**
      * An expression that defines one or more attributes to be updated, the action to be performed on them, and new value(s) for them. The following action values are available for UpdateExpression.    SET - Adds one or more attributes and values to an item. If any of these attribute already exist, they are replaced by the new values. You can also use SET to add or subtract from an attribute that is of type Number. For example: SET myNum = myNum + :val   SET supports the following functions:    if_not_exists (path, operand) - if the item does not contain an attribute at the specified path, then if_not_exists evaluates to operand; otherwise, it evaluates to path. You can use this function to avoid overwriting an attribute that may already be present in the item.    list_append (operand, operand) - evaluates to a list with a new element added to it. You can append the new element to the start or the end of the list by reversing the order of the operands.   These function names are case-sensitive.    REMOVE - Removes one or more attributes from an item.    ADD - Adds the specified value to the item, if the attribute does not already exist. If the attribute does exist, then the behavior of ADD depends on the data type of the attribute:   If the existing attribute is a number, and if Value is also a number, then Value is mathematically added to the existing attribute. If Value is a negative number, then it is subtracted from the existing attribute.  If you use ADD to increment or decrement a number value for an item that doesn't exist before the update, DynamoDB uses 0 as the initial value. Similarly, if you use ADD for an existing item to increment or decrement an attribute value that doesn't exist before the update, DynamoDB uses 0 as the initial value. For example, suppose that the item you want to update doesn't have an attribute named itemcount, but you decide to ADD the number 3 to this attribute anyway. DynamoDB will create the itemcount attribute, set its initial value to 0, and finally add 3 to it. The result will be a new itemcount attribute in the item, with a value of 3.    If the existing data type is a set and if Value is also a set, then Value is added to the existing set. For example, if the attribute value is the set [1,2], and the ADD action specified [3], then the final attribute value is [1,2,3]. An error occurs if an ADD action is specified for a set attribute and the attribute type specified does not match the existing set type.  Both sets must have the same primitive data type. For example, if the existing data type is a set of strings, the Value must also be a set of strings.    The ADD action only supports Number and set data types. In addition, ADD can only be used on top-level attributes, not nested attributes.     DELETE - Deletes an element from a set. If a set of values is specified, then those values are subtracted from the old set. For example, if the attribute value was the set [a,b,c] and the DELETE action specifies [a,c], then the final attribute value is [b]. Specifying an empty set is an error.  The DELETE action only supports set data types. In addition, DELETE can only be used on top-level attributes, not nested attributes.    You can have many actions in a single expression, such as the following: SET a=:value1, b=:value2 DELETE :value3, :value4, :value5  For more information on update expressions, see Modifying Items and Attributes in the Amazon DynamoDB Developer Guide.
      */
    var UpdateExpression: js.UndefOr[UpdateExpression] = js.undefined
  }
  
  trait UpdateItemOutput extends js.Object {
    /**
      * A map of attribute values as they appear before or after the UpdateItem operation, as determined by the ReturnValues parameter. The Attributes map is only present if ReturnValues was specified as something other than NONE in the request. Each element represents one attribute.
      */
    var Attributes: js.UndefOr[AttributeMap] = js.undefined
    /**
      * The capacity units consumed by the UpdateItem operation. The data returned includes the total provisioned throughput consumed, along with statistics for the table and any indexes involved in the operation. ConsumedCapacity is only returned if the ReturnConsumedCapacity parameter was specified. For more information, see Provisioned Throughput in the Amazon DynamoDB Developer Guide.
      */
    var ConsumedCapacity: js.UndefOr[ConsumedCapacity] = js.undefined
    /**
      * Information about item collections, if any, that were affected by the UpdateItem operation. ItemCollectionMetrics is only returned if the ReturnItemCollectionMetrics parameter was specified. If the table does not have any local secondary indexes, this information is not returned in the response. Each ItemCollectionMetrics element consists of:    ItemCollectionKey - The partition key value of the item collection. This is the same as the partition key value of the item itself.    SizeEstimateRangeGB - An estimate of item collection size, in gigabytes. This value is a two-element array containing a lower bound and an upper bound for the estimate. The estimate includes the size of all the items in the table, plus the size of all attributes projected into all of the local secondary indexes on that table. Use this estimate to measure whether a local secondary index is approaching its size limit. The estimate is subject to change over time; therefore, do not rely on the precision or accuracy of the estimate.  
      */
    var ItemCollectionMetrics: js.UndefOr[ItemCollectionMetrics] = js.undefined
  }
  
  trait UpdateTableInput extends js.Object {
    /**
      * An array of attributes that describe the key schema for the table and indexes. If you are adding a new global secondary index to the table, AttributeDefinitions must include the key element(s) of the new index.
      */
    var AttributeDefinitions: js.UndefOr[AttributeDefinitions] = js.undefined
    /**
      * Controls how you are charged for read and write throughput and how you manage capacity. When switching from pay-per-request to provisioned capacity, initial provisioned capacity values must be set. The initial provisioned capacity values are estimated based on the consumed read and write capacity of your table and global secondary indexes over the past 30 minutes.    PROVISIONED - Sets the billing mode to PROVISIONED. We recommend using PROVISIONED for predictable workloads.    PAY_PER_REQUEST - Sets the billing mode to PAY_PER_REQUEST. We recommend using PAY_PER_REQUEST for unpredictable workloads.   
      */
    var BillingMode: js.UndefOr[BillingMode] = js.undefined
    /**
      * An array of one or more global secondary indexes for the table. For each index in the array, you can request one action:    Create - add a new global secondary index to the table.    Update - modify the provisioned throughput settings of an existing global secondary index.    Delete - remove a global secondary index from the table.   For more information, see Managing Global Secondary Indexes in the Amazon DynamoDB Developer Guide. 
      */
    var GlobalSecondaryIndexUpdates: js.UndefOr[GlobalSecondaryIndexUpdateList] = js.undefined
    /**
      * The new provisioned throughput settings for the specified table or index.
      */
    var ProvisionedThroughput: js.UndefOr[ProvisionedThroughput] = js.undefined
    /**
      * The new server-side encryption settings for the specified table.
      */
    var SSESpecification: js.UndefOr[SSESpecification] = js.undefined
    /**
      * Represents the DynamoDB Streams configuration for the table.  You will receive a ResourceInUseException if you attempt to enable a stream on a table that already has a stream, or if you attempt to disable a stream on a table which does not have a stream. 
      */
    var StreamSpecification: js.UndefOr[StreamSpecification] = js.undefined
    /**
      * The name of the table to be updated.
      */
    var TableName: TableName
  }
  
  trait UpdateTableOutput extends js.Object {
    /**
      * Represents the properties of the table.
      */
    var TableDescription: js.UndefOr[TableDescription] = js.undefined
  }
  
  trait UpdateTimeToLiveInput extends js.Object {
    /**
      * The name of the table to be configured.
      */
    var TableName: TableName
    /**
      * Represents the settings used to enable or disable Time to Live for the specified table.
      */
    var TimeToLiveSpecification: TimeToLiveSpecification
  }
  
  trait UpdateTimeToLiveOutput extends js.Object {
    /**
      * Represents the output of an UpdateTimeToLive operation.
      */
    var TimeToLiveSpecification: js.UndefOr[TimeToLiveSpecification] = js.undefined
  }
  
  trait WriteRequest extends js.Object {
    /**
      * A request to perform a DeleteItem operation.
      */
    var DeleteRequest: js.UndefOr[DeleteRequest] = js.undefined
    /**
      * A request to perform a PutItem operation.
      */
    var PutRequest: js.UndefOr[PutRequest] = js.undefined
  }
  
  val TypesNs: this.type = js.native
  @js.native
  object Converter extends js.Object {
    def input(data: js.Any): awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.AttributeValue = js.native
    def input(data: js.Any, options: awsDashSdkLib.libDynamodbConverterMod.ConverterNs.ConverterOptions): awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.AttributeValue = js.native
    def marshall(data: org.scalablytyped.runtime.StringDictionary[js.Any]): awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.AttributeMap = js.native
    def marshall(
      data: org.scalablytyped.runtime.StringDictionary[js.Any],
      options: awsDashSdkLib.libDynamodbConverterMod.ConverterNs.ConverterOptions
    ): awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.AttributeMap = js.native
    def output(data: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.AttributeValue): js.Any = js.native
    def output(
      data: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.AttributeValue,
      options: awsDashSdkLib.libDynamodbConverterMod.ConverterNs.ConverterOptions
    ): js.Any = js.native
    def unmarshall(data: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.AttributeMap): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    def unmarshall(
      data: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.AttributeMap,
      options: awsDashSdkLib.libDynamodbConverterMod.ConverterNs.ConverterOptions
    ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  }
  
  @JSName("Converter")
  @js.native
  object ConverterNs extends js.Object {
    type ConverterOptions = awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DocumentClientNs.ConverterOptions
  }
  
  @JSName("DocumentClient")
  @js.native
  object DocumentClientNs extends js.Object {
    trait AttributeDefinition extends js.Object {
      /**
        * A name for the attribute.
        */
      var AttributeName: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.KeySchemaAttributeName
      /**
        * The data type for the attribute, where:    S - the attribute is of type String    N - the attribute is of type Number    B - the attribute is of type Binary  
        */
      var AttributeType: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ScalarAttributeType
    }
    
    trait AttributeMap
      extends /* key */ org.scalablytyped.runtime.StringDictionary[
              awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.AttributeValue
            ]
    
    trait AttributeUpdates
      extends /* key */ org.scalablytyped.runtime.StringDictionary[
              awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.AttributeValueUpdate
            ]
    
    trait AttributeValueUpdate extends js.Object {
      /**
        * Specifies how to perform the update. Valid values are PUT (default), DELETE, and ADD. The behavior depends on whether the specified primary key already exists in the table.  If an item with the specified Key is found in the table:     PUT - Adds the specified attribute to the item. If the attribute already exists, it is replaced by the new value.     DELETE - If no value is specified, the attribute and its value are removed from the item. The data type of the specified value must match the existing value's data type. If a set of values is specified, then those values are subtracted from the old set. For example, if the attribute value was the set [a,b,c] and the DELETE action specified [a,c], then the final attribute value would be [b]. Specifying an empty set is an error.    ADD - If the attribute does not already exist, then the attribute and its values are added to the item. If the attribute does exist, then the behavior of ADD depends on the data type of the attribute:   If the existing attribute is a number, and if Value is also a number, then the Value is mathematically added to the existing attribute. If Value is a negative number, then it is subtracted from the existing attribute.   If you use ADD to increment or decrement a number value for an item that doesn't exist before the update, DynamoDB uses 0 as the initial value. In addition, if you use ADD to update an existing item, and intend to increment or decrement an attribute value which does not yet exist, DynamoDB uses 0 as the initial value. For example, suppose that the item you want to update does not yet have an attribute named itemcount, but you decide to ADD the number 3 to this attribute anyway, even though it currently does not exist. DynamoDB will create the itemcount attribute, set its initial value to 0, and finally add 3 to it. The result will be a new itemcount attribute in the item, with a value of 3.    If the existing data type is a set, and if the Value is also a set, then the Value is added to the existing set. (This is a set operation, not mathematical addition.) For example, if the attribute value was the set [1,2], and the ADD action specified [3], then the final attribute value would be [1,2,3]. An error occurs if an Add action is specified for a set attribute and the attribute type specified does not match the existing set type.  Both sets must have the same primitive data type. For example, if the existing data type is a set of strings, the Value must also be a set of strings. The same holds true for number sets and binary sets.   This action is only valid for an existing attribute whose data type is number or is a set. Do not use ADD for any other data types.    If no item with the specified Key is found:     PUT - DynamoDB creates a new item with the specified primary key, and then adds the attribute.     DELETE - Nothing happens; there is no attribute to delete.    ADD - DynamoDB creates an item with the supplied primary key and number (or set of numbers) for the attribute value. The only data types allowed are number and number set; no other data types can be specified.  
        */
      var Action: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.AttributeAction
          ] = js.undefined
      /**
        * Represents the data for an attribute. Each attribute value is described as a name-value pair. The name is the data type, and the value is the data itself. For more information, see Data Types in the Amazon DynamoDB Developer Guide. 
        */
      var Value: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.AttributeValue
          ] = js.undefined
    }
    
    trait AutoScalingPolicyDescription extends js.Object {
      /**
        * The name of the scaling policy.
        */
      var PolicyName: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.AutoScalingPolicyName
          ] = js.undefined
      /**
        * Represents a target tracking scaling policy configuration.
        */
      var TargetTrackingScalingPolicyConfiguration: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.AutoScalingTargetTrackingScalingPolicyConfigurationDescription
          ] = js.undefined
    }
    
    trait AutoScalingPolicyUpdate extends js.Object {
      /**
        * The name of the scaling policy.
        */
      var PolicyName: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.AutoScalingPolicyName
          ] = js.undefined
      /**
        * Represents a target tracking scaling policy configuration.
        */
      var TargetTrackingScalingPolicyConfiguration: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.AutoScalingTargetTrackingScalingPolicyConfigurationUpdate
    }
    
    trait AutoScalingSettingsDescription extends js.Object {
      /**
        * Disabled autoscaling for this global table or global secondary index.
        */
      var AutoScalingDisabled: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BooleanObject
          ] = js.undefined
      /**
        * Role ARN used for configuring autoScaling policy.
        */
      var AutoScalingRoleArn: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.String] = js.undefined
      /**
        * The maximum capacity units that a global table or global secondary index should be scaled up to.
        */
      var MaximumUnits: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.PositiveLongObject
          ] = js.undefined
      /**
        * The minimum capacity units that a global table or global secondary index should be scaled down to.
        */
      var MinimumUnits: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.PositiveLongObject
          ] = js.undefined
      /**
        * Information about the scaling policies.
        */
      var ScalingPolicies: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.AutoScalingPolicyDescriptionList
          ] = js.undefined
    }
    
    trait AutoScalingSettingsUpdate extends js.Object {
      /**
        * Disabled autoscaling for this global table or global secondary index.
        */
      var AutoScalingDisabled: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BooleanObject
          ] = js.undefined
      /**
        * Role ARN used for configuring autoscaling policy.
        */
      var AutoScalingRoleArn: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.AutoScalingRoleArn
          ] = js.undefined
      /**
        * The maximum capacity units that a global table or global secondary index should be scaled up to.
        */
      var MaximumUnits: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.PositiveLongObject
          ] = js.undefined
      /**
        * The minimum capacity units that a global table or global secondary index should be scaled down to.
        */
      var MinimumUnits: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.PositiveLongObject
          ] = js.undefined
      /**
        * The scaling policy to apply for scaling target global table or global secondary index capacity units.
        */
      var ScalingPolicyUpdate: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.AutoScalingPolicyUpdate
          ] = js.undefined
    }
    
    trait AutoScalingTargetTrackingScalingPolicyConfigurationDescription extends js.Object {
      /**
        * Indicates whether scale in by the target tracking policy is disabled. If the value is true, scale in is disabled and the target tracking policy won't remove capacity from the scalable resource. Otherwise, scale in is enabled and the target tracking policy can remove capacity from the scalable resource. The default value is false.
        */
      var DisableScaleIn: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BooleanObject
          ] = js.undefined
      /**
        * The amount of time, in seconds, after a scale in activity completes before another scale in activity can start. The cooldown period is used to block subsequent scale in requests until it has expired. You should scale in conservatively to protect your application's availability. However, if another alarm triggers a scale out policy during the cooldown period after a scale-in, application autoscaling scales out your scalable target immediately. 
        */
      var ScaleInCooldown: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.IntegerObject
          ] = js.undefined
      /**
        * The amount of time, in seconds, after a scale out activity completes before another scale out activity can start. While the cooldown period is in effect, the capacity that has been added by the previous scale out event that initiated the cooldown is calculated as part of the desired capacity for the next scale out. You should continuously (but not excessively) scale out.
        */
      var ScaleOutCooldown: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.IntegerObject
          ] = js.undefined
      /**
        * The target value for the metric. The range is 8.515920e-109 to 1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base 2).
        */
      var TargetValue: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.Double
    }
    
    trait AutoScalingTargetTrackingScalingPolicyConfigurationUpdate extends js.Object {
      /**
        * Indicates whether scale in by the target tracking policy is disabled. If the value is true, scale in is disabled and the target tracking policy won't remove capacity from the scalable resource. Otherwise, scale in is enabled and the target tracking policy can remove capacity from the scalable resource. The default value is false.
        */
      var DisableScaleIn: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BooleanObject
          ] = js.undefined
      /**
        * The amount of time, in seconds, after a scale in activity completes before another scale in activity can start. The cooldown period is used to block subsequent scale in requests until it has expired. You should scale in conservatively to protect your application's availability. However, if another alarm triggers a scale out policy during the cooldown period after a scale-in, application autoscaling scales out your scalable target immediately. 
        */
      var ScaleInCooldown: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.IntegerObject
          ] = js.undefined
      /**
        * The amount of time, in seconds, after a scale out activity completes before another scale out activity can start. While the cooldown period is in effect, the capacity that has been added by the previous scale out event that initiated the cooldown is calculated as part of the desired capacity for the next scale out. You should continuously (but not excessively) scale out.
        */
      var ScaleOutCooldown: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.IntegerObject
          ] = js.undefined
      /**
        * The target value for the metric. The range is 8.515920e-109 to 1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base 2).
        */
      var TargetValue: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.Double
    }
    
    trait BackupDescription extends js.Object {
      /**
        * Contains the details of the backup created for the table. 
        */
      var BackupDetails: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BackupDetails
          ] = js.undefined
      /**
        * Contains the details of the table when the backup was created. 
        */
      var SourceTableDetails: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.SourceTableDetails
          ] = js.undefined
      /**
        * Contains the details of the features enabled on the table when the backup was created. For example, LSIs, GSIs, streams, TTL.
        */
      var SourceTableFeatureDetails: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.SourceTableFeatureDetails
          ] = js.undefined
    }
    
    trait BackupDetails extends js.Object {
      /**
        * ARN associated with the backup.
        */
      var BackupArn: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BackupArn
      /**
        * Time at which the backup was created. This is the request time of the backup. 
        */
      var BackupCreationDateTime: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BackupCreationDateTime
      /**
        * Time at which the automatic on-demand backup created by DynamoDB will expire. This SYSTEM on-demand backup expires automatically 35 days after its creation.
        */
      var BackupExpiryDateTime: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs._Date] = js.undefined
      /**
        * Name of the requested backup.
        */
      var BackupName: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BackupName
      /**
        * Size of the backup in bytes.
        */
      var BackupSizeBytes: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BackupSizeBytes
          ] = js.undefined
      /**
        * Backup can be in one of the following states: CREATING, ACTIVE, DELETED. 
        */
      var BackupStatus: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BackupStatus
      /**
        * BackupType:    USER - You create and manage these using the on-demand backup feature.    SYSTEM - If you delete a table with point-in-time recovery enabled, a SYSTEM backup is automatically created and is retained for 35 days (at no additional cost). System backups allow you to restore the deleted table to the state it was in just before the point of deletion.   
        */
      var BackupType: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BackupType
    }
    
    trait BackupSummary extends js.Object {
      /**
        * ARN associated with the backup.
        */
      var BackupArn: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BackupArn] = js.undefined
      /**
        * Time at which the backup was created.
        */
      var BackupCreationDateTime: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BackupCreationDateTime
          ] = js.undefined
      /**
        * Time at which the automatic on-demand backup created by DynamoDB will expire. This SYSTEM on-demand backup expires automatically 35 days after its creation.
        */
      var BackupExpiryDateTime: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs._Date] = js.undefined
      /**
        * Name of the specified backup.
        */
      var BackupName: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BackupName] = js.undefined
      /**
        * Size of the backup in bytes.
        */
      var BackupSizeBytes: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BackupSizeBytes
          ] = js.undefined
      /**
        * Backup can be in one of the following states: CREATING, ACTIVE, DELETED.
        */
      var BackupStatus: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BackupStatus
          ] = js.undefined
      /**
        * BackupType:    USER - You create and manage these using the on-demand backup feature.    SYSTEM - If you delete a table with point-in-time recovery enabled, a SYSTEM backup is automatically created and is retained for 35 days (at no additional cost). System backups allow you to restore the deleted table to the state it was in just before the point of deletion.   
        */
      var BackupType: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BackupType] = js.undefined
      /**
        * ARN associated with the table.
        */
      var TableArn: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableArn] = js.undefined
      /**
        * Unique identifier for the table.
        */
      var TableId: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableId] = js.undefined
      /**
        * Name of the table.
        */
      var TableName: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableName] = js.undefined
    }
    
    trait BatchGetItemInput extends js.Object {
      /**
        * A map of one or more table names and, for each table, a map that describes one or more items to retrieve from that table. Each table name can be used only once per BatchGetItem request. Each element in the map of items to retrieve consists of the following:    ConsistentRead - If true, a strongly consistent read is used; if false (the default), an eventually consistent read is used.    ExpressionAttributeNames - One or more substitution tokens for attribute names in the ProjectionExpression parameter. The following are some use cases for using ExpressionAttributeNames:   To access an attribute whose name conflicts with a DynamoDB reserved word.   To create a placeholder for repeating occurrences of an attribute name in an expression.   To prevent special characters in an attribute name from being misinterpreted in an expression.   Use the # character in an expression to dereference an attribute name. For example, consider the following attribute name:    Percentile    The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression. (For the complete list of reserved words, see Reserved Words in the Amazon DynamoDB Developer Guide). To work around this, you could specify the following for ExpressionAttributeNames:    {"#P":"Percentile"}    You could then use this substitution in an expression, as in this example:    #P = :val     Tokens that begin with the : character are expression attribute values, which are placeholders for the actual value at runtime.  For more information on expression attribute names, see Accessing Item Attributes in the Amazon DynamoDB Developer Guide.    Keys - An array of primary key attribute values that define specific items in the table. For each primary key, you must provide all of the key attributes. For example, with a simple primary key, you only need to provide the partition key value. For a composite key, you must provide both the partition key value and the sort key value.    ProjectionExpression - A string that identifies one or more attributes to retrieve from the table. These attributes can include scalars, sets, or elements of a JSON document. The attributes in the expression must be separated by commas. If no attribute names are specified, then all attributes will be returned. If any of the requested attributes are not found, they will not appear in the result. For more information, see Accessing Item Attributes in the Amazon DynamoDB Developer Guide.    AttributesToGet - This is a legacy parameter. Use ProjectionExpression instead. For more information, see AttributesToGet in the Amazon DynamoDB Developer Guide.   
        */
      var RequestItems: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BatchGetRequestMap
      var ReturnConsumedCapacity: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ReturnConsumedCapacity
          ] = js.undefined
    }
    
    trait BatchGetItemOutput extends js.Object {
      /**
        * The read capacity units consumed by the entire BatchGetItem operation. Each element consists of:    TableName - The table that consumed the provisioned throughput.    CapacityUnits - The total number of capacity units consumed.  
        */
      var ConsumedCapacity: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ConsumedCapacityMultiple
          ] = js.undefined
      /**
        * A map of table name to a list of items. Each object in Responses consists of a table name, along with a map of attribute data consisting of the data type and attribute value.
        */
      var Responses: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BatchGetResponseMap
          ] = js.undefined
      /**
        * A map of tables and their respective keys that were not processed with the current response. The UnprocessedKeys value is in the same form as RequestItems, so the value can be provided directly to a subsequent BatchGetItem operation. For more information, see RequestItems in the Request Parameters section. Each element consists of:    Keys - An array of primary key attribute values that define specific items in the table.    ProjectionExpression - One or more attributes to be retrieved from the table or index. By default, all attributes are returned. If a requested attribute is not found, it does not appear in the result.    ConsistentRead - The consistency of a read operation. If set to true, then a strongly consistent read is used; otherwise, an eventually consistent read is used.   If there are no unprocessed keys remaining, the response contains an empty UnprocessedKeys map.
        */
      var UnprocessedKeys: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BatchGetRequestMap
          ] = js.undefined
    }
    
    trait BatchGetRequestMap
      extends /* key */ org.scalablytyped.runtime.StringDictionary[
              awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.KeysAndAttributes
            ]
    
    trait BatchGetResponseMap
      extends /* key */ org.scalablytyped.runtime.StringDictionary[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ItemList]
    
    trait BatchWriteItemInput extends js.Object {
      /**
        * A map of one or more table names and, for each table, a list of operations to be performed (DeleteRequest or PutRequest). Each element in the map consists of the following:    DeleteRequest - Perform a DeleteItem operation on the specified item. The item to be deleted is identified by a Key subelement:    Key - A map of primary key attribute values that uniquely identify the item. Each entry in this map consists of an attribute name and an attribute value. For each primary key, you must provide all of the key attributes. For example, with a simple primary key, you only need to provide a value for the partition key. For a composite primary key, you must provide values for both the partition key and the sort key.      PutRequest - Perform a PutItem operation on the specified item. The item to be put is identified by an Item subelement:    Item - A map of attributes and their values. Each entry in this map consists of an attribute name and an attribute value. Attribute values must not be null; string and binary type attributes must have lengths greater than zero; and set type attributes must not be empty. Requests that contain empty values will be rejected with a ValidationException exception. If you specify any attributes that are part of an index key, then the data types for those attributes must match those of the schema in the table's attribute definition.    
        */
      var RequestItems: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BatchWriteItemRequestMap
      var ReturnConsumedCapacity: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ReturnConsumedCapacity
          ] = js.undefined
      /**
        * Determines whether item collection metrics are returned. If set to SIZE, the response includes statistics about item collections, if any, that were modified during the operation are returned in the response. If set to NONE (the default), no statistics are returned.
        */
      var ReturnItemCollectionMetrics: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ReturnItemCollectionMetrics
          ] = js.undefined
    }
    
    trait BatchWriteItemOutput extends js.Object {
      /**
        * The capacity units consumed by the entire BatchWriteItem operation. Each element consists of:    TableName - The table that consumed the provisioned throughput.    CapacityUnits - The total number of capacity units consumed.  
        */
      var ConsumedCapacity: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ConsumedCapacityMultiple
          ] = js.undefined
      /**
        * A list of tables that were processed by BatchWriteItem and, for each table, information about any item collections that were affected by individual DeleteItem or PutItem operations. Each entry consists of the following subelements:    ItemCollectionKey - The partition key value of the item collection. This is the same as the partition key value of the item.    SizeEstimateRangeGB - An estimate of item collection size, expressed in GB. This is a two-element array containing a lower bound and an upper bound for the estimate. The estimate includes the size of all the items in the table, plus the size of all attributes projected into all of the local secondary indexes on the table. Use this estimate to measure whether a local secondary index is approaching its size limit. The estimate is subject to change over time; therefore, do not rely on the precision or accuracy of the estimate.  
        */
      var ItemCollectionMetrics: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ItemCollectionMetricsPerTable
          ] = js.undefined
      /**
        * A map of tables and requests against those tables that were not processed. The UnprocessedItems value is in the same form as RequestItems, so you can provide this value directly to a subsequent BatchGetItem operation. For more information, see RequestItems in the Request Parameters section. Each UnprocessedItems entry consists of a table name and, for that table, a list of operations to perform (DeleteRequest or PutRequest).    DeleteRequest - Perform a DeleteItem operation on the specified item. The item to be deleted is identified by a Key subelement:    Key - A map of primary key attribute values that uniquely identify the item. Each entry in this map consists of an attribute name and an attribute value.      PutRequest - Perform a PutItem operation on the specified item. The item to be put is identified by an Item subelement:    Item - A map of attributes and their values. Each entry in this map consists of an attribute name and an attribute value. Attribute values must not be null; string and binary type attributes must have lengths greater than zero; and set type attributes must not be empty. Requests that contain empty values will be rejected with a ValidationException exception. If you specify any attributes that are part of an index key, then the data types for those attributes must match those of the schema in the table's attribute definition.     If there are no unprocessed items remaining, the response contains an empty UnprocessedItems map.
        */
      var UnprocessedItems: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BatchWriteItemRequestMap
          ] = js.undefined
    }
    
    trait BatchWriteItemRequestMap
      extends /* key */ org.scalablytyped.runtime.StringDictionary[
              awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.WriteRequests
            ]
    
    trait BillingModeSummary extends js.Object {
      /**
        * Controls how you are charged for read and write throughput and how you manage capacity. This setting can be changed later.    PROVISIONED - Sets the read/write capacity mode to PROVISIONED. We recommend using PROVISIONED for predictable workloads.    PAY_PER_REQUEST - Sets the read/write capacity mode to PAY_PER_REQUEST. We recommend using PAY_PER_REQUEST for unpredictable workloads.   
        */
      var BillingMode: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BillingMode
          ] = js.undefined
      /**
        * Represents the time when PAY_PER_REQUEST was last set as the read/write capacity mode.
        */
      var LastUpdateToPayPerRequestDateTime: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs._Date] = js.undefined
    }
    
    trait BinarySet extends js.Object {
      var `type`: awsDashSdkLib.awsDashSdkLibStrings.Binary
      var values: js.Array[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.binaryType]
    }
    
    //<!--auto-generated start-->
    trait Blob extends js.Object
    
    trait Capacity extends js.Object {
      /**
        * The total number of capacity units consumed on a table or an index.
        */
      var CapacityUnits: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ConsumedCapacityUnits
          ] = js.undefined
      /**
        * The total number of read capacity units consumed on a table or an index.
        */
      var ReadCapacityUnits: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ConsumedCapacityUnits
          ] = js.undefined
      /**
        * The total number of write capacity units consumed on a table or an index.
        */
      var WriteCapacityUnits: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ConsumedCapacityUnits
          ] = js.undefined
    }
    
    trait Condition extends js.Object {
      /**
        * One or more values to evaluate against the supplied attribute. The number of values in the list depends on the ComparisonOperator being used. For type Number, value comparisons are numeric. String value comparisons for greater than, equals, or less than are based on ASCII character code values. For example, a is greater than A, and a is greater than B. For a list of code values, see http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters. For Binary, DynamoDB treats each byte of the binary data as unsigned when it compares binary values.
        */
      var AttributeValueList: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.AttributeValueList
          ] = js.undefined
      /**
        * A comparator for evaluating attributes. For example, equals, greater than, less than, etc. The following comparison operators are available:  EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN  The following are descriptions of each comparison operator.    EQ : Equal. EQ is supported for all data types, including lists and maps.  AttributeValueList can contain only one AttributeValue element of type String, Number, Binary, String Set, Number Set, or Binary Set. If an item contains an AttributeValue element of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not equal {"NS":["6", "2", "1"]}.     NE : Not equal. NE is supported for all data types, including lists and maps.  AttributeValueList can contain only one AttributeValue of type String, Number, Binary, String Set, Number Set, or Binary Set. If an item contains an AttributeValue of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not equal {"NS":["6", "2", "1"]}.     LE : Less than or equal.   AttributeValueList can contain only one AttributeValue element of type String, Number, or Binary (not a set type). If an item contains an AttributeValue element of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not compare to {"NS":["6", "2", "1"]}.     LT : Less than.   AttributeValueList can contain only one AttributeValue of type String, Number, or Binary (not a set type). If an item contains an AttributeValue element of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not compare to {"NS":["6", "2", "1"]}.     GE : Greater than or equal.   AttributeValueList can contain only one AttributeValue element of type String, Number, or Binary (not a set type). If an item contains an AttributeValue element of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not compare to {"NS":["6", "2", "1"]}.     GT : Greater than.   AttributeValueList can contain only one AttributeValue element of type String, Number, or Binary (not a set type). If an item contains an AttributeValue element of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not compare to {"NS":["6", "2", "1"]}.     NOT_NULL : The attribute exists. NOT_NULL is supported for all data types, including lists and maps.  This operator tests for the existence of an attribute, not its data type. If the data type of attribute "a" is null, and you evaluate it using NOT_NULL, the result is a Boolean true. This result is because the attribute "a" exists; its data type is not relevant to the NOT_NULL comparison operator.     NULL : The attribute does not exist. NULL is supported for all data types, including lists and maps.  This operator tests for the nonexistence of an attribute, not its data type. If the data type of attribute "a" is null, and you evaluate it using NULL, the result is a Boolean false. This is because the attribute "a" exists; its data type is not relevant to the NULL comparison operator.     CONTAINS : Checks for a subsequence, or value in a set.  AttributeValueList can contain only one AttributeValue element of type String, Number, or Binary (not a set type). If the target attribute of the comparison is of type String, then the operator checks for a substring match. If the target attribute of the comparison is of type Binary, then the operator looks for a subsequence of the target that matches the input. If the target attribute of the comparison is a set ("SS", "NS", or "BS"), then the operator evaluates to true if it finds an exact match with any member of the set. CONTAINS is supported for lists: When evaluating "a CONTAINS b", "a" can be a list; however, "b" cannot be a set, a map, or a list.    NOT_CONTAINS : Checks for absence of a subsequence, or absence of a value in a set.  AttributeValueList can contain only one AttributeValue element of type String, Number, or Binary (not a set type). If the target attribute of the comparison is a String, then the operator checks for the absence of a substring match. If the target attribute of the comparison is Binary, then the operator checks for the absence of a subsequence of the target that matches the input. If the target attribute of the comparison is a set ("SS", "NS", or "BS"), then the operator evaluates to true if it does not find an exact match with any member of the set. NOT_CONTAINS is supported for lists: When evaluating "a NOT CONTAINS b", "a" can be a list; however, "b" cannot be a set, a map, or a list.    BEGINS_WITH : Checks for a prefix.   AttributeValueList can contain only one AttributeValue of type String or Binary (not a Number or a set type). The target attribute of the comparison must be of type String or Binary (not a Number or a set type).     IN : Checks for matching elements in a list.  AttributeValueList can contain one or more AttributeValue elements of type String, Number, or Binary. These attributes are compared against an existing attribute of an item. If any elements of the input are equal to the item attribute, the expression evaluates to true.    BETWEEN : Greater than or equal to the first value, and less than or equal to the second value.   AttributeValueList must contain two AttributeValue elements of the same type, either String, Number, or Binary (not a set type). A target attribute matches if the target value is greater than, or equal to, the first element and less than, or equal to, the second element. If an item contains an AttributeValue element of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not compare to {"N":"6"}. Also, {"N":"6"} does not compare to {"NS":["6", "2", "1"]}    For usage examples of AttributeValueList and ComparisonOperator, see Legacy Conditional Parameters in the Amazon DynamoDB Developer Guide.
        */
      var ComparisonOperator: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ComparisonOperator
    }
    
    trait ConditionCheck extends js.Object {
      /**
        * A condition that must be satisfied in order for a conditional update to succeed.
        */
      var ConditionExpression: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ConditionExpression
      /**
        * One or more substitution tokens for attribute names in an expression.
        */
      var ExpressionAttributeNames: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ExpressionAttributeNameMap
          ] = js.undefined
      /**
        * One or more values that can be substituted in an expression.
        */
      var ExpressionAttributeValues: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ExpressionAttributeValueMap
          ] = js.undefined
      /**
        * The primary key of the item to be checked. Each element consists of an attribute name and a value for that attribute.
        */
      var Key: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.Key
      /**
        * Use ReturnValuesOnConditionCheckFailure to get the item attributes if the ConditionCheck condition fails. For ReturnValuesOnConditionCheckFailure, the valid values are: NONE and ALL_OLD.
        */
      var ReturnValuesOnConditionCheckFailure: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ReturnValuesOnConditionCheckFailure
          ] = js.undefined
      /**
        * Name of the table for the check item request.
        */
      var TableName: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableName
    }
    
    trait ConsumedCapacity extends js.Object {
      /**
        * The total number of capacity units consumed by the operation.
        */
      var CapacityUnits: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ConsumedCapacityUnits
          ] = js.undefined
      /**
        * The amount of throughput consumed on each global index affected by the operation.
        */
      var GlobalSecondaryIndexes: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.SecondaryIndexesCapacityMap
          ] = js.undefined
      /**
        * The amount of throughput consumed on each local index affected by the operation.
        */
      var LocalSecondaryIndexes: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.SecondaryIndexesCapacityMap
          ] = js.undefined
      /**
        * The total number of read capacity units consumed by the operation.
        */
      var ReadCapacityUnits: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ConsumedCapacityUnits
          ] = js.undefined
      /**
        * The amount of throughput consumed on the table affected by the operation.
        */
      var Table: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.Capacity] = js.undefined
      /**
        * The name of the table that was affected by the operation.
        */
      var TableName: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableName] = js.undefined
      /**
        * The total number of write capacity units consumed by the operation.
        */
      var WriteCapacityUnits: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ConsumedCapacityUnits
          ] = js.undefined
    }
    
    trait ContinuousBackupsDescription extends js.Object {
      /**
        *  ContinuousBackupsStatus can be one of the following states: ENABLED, DISABLED
        */
      var ContinuousBackupsStatus: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ContinuousBackupsStatus
      /**
        * The description of the point in time recovery settings applied to the table.
        */
      var PointInTimeRecoveryDescription: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.PointInTimeRecoveryDescription
          ] = js.undefined
    }
    
    trait ConverterOptions extends js.Object {
      /**
        * An optional flag indicating that the document client should cast
        * empty strings, buffers, and sets to NULL shapes
        */
      var convertEmptyValues: js.UndefOr[scala.Boolean] = js.undefined
      /**
        * Whether to return numbers as a NumberValue object instead of
        * converting them to native JavaScript numbers. This allows for the
        * safe round-trip transport of numbers of arbitrary size.
        */
      var wrapNumbers: js.UndefOr[scala.Boolean] = js.undefined
    }
    
    trait CreateBackupInput extends js.Object {
      /**
        * Specified name for the backup.
        */
      var BackupName: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BackupName
      /**
        * The name of the table.
        */
      var TableName: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableName
    }
    
    trait CreateBackupOutput extends js.Object {
      /**
        * Contains the details of the backup created for the table.
        */
      var BackupDetails: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BackupDetails
          ] = js.undefined
    }
    
    trait CreateGlobalSecondaryIndexAction extends js.Object {
      /**
        * The name of the global secondary index to be created.
        */
      var IndexName: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.IndexName
      /**
        * The key schema for the global secondary index.
        */
      var KeySchema: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.KeySchema
      /**
        * Represents attributes that are copied (projected) from the table into an index. These are in addition to the primary key attributes and index key attributes, which are automatically projected.
        */
      var Projection: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.Projection
      /**
        * Represents the provisioned throughput settings for the specified global secondary index. For current minimum and maximum provisioned throughput values, see Limits in the Amazon DynamoDB Developer Guide.
        */
      var ProvisionedThroughput: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ProvisionedThroughput
          ] = js.undefined
    }
    
    trait CreateGlobalTableInput extends js.Object {
      /**
        * The global table name.
        */
      var GlobalTableName: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableName
      /**
        * The regions where the global table needs to be created.
        */
      var ReplicationGroup: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ReplicaList
    }
    
    trait CreateGlobalTableOutput extends js.Object {
      /**
        * Contains the details of the global table.
        */
      var GlobalTableDescription: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.GlobalTableDescription
          ] = js.undefined
    }
    
    trait CreateReplicaAction extends js.Object {
      /**
        * The region of the replica to be added.
        */
      var RegionName: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.RegionName
    }
    
    trait CreateSetOptions extends js.Object {
      /**
        * Set to true if you want to validate the type of each element in the set. Defaults to false.
        */
      var validate: js.UndefOr[scala.Boolean] = js.undefined
    }
    
    trait CreateTableInput extends js.Object {
      /**
        * An array of attributes that describe the key schema for the table and indexes.
        */
      var AttributeDefinitions: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.AttributeDefinitions
      /**
        * Controls how you are charged for read and write throughput and how you manage capacity. This setting can be changed later.    PROVISIONED - Sets the billing mode to PROVISIONED. We recommend using PROVISIONED for predictable workloads.    PAY_PER_REQUEST - Sets the billing mode to PAY_PER_REQUEST. We recommend using PAY_PER_REQUEST for unpredictable workloads.   
        */
      var BillingMode: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BillingMode
          ] = js.undefined
      /**
        * One or more global secondary indexes (the maximum is five) to be created on the table. Each global secondary index in the array includes the following:    IndexName - The name of the global secondary index. Must be unique only for this table.     KeySchema - Specifies the key schema for the global secondary index.    Projection - Specifies attributes that are copied (projected) from the table into the index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. Each attribute specification is composed of:    ProjectionType - One of the following:    KEYS_ONLY - Only the index and primary keys are projected into the index.    INCLUDE - Only the specified table attributes are projected into the index. The list of projected attributes are in NonKeyAttributes.    ALL - All of the table attributes are projected into the index.      NonKeyAttributes - A list of one or more non-key attribute names that are projected into the secondary index. The total count of attributes provided in NonKeyAttributes, summed across all of the secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts as two distinct attributes when determining the total.      ProvisionedThroughput - The provisioned throughput settings for the global secondary index, consisting of read and write capacity units.  
        */
      var GlobalSecondaryIndexes: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.GlobalSecondaryIndexList
          ] = js.undefined
      /**
        * Specifies the attributes that make up the primary key for a table or an index. The attributes in KeySchema must also be defined in the AttributeDefinitions array. For more information, see Data Model in the Amazon DynamoDB Developer Guide. Each KeySchemaElement in the array is composed of:    AttributeName - The name of this key attribute.    KeyType - The role that the key attribute will assume:    HASH - partition key    RANGE - sort key      The partition key of an item is also known as its hash attribute. The term "hash attribute" derives from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values. The sort key of an item is also known as its range attribute. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value.  For a simple primary key (partition key), you must provide exactly one element with a KeyType of HASH. For a composite primary key (partition key and sort key), you must provide exactly two elements, in this order: The first element must have a KeyType of HASH, and the second element must have a KeyType of RANGE. For more information, see Specifying the Primary Key in the Amazon DynamoDB Developer Guide.
        */
      var KeySchema: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.KeySchema
      /**
        * One or more local secondary indexes (the maximum is five) to be created on the table. Each index is scoped to a given partition key value. There is a 10 GB size limit per partition key value; otherwise, the size of a local secondary index is unconstrained. Each local secondary index in the array includes the following:    IndexName - The name of the local secondary index. Must be unique only for this table.     KeySchema - Specifies the key schema for the local secondary index. The key schema must begin with the same partition key as the table.    Projection - Specifies attributes that are copied (projected) from the table into the index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. Each attribute specification is composed of:    ProjectionType - One of the following:    KEYS_ONLY - Only the index and primary keys are projected into the index.    INCLUDE - Only the specified table attributes are projected into the index. The list of projected attributes are in NonKeyAttributes.    ALL - All of the table attributes are projected into the index.      NonKeyAttributes - A list of one or more non-key attribute names that are projected into the secondary index. The total count of attributes provided in NonKeyAttributes, summed across all of the secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts as two distinct attributes when determining the total.    
        */
      var LocalSecondaryIndexes: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.LocalSecondaryIndexList
          ] = js.undefined
      /**
        * Represents the provisioned throughput settings for a specified table or index. The settings can be modified using the UpdateTable operation.  If you set BillingMode as PROVISIONED, you must specify this property. If you set BillingMode as PAY_PER_REQUEST, you cannot specify this property.  For current minimum and maximum provisioned throughput values, see Limits in the Amazon DynamoDB Developer Guide.
        */
      var ProvisionedThroughput: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ProvisionedThroughput
          ] = js.undefined
      /**
        * Represents the settings used to enable server-side encryption.
        */
      var SSESpecification: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.SSESpecification
          ] = js.undefined
      /**
        * The settings for DynamoDB Streams on the table. These settings consist of:    StreamEnabled - Indicates whether Streams is to be enabled (true) or disabled (false).    StreamViewType - When an item in the table is modified, StreamViewType determines what information is written to the table's stream. Valid values for StreamViewType are:    KEYS_ONLY - Only the key attributes of the modified item are written to the stream.    NEW_IMAGE - The entire item, as it appears after it was modified, is written to the stream.    OLD_IMAGE - The entire item, as it appeared before it was modified, is written to the stream.    NEW_AND_OLD_IMAGES - Both the new and the old item images of the item are written to the stream.    
        */
      var StreamSpecification: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.StreamSpecification
          ] = js.undefined
      /**
        * The name of the table to create.
        */
      var TableName: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableName
    }
    
    trait CreateTableOutput extends js.Object {
      /**
        * Represents the properties of the table.
        */
      var TableDescription: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableDescription
          ] = js.undefined
    }
    
    trait Delete extends js.Object {
      /**
        * A condition that must be satisfied in order for a conditional delete to succeed.
        */
      var ConditionExpression: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ConditionExpression
          ] = js.undefined
      /**
        * One or more substitution tokens for attribute names in an expression.
        */
      var ExpressionAttributeNames: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ExpressionAttributeNameMap
          ] = js.undefined
      /**
        * One or more values that can be substituted in an expression.
        */
      var ExpressionAttributeValues: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ExpressionAttributeValueMap
          ] = js.undefined
      /**
        * The primary key of the item to be deleted. Each element consists of an attribute name and a value for that attribute.
        */
      var Key: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.Key
      /**
        * Use ReturnValuesOnConditionCheckFailure to get the item attributes if the Delete condition fails. For ReturnValuesOnConditionCheckFailure, the valid values are: NONE and ALL_OLD.
        */
      var ReturnValuesOnConditionCheckFailure: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ReturnValuesOnConditionCheckFailure
          ] = js.undefined
      /**
        * Name of the table in which the item to be deleted resides.
        */
      var TableName: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableName
    }
    
    trait DeleteBackupInput extends js.Object {
      /**
        * The ARN associated with the backup.
        */
      var BackupArn: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BackupArn
    }
    
    trait DeleteBackupOutput extends js.Object {
      /**
        * Contains the description of the backup created for the table.
        */
      var BackupDescription: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BackupDescription
          ] = js.undefined
    }
    
    trait DeleteGlobalSecondaryIndexAction extends js.Object {
      /**
        * The name of the global secondary index to be deleted.
        */
      var IndexName: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.IndexName
    }
    
    trait DeleteItemInput extends js.Object {
      /**
        * A condition that must be satisfied in order for a conditional DeleteItem to succeed. An expression can contain any of the following:   Functions: attribute_exists | attribute_not_exists | attribute_type | contains | begins_with | size  These function names are case-sensitive.   Comparison operators: = | &lt;&gt; | &lt; | &gt; | &lt;= | &gt;= | BETWEEN | IN      Logical operators: AND | OR | NOT    For more information on condition expressions, see Specifying Conditions in the Amazon DynamoDB Developer Guide.
        */
      var ConditionExpression: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ConditionExpression
          ] = js.undefined
      /**
        * This is a legacy parameter. Use ConditionExpression instead. For more information, see ConditionalOperator in the Amazon DynamoDB Developer Guide.
        */
      var ConditionalOperator: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ConditionalOperator
          ] = js.undefined
      /**
        * This is a legacy parameter. Use ConditionExpression instead. For more information, see Expected in the Amazon DynamoDB Developer Guide.
        */
      var Expected: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ExpectedAttributeMap
          ] = js.undefined
      /**
        * One or more substitution tokens for attribute names in an expression. The following are some use cases for using ExpressionAttributeNames:   To access an attribute whose name conflicts with a DynamoDB reserved word.   To create a placeholder for repeating occurrences of an attribute name in an expression.   To prevent special characters in an attribute name from being misinterpreted in an expression.   Use the # character in an expression to dereference an attribute name. For example, consider the following attribute name:    Percentile    The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression. (For the complete list of reserved words, see Reserved Words in the Amazon DynamoDB Developer Guide). To work around this, you could specify the following for ExpressionAttributeNames:    {"#P":"Percentile"}    You could then use this substitution in an expression, as in this example:    #P = :val     Tokens that begin with the : character are expression attribute values, which are placeholders for the actual value at runtime.  For more information on expression attribute names, see Accessing Item Attributes in the Amazon DynamoDB Developer Guide.
        */
      var ExpressionAttributeNames: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ExpressionAttributeNameMap
          ] = js.undefined
      /**
        * One or more values that can be substituted in an expression. Use the : (colon) character in an expression to dereference an attribute value. For example, suppose that you wanted to check whether the value of the ProductStatus attribute was one of the following:   Available | Backordered | Discontinued  You would first need to specify ExpressionAttributeValues as follows:  { ":avail":{"S":"Available"}, ":back":{"S":"Backordered"}, ":disc":{"S":"Discontinued"} }  You could then use these values in an expression, such as this:  ProductStatus IN (:avail, :back, :disc)  For more information on expression attribute values, see Specifying Conditions in the Amazon DynamoDB Developer Guide.
        */
      var ExpressionAttributeValues: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ExpressionAttributeValueMap
          ] = js.undefined
      /**
        * A map of attribute names to AttributeValue objects, representing the primary key of the item to delete. For the primary key, you must provide all of the attributes. For example, with a simple primary key, you only need to provide a value for the partition key. For a composite primary key, you must provide values for both the partition key and the sort key.
        */
      var Key: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.Key
      var ReturnConsumedCapacity: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ReturnConsumedCapacity
          ] = js.undefined
      /**
        * Determines whether item collection metrics are returned. If set to SIZE, the response includes statistics about item collections, if any, that were modified during the operation are returned in the response. If set to NONE (the default), no statistics are returned.
        */
      var ReturnItemCollectionMetrics: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ReturnItemCollectionMetrics
          ] = js.undefined
      /**
        * Use ReturnValues if you want to get the item attributes as they appeared before they were deleted. For DeleteItem, the valid values are:    NONE - If ReturnValues is not specified, or if its value is NONE, then nothing is returned. (This setting is the default for ReturnValues.)    ALL_OLD - The content of the old item is returned.    The ReturnValues parameter is used by several DynamoDB operations; however, DeleteItem does not recognize any values other than NONE or ALL_OLD. 
        */
      var ReturnValues: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ReturnValue
          ] = js.undefined
      /**
        * The name of the table from which to delete the item.
        */
      var TableName: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableName
    }
    
    trait DeleteItemOutput extends js.Object {
      /**
        * A map of attribute names to AttributeValue objects, representing the item as it appeared before the DeleteItem operation. This map appears in the response only if ReturnValues was specified as ALL_OLD in the request.
        */
      var Attributes: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.AttributeMap
          ] = js.undefined
      /**
        * The capacity units consumed by the DeleteItem operation. The data returned includes the total provisioned throughput consumed, along with statistics for the table and any indexes involved in the operation. ConsumedCapacity is only returned if the ReturnConsumedCapacity parameter was specified. For more information, see Provisioned Throughput in the Amazon DynamoDB Developer Guide.
        */
      var ConsumedCapacity: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ConsumedCapacity
          ] = js.undefined
      /**
        * Information about item collections, if any, that were affected by the DeleteItem operation. ItemCollectionMetrics is only returned if the ReturnItemCollectionMetrics parameter was specified. If the table does not have any local secondary indexes, this information is not returned in the response. Each ItemCollectionMetrics element consists of:    ItemCollectionKey - The partition key value of the item collection. This is the same as the partition key value of the item itself.    SizeEstimateRangeGB - An estimate of item collection size, in gigabytes. This value is a two-element array containing a lower bound and an upper bound for the estimate. The estimate includes the size of all the items in the table, plus the size of all attributes projected into all of the local secondary indexes on that table. Use this estimate to measure whether a local secondary index is approaching its size limit. The estimate is subject to change over time; therefore, do not rely on the precision or accuracy of the estimate.  
        */
      var ItemCollectionMetrics: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ItemCollectionMetrics
          ] = js.undefined
    }
    
    trait DeleteReplicaAction extends js.Object {
      /**
        * The region of the replica to be removed.
        */
      var RegionName: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.RegionName
    }
    
    trait DeleteRequest extends js.Object {
      /**
        * A map of attribute name to attribute values, representing the primary key of the item to delete. All of the table's primary key attributes must be specified, and their data types must match those of the table's key schema.
        */
      var Key: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.Key
    }
    
    trait DeleteTableInput extends js.Object {
      /**
        * The name of the table to delete.
        */
      var TableName: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableName
    }
    
    trait DeleteTableOutput extends js.Object {
      /**
        * Represents the properties of a table.
        */
      var TableDescription: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableDescription
          ] = js.undefined
    }
    
    trait DescribeBackupInput extends js.Object {
      /**
        * The ARN associated with the backup.
        */
      var BackupArn: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BackupArn
    }
    
    trait DescribeBackupOutput extends js.Object {
      /**
        * Contains the description of the backup created for the table.
        */
      var BackupDescription: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BackupDescription
          ] = js.undefined
    }
    
    trait DescribeContinuousBackupsInput extends js.Object {
      /**
        * Name of the table for which the customer wants to check the continuous backups and point in time recovery settings.
        */
      var TableName: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableName
    }
    
    trait DescribeContinuousBackupsOutput extends js.Object {
      /**
        * Represents the continuous backups and point in time recovery settings on the table.
        */
      var ContinuousBackupsDescription: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ContinuousBackupsDescription
          ] = js.undefined
    }
    
    trait DescribeEndpointsRequest extends js.Object
    
    trait DescribeEndpointsResponse extends js.Object {
      var Endpoints: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.Endpoints
    }
    
    trait DescribeGlobalTableInput extends js.Object {
      /**
        * The name of the global table.
        */
      var GlobalTableName: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableName
    }
    
    trait DescribeGlobalTableOutput extends js.Object {
      /**
        * Contains the details of the global table.
        */
      var GlobalTableDescription: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.GlobalTableDescription
          ] = js.undefined
    }
    
    trait DescribeGlobalTableSettingsInput extends js.Object {
      /**
        * The name of the global table to describe.
        */
      var GlobalTableName: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableName
    }
    
    trait DescribeGlobalTableSettingsOutput extends js.Object {
      /**
        * The name of the global table.
        */
      var GlobalTableName: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableName] = js.undefined
      /**
        * The region specific settings for the global table.
        */
      var ReplicaSettings: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ReplicaSettingsDescriptionList
          ] = js.undefined
    }
    
    trait DescribeLimitsInput extends js.Object
    
    trait DescribeLimitsOutput extends js.Object {
      /**
        * The maximum total read capacity units that your account allows you to provision across all of your tables in this region.
        */
      var AccountMaxReadCapacityUnits: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.PositiveLongObject
          ] = js.undefined
      /**
        * The maximum total write capacity units that your account allows you to provision across all of your tables in this region.
        */
      var AccountMaxWriteCapacityUnits: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.PositiveLongObject
          ] = js.undefined
      /**
        * The maximum read capacity units that your account allows you to provision for a new table that you are creating in this region, including the read capacity units provisioned for its global secondary indexes (GSIs).
        */
      var TableMaxReadCapacityUnits: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.PositiveLongObject
          ] = js.undefined
      /**
        * The maximum write capacity units that your account allows you to provision for a new table that you are creating in this region, including the write capacity units provisioned for its global secondary indexes (GSIs).
        */
      var TableMaxWriteCapacityUnits: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.PositiveLongObject
          ] = js.undefined
    }
    
    trait DescribeTableInput extends js.Object {
      /**
        * The name of the table to describe.
        */
      var TableName: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableName
    }
    
    trait DescribeTableOutput extends js.Object {
      /**
        * The properties of the table.
        */
      var Table: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableDescription
          ] = js.undefined
    }
    
    trait DescribeTimeToLiveInput extends js.Object {
      /**
        * The name of the table to be described.
        */
      var TableName: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableName
    }
    
    trait DescribeTimeToLiveOutput extends js.Object {
      /**
        * 
        */
      var TimeToLiveDescription: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TimeToLiveDescription
          ] = js.undefined
    }
    
    trait DocumentClientOptions
      extends awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ConverterOptions {
      /**
        * An optional map of parameters to bind to every request sent by this service object.
        */
      var params: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
      /**
        * An optional pre-configured instance of the AWS.DynamoDB service object to use for requests. The object may bound parameters used by the document client.
        */
      var service: js.UndefOr[awsDashSdkLib.clientsDynamodbMod.namespaced] = js.undefined
    }
    
    trait Endpoint extends js.Object {
      var Address: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.String
      var CachePeriodInMinutes: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.Long
    }
    
    trait ExpectedAttributeMap
      extends /* key */ org.scalablytyped.runtime.StringDictionary[
              awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ExpectedAttributeValue
            ]
    
    trait ExpectedAttributeValue extends js.Object {
      /**
        * One or more values to evaluate against the supplied attribute. The number of values in the list depends on the ComparisonOperator being used. For type Number, value comparisons are numeric. String value comparisons for greater than, equals, or less than are based on ASCII character code values. For example, a is greater than A, and a is greater than B. For a list of code values, see http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters. For Binary, DynamoDB treats each byte of the binary data as unsigned when it compares binary values. For information on specifying data types in JSON, see JSON Data Format in the Amazon DynamoDB Developer Guide.
        */
      var AttributeValueList: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.AttributeValueList
          ] = js.undefined
      /**
        * A comparator for evaluating attributes in the AttributeValueList. For example, equals, greater than, less than, etc. The following comparison operators are available:  EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN  The following are descriptions of each comparison operator.    EQ : Equal. EQ is supported for all data types, including lists and maps.  AttributeValueList can contain only one AttributeValue element of type String, Number, Binary, String Set, Number Set, or Binary Set. If an item contains an AttributeValue element of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not equal {"NS":["6", "2", "1"]}.     NE : Not equal. NE is supported for all data types, including lists and maps.  AttributeValueList can contain only one AttributeValue of type String, Number, Binary, String Set, Number Set, or Binary Set. If an item contains an AttributeValue of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not equal {"NS":["6", "2", "1"]}.     LE : Less than or equal.   AttributeValueList can contain only one AttributeValue element of type String, Number, or Binary (not a set type). If an item contains an AttributeValue element of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not compare to {"NS":["6", "2", "1"]}.     LT : Less than.   AttributeValueList can contain only one AttributeValue of type String, Number, or Binary (not a set type). If an item contains an AttributeValue element of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not compare to {"NS":["6", "2", "1"]}.     GE : Greater than or equal.   AttributeValueList can contain only one AttributeValue element of type String, Number, or Binary (not a set type). If an item contains an AttributeValue element of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not compare to {"NS":["6", "2", "1"]}.     GT : Greater than.   AttributeValueList can contain only one AttributeValue element of type String, Number, or Binary (not a set type). If an item contains an AttributeValue element of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not compare to {"NS":["6", "2", "1"]}.     NOT_NULL : The attribute exists. NOT_NULL is supported for all data types, including lists and maps.  This operator tests for the existence of an attribute, not its data type. If the data type of attribute "a" is null, and you evaluate it using NOT_NULL, the result is a Boolean true. This result is because the attribute "a" exists; its data type is not relevant to the NOT_NULL comparison operator.     NULL : The attribute does not exist. NULL is supported for all data types, including lists and maps.  This operator tests for the nonexistence of an attribute, not its data type. If the data type of attribute "a" is null, and you evaluate it using NULL, the result is a Boolean false. This is because the attribute "a" exists; its data type is not relevant to the NULL comparison operator.     CONTAINS : Checks for a subsequence, or value in a set.  AttributeValueList can contain only one AttributeValue element of type String, Number, or Binary (not a set type). If the target attribute of the comparison is of type String, then the operator checks for a substring match. If the target attribute of the comparison is of type Binary, then the operator looks for a subsequence of the target that matches the input. If the target attribute of the comparison is a set ("SS", "NS", or "BS"), then the operator evaluates to true if it finds an exact match with any member of the set. CONTAINS is supported for lists: When evaluating "a CONTAINS b", "a" can be a list; however, "b" cannot be a set, a map, or a list.    NOT_CONTAINS : Checks for absence of a subsequence, or absence of a value in a set.  AttributeValueList can contain only one AttributeValue element of type String, Number, or Binary (not a set type). If the target attribute of the comparison is a String, then the operator checks for the absence of a substring match. If the target attribute of the comparison is Binary, then the operator checks for the absence of a subsequence of the target that matches the input. If the target attribute of the comparison is a set ("SS", "NS", or "BS"), then the operator evaluates to true if it does not find an exact match with any member of the set. NOT_CONTAINS is supported for lists: When evaluating "a NOT CONTAINS b", "a" can be a list; however, "b" cannot be a set, a map, or a list.    BEGINS_WITH : Checks for a prefix.   AttributeValueList can contain only one AttributeValue of type String or Binary (not a Number or a set type). The target attribute of the comparison must be of type String or Binary (not a Number or a set type).     IN : Checks for matching elements in a list.  AttributeValueList can contain one or more AttributeValue elements of type String, Number, or Binary. These attributes are compared against an existing attribute of an item. If any elements of the input are equal to the item attribute, the expression evaluates to true.    BETWEEN : Greater than or equal to the first value, and less than or equal to the second value.   AttributeValueList must contain two AttributeValue elements of the same type, either String, Number, or Binary (not a set type). A target attribute matches if the target value is greater than, or equal to, the first element and less than, or equal to, the second element. If an item contains an AttributeValue element of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not compare to {"N":"6"}. Also, {"N":"6"} does not compare to {"NS":["6", "2", "1"]}   
        */
      var ComparisonOperator: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ComparisonOperator
          ] = js.undefined
      /**
        * Causes DynamoDB to evaluate the value before attempting a conditional operation:   If Exists is true, DynamoDB will check to see if that attribute value already exists in the table. If it is found, then the operation succeeds. If it is not found, the operation fails with a ConditionCheckFailedException.   If Exists is false, DynamoDB assumes that the attribute value does not exist in the table. If in fact the value does not exist, then the assumption is valid and the operation succeeds. If the value is found, despite the assumption that it does not exist, the operation fails with a ConditionCheckFailedException.   The default setting for Exists is true. If you supply a Value all by itself, DynamoDB assumes the attribute exists: You don't have to set Exists to true, because it is implied. DynamoDB returns a ValidationException if:    Exists is true but there is no Value to check. (You expect a value to exist, but don't specify what that value is.)    Exists is false but you also provide a Value. (You cannot expect an attribute to have a value, while also expecting it not to exist.)  
        */
      var Exists: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BooleanObject
          ] = js.undefined
      /**
        * Represents the data for the expected attribute. Each attribute value is described as a name-value pair. The name is the data type, and the value is the data itself. For more information, see Data Types in the Amazon DynamoDB Developer Guide.
        */
      var Value: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.AttributeValue
          ] = js.undefined
    }
    
    trait ExpressionAttributeNameMap
      extends /* key */ org.scalablytyped.runtime.StringDictionary[
              awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.AttributeName
            ]
    
    trait ExpressionAttributeValueMap
      extends /* key */ org.scalablytyped.runtime.StringDictionary[
              awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.AttributeValue
            ]
    
    trait FilterConditionMap
      extends /* key */ org.scalablytyped.runtime.StringDictionary[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.Condition]
    
    trait Get extends js.Object {
      /**
        * One or more substitution tokens for attribute names in the ProjectionExpression parameter.
        */
      var ExpressionAttributeNames: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ExpressionAttributeNameMap
          ] = js.undefined
      /**
        * A map of attribute names to AttributeValue objects that specifies the primary key of the item to retrieve.
        */
      var Key: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.Key
      /**
        * A string that identifies one or more attributes of the specified item to retrieve from the table. The attributes in the expression must be separated by commas. If no attribute names are specified, then all attributes of the specified item are returned. If any of the requested attributes are not found, they do not appear in the result.
        */
      var ProjectionExpression: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ProjectionExpression
          ] = js.undefined
      /**
        * The name of the table from which to retrieve the specified item.
        */
      var TableName: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableName
    }
    
    trait GetItemInput extends js.Object {
      /**
        * This is a legacy parameter. Use ProjectionExpression instead. For more information, see AttributesToGet in the Amazon DynamoDB Developer Guide.
        */
      var AttributesToGet: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.AttributeNameList
          ] = js.undefined
      /**
        * Determines the read consistency model: If set to true, then the operation uses strongly consistent reads; otherwise, the operation uses eventually consistent reads.
        */
      var ConsistentRead: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ConsistentRead
          ] = js.undefined
      /**
        * One or more substitution tokens for attribute names in an expression. The following are some use cases for using ExpressionAttributeNames:   To access an attribute whose name conflicts with a DynamoDB reserved word.   To create a placeholder for repeating occurrences of an attribute name in an expression.   To prevent special characters in an attribute name from being misinterpreted in an expression.   Use the # character in an expression to dereference an attribute name. For example, consider the following attribute name:    Percentile    The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression. (For the complete list of reserved words, see Reserved Words in the Amazon DynamoDB Developer Guide). To work around this, you could specify the following for ExpressionAttributeNames:    {"#P":"Percentile"}    You could then use this substitution in an expression, as in this example:    #P = :val     Tokens that begin with the : character are expression attribute values, which are placeholders for the actual value at runtime.  For more information on expression attribute names, see Accessing Item Attributes in the Amazon DynamoDB Developer Guide.
        */
      var ExpressionAttributeNames: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ExpressionAttributeNameMap
          ] = js.undefined
      /**
        * A map of attribute names to AttributeValue objects, representing the primary key of the item to retrieve. For the primary key, you must provide all of the attributes. For example, with a simple primary key, you only need to provide a value for the partition key. For a composite primary key, you must provide values for both the partition key and the sort key.
        */
      var Key: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.Key
      /**
        * A string that identifies one or more attributes to retrieve from the table. These attributes can include scalars, sets, or elements of a JSON document. The attributes in the expression must be separated by commas. If no attribute names are specified, then all attributes will be returned. If any of the requested attributes are not found, they will not appear in the result. For more information, see Accessing Item Attributes in the Amazon DynamoDB Developer Guide.
        */
      var ProjectionExpression: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ProjectionExpression
          ] = js.undefined
      var ReturnConsumedCapacity: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ReturnConsumedCapacity
          ] = js.undefined
      /**
        * The name of the table containing the requested item.
        */
      var TableName: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableName
    }
    
    trait GetItemOutput extends js.Object {
      /**
        * The capacity units consumed by the GetItem operation. The data returned includes the total provisioned throughput consumed, along with statistics for the table and any indexes involved in the operation. ConsumedCapacity is only returned if the ReturnConsumedCapacity parameter was specified. For more information, see Provisioned Throughput in the Amazon DynamoDB Developer Guide.
        */
      var ConsumedCapacity: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ConsumedCapacity
          ] = js.undefined
      /**
        * A map of attribute names to AttributeValue objects, as specified by ProjectionExpression.
        */
      var Item: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.AttributeMap
          ] = js.undefined
    }
    
    trait GlobalSecondaryIndex extends js.Object {
      /**
        * The name of the global secondary index. The name must be unique among all other indexes on this table.
        */
      var IndexName: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.IndexName
      /**
        * The complete key schema for a global secondary index, which consists of one or more pairs of attribute names and key types:    HASH - partition key    RANGE - sort key    The partition key of an item is also known as its hash attribute. The term "hash attribute" derives from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values. The sort key of an item is also known as its range attribute. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value. 
        */
      var KeySchema: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.KeySchema
      /**
        * Represents attributes that are copied (projected) from the table into the global secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. 
        */
      var Projection: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.Projection
      /**
        * Represents the provisioned throughput settings for the specified global secondary index. For current minimum and maximum provisioned throughput values, see Limits in the Amazon DynamoDB Developer Guide.
        */
      var ProvisionedThroughput: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ProvisionedThroughput
          ] = js.undefined
    }
    
    trait GlobalSecondaryIndexDescription extends js.Object {
      /**
        * Indicates whether the index is currently backfilling. Backfilling is the process of reading items from the table and determining whether they can be added to the index. (Not all items will qualify: For example, a partition key cannot have any duplicate values.) If an item can be added to the index, DynamoDB will do so. After all items have been processed, the backfilling operation is complete and Backfilling is false.  For indexes that were created during a CreateTable operation, the Backfilling attribute does not appear in the DescribeTable output. 
        */
      var Backfilling: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.Backfilling
          ] = js.undefined
      /**
        * The Amazon Resource Name (ARN) that uniquely identifies the index.
        */
      var IndexArn: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.String] = js.undefined
      /**
        * The name of the global secondary index.
        */
      var IndexName: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.IndexName] = js.undefined
      /**
        * The total size of the specified index, in bytes. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.
        */
      var IndexSizeBytes: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.Long] = js.undefined
      /**
        * The current state of the global secondary index:    CREATING - The index is being created.    UPDATING - The index is being updated.    DELETING - The index is being deleted.    ACTIVE - The index is ready for use.  
        */
      var IndexStatus: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.IndexStatus
          ] = js.undefined
      /**
        * The number of items in the specified index. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.
        */
      var ItemCount: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.Long] = js.undefined
      /**
        * The complete key schema for a global secondary index, which consists of one or more pairs of attribute names and key types:    HASH - partition key    RANGE - sort key    The partition key of an item is also known as its hash attribute. The term "hash attribute" derives from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values. The sort key of an item is also known as its range attribute. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value. 
        */
      var KeySchema: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.KeySchema] = js.undefined
      /**
        * Represents attributes that are copied (projected) from the table into the global secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. 
        */
      var Projection: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.Projection] = js.undefined
      /**
        * Represents the provisioned throughput settings for the specified global secondary index. For current minimum and maximum provisioned throughput values, see Limits in the Amazon DynamoDB Developer Guide.
        */
      var ProvisionedThroughput: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ProvisionedThroughputDescription
          ] = js.undefined
    }
    
    trait GlobalSecondaryIndexInfo extends js.Object {
      /**
        * The name of the global secondary index.
        */
      var IndexName: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.IndexName] = js.undefined
      /**
        * The complete key schema for a global secondary index, which consists of one or more pairs of attribute names and key types:    HASH - partition key    RANGE - sort key    The partition key of an item is also known as its hash attribute. The term "hash attribute" derives from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values. The sort key of an item is also known as its range attribute. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value. 
        */
      var KeySchema: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.KeySchema] = js.undefined
      /**
        * Represents attributes that are copied (projected) from the table into the global secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. 
        */
      var Projection: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.Projection] = js.undefined
      /**
        * Represents the provisioned throughput settings for the specified global secondary index. 
        */
      var ProvisionedThroughput: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ProvisionedThroughput
          ] = js.undefined
    }
    
    trait GlobalSecondaryIndexUpdate extends js.Object {
      /**
        * The parameters required for creating a global secondary index on an existing table:    IndexName      KeySchema      AttributeDefinitions      Projection      ProvisionedThroughput    
        */
      var Create: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.CreateGlobalSecondaryIndexAction
          ] = js.undefined
      /**
        * The name of an existing global secondary index to be removed.
        */
      var Delete: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.DeleteGlobalSecondaryIndexAction
          ] = js.undefined
      /**
        * The name of an existing global secondary index, along with new provisioned throughput settings to be applied to that index.
        */
      var Update: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.UpdateGlobalSecondaryIndexAction
          ] = js.undefined
    }
    
    trait GlobalTable extends js.Object {
      /**
        * The global table name.
        */
      var GlobalTableName: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableName] = js.undefined
      /**
        * The regions where the global table has replicas.
        */
      var ReplicationGroup: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ReplicaList
          ] = js.undefined
    }
    
    trait GlobalTableDescription extends js.Object {
      /**
        * The creation time of the global table.
        */
      var CreationDateTime: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs._Date] = js.undefined
      /**
        * The unique identifier of the global table.
        */
      var GlobalTableArn: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.GlobalTableArnString
          ] = js.undefined
      /**
        * The global table name.
        */
      var GlobalTableName: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableName] = js.undefined
      /**
        * The current state of the global table:    CREATING - The global table is being created.    UPDATING - The global table is being updated.    DELETING - The global table is being deleted.    ACTIVE - The global table is ready for use.  
        */
      var GlobalTableStatus: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.GlobalTableStatus
          ] = js.undefined
      /**
        * The regions where the global table has replicas.
        */
      var ReplicationGroup: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ReplicaDescriptionList
          ] = js.undefined
    }
    
    trait GlobalTableGlobalSecondaryIndexSettingsUpdate extends js.Object {
      /**
        * The name of the global secondary index. The name must be unique among all other indexes on this table.
        */
      var IndexName: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.IndexName
      /**
        * AutoScaling settings for managing a global secondary index's write capacity units.
        */
      var ProvisionedWriteCapacityAutoScalingSettingsUpdate: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.AutoScalingSettingsUpdate
          ] = js.undefined
      /**
        * The maximum number of writes consumed per second before DynamoDB returns a ThrottlingException. 
        */
      var ProvisionedWriteCapacityUnits: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.PositiveLongObject
          ] = js.undefined
    }
    
    trait ItemCollectionKeyAttributeMap
      extends /* key */ org.scalablytyped.runtime.StringDictionary[
              awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.AttributeValue
            ]
    
    trait ItemCollectionMetrics extends js.Object {
      /**
        * The partition key value of the item collection. This value is the same as the partition key value of the item.
        */
      var ItemCollectionKey: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ItemCollectionKeyAttributeMap
          ] = js.undefined
      /**
        * An estimate of item collection size, in gigabytes. This value is a two-element array containing a lower bound and an upper bound for the estimate. The estimate includes the size of all the items in the table, plus the size of all attributes projected into all of the local secondary indexes on that table. Use this estimate to measure whether a local secondary index is approaching its size limit. The estimate is subject to change over time; therefore, do not rely on the precision or accuracy of the estimate.
        */
      var SizeEstimateRangeGB: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ItemCollectionSizeEstimateRange
          ] = js.undefined
    }
    
    trait ItemCollectionMetricsPerTable
      extends /* key */ org.scalablytyped.runtime.StringDictionary[
              awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ItemCollectionMetricsMultiple
            ]
    
    trait ItemResponse extends js.Object {
      /**
        * Map of attribute data consisting of the data type and attribute value.
        */
      var Item: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.AttributeMap
          ] = js.undefined
    }
    
    trait Key
      extends /* key */ org.scalablytyped.runtime.StringDictionary[
              awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.AttributeValue
            ]
    
    trait KeyConditions
      extends /* key */ org.scalablytyped.runtime.StringDictionary[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.Condition]
    
    trait KeySchemaElement extends js.Object {
      /**
        * The name of a key attribute.
        */
      var AttributeName: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.KeySchemaAttributeName
      /**
        * The role that this key attribute will assume:    HASH - partition key    RANGE - sort key    The partition key of an item is also known as its hash attribute. The term "hash attribute" derives from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values. The sort key of an item is also known as its range attribute. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value. 
        */
      var KeyType: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.KeyType
    }
    
    trait KeysAndAttributes extends js.Object {
      /**
        * This is a legacy parameter. Use ProjectionExpression instead. For more information, see Legacy Conditional Parameters in the Amazon DynamoDB Developer Guide.
        */
      var AttributesToGet: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.AttributeNameList
          ] = js.undefined
      /**
        * The consistency of a read operation. If set to true, then a strongly consistent read is used; otherwise, an eventually consistent read is used.
        */
      var ConsistentRead: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ConsistentRead
          ] = js.undefined
      /**
        * One or more substitution tokens for attribute names in an expression. The following are some use cases for using ExpressionAttributeNames:   To access an attribute whose name conflicts with a DynamoDB reserved word.   To create a placeholder for repeating occurrences of an attribute name in an expression.   To prevent special characters in an attribute name from being misinterpreted in an expression.   Use the # character in an expression to dereference an attribute name. For example, consider the following attribute name:    Percentile    The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression. (For the complete list of reserved words, see Reserved Words in the Amazon DynamoDB Developer Guide). To work around this, you could specify the following for ExpressionAttributeNames:    {"#P":"Percentile"}    You could then use this substitution in an expression, as in this example:    #P = :val     Tokens that begin with the : character are expression attribute values, which are placeholders for the actual value at runtime.  For more information on expression attribute names, see Accessing Item Attributes in the Amazon DynamoDB Developer Guide.
        */
      var ExpressionAttributeNames: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ExpressionAttributeNameMap
          ] = js.undefined
      /**
        * The primary key attribute values that define the items and the attributes associated with the items.
        */
      var Keys: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.KeyList
      /**
        * A string that identifies one or more attributes to retrieve from the table. These attributes can include scalars, sets, or elements of a JSON document. The attributes in the ProjectionExpression must be separated by commas. If no attribute names are specified, then all attributes will be returned. If any of the requested attributes are not found, they will not appear in the result. For more information, see Accessing Item Attributes in the Amazon DynamoDB Developer Guide.
        */
      var ProjectionExpression: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ProjectionExpression
          ] = js.undefined
    }
    
    trait ListBackupsInput extends js.Object {
      /**
        * The backups from the table specified by BackupType are listed. Where BackupType can be:    USER - On-demand backup created by you.    SYSTEM - On-demand backup automatically created by DynamoDB.    ALL - All types of on-demand backups (USER and SYSTEM).  
        */
      var BackupType: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BackupTypeFilter
          ] = js.undefined
      /**
        *  LastEvaluatedBackupArn is the ARN of the backup last evaluated when the current page of results was returned, inclusive of the current page of results. This value may be specified as the ExclusiveStartBackupArn of a new ListBackups operation in order to fetch the next page of results. 
        */
      var ExclusiveStartBackupArn: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BackupArn] = js.undefined
      /**
        * Maximum number of backups to return at once.
        */
      var Limit: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BackupsInputLimit
          ] = js.undefined
      /**
        * The backups from the table specified by TableName are listed. 
        */
      var TableName: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableName] = js.undefined
      /**
        * Only backups created after this time are listed. TimeRangeLowerBound is inclusive.
        */
      var TimeRangeLowerBound: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TimeRangeLowerBound
          ] = js.undefined
      /**
        * Only backups created before this time are listed. TimeRangeUpperBound is exclusive. 
        */
      var TimeRangeUpperBound: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TimeRangeUpperBound
          ] = js.undefined
    }
    
    trait ListBackupsOutput extends js.Object {
      /**
        * List of BackupSummary objects.
        */
      var BackupSummaries: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BackupSummaries
          ] = js.undefined
      /**
        *  The ARN of the backup last evaluated when the current page of results was returned, inclusive of the current page of results. This value may be specified as the ExclusiveStartBackupArn of a new ListBackups operation in order to fetch the next page of results.   If LastEvaluatedBackupArn is empty, then the last page of results has been processed and there are no more results to be retrieved.   If LastEvaluatedBackupArn is not empty, this may or may not indicate there is more data to be returned. All results are guaranteed to have been returned if and only if no value for LastEvaluatedBackupArn is returned. 
        */
      var LastEvaluatedBackupArn: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BackupArn] = js.undefined
    }
    
    trait ListGlobalTablesInput extends js.Object {
      /**
        * The first global table name that this operation will evaluate.
        */
      var ExclusiveStartGlobalTableName: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableName] = js.undefined
      /**
        * The maximum number of table names to return.
        */
      var Limit: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.PositiveIntegerObject
          ] = js.undefined
      /**
        * Lists the global tables in a specific region.
        */
      var RegionName: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.RegionName] = js.undefined
    }
    
    trait ListGlobalTablesOutput extends js.Object {
      /**
        * List of global table names.
        */
      var GlobalTables: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.GlobalTableList
          ] = js.undefined
      /**
        * Last evaluated global table name.
        */
      var LastEvaluatedGlobalTableName: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableName] = js.undefined
    }
    
    trait ListTablesInput extends js.Object {
      /**
        * The first table name that this operation will evaluate. Use the value that was returned for LastEvaluatedTableName in a previous operation, so that you can obtain the next page of results.
        */
      var ExclusiveStartTableName: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableName] = js.undefined
      /**
        * A maximum number of table names to return. If this parameter is not specified, the limit is 100.
        */
      var Limit: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ListTablesInputLimit
          ] = js.undefined
    }
    
    trait ListTablesOutput extends js.Object {
      /**
        * The name of the last table in the current page of results. Use this value as the ExclusiveStartTableName in a new request to obtain the next page of results, until all the table names are returned. If you do not receive a LastEvaluatedTableName value in the response, this means that there are no more table names to be retrieved.
        */
      var LastEvaluatedTableName: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableName] = js.undefined
      /**
        * The names of the tables associated with the current account at the current endpoint. The maximum size of this array is 100. If LastEvaluatedTableName also appears in the output, you can use this value as the ExclusiveStartTableName parameter in a subsequent ListTables request and obtain the next page of results.
        */
      var TableNames: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableNameList
          ] = js.undefined
    }
    
    trait ListTagsOfResourceInput extends js.Object {
      /**
        * An optional string that, if supplied, must be copied from the output of a previous call to ListTagOfResource. When provided in this manner, this API fetches the next page of results.
        */
      var NextToken: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.NextTokenString
          ] = js.undefined
      /**
        * The Amazon DynamoDB resource with tags to be listed. This value is an Amazon Resource Name (ARN).
        */
      var ResourceArn: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ResourceArnString
    }
    
    trait ListTagsOfResourceOutput extends js.Object {
      /**
        * If this value is returned, there are additional results to be displayed. To retrieve them, call ListTagsOfResource again, with NextToken set to this value.
        */
      var NextToken: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.NextTokenString
          ] = js.undefined
      /**
        * The tags currently associated with the Amazon DynamoDB resource.
        */
      var Tags: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TagList] = js.undefined
    }
    
    trait LocalSecondaryIndex extends js.Object {
      /**
        * The name of the local secondary index. The name must be unique among all other indexes on this table.
        */
      var IndexName: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.IndexName
      /**
        * The complete key schema for the local secondary index, consisting of one or more pairs of attribute names and key types:    HASH - partition key    RANGE - sort key    The partition key of an item is also known as its hash attribute. The term "hash attribute" derives from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values. The sort key of an item is also known as its range attribute. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value. 
        */
      var KeySchema: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.KeySchema
      /**
        * Represents attributes that are copied (projected) from the table into the local secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. 
        */
      var Projection: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.Projection
    }
    
    trait LocalSecondaryIndexDescription extends js.Object {
      /**
        * The Amazon Resource Name (ARN) that uniquely identifies the index.
        */
      var IndexArn: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.String] = js.undefined
      /**
        * Represents the name of the local secondary index.
        */
      var IndexName: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.IndexName] = js.undefined
      /**
        * The total size of the specified index, in bytes. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.
        */
      var IndexSizeBytes: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.Long] = js.undefined
      /**
        * The number of items in the specified index. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.
        */
      var ItemCount: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.Long] = js.undefined
      /**
        * The complete key schema for the local secondary index, consisting of one or more pairs of attribute names and key types:    HASH - partition key    RANGE - sort key    The partition key of an item is also known as its hash attribute. The term "hash attribute" derives from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values. The sort key of an item is also known as its range attribute. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value. 
        */
      var KeySchema: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.KeySchema] = js.undefined
      /**
        * Represents attributes that are copied (projected) from the table into the global secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. 
        */
      var Projection: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.Projection] = js.undefined
    }
    
    trait LocalSecondaryIndexInfo extends js.Object {
      /**
        * Represents the name of the local secondary index.
        */
      var IndexName: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.IndexName] = js.undefined
      /**
        * The complete key schema for a local secondary index, which consists of one or more pairs of attribute names and key types:    HASH - partition key    RANGE - sort key    The partition key of an item is also known as its hash attribute. The term "hash attribute" derives from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values. The sort key of an item is also known as its range attribute. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value. 
        */
      var KeySchema: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.KeySchema] = js.undefined
      /**
        * Represents attributes that are copied (projected) from the table into the global secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. 
        */
      var Projection: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.Projection] = js.undefined
    }
    
    trait MapAttributeValue
      extends /* key */ org.scalablytyped.runtime.StringDictionary[
              awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.AttributeValue
            ]
    
    trait NumberSet extends js.Object {
      var `type`: awsDashSdkLib.awsDashSdkLibStrings.Number
      var values: js.Array[scala.Double]
    }
    
    trait PointInTimeRecoveryDescription extends js.Object {
      /**
        * Specifies the earliest point in time you can restore your table to. It You can restore your table to any point in time during the last 35 days. 
        */
      var EarliestRestorableDateTime: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs._Date] = js.undefined
      /**
        *  LatestRestorableDateTime is typically 5 minutes before the current time. 
        */
      var LatestRestorableDateTime: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs._Date] = js.undefined
      /**
        * The current state of point in time recovery:    ENABLING - Point in time recovery is being enabled.    ENABLED - Point in time recovery is enabled.    DISABLED - Point in time recovery is disabled.  
        */
      var PointInTimeRecoveryStatus: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.PointInTimeRecoveryStatus
          ] = js.undefined
    }
    
    trait PointInTimeRecoverySpecification extends js.Object {
      /**
        * Indicates whether point in time recovery is enabled (true) or disabled (false) on the table.
        */
      var PointInTimeRecoveryEnabled: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BooleanObject
    }
    
    trait Projection extends js.Object {
      /**
        * Represents the non-key attribute names which will be projected into the index. For local secondary indexes, the total count of NonKeyAttributes summed across all of the local secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts as two distinct attributes when determining the total.
        */
      var NonKeyAttributes: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.NonKeyAttributeNameList
          ] = js.undefined
      /**
        * The set of attributes that are projected into the index:    KEYS_ONLY - Only the index and primary keys are projected into the index.    INCLUDE - Only the specified table attributes are projected into the index. The list of projected attributes are in NonKeyAttributes.    ALL - All of the table attributes are projected into the index.  
        */
      var ProjectionType: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ProjectionType
          ] = js.undefined
    }
    
    trait ProvisionedThroughput extends js.Object {
      /**
        * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a ThrottlingException. For more information, see Specifying Read and Write Requirements in the Amazon DynamoDB Developer Guide. If read/write capacity mode is PAY_PER_REQUEST the value is set to 0.
        */
      var ReadCapacityUnits: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.PositiveLongObject
      /**
        * The maximum number of writes consumed per second before DynamoDB returns a ThrottlingException. For more information, see Specifying Read and Write Requirements in the Amazon DynamoDB Developer Guide. If read/write capacity mode is PAY_PER_REQUEST the value is set to 0.
        */
      var WriteCapacityUnits: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.PositiveLongObject
    }
    
    trait ProvisionedThroughputDescription extends js.Object {
      /**
        * The date and time of the last provisioned throughput decrease for this table.
        */
      var LastDecreaseDateTime: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs._Date] = js.undefined
      /**
        * The date and time of the last provisioned throughput increase for this table.
        */
      var LastIncreaseDateTime: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs._Date] = js.undefined
      /**
        * The number of provisioned throughput decreases for this table during this UTC calendar day. For current maximums on provisioned throughput decreases, see Limits in the Amazon DynamoDB Developer Guide.
        */
      var NumberOfDecreasesToday: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.PositiveLongObject
          ] = js.undefined
      /**
        * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a ThrottlingException. Eventually consistent reads require less effort than strongly consistent reads, so a setting of 50 ReadCapacityUnits per second provides 100 eventually consistent ReadCapacityUnits per second.
        */
      var ReadCapacityUnits: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.NonNegativeLongObject
          ] = js.undefined
      /**
        * The maximum number of writes consumed per second before DynamoDB returns a ThrottlingException.
        */
      var WriteCapacityUnits: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.NonNegativeLongObject
          ] = js.undefined
    }
    
    trait Put extends js.Object {
      /**
        * A condition that must be satisfied in order for a conditional update to succeed.
        */
      var ConditionExpression: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ConditionExpression
          ] = js.undefined
      /**
        * One or more substitution tokens for attribute names in an expression.
        */
      var ExpressionAttributeNames: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ExpressionAttributeNameMap
          ] = js.undefined
      /**
        * One or more values that can be substituted in an expression.
        */
      var ExpressionAttributeValues: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ExpressionAttributeValueMap
          ] = js.undefined
      /**
        * A map of attribute name to attribute values, representing the primary key of the item to be written by PutItem. All of the table's primary key attributes must be specified, and their data types must match those of the table's key schema. If any attributes are present in the item that are part of an index key schema for the table, their types must match the index key schema. 
        */
      var Item: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.PutItemInputAttributeMap
      /**
        * Use ReturnValuesOnConditionCheckFailure to get the item attributes if the Put condition fails. For ReturnValuesOnConditionCheckFailure, the valid values are: NONE and ALL_OLD.
        */
      var ReturnValuesOnConditionCheckFailure: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ReturnValuesOnConditionCheckFailure
          ] = js.undefined
      /**
        * Name of the table in which to write the item.
        */
      var TableName: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableName
    }
    
    trait PutItemInput extends js.Object {
      /**
        * A condition that must be satisfied in order for a conditional PutItem operation to succeed. An expression can contain any of the following:   Functions: attribute_exists | attribute_not_exists | attribute_type | contains | begins_with | size  These function names are case-sensitive.   Comparison operators: = | &lt;&gt; | &lt; | &gt; | &lt;= | &gt;= | BETWEEN | IN      Logical operators: AND | OR | NOT    For more information on condition expressions, see Specifying Conditions in the Amazon DynamoDB Developer Guide.
        */
      var ConditionExpression: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ConditionExpression
          ] = js.undefined
      /**
        * This is a legacy parameter. Use ConditionExpression instead. For more information, see ConditionalOperator in the Amazon DynamoDB Developer Guide.
        */
      var ConditionalOperator: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ConditionalOperator
          ] = js.undefined
      /**
        * This is a legacy parameter. Use ConditionExpression instead. For more information, see Expected in the Amazon DynamoDB Developer Guide.
        */
      var Expected: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ExpectedAttributeMap
          ] = js.undefined
      /**
        * One or more substitution tokens for attribute names in an expression. The following are some use cases for using ExpressionAttributeNames:   To access an attribute whose name conflicts with a DynamoDB reserved word.   To create a placeholder for repeating occurrences of an attribute name in an expression.   To prevent special characters in an attribute name from being misinterpreted in an expression.   Use the # character in an expression to dereference an attribute name. For example, consider the following attribute name:    Percentile    The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression. (For the complete list of reserved words, see Reserved Words in the Amazon DynamoDB Developer Guide). To work around this, you could specify the following for ExpressionAttributeNames:    {"#P":"Percentile"}    You could then use this substitution in an expression, as in this example:    #P = :val     Tokens that begin with the : character are expression attribute values, which are placeholders for the actual value at runtime.  For more information on expression attribute names, see Accessing Item Attributes in the Amazon DynamoDB Developer Guide.
        */
      var ExpressionAttributeNames: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ExpressionAttributeNameMap
          ] = js.undefined
      /**
        * One or more values that can be substituted in an expression. Use the : (colon) character in an expression to dereference an attribute value. For example, suppose that you wanted to check whether the value of the ProductStatus attribute was one of the following:   Available | Backordered | Discontinued  You would first need to specify ExpressionAttributeValues as follows:  { ":avail":{"S":"Available"}, ":back":{"S":"Backordered"}, ":disc":{"S":"Discontinued"} }  You could then use these values in an expression, such as this:  ProductStatus IN (:avail, :back, :disc)  For more information on expression attribute values, see Specifying Conditions in the Amazon DynamoDB Developer Guide.
        */
      var ExpressionAttributeValues: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ExpressionAttributeValueMap
          ] = js.undefined
      /**
        * A map of attribute name/value pairs, one for each attribute. Only the primary key attributes are required; you can optionally provide other attribute name-value pairs for the item. You must provide all of the attributes for the primary key. For example, with a simple primary key, you only need to provide a value for the partition key. For a composite primary key, you must provide both values for both the partition key and the sort key. If you specify any attributes that are part of an index key, then the data types for those attributes must match those of the schema in the table's attribute definition. For more information about primary keys, see Primary Key in the Amazon DynamoDB Developer Guide. Each element in the Item map is an AttributeValue object.
        */
      var Item: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.PutItemInputAttributeMap
      var ReturnConsumedCapacity: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ReturnConsumedCapacity
          ] = js.undefined
      /**
        * Determines whether item collection metrics are returned. If set to SIZE, the response includes statistics about item collections, if any, that were modified during the operation are returned in the response. If set to NONE (the default), no statistics are returned.
        */
      var ReturnItemCollectionMetrics: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ReturnItemCollectionMetrics
          ] = js.undefined
      /**
        * Use ReturnValues if you want to get the item attributes as they appeared before they were updated with the PutItem request. For PutItem, the valid values are:    NONE - If ReturnValues is not specified, or if its value is NONE, then nothing is returned. (This setting is the default for ReturnValues.)    ALL_OLD - If PutItem overwrote an attribute name-value pair, then the content of the old item is returned.    The ReturnValues parameter is used by several DynamoDB operations; however, PutItem does not recognize any values other than NONE or ALL_OLD. 
        */
      var ReturnValues: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ReturnValue
          ] = js.undefined
      /**
        * The name of the table to contain the item.
        */
      var TableName: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableName
    }
    
    trait PutItemInputAttributeMap
      extends /* key */ org.scalablytyped.runtime.StringDictionary[
              awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.AttributeValue
            ]
    
    trait PutItemOutput extends js.Object {
      /**
        * The attribute values as they appeared before the PutItem operation, but only if ReturnValues is specified as ALL_OLD in the request. Each element consists of an attribute name and an attribute value.
        */
      var Attributes: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.AttributeMap
          ] = js.undefined
      /**
        * The capacity units consumed by the PutItem operation. The data returned includes the total provisioned throughput consumed, along with statistics for the table and any indexes involved in the operation. ConsumedCapacity is only returned if the ReturnConsumedCapacity parameter was specified. For more information, see Provisioned Throughput in the Amazon DynamoDB Developer Guide.
        */
      var ConsumedCapacity: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ConsumedCapacity
          ] = js.undefined
      /**
        * Information about item collections, if any, that were affected by the PutItem operation. ItemCollectionMetrics is only returned if the ReturnItemCollectionMetrics parameter was specified. If the table does not have any local secondary indexes, this information is not returned in the response. Each ItemCollectionMetrics element consists of:    ItemCollectionKey - The partition key value of the item collection. This is the same as the partition key value of the item itself.    SizeEstimateRangeGB - An estimate of item collection size, in gigabytes. This value is a two-element array containing a lower bound and an upper bound for the estimate. The estimate includes the size of all the items in the table, plus the size of all attributes projected into all of the local secondary indexes on that table. Use this estimate to measure whether a local secondary index is approaching its size limit. The estimate is subject to change over time; therefore, do not rely on the precision or accuracy of the estimate.  
        */
      var ItemCollectionMetrics: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ItemCollectionMetrics
          ] = js.undefined
    }
    
    trait PutRequest extends js.Object {
      /**
        * A map of attribute name to attribute values, representing the primary key of an item to be processed by PutItem. All of the table's primary key attributes must be specified, and their data types must match those of the table's key schema. If any attributes are present in the item which are part of an index key schema for the table, their types must match the index key schema.
        */
      var Item: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.PutItemInputAttributeMap
    }
    
    trait QueryInput extends js.Object {
      /**
        * This is a legacy parameter. Use ProjectionExpression instead. For more information, see AttributesToGet in the Amazon DynamoDB Developer Guide.
        */
      var AttributesToGet: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.AttributeNameList
          ] = js.undefined
      /**
        * This is a legacy parameter. Use FilterExpression instead. For more information, see ConditionalOperator in the Amazon DynamoDB Developer Guide.
        */
      var ConditionalOperator: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ConditionalOperator
          ] = js.undefined
      /**
        * Determines the read consistency model: If set to true, then the operation uses strongly consistent reads; otherwise, the operation uses eventually consistent reads. Strongly consistent reads are not supported on global secondary indexes. If you query a global secondary index with ConsistentRead set to true, you will receive a ValidationException.
        */
      var ConsistentRead: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ConsistentRead
          ] = js.undefined
      /**
        * The primary key of the first item that this operation will evaluate. Use the value that was returned for LastEvaluatedKey in the previous operation. The data type for ExclusiveStartKey must be String, Number or Binary. No set data types are allowed.
        */
      var ExclusiveStartKey: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.Key] = js.undefined
      /**
        * One or more substitution tokens for attribute names in an expression. The following are some use cases for using ExpressionAttributeNames:   To access an attribute whose name conflicts with a DynamoDB reserved word.   To create a placeholder for repeating occurrences of an attribute name in an expression.   To prevent special characters in an attribute name from being misinterpreted in an expression.   Use the # character in an expression to dereference an attribute name. For example, consider the following attribute name:    Percentile    The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression. (For the complete list of reserved words, see Reserved Words in the Amazon DynamoDB Developer Guide). To work around this, you could specify the following for ExpressionAttributeNames:    {"#P":"Percentile"}    You could then use this substitution in an expression, as in this example:    #P = :val     Tokens that begin with the : character are expression attribute values, which are placeholders for the actual value at runtime.  For more information on expression attribute names, see Accessing Item Attributes in the Amazon DynamoDB Developer Guide.
        */
      var ExpressionAttributeNames: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ExpressionAttributeNameMap
          ] = js.undefined
      /**
        * One or more values that can be substituted in an expression. Use the : (colon) character in an expression to dereference an attribute value. For example, suppose that you wanted to check whether the value of the ProductStatus attribute was one of the following:   Available | Backordered | Discontinued  You would first need to specify ExpressionAttributeValues as follows:  { ":avail":{"S":"Available"}, ":back":{"S":"Backordered"}, ":disc":{"S":"Discontinued"} }  You could then use these values in an expression, such as this:  ProductStatus IN (:avail, :back, :disc)  For more information on expression attribute values, see Specifying Conditions in the Amazon DynamoDB Developer Guide.
        */
      var ExpressionAttributeValues: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ExpressionAttributeValueMap
          ] = js.undefined
      /**
        * A string that contains conditions that DynamoDB applies after the Query operation, but before the data is returned to you. Items that do not satisfy the FilterExpression criteria are not returned. A FilterExpression does not allow key attributes. You cannot define a filter expression based on a partition key or a sort key.  A FilterExpression is applied after the items have already been read; the process of filtering does not consume any additional read capacity units.  For more information, see Filter Expressions in the Amazon DynamoDB Developer Guide.
        */
      var FilterExpression: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ConditionExpression
          ] = js.undefined
      /**
        * The name of an index to query. This index can be any local secondary index or global secondary index on the table. Note that if you use the IndexName parameter, you must also provide TableName. 
        */
      var IndexName: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.IndexName] = js.undefined
      /**
        * The condition that specifies the key value(s) for items to be retrieved by the Query action. The condition must perform an equality test on a single partition key value. The condition can optionally perform one of several comparison tests on a single sort key value. This allows Query to retrieve one item with a given partition key value and sort key value, or several items that have the same partition key value but different sort key values. The partition key equality test is required, and must be specified in the following format:  partitionKeyName = :partitionkeyval  If you also want to provide a condition for the sort key, it must be combined using AND with the condition for the sort key. Following is an example, using the = comparison operator for the sort key:  partitionKeyName = :partitionkeyval AND sortKeyName = :sortkeyval  Valid comparisons for the sort key condition are as follows:    sortKeyName = :sortkeyval - true if the sort key value is equal to :sortkeyval.    sortKeyName &lt; :sortkeyval - true if the sort key value is less than :sortkeyval.    sortKeyName &lt;= :sortkeyval - true if the sort key value is less than or equal to :sortkeyval.    sortKeyName &gt; :sortkeyval - true if the sort key value is greater than :sortkeyval.    sortKeyName &gt;=  :sortkeyval - true if the sort key value is greater than or equal to :sortkeyval.    sortKeyName BETWEEN :sortkeyval1 AND :sortkeyval2 - true if the sort key value is greater than or equal to :sortkeyval1, and less than or equal to :sortkeyval2.    begins_with ( sortKeyName, :sortkeyval ) - true if the sort key value begins with a particular operand. (You cannot use this function with a sort key that is of type Number.) Note that the function name begins_with is case-sensitive.   Use the ExpressionAttributeValues parameter to replace tokens such as :partitionval and :sortval with actual values at runtime. You can optionally use the ExpressionAttributeNames parameter to replace the names of the partition key and sort key with placeholder tokens. This option might be necessary if an attribute name conflicts with a DynamoDB reserved word. For example, the following KeyConditionExpression parameter causes an error because Size is a reserved word:    Size = :myval    To work around this, define a placeholder (such a #S) to represent the attribute name Size. KeyConditionExpression then is as follows:    #S = :myval    For a list of reserved words, see Reserved Words in the Amazon DynamoDB Developer Guide. For more information on ExpressionAttributeNames and ExpressionAttributeValues, see Using Placeholders for Attribute Names and Values in the Amazon DynamoDB Developer Guide.
        */
      var KeyConditionExpression: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.KeyExpression
          ] = js.undefined
      /**
        * This is a legacy parameter. Use KeyConditionExpression instead. For more information, see KeyConditions in the Amazon DynamoDB Developer Guide.
        */
      var KeyConditions: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.KeyConditions
          ] = js.undefined
      /**
        * The maximum number of items to evaluate (not necessarily the number of matching items). If DynamoDB processes the number of items up to the limit while processing the results, it stops the operation and returns the matching values up to that point, and a key in LastEvaluatedKey to apply in a subsequent operation, so that you can pick up where you left off. Also, if the processed data set size exceeds 1 MB before DynamoDB reaches this limit, it stops the operation and returns the matching values up to the limit, and a key in LastEvaluatedKey to apply in a subsequent operation to continue the operation. For more information, see Query and Scan in the Amazon DynamoDB Developer Guide.
        */
      var Limit: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.PositiveIntegerObject
          ] = js.undefined
      /**
        * A string that identifies one or more attributes to retrieve from the table. These attributes can include scalars, sets, or elements of a JSON document. The attributes in the expression must be separated by commas. If no attribute names are specified, then all attributes will be returned. If any of the requested attributes are not found, they will not appear in the result. For more information, see Accessing Item Attributes in the Amazon DynamoDB Developer Guide.
        */
      var ProjectionExpression: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ProjectionExpression
          ] = js.undefined
      /**
        * This is a legacy parameter. Use FilterExpression instead. For more information, see QueryFilter in the Amazon DynamoDB Developer Guide.
        */
      var QueryFilter: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.FilterConditionMap
          ] = js.undefined
      var ReturnConsumedCapacity: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ReturnConsumedCapacity
          ] = js.undefined
      /**
        * Specifies the order for index traversal: If true (default), the traversal is performed in ascending order; if false, the traversal is performed in descending order.  Items with the same partition key value are stored in sorted order by sort key. If the sort key data type is Number, the results are stored in numeric order. For type String, the results are stored in order of UTF-8 bytes. For type Binary, DynamoDB treats each byte of the binary data as unsigned. If ScanIndexForward is true, DynamoDB returns the results in the order in which they are stored (by sort key value). This is the default behavior. If ScanIndexForward is false, DynamoDB reads the results in reverse order by sort key value, and then returns the results to the client.
        */
      var ScanIndexForward: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BooleanObject
          ] = js.undefined
      /**
        * The attributes to be returned in the result. You can retrieve all item attributes, specific item attributes, the count of matching items, or in the case of an index, some or all of the attributes projected into the index.    ALL_ATTRIBUTES - Returns all of the item attributes from the specified table or index. If you query a local secondary index, then for each matching item in the index DynamoDB will fetch the entire item from the parent table. If the index is configured to project all item attributes, then all of the data can be obtained from the local secondary index, and no fetching is required.    ALL_PROJECTED_ATTRIBUTES - Allowed only when querying an index. Retrieves all attributes that have been projected into the index. If the index is configured to project all attributes, this return value is equivalent to specifying ALL_ATTRIBUTES.    COUNT - Returns the number of matching items, rather than the matching items themselves.    SPECIFIC_ATTRIBUTES - Returns only the attributes listed in AttributesToGet. This return value is equivalent to specifying AttributesToGet without specifying any value for Select. If you query or scan a local secondary index and request only attributes that are projected into that index, the operation will read only the index and not the table. If any of the requested attributes are not projected into the local secondary index, DynamoDB will fetch each of these attributes from the parent table. This extra fetching incurs additional throughput cost and latency. If you query or scan a global secondary index, you can only request attributes that are projected into the index. Global secondary index queries cannot fetch attributes from the parent table.   If neither Select nor AttributesToGet are specified, DynamoDB defaults to ALL_ATTRIBUTES when accessing a table, and ALL_PROJECTED_ATTRIBUTES when accessing an index. You cannot use both Select and AttributesToGet together in a single request, unless the value for Select is SPECIFIC_ATTRIBUTES. (This usage is equivalent to specifying AttributesToGet without any value for Select.)  If you use the ProjectionExpression parameter, then the value for Select can only be SPECIFIC_ATTRIBUTES. Any other value for Select will return an error. 
        */
      var Select: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.Select] = js.undefined
      /**
        * The name of the table containing the requested items.
        */
      var TableName: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableName
    }
    
    trait QueryOutput extends js.Object {
      /**
        * The capacity units consumed by the Query operation. The data returned includes the total provisioned throughput consumed, along with statistics for the table and any indexes involved in the operation. ConsumedCapacity is only returned if the ReturnConsumedCapacity parameter was specified For more information, see Provisioned Throughput in the Amazon DynamoDB Developer Guide.
        */
      var ConsumedCapacity: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ConsumedCapacity
          ] = js.undefined
      /**
        * The number of items in the response. If you used a QueryFilter in the request, then Count is the number of items returned after the filter was applied, and ScannedCount is the number of matching items before the filter was applied. If you did not use a filter in the request, then Count and ScannedCount are the same.
        */
      var Count: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.Integer] = js.undefined
      /**
        * An array of item attributes that match the query criteria. Each element in this array consists of an attribute name and the value for that attribute.
        */
      var Items: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ItemList] = js.undefined
      /**
        * The primary key of the item where the operation stopped, inclusive of the previous result set. Use this value to start a new operation, excluding this value in the new request. If LastEvaluatedKey is empty, then the "last page" of results has been processed and there is no more data to be retrieved. If LastEvaluatedKey is not empty, it does not necessarily mean that there is more data in the result set. The only way to know when you have reached the end of the result set is when LastEvaluatedKey is empty.
        */
      var LastEvaluatedKey: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.Key] = js.undefined
      /**
        * The number of items evaluated, before any QueryFilter is applied. A high ScannedCount value with few, or no, Count results indicates an inefficient Query operation. For more information, see Count and ScannedCount in the Amazon DynamoDB Developer Guide. If you did not use a filter in the request, then ScannedCount is the same as Count.
        */
      var ScannedCount: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.Integer] = js.undefined
    }
    
    trait Replica extends js.Object {
      /**
        * The region where the replica needs to be created.
        */
      var RegionName: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.RegionName] = js.undefined
    }
    
    trait ReplicaDescription extends js.Object {
      /**
        * The name of the region.
        */
      var RegionName: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.RegionName] = js.undefined
    }
    
    trait ReplicaGlobalSecondaryIndexSettingsDescription extends js.Object {
      /**
        * The name of the global secondary index. The name must be unique among all other indexes on this table.
        */
      var IndexName: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.IndexName
      /**
        *  The current status of the global secondary index:    CREATING - The global secondary index is being created.    UPDATING - The global secondary index is being updated.    DELETING - The global secondary index is being deleted.    ACTIVE - The global secondary index is ready for use.  
        */
      var IndexStatus: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.IndexStatus
          ] = js.undefined
      /**
        * Autoscaling settings for a global secondary index replica's read capacity units.
        */
      var ProvisionedReadCapacityAutoScalingSettings: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.AutoScalingSettingsDescription
          ] = js.undefined
      /**
        * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a ThrottlingException.
        */
      var ProvisionedReadCapacityUnits: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.PositiveLongObject
          ] = js.undefined
      /**
        * AutoScaling settings for a global secondary index replica's write capacity units.
        */
      var ProvisionedWriteCapacityAutoScalingSettings: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.AutoScalingSettingsDescription
          ] = js.undefined
      /**
        * The maximum number of writes consumed per second before DynamoDB returns a ThrottlingException.
        */
      var ProvisionedWriteCapacityUnits: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.PositiveLongObject
          ] = js.undefined
    }
    
    trait ReplicaGlobalSecondaryIndexSettingsUpdate extends js.Object {
      /**
        * The name of the global secondary index. The name must be unique among all other indexes on this table.
        */
      var IndexName: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.IndexName
      /**
        * Autoscaling settings for managing a global secondary index replica's read capacity units.
        */
      var ProvisionedReadCapacityAutoScalingSettingsUpdate: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.AutoScalingSettingsUpdate
          ] = js.undefined
      /**
        * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a ThrottlingException.
        */
      var ProvisionedReadCapacityUnits: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.PositiveLongObject
          ] = js.undefined
    }
    
    trait ReplicaSettingsDescription extends js.Object {
      /**
        * The region name of the replica.
        */
      var RegionName: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.RegionName
      /**
        * The read/write capacity mode of the replica.
        */
      var ReplicaBillingModeSummary: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BillingModeSummary
          ] = js.undefined
      /**
        * Replica global secondary index settings for the global table.
        */
      var ReplicaGlobalSecondaryIndexSettings: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ReplicaGlobalSecondaryIndexSettingsDescriptionList
          ] = js.undefined
      /**
        * Autoscaling settings for a global table replica's read capacity units.
        */
      var ReplicaProvisionedReadCapacityAutoScalingSettings: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.AutoScalingSettingsDescription
          ] = js.undefined
      /**
        * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a ThrottlingException. For more information, see Specifying Read and Write Requirements in the Amazon DynamoDB Developer Guide. 
        */
      var ReplicaProvisionedReadCapacityUnits: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.NonNegativeLongObject
          ] = js.undefined
      /**
        * AutoScaling settings for a global table replica's write capacity units.
        */
      var ReplicaProvisionedWriteCapacityAutoScalingSettings: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.AutoScalingSettingsDescription
          ] = js.undefined
      /**
        * The maximum number of writes consumed per second before DynamoDB returns a ThrottlingException. For more information, see Specifying Read and Write Requirements in the Amazon DynamoDB Developer Guide.
        */
      var ReplicaProvisionedWriteCapacityUnits: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.NonNegativeLongObject
          ] = js.undefined
      /**
        * The current state of the region:    CREATING - The region is being created.    UPDATING - The region is being updated.    DELETING - The region is being deleted.    ACTIVE - The region is ready for use.  
        */
      var ReplicaStatus: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ReplicaStatus
          ] = js.undefined
    }
    
    trait ReplicaSettingsUpdate extends js.Object {
      /**
        * The region of the replica to be added.
        */
      var RegionName: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.RegionName
      /**
        * Represents the settings of a global secondary index for a global table that will be modified.
        */
      var ReplicaGlobalSecondaryIndexSettingsUpdate: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ReplicaGlobalSecondaryIndexSettingsUpdateList
          ] = js.undefined
      /**
        * Autoscaling settings for managing a global table replica's read capacity units.
        */
      var ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.AutoScalingSettingsUpdate
          ] = js.undefined
      /**
        * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a ThrottlingException. For more information, see Specifying Read and Write Requirements in the Amazon DynamoDB Developer Guide. 
        */
      var ReplicaProvisionedReadCapacityUnits: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.PositiveLongObject
          ] = js.undefined
    }
    
    trait ReplicaUpdate extends js.Object {
      /**
        * The parameters required for creating a replica on an existing global table.
        */
      var Create: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.CreateReplicaAction
          ] = js.undefined
      /**
        * The name of the existing replica to be removed.
        */
      var Delete: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.DeleteReplicaAction
          ] = js.undefined
    }
    
    trait RestoreSummary extends js.Object {
      /**
        * Point in time or source backup time.
        */
      var RestoreDateTime: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs._Date
      /**
        * Indicates if a restore is in progress or not.
        */
      var RestoreInProgress: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.RestoreInProgress
      /**
        * ARN of the backup from which the table was restored.
        */
      var SourceBackupArn: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BackupArn] = js.undefined
      /**
        * ARN of the source table of the backup that is being restored.
        */
      var SourceTableArn: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableArn] = js.undefined
    }
    
    trait RestoreTableFromBackupInput extends js.Object {
      /**
        * The ARN associated with the backup.
        */
      var BackupArn: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BackupArn
      /**
        * The name of the new table to which the backup must be restored.
        */
      var TargetTableName: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableName
    }
    
    trait RestoreTableFromBackupOutput extends js.Object {
      /**
        * The description of the table created from an existing backup.
        */
      var TableDescription: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableDescription
          ] = js.undefined
    }
    
    trait RestoreTableToPointInTimeInput extends js.Object {
      /**
        * Time in the past to restore the table to.
        */
      var RestoreDateTime: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs._Date] = js.undefined
      /**
        * Name of the source table that is being restored.
        */
      var SourceTableName: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableName
      /**
        * The name of the new table to which it must be restored to.
        */
      var TargetTableName: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableName
      /**
        * Restore the table to the latest possible time. LatestRestorableDateTime is typically 5 minutes before the current time. 
        */
      var UseLatestRestorableTime: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BooleanObject
          ] = js.undefined
    }
    
    trait RestoreTableToPointInTimeOutput extends js.Object {
      /**
        * Represents the properties of a table.
        */
      var TableDescription: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableDescription
          ] = js.undefined
    }
    
    trait SSEDescription extends js.Object {
      /**
        * The KMS master key ARN used for the KMS encryption.
        */
      var KMSMasterKeyArn: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.KMSMasterKeyArn
          ] = js.undefined
      /**
        * Server-side encryption type:    AES256 - Server-side encryption which uses the AES256 algorithm (not applicable).    KMS - Server-side encryption which uses AWS Key Management Service. Key is stored in your account and is managed by AWS KMS (KMS charges apply).  
        */
      var SSEType: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.SSEType] = js.undefined
      /**
        * The current state of server-side encryption:    ENABLING - Server-side encryption is being enabled.    ENABLED - Server-side encryption is enabled.    DISABLING - Server-side encryption is being disabled.    DISABLED - Server-side encryption is disabled.    UPDATING - Server-side encryption is being updated.  
        */
      var Status: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.SSEStatus] = js.undefined
    }
    
    trait SSESpecification extends js.Object {
      /**
        * Indicates whether server-side encryption is enabled (true) or disabled (false) on the table. If enabled (true), server-side encryption type is set to KMS. If disabled (false) or not specified, server-side encryption is set to AWS owned CMK.
        */
      var Enabled: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.SSEEnabled] = js.undefined
      /**
        * The KMS Master Key (CMK) which should be used for the KMS encryption. To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. Note that you should only provide this parameter if the key is different from the default DynamoDB KMS Master Key alias/aws/dynamodb.
        */
      var KMSMasterKeyId: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.KMSMasterKeyId
          ] = js.undefined
      /**
        * Server-side encryption type:    AES256 - Server-side encryption which uses the AES256 algorithm (not applicable).    KMS - Server-side encryption which uses AWS Key Management Service. Key is stored in your account and is managed by AWS KMS (KMS charges apply).  
        */
      var SSEType: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.SSEType] = js.undefined
    }
    
    trait ScanInput extends js.Object {
      /**
        * This is a legacy parameter. Use ProjectionExpression instead. For more information, see AttributesToGet in the Amazon DynamoDB Developer Guide.
        */
      var AttributesToGet: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.AttributeNameList
          ] = js.undefined
      /**
        * This is a legacy parameter. Use FilterExpression instead. For more information, see ConditionalOperator in the Amazon DynamoDB Developer Guide.
        */
      var ConditionalOperator: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ConditionalOperator
          ] = js.undefined
      /**
        * A Boolean value that determines the read consistency model during the scan:   If ConsistentRead is false, then the data returned from Scan might not contain the results from other recently completed write operations (PutItem, UpdateItem or DeleteItem).   If ConsistentRead is true, then all of the write operations that completed before the Scan began are guaranteed to be contained in the Scan response.   The default setting for ConsistentRead is false. The ConsistentRead parameter is not supported on global secondary indexes. If you scan a global secondary index with ConsistentRead set to true, you will receive a ValidationException.
        */
      var ConsistentRead: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ConsistentRead
          ] = js.undefined
      /**
        * The primary key of the first item that this operation will evaluate. Use the value that was returned for LastEvaluatedKey in the previous operation. The data type for ExclusiveStartKey must be String, Number or Binary. No set data types are allowed. In a parallel scan, a Scan request that includes ExclusiveStartKey must specify the same segment whose previous Scan returned the corresponding value of LastEvaluatedKey.
        */
      var ExclusiveStartKey: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.Key] = js.undefined
      /**
        * One or more substitution tokens for attribute names in an expression. The following are some use cases for using ExpressionAttributeNames:   To access an attribute whose name conflicts with a DynamoDB reserved word.   To create a placeholder for repeating occurrences of an attribute name in an expression.   To prevent special characters in an attribute name from being misinterpreted in an expression.   Use the # character in an expression to dereference an attribute name. For example, consider the following attribute name:    Percentile    The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression. (For the complete list of reserved words, see Reserved Words in the Amazon DynamoDB Developer Guide). To work around this, you could specify the following for ExpressionAttributeNames:    {"#P":"Percentile"}    You could then use this substitution in an expression, as in this example:    #P = :val     Tokens that begin with the : character are expression attribute values, which are placeholders for the actual value at runtime.  For more information on expression attribute names, see Accessing Item Attributes in the Amazon DynamoDB Developer Guide.
        */
      var ExpressionAttributeNames: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ExpressionAttributeNameMap
          ] = js.undefined
      /**
        * One or more values that can be substituted in an expression. Use the : (colon) character in an expression to dereference an attribute value. For example, suppose that you wanted to check whether the value of the ProductStatus attribute was one of the following:   Available | Backordered | Discontinued  You would first need to specify ExpressionAttributeValues as follows:  { ":avail":{"S":"Available"}, ":back":{"S":"Backordered"}, ":disc":{"S":"Discontinued"} }  You could then use these values in an expression, such as this:  ProductStatus IN (:avail, :back, :disc)  For more information on expression attribute values, see Specifying Conditions in the Amazon DynamoDB Developer Guide.
        */
      var ExpressionAttributeValues: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ExpressionAttributeValueMap
          ] = js.undefined
      /**
        * A string that contains conditions that DynamoDB applies after the Scan operation, but before the data is returned to you. Items that do not satisfy the FilterExpression criteria are not returned.  A FilterExpression is applied after the items have already been read; the process of filtering does not consume any additional read capacity units.  For more information, see Filter Expressions in the Amazon DynamoDB Developer Guide.
        */
      var FilterExpression: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ConditionExpression
          ] = js.undefined
      /**
        * The name of a secondary index to scan. This index can be any local secondary index or global secondary index. Note that if you use the IndexName parameter, you must also provide TableName.
        */
      var IndexName: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.IndexName] = js.undefined
      /**
        * The maximum number of items to evaluate (not necessarily the number of matching items). If DynamoDB processes the number of items up to the limit while processing the results, it stops the operation and returns the matching values up to that point, and a key in LastEvaluatedKey to apply in a subsequent operation, so that you can pick up where you left off. Also, if the processed data set size exceeds 1 MB before DynamoDB reaches this limit, it stops the operation and returns the matching values up to the limit, and a key in LastEvaluatedKey to apply in a subsequent operation to continue the operation. For more information, see Query and Scan in the Amazon DynamoDB Developer Guide.
        */
      var Limit: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.PositiveIntegerObject
          ] = js.undefined
      /**
        * A string that identifies one or more attributes to retrieve from the specified table or index. These attributes can include scalars, sets, or elements of a JSON document. The attributes in the expression must be separated by commas. If no attribute names are specified, then all attributes will be returned. If any of the requested attributes are not found, they will not appear in the result. For more information, see Accessing Item Attributes in the Amazon DynamoDB Developer Guide.
        */
      var ProjectionExpression: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ProjectionExpression
          ] = js.undefined
      var ReturnConsumedCapacity: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ReturnConsumedCapacity
          ] = js.undefined
      /**
        * This is a legacy parameter. Use FilterExpression instead. For more information, see ScanFilter in the Amazon DynamoDB Developer Guide.
        */
      var ScanFilter: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.FilterConditionMap
          ] = js.undefined
      /**
        * For a parallel Scan request, Segment identifies an individual segment to be scanned by an application worker. Segment IDs are zero-based, so the first segment is always 0. For example, if you want to use four application threads to scan a table or an index, then the first thread specifies a Segment value of 0, the second thread specifies 1, and so on. The value of LastEvaluatedKey returned from a parallel Scan request must be used as ExclusiveStartKey with the same segment ID in a subsequent Scan operation. The value for Segment must be greater than or equal to 0, and less than the value provided for TotalSegments. If you provide Segment, you must also provide TotalSegments.
        */
      var Segment: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ScanSegment
          ] = js.undefined
      /**
        * The attributes to be returned in the result. You can retrieve all item attributes, specific item attributes, the count of matching items, or in the case of an index, some or all of the attributes projected into the index.    ALL_ATTRIBUTES - Returns all of the item attributes from the specified table or index. If you query a local secondary index, then for each matching item in the index DynamoDB will fetch the entire item from the parent table. If the index is configured to project all item attributes, then all of the data can be obtained from the local secondary index, and no fetching is required.    ALL_PROJECTED_ATTRIBUTES - Allowed only when querying an index. Retrieves all attributes that have been projected into the index. If the index is configured to project all attributes, this return value is equivalent to specifying ALL_ATTRIBUTES.    COUNT - Returns the number of matching items, rather than the matching items themselves.    SPECIFIC_ATTRIBUTES - Returns only the attributes listed in AttributesToGet. This return value is equivalent to specifying AttributesToGet without specifying any value for Select. If you query or scan a local secondary index and request only attributes that are projected into that index, the operation will read only the index and not the table. If any of the requested attributes are not projected into the local secondary index, DynamoDB will fetch each of these attributes from the parent table. This extra fetching incurs additional throughput cost and latency. If you query or scan a global secondary index, you can only request attributes that are projected into the index. Global secondary index queries cannot fetch attributes from the parent table.   If neither Select nor AttributesToGet are specified, DynamoDB defaults to ALL_ATTRIBUTES when accessing a table, and ALL_PROJECTED_ATTRIBUTES when accessing an index. You cannot use both Select and AttributesToGet together in a single request, unless the value for Select is SPECIFIC_ATTRIBUTES. (This usage is equivalent to specifying AttributesToGet without any value for Select.)  If you use the ProjectionExpression parameter, then the value for Select can only be SPECIFIC_ATTRIBUTES. Any other value for Select will return an error. 
        */
      var Select: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.Select] = js.undefined
      /**
        * The name of the table containing the requested items; or, if you provide IndexName, the name of the table to which that index belongs.
        */
      var TableName: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableName
      /**
        * For a parallel Scan request, TotalSegments represents the total number of segments into which the Scan operation will be divided. The value of TotalSegments corresponds to the number of application workers that will perform the parallel scan. For example, if you want to use four application threads to scan a table or an index, specify a TotalSegments value of 4. The value for TotalSegments must be greater than or equal to 1, and less than or equal to 1000000. If you specify a TotalSegments value of 1, the Scan operation will be sequential rather than parallel. If you specify TotalSegments, you must also specify Segment.
        */
      var TotalSegments: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ScanTotalSegments
          ] = js.undefined
    }
    
    trait ScanOutput extends js.Object {
      /**
        * The capacity units consumed by the Scan operation. The data returned includes the total provisioned throughput consumed, along with statistics for the table and any indexes involved in the operation. ConsumedCapacity is only returned if the ReturnConsumedCapacity parameter was specified. For more information, see Provisioned Throughput in the Amazon DynamoDB Developer Guide.
        */
      var ConsumedCapacity: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ConsumedCapacity
          ] = js.undefined
      /**
        * The number of items in the response. If you set ScanFilter in the request, then Count is the number of items returned after the filter was applied, and ScannedCount is the number of matching items before the filter was applied. If you did not use a filter in the request, then Count is the same as ScannedCount.
        */
      var Count: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.Integer] = js.undefined
      /**
        * An array of item attributes that match the scan criteria. Each element in this array consists of an attribute name and the value for that attribute.
        */
      var Items: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ItemList] = js.undefined
      /**
        * The primary key of the item where the operation stopped, inclusive of the previous result set. Use this value to start a new operation, excluding this value in the new request. If LastEvaluatedKey is empty, then the "last page" of results has been processed and there is no more data to be retrieved. If LastEvaluatedKey is not empty, it does not necessarily mean that there is more data in the result set. The only way to know when you have reached the end of the result set is when LastEvaluatedKey is empty.
        */
      var LastEvaluatedKey: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.Key] = js.undefined
      /**
        * The number of items evaluated, before any ScanFilter is applied. A high ScannedCount value with few, or no, Count results indicates an inefficient Scan operation. For more information, see Count and ScannedCount in the Amazon DynamoDB Developer Guide. If you did not use a filter in the request, then ScannedCount is the same as Count.
        */
      var ScannedCount: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.Integer] = js.undefined
    }
    
    trait SecondaryIndexesCapacityMap
      extends /* key */ org.scalablytyped.runtime.StringDictionary[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.Capacity]
    
    trait SourceTableDetails extends js.Object {
      /**
        * Controls how you are charged for read and write throughput and how you manage capacity. This setting can be changed later.    PROVISIONED - Sets the read/write capacity mode to PROVISIONED. We recommend using PROVISIONED for predictable workloads.    PAY_PER_REQUEST - Sets the read/write capacity mode to PAY_PER_REQUEST. We recommend using PAY_PER_REQUEST for unpredictable workloads.   
        */
      var BillingMode: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BillingMode
          ] = js.undefined
      /**
        * Number of items in the table. Please note this is an approximate value. 
        */
      var ItemCount: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ItemCount] = js.undefined
      /**
        * Schema of the table. 
        */
      var KeySchema: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.KeySchema
      /**
        * Read IOPs and Write IOPS on the table when the backup was created.
        */
      var ProvisionedThroughput: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ProvisionedThroughput
      /**
        * ARN of the table for which backup was created. 
        */
      var TableArn: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableArn] = js.undefined
      /**
        * Time when the source table was created. 
        */
      var TableCreationDateTime: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableCreationDateTime
      /**
        * Unique identifier for the table for which the backup was created. 
        */
      var TableId: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableId
      /**
        * The name of the table for which the backup was created. 
        */
      var TableName: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableName
      /**
        * Size of the table in bytes. Please note this is an approximate value.
        */
      var TableSizeBytes: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.Long] = js.undefined
    }
    
    trait SourceTableFeatureDetails extends js.Object {
      /**
        * Represents the GSI properties for the table when the backup was created. It includes the IndexName, KeySchema, Projection and ProvisionedThroughput for the GSIs on the table at the time of backup. 
        */
      var GlobalSecondaryIndexes: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.GlobalSecondaryIndexes
          ] = js.undefined
      /**
        * Represents the LSI properties for the table when the backup was created. It includes the IndexName, KeySchema and Projection for the LSIs on the table at the time of backup. 
        */
      var LocalSecondaryIndexes: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.LocalSecondaryIndexes
          ] = js.undefined
      /**
        * The description of the server-side encryption status on the table when the backup was created.
        */
      var SSEDescription: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.SSEDescription
          ] = js.undefined
      /**
        * Stream settings on the table when the backup was created.
        */
      var StreamDescription: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.StreamSpecification
          ] = js.undefined
      /**
        * Time to Live settings on the table when the backup was created.
        */
      var TimeToLiveDescription: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TimeToLiveDescription
          ] = js.undefined
    }
    
    trait StreamSpecification extends js.Object {
      /**
        * Indicates whether DynamoDB Streams is enabled (true) or disabled (false) on the table.
        */
      var StreamEnabled: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.StreamEnabled
          ] = js.undefined
      /**
        *  When an item in the table is modified, StreamViewType determines what information is written to the stream for this table. Valid values for StreamViewType are:    KEYS_ONLY - Only the key attributes of the modified item are written to the stream.    NEW_IMAGE - The entire item, as it appears after it was modified, is written to the stream.    OLD_IMAGE - The entire item, as it appeared before it was modified, is written to the stream.    NEW_AND_OLD_IMAGES - Both the new and the old item images of the item are written to the stream.  
        */
      var StreamViewType: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.StreamViewType
          ] = js.undefined
    }
    
    trait StringSet extends js.Object {
      var `type`: awsDashSdkLib.awsDashSdkLibStrings.String
      var values: js.Array[java.lang.String]
    }
    
    trait TableDescription extends js.Object {
      /**
        * An array of AttributeDefinition objects. Each of these objects describes one attribute in the table and index key schema. Each AttributeDefinition object in this array is composed of:    AttributeName - The name of the attribute.    AttributeType - The data type for the attribute.  
        */
      var AttributeDefinitions: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.AttributeDefinitions
          ] = js.undefined
      /**
        * Contains the details for the read/write capacity mode.
        */
      var BillingModeSummary: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BillingModeSummary
          ] = js.undefined
      /**
        * The date and time when the table was created, in UNIX epoch time format.
        */
      var CreationDateTime: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs._Date] = js.undefined
      /**
        * The global secondary indexes, if any, on the table. Each index is scoped to a given partition key value. Each element is composed of:    Backfilling - If true, then the index is currently in the backfilling phase. Backfilling occurs only when a new global secondary index is added to the table; it is the process by which DynamoDB populates the new index with data from the table. (This attribute does not appear for indexes that were created during a CreateTable operation.)    IndexName - The name of the global secondary index.    IndexSizeBytes - The total size of the global secondary index, in bytes. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.     IndexStatus - The current status of the global secondary index:    CREATING - The index is being created.    UPDATING - The index is being updated.    DELETING - The index is being deleted.    ACTIVE - The index is ready for use.      ItemCount - The number of items in the global secondary index. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.     KeySchema - Specifies the complete index key schema. The attribute names in the key schema must be between 1 and 255 characters (inclusive). The key schema must begin with the same partition key as the table.    Projection - Specifies attributes that are copied (projected) from the table into the index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. Each attribute specification is composed of:    ProjectionType - One of the following:    KEYS_ONLY - Only the index and primary keys are projected into the index.    INCLUDE - Only the specified table attributes are projected into the index. The list of projected attributes are in NonKeyAttributes.    ALL - All of the table attributes are projected into the index.      NonKeyAttributes - A list of one or more non-key attribute names that are projected into the secondary index. The total count of attributes provided in NonKeyAttributes, summed across all of the secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts as two distinct attributes when determining the total.      ProvisionedThroughput - The provisioned throughput settings for the global secondary index, consisting of read and write capacity units, along with data about increases and decreases.    If the table is in the DELETING state, no information about indexes will be returned.
        */
      var GlobalSecondaryIndexes: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.GlobalSecondaryIndexDescriptionList
          ] = js.undefined
      /**
        * The number of items in the specified table. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.
        */
      var ItemCount: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.Long] = js.undefined
      /**
        * The primary key structure for the table. Each KeySchemaElement consists of:    AttributeName - The name of the attribute.    KeyType - The role of the attribute:    HASH - partition key    RANGE - sort key    The partition key of an item is also known as its hash attribute. The term "hash attribute" derives from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values. The sort key of an item is also known as its range attribute. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value.    For more information about primary keys, see Primary Key in the Amazon DynamoDB Developer Guide.
        */
      var KeySchema: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.KeySchema] = js.undefined
      /**
        * The Amazon Resource Name (ARN) that uniquely identifies the latest stream for this table.
        */
      var LatestStreamArn: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.StreamArn] = js.undefined
      /**
        * A timestamp, in ISO 8601 format, for this stream. Note that LatestStreamLabel is not a unique identifier for the stream, because it is possible that a stream from another table might have the same timestamp. However, the combination of the following three elements is guaranteed to be unique:   the AWS customer ID.   the table name.   the StreamLabel.  
        */
      var LatestStreamLabel: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.String] = js.undefined
      /**
        * Represents one or more local secondary indexes on the table. Each index is scoped to a given partition key value. Tables with one or more local secondary indexes are subject to an item collection size limit, where the amount of data within a given item collection cannot exceed 10 GB. Each element is composed of:    IndexName - The name of the local secondary index.    KeySchema - Specifies the complete index key schema. The attribute names in the key schema must be between 1 and 255 characters (inclusive). The key schema must begin with the same partition key as the table.    Projection - Specifies attributes that are copied (projected) from the table into the index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. Each attribute specification is composed of:    ProjectionType - One of the following:    KEYS_ONLY - Only the index and primary keys are projected into the index.    INCLUDE - Only the specified table attributes are projected into the index. The list of projected attributes are in NonKeyAttributes.    ALL - All of the table attributes are projected into the index.      NonKeyAttributes - A list of one or more non-key attribute names that are projected into the secondary index. The total count of attributes provided in NonKeyAttributes, summed across all of the secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts as two distinct attributes when determining the total.      IndexSizeBytes - Represents the total size of the index, in bytes. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.    ItemCount - Represents the number of items in the index. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.   If the table is in the DELETING state, no information about indexes will be returned.
        */
      var LocalSecondaryIndexes: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.LocalSecondaryIndexDescriptionList
          ] = js.undefined
      /**
        * The provisioned throughput settings for the table, consisting of read and write capacity units, along with data about increases and decreases.
        */
      var ProvisionedThroughput: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ProvisionedThroughputDescription
          ] = js.undefined
      /**
        * Contains details for the restore.
        */
      var RestoreSummary: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.RestoreSummary
          ] = js.undefined
      /**
        * The description of the server-side encryption status on the specified table.
        */
      var SSEDescription: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.SSEDescription
          ] = js.undefined
      /**
        * The current DynamoDB Streams configuration for the table.
        */
      var StreamSpecification: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.StreamSpecification
          ] = js.undefined
      /**
        * The Amazon Resource Name (ARN) that uniquely identifies the table.
        */
      var TableArn: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.String] = js.undefined
      /**
        * Unique identifier for the table for which the backup was created. 
        */
      var TableId: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableId] = js.undefined
      /**
        * The name of the table.
        */
      var TableName: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableName] = js.undefined
      /**
        * The total size of the specified table, in bytes. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.
        */
      var TableSizeBytes: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.Long] = js.undefined
      /**
        * The current state of the table:    CREATING - The table is being created.    UPDATING - The table is being updated.    DELETING - The table is being deleted.    ACTIVE - The table is ready for use.  
        */
      var TableStatus: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableStatus
          ] = js.undefined
    }
    
    trait Tag extends js.Object {
      /**
        * The key of the tag.Tag keys are case sensitive. Each DynamoDB table can only have up to one tag with the same key. If you try to add an existing tag (same key), the existing tag value will be updated to the new value. 
        */
      var Key: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TagKeyString
      /**
        * The value of the tag. Tag values are case-sensitive and can be null.
        */
      var Value: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TagValueString
    }
    
    trait TagResourceInput extends js.Object {
      /**
        * Identifies the Amazon DynamoDB resource to which tags should be added. This value is an Amazon Resource Name (ARN).
        */
      var ResourceArn: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ResourceArnString
      /**
        * The tags to be assigned to the Amazon DynamoDB resource.
        */
      var Tags: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TagList
    }
    
    trait TimeToLiveDescription extends js.Object {
      /**
        *  The name of the Time to Live attribute for items in the table.
        */
      var AttributeName: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TimeToLiveAttributeName
          ] = js.undefined
      /**
        *  The Time to Live status for the table.
        */
      var TimeToLiveStatus: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TimeToLiveStatus
          ] = js.undefined
    }
    
    trait TimeToLiveSpecification extends js.Object {
      /**
        * The name of the Time to Live attribute used to store the expiration time for items in the table.
        */
      var AttributeName: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TimeToLiveAttributeName
      /**
        * Indicates whether Time To Live is to be enabled (true) or disabled (false) on the table.
        */
      var Enabled: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TimeToLiveEnabled
    }
    
    trait TransactGetItem extends js.Object {
      /**
        * Contains the primary key that identifies the item to get, together with the name of the table that contains the item, and optionally the specific attributes of the item to retrieve.
        */
      var Get: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.Get
    }
    
    trait TransactGetItemsInput extends js.Object {
      /**
        * A value of TOTAL causes consumed capacity information to be returned, and a value of NONE prevents that information from being returned. No other value is valid.
        */
      var ReturnConsumedCapacity: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ReturnConsumedCapacity
          ] = js.undefined
      /**
        * An ordered array of up to 10 TransactGetItem objects, each of which contains a Get structure.
        */
      var TransactItems: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TransactGetItemList
    }
    
    trait TransactGetItemsOutput extends js.Object {
      /**
        * If the ReturnConsumedCapacity value was TOTAL, this is an array of ConsumedCapacity objects, one for each table addressed by TransactGetItem objects in the TransactItems parameter. These ConsumedCapacity objects report the read-capacity units consumed by the TransactGetItems call in that table.
        */
      var ConsumedCapacity: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ConsumedCapacityMultiple
          ] = js.undefined
      /**
        * An ordered array of up to 10 ItemResponse objects, each of which corresponds to the TransactGetItem object in the same position in the TransactItems array. Each ItemResponse object contains a Map of the name-value pairs that are the projected attributes of the requested item. If a requested item could not be retrieved, the corresponding ItemResponse object is Null, or if the requested item has no projected attributes, the corresponding ItemResponse object is an empty Map. 
        */
      var Responses: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ItemResponseList
          ] = js.undefined
    }
    
    trait TransactWriteItem extends js.Object {
      /**
        * A request to perform a check item operation.
        */
      var ConditionCheck: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ConditionCheck
          ] = js.undefined
      /**
        * A request to perform a DeleteItem operation.
        */
      var Delete: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.Delete] = js.undefined
      /**
        * A request to perform a PutItem operation.
        */
      var Put: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.Put] = js.undefined
      /**
        * A request to perform an UpdateItem operation.
        */
      var Update: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.Update] = js.undefined
    }
    
    trait TransactWriteItemsInput extends js.Object {
      /**
        * Providing a ClientRequestToken makes the call to TransactWriteItems idempotent, meaning that multiple identical calls have the same effect as one single call. Although multiple identical calls using the same client request token produce the same result on the server (no side effects), the responses to the calls may not be the same. If the ReturnConsumedCapacity&gt; parameter is set, then the initial TransactWriteItems call returns the amount of write capacity units consumed in making the changes, and subsequent TransactWriteItems calls with the same client token return the amount of read capacity units consumed in reading the item. A client request token is valid for 10 minutes after the first request that uses it completes. After 10 minutes, any request with the same client token is treated as a new request. Do not resubmit the same request with the same client token for more than 10 minutes or the result may not be idempotent. If you submit a request with the same client token but a change in other parameters within the 10 minute idempotency window, DynamoDB returns an IdempotentParameterMismatch exception.
        */
      var ClientRequestToken: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ClientRequestToken
          ] = js.undefined
      var ReturnConsumedCapacity: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ReturnConsumedCapacity
          ] = js.undefined
      /**
        * Determines whether item collection metrics are returned. If set to SIZE, the response includes statistics about item collections (if any), that were modified during the operation and are returned in the response. If set to NONE (the default), no statistics are returned. 
        */
      var ReturnItemCollectionMetrics: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ReturnItemCollectionMetrics
          ] = js.undefined
      /**
        * An ordered array of up to 10 TransactWriteItem objects, each of which contains a ConditionCheck, Put, Update, or Delete object. These can operate on items in different tables, but the tables must reside in the same AWS account and region, and no two of them can operate on the same item. 
        */
      var TransactItems: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TransactWriteItemList
    }
    
    trait TransactWriteItemsOutput extends js.Object {
      /**
        * The capacity units consumed by the entire TransactWriteItems operation. The values of the list are ordered according to the ordering of the TransactItems request parameter. 
        */
      var ConsumedCapacity: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ConsumedCapacityMultiple
          ] = js.undefined
      /**
        * A list of tables that were processed by TransactWriteItems and, for each table, information about any item collections that were affected by individual UpdateItem, PutItem or DeleteItem operations. 
        */
      var ItemCollectionMetrics: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ItemCollectionMetricsPerTable
          ] = js.undefined
    }
    
    trait UntagResourceInput extends js.Object {
      /**
        * The Amazon DyanamoDB resource the tags will be removed from. This value is an Amazon Resource Name (ARN).
        */
      var ResourceArn: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ResourceArnString
      /**
        * A list of tag keys. Existing tags of the resource whose keys are members of this list will be removed from the Amazon DynamoDB resource.
        */
      var TagKeys: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TagKeyList
    }
    
    trait Update extends js.Object {
      /**
        * A condition that must be satisfied in order for a conditional update to succeed.
        */
      var ConditionExpression: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ConditionExpression
          ] = js.undefined
      /**
        * One or more substitution tokens for attribute names in an expression.
        */
      var ExpressionAttributeNames: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ExpressionAttributeNameMap
          ] = js.undefined
      /**
        * One or more values that can be substituted in an expression.
        */
      var ExpressionAttributeValues: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ExpressionAttributeValueMap
          ] = js.undefined
      /**
        * The primary key of the item to be updated. Each element consists of an attribute name and a value for that attribute.
        */
      var Key: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.Key
      /**
        * Use ReturnValuesOnConditionCheckFailure to get the item attributes if the Update condition fails. For ReturnValuesOnConditionCheckFailure, the valid values are: NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW.
        */
      var ReturnValuesOnConditionCheckFailure: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ReturnValuesOnConditionCheckFailure
          ] = js.undefined
      /**
        * Name of the table for the UpdateItem request.
        */
      var TableName: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableName
      /**
        * An expression that defines one or more attributes to be updated, the action to be performed on them, and new value(s) for them.
        */
      var UpdateExpression: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.UpdateExpression
    }
    
    trait UpdateContinuousBackupsInput extends js.Object {
      /**
        * Represents the settings used to enable point in time recovery.
        */
      var PointInTimeRecoverySpecification: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.PointInTimeRecoverySpecification
      /**
        * The name of the table.
        */
      var TableName: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableName
    }
    
    trait UpdateContinuousBackupsOutput extends js.Object {
      /**
        * Represents the continuous backups and point in time recovery settings on the table.
        */
      var ContinuousBackupsDescription: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ContinuousBackupsDescription
          ] = js.undefined
    }
    
    trait UpdateGlobalSecondaryIndexAction extends js.Object {
      /**
        * The name of the global secondary index to be updated.
        */
      var IndexName: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.IndexName
      /**
        * Represents the provisioned throughput settings for the specified global secondary index. For current minimum and maximum provisioned throughput values, see Limits in the Amazon DynamoDB Developer Guide.
        */
      var ProvisionedThroughput: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ProvisionedThroughput
    }
    
    trait UpdateGlobalTableInput extends js.Object {
      /**
        * The global table name.
        */
      var GlobalTableName: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableName
      /**
        * A list of regions that should be added or removed from the global table.
        */
      var ReplicaUpdates: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ReplicaUpdateList
    }
    
    trait UpdateGlobalTableOutput extends js.Object {
      /**
        * Contains the details of the global table.
        */
      var GlobalTableDescription: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.GlobalTableDescription
          ] = js.undefined
    }
    
    trait UpdateGlobalTableSettingsInput extends js.Object {
      /**
        * The billing mode of the global table. If GlobalTableBillingMode is not specified, the global table defaults to PROVISIONED capacity billing mode.
        */
      var GlobalTableBillingMode: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BillingMode
          ] = js.undefined
      /**
        * Represents the settings of a global secondary index for a global table that will be modified.
        */
      var GlobalTableGlobalSecondaryIndexSettingsUpdate: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.GlobalTableGlobalSecondaryIndexSettingsUpdateList
          ] = js.undefined
      /**
        * The name of the global table
        */
      var GlobalTableName: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableName
      /**
        * AutoScaling settings for managing provisioned write capacity for the global table.
        */
      var GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.AutoScalingSettingsUpdate
          ] = js.undefined
      /**
        * The maximum number of writes consumed per second before DynamoDB returns a ThrottlingException. 
        */
      var GlobalTableProvisionedWriteCapacityUnits: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.PositiveLongObject
          ] = js.undefined
      /**
        * Represents the settings for a global table in a region that will be modified.
        */
      var ReplicaSettingsUpdate: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ReplicaSettingsUpdateList
          ] = js.undefined
    }
    
    trait UpdateGlobalTableSettingsOutput extends js.Object {
      /**
        * The name of the global table.
        */
      var GlobalTableName: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableName] = js.undefined
      /**
        * The region specific settings for the global table.
        */
      var ReplicaSettings: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ReplicaSettingsDescriptionList
          ] = js.undefined
    }
    
    trait UpdateItemInput extends js.Object {
      /**
        * This is a legacy parameter. Use UpdateExpression instead. For more information, see AttributeUpdates in the Amazon DynamoDB Developer Guide.
        */
      var AttributeUpdates: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.AttributeUpdates
          ] = js.undefined
      /**
        * A condition that must be satisfied in order for a conditional update to succeed. An expression can contain any of the following:   Functions: attribute_exists | attribute_not_exists | attribute_type | contains | begins_with | size  These function names are case-sensitive.   Comparison operators: = | &lt;&gt; | &lt; | &gt; | &lt;= | &gt;= | BETWEEN | IN      Logical operators: AND | OR | NOT    For more information on condition expressions, see Specifying Conditions in the Amazon DynamoDB Developer Guide.
        */
      var ConditionExpression: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ConditionExpression
          ] = js.undefined
      /**
        * This is a legacy parameter. Use ConditionExpression instead. For more information, see ConditionalOperator in the Amazon DynamoDB Developer Guide.
        */
      var ConditionalOperator: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ConditionalOperator
          ] = js.undefined
      /**
        * This is a legacy parameter. Use ConditionExpression instead. For more information, see Expected in the Amazon DynamoDB Developer Guide.
        */
      var Expected: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ExpectedAttributeMap
          ] = js.undefined
      /**
        * One or more substitution tokens for attribute names in an expression. The following are some use cases for using ExpressionAttributeNames:   To access an attribute whose name conflicts with a DynamoDB reserved word.   To create a placeholder for repeating occurrences of an attribute name in an expression.   To prevent special characters in an attribute name from being misinterpreted in an expression.   Use the # character in an expression to dereference an attribute name. For example, consider the following attribute name:    Percentile    The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression. (For the complete list of reserved words, see Reserved Words in the Amazon DynamoDB Developer Guide). To work around this, you could specify the following for ExpressionAttributeNames:    {"#P":"Percentile"}    You could then use this substitution in an expression, as in this example:    #P = :val     Tokens that begin with the : character are expression attribute values, which are placeholders for the actual value at runtime.  For more information on expression attribute names, see Accessing Item Attributes in the Amazon DynamoDB Developer Guide.
        */
      var ExpressionAttributeNames: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ExpressionAttributeNameMap
          ] = js.undefined
      /**
        * One or more values that can be substituted in an expression. Use the : (colon) character in an expression to dereference an attribute value. For example, suppose that you wanted to check whether the value of the ProductStatus attribute was one of the following:   Available | Backordered | Discontinued  You would first need to specify ExpressionAttributeValues as follows:  { ":avail":{"S":"Available"}, ":back":{"S":"Backordered"}, ":disc":{"S":"Discontinued"} }  You could then use these values in an expression, such as this:  ProductStatus IN (:avail, :back, :disc)  For more information on expression attribute values, see Specifying Conditions in the Amazon DynamoDB Developer Guide.
        */
      var ExpressionAttributeValues: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ExpressionAttributeValueMap
          ] = js.undefined
      /**
        * The primary key of the item to be updated. Each element consists of an attribute name and a value for that attribute. For the primary key, you must provide all of the attributes. For example, with a simple primary key, you only need to provide a value for the partition key. For a composite primary key, you must provide values for both the partition key and the sort key.
        */
      var Key: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.Key
      var ReturnConsumedCapacity: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ReturnConsumedCapacity
          ] = js.undefined
      /**
        * Determines whether item collection metrics are returned. If set to SIZE, the response includes statistics about item collections, if any, that were modified during the operation are returned in the response. If set to NONE (the default), no statistics are returned.
        */
      var ReturnItemCollectionMetrics: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ReturnItemCollectionMetrics
          ] = js.undefined
      /**
        * Use ReturnValues if you want to get the item attributes as they appear before or after they are updated. For UpdateItem, the valid values are:    NONE - If ReturnValues is not specified, or if its value is NONE, then nothing is returned. (This setting is the default for ReturnValues.)    ALL_OLD - Returns all of the attributes of the item, as they appeared before the UpdateItem operation.    UPDATED_OLD - Returns only the updated attributes, as they appeared before the UpdateItem operation.    ALL_NEW - Returns all of the attributes of the item, as they appear after the UpdateItem operation.    UPDATED_NEW - Returns only the updated attributes, as they appear after the UpdateItem operation.   There is no additional cost associated with requesting a return value aside from the small network and processing overhead of receiving a larger response. No read capacity units are consumed. The values returned are strongly consistent.
        */
      var ReturnValues: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ReturnValue
          ] = js.undefined
      /**
        * The name of the table containing the item to update.
        */
      var TableName: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableName
      /**
        * An expression that defines one or more attributes to be updated, the action to be performed on them, and new value(s) for them. The following action values are available for UpdateExpression.    SET - Adds one or more attributes and values to an item. If any of these attribute already exist, they are replaced by the new values. You can also use SET to add or subtract from an attribute that is of type Number. For example: SET myNum = myNum + :val   SET supports the following functions:    if_not_exists (path, operand) - if the item does not contain an attribute at the specified path, then if_not_exists evaluates to operand; otherwise, it evaluates to path. You can use this function to avoid overwriting an attribute that may already be present in the item.    list_append (operand, operand) - evaluates to a list with a new element added to it. You can append the new element to the start or the end of the list by reversing the order of the operands.   These function names are case-sensitive.    REMOVE - Removes one or more attributes from an item.    ADD - Adds the specified value to the item, if the attribute does not already exist. If the attribute does exist, then the behavior of ADD depends on the data type of the attribute:   If the existing attribute is a number, and if Value is also a number, then Value is mathematically added to the existing attribute. If Value is a negative number, then it is subtracted from the existing attribute.  If you use ADD to increment or decrement a number value for an item that doesn't exist before the update, DynamoDB uses 0 as the initial value. Similarly, if you use ADD for an existing item to increment or decrement an attribute value that doesn't exist before the update, DynamoDB uses 0 as the initial value. For example, suppose that the item you want to update doesn't have an attribute named itemcount, but you decide to ADD the number 3 to this attribute anyway. DynamoDB will create the itemcount attribute, set its initial value to 0, and finally add 3 to it. The result will be a new itemcount attribute in the item, with a value of 3.    If the existing data type is a set and if Value is also a set, then Value is added to the existing set. For example, if the attribute value is the set [1,2], and the ADD action specified [3], then the final attribute value is [1,2,3]. An error occurs if an ADD action is specified for a set attribute and the attribute type specified does not match the existing set type.  Both sets must have the same primitive data type. For example, if the existing data type is a set of strings, the Value must also be a set of strings.    The ADD action only supports Number and set data types. In addition, ADD can only be used on top-level attributes, not nested attributes.     DELETE - Deletes an element from a set. If a set of values is specified, then those values are subtracted from the old set. For example, if the attribute value was the set [a,b,c] and the DELETE action specifies [a,c], then the final attribute value is [b]. Specifying an empty set is an error.  The DELETE action only supports set data types. In addition, DELETE can only be used on top-level attributes, not nested attributes.    You can have many actions in a single expression, such as the following: SET a=:value1, b=:value2 DELETE :value3, :value4, :value5  For more information on update expressions, see Modifying Items and Attributes in the Amazon DynamoDB Developer Guide.
        */
      var UpdateExpression: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.UpdateExpression
          ] = js.undefined
    }
    
    trait UpdateItemOutput extends js.Object {
      /**
        * A map of attribute values as they appear before or after the UpdateItem operation, as determined by the ReturnValues parameter. The Attributes map is only present if ReturnValues was specified as something other than NONE in the request. Each element represents one attribute.
        */
      var Attributes: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.AttributeMap
          ] = js.undefined
      /**
        * The capacity units consumed by the UpdateItem operation. The data returned includes the total provisioned throughput consumed, along with statistics for the table and any indexes involved in the operation. ConsumedCapacity is only returned if the ReturnConsumedCapacity parameter was specified. For more information, see Provisioned Throughput in the Amazon DynamoDB Developer Guide.
        */
      var ConsumedCapacity: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ConsumedCapacity
          ] = js.undefined
      /**
        * Information about item collections, if any, that were affected by the UpdateItem operation. ItemCollectionMetrics is only returned if the ReturnItemCollectionMetrics parameter was specified. If the table does not have any local secondary indexes, this information is not returned in the response. Each ItemCollectionMetrics element consists of:    ItemCollectionKey - The partition key value of the item collection. This is the same as the partition key value of the item itself.    SizeEstimateRangeGB - An estimate of item collection size, in gigabytes. This value is a two-element array containing a lower bound and an upper bound for the estimate. The estimate includes the size of all the items in the table, plus the size of all attributes projected into all of the local secondary indexes on that table. Use this estimate to measure whether a local secondary index is approaching its size limit. The estimate is subject to change over time; therefore, do not rely on the precision or accuracy of the estimate.  
        */
      var ItemCollectionMetrics: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ItemCollectionMetrics
          ] = js.undefined
    }
    
    trait UpdateTableInput extends js.Object {
      /**
        * An array of attributes that describe the key schema for the table and indexes. If you are adding a new global secondary index to the table, AttributeDefinitions must include the key element(s) of the new index.
        */
      var AttributeDefinitions: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.AttributeDefinitions
          ] = js.undefined
      /**
        * Controls how you are charged for read and write throughput and how you manage capacity. When switching from pay-per-request to provisioned capacity, initial provisioned capacity values must be set. The initial provisioned capacity values are estimated based on the consumed read and write capacity of your table and global secondary indexes over the past 30 minutes.    PROVISIONED - Sets the billing mode to PROVISIONED. We recommend using PROVISIONED for predictable workloads.    PAY_PER_REQUEST - Sets the billing mode to PAY_PER_REQUEST. We recommend using PAY_PER_REQUEST for unpredictable workloads.   
        */
      var BillingMode: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BillingMode
          ] = js.undefined
      /**
        * An array of one or more global secondary indexes for the table. For each index in the array, you can request one action:    Create - add a new global secondary index to the table.    Update - modify the provisioned throughput settings of an existing global secondary index.    Delete - remove a global secondary index from the table.   For more information, see Managing Global Secondary Indexes in the Amazon DynamoDB Developer Guide. 
        */
      var GlobalSecondaryIndexUpdates: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.GlobalSecondaryIndexUpdateList
          ] = js.undefined
      /**
        * The new provisioned throughput settings for the specified table or index.
        */
      var ProvisionedThroughput: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ProvisionedThroughput
          ] = js.undefined
      /**
        * The new server-side encryption settings for the specified table.
        */
      var SSESpecification: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.SSESpecification
          ] = js.undefined
      /**
        * Represents the DynamoDB Streams configuration for the table.  You will receive a ResourceInUseException if you attempt to enable a stream on a table that already has a stream, or if you attempt to disable a stream on a table which does not have a stream. 
        */
      var StreamSpecification: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.StreamSpecification
          ] = js.undefined
      /**
        * The name of the table to be updated.
        */
      var TableName: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableName
    }
    
    trait UpdateTableOutput extends js.Object {
      /**
        * Represents the properties of the table.
        */
      var TableDescription: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableDescription
          ] = js.undefined
    }
    
    trait UpdateTimeToLiveInput extends js.Object {
      /**
        * The name of the table to be configured.
        */
      var TableName: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableName
      /**
        * Represents the settings used to enable or disable Time to Live for the specified table.
        */
      var TimeToLiveSpecification: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TimeToLiveSpecification
    }
    
    trait UpdateTimeToLiveOutput extends js.Object {
      /**
        * Represents the output of an UpdateTimeToLive operation.
        */
      var TimeToLiveSpecification: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TimeToLiveSpecification
          ] = js.undefined
    }
    
    trait WriteRequest extends js.Object {
      /**
        * A request to perform a DeleteItem operation.
        */
      var DeleteRequest: js.UndefOr[
            awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.DeleteRequest
          ] = js.undefined
      /**
        * A request to perform a PutItem operation.
        */
      var PutRequest: js.UndefOr[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.PutRequest] = js.undefined
    }
    
    type AttributeAction = awsDashSdkLib.awsDashSdkLibStrings.ADD | awsDashSdkLib.awsDashSdkLibStrings.PUT | awsDashSdkLib.awsDashSdkLibStrings.DELETE | java.lang.String
    type AttributeDefinitions = js.Array[
        awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.AttributeDefinition
      ]
    type AttributeName = java.lang.String
    type AttributeNameList = js.Array[
        awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.AttributeName
      ]
    type AttributeValue = js.Any
    type AttributeValueList = js.Array[
        awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.AttributeValue
      ]
    type AutoScalingPolicyDescriptionList = js.Array[
        awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.AutoScalingPolicyDescription
      ]
    type AutoScalingPolicyName = java.lang.String
    type AutoScalingRoleArn = java.lang.String
    type Backfilling = scala.Boolean
    type BackupArn = java.lang.String
    type BackupCreationDateTime = stdLib.Date
    type BackupName = java.lang.String
    type BackupSizeBytes = scala.Double
    type BackupStatus = awsDashSdkLib.awsDashSdkLibStrings.CREATING | awsDashSdkLib.awsDashSdkLibStrings.DELETED | awsDashSdkLib.awsDashSdkLibStrings.AVAILABLE | java.lang.String
    type BackupSummaries = js.Array[
        awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BackupSummary
      ]
    type BackupType = awsDashSdkLib.awsDashSdkLibStrings.USER | awsDashSdkLib.awsDashSdkLibStrings.SYSTEM | java.lang.String
    type BackupTypeFilter = awsDashSdkLib.awsDashSdkLibStrings.USER | awsDashSdkLib.awsDashSdkLibStrings.SYSTEM | awsDashSdkLib.awsDashSdkLibStrings.ALL | java.lang.String
    type BackupsInputLimit = scala.Double
    type BillingMode = awsDashSdkLib.awsDashSdkLibStrings.PROVISIONED | awsDashSdkLib.awsDashSdkLibStrings.PAY_PER_REQUEST | java.lang.String
    type BinaryAttributeValue = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.Blob | java.lang.String
    type BinarySetAttributeValue = js.Array[
        awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BinaryAttributeValue
      ]
    type BooleanAttributeValue = scala.Boolean
    type BooleanObject = scala.Boolean
    type ClientRequestToken = java.lang.String
    type ComparisonOperator = awsDashSdkLib.awsDashSdkLibStrings.EQ | awsDashSdkLib.awsDashSdkLibStrings.NE | awsDashSdkLib.awsDashSdkLibStrings.IN | awsDashSdkLib.awsDashSdkLibStrings.LE | awsDashSdkLib.awsDashSdkLibStrings.LT | awsDashSdkLib.awsDashSdkLibStrings.GE | awsDashSdkLib.awsDashSdkLibStrings.GT | awsDashSdkLib.awsDashSdkLibStrings.BETWEEN | awsDashSdkLib.awsDashSdkLibStrings.NOT_NULL | awsDashSdkLib.awsDashSdkLibStrings.NULL | awsDashSdkLib.awsDashSdkLibStrings.CONTAINS | awsDashSdkLib.awsDashSdkLibStrings.NOT_CONTAINS | awsDashSdkLib.awsDashSdkLibStrings.BEGINS_WITH | java.lang.String
    type ConditionExpression = java.lang.String
    type ConditionalOperator = awsDashSdkLib.awsDashSdkLibStrings.AND | awsDashSdkLib.awsDashSdkLibStrings.OR | java.lang.String
    type ConsistentRead = scala.Boolean
    type ConsumedCapacityMultiple = js.Array[
        awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ConsumedCapacity
      ]
    type ConsumedCapacityUnits = scala.Double
    type ContinuousBackupsStatus = awsDashSdkLib.awsDashSdkLibStrings.ENABLED | awsDashSdkLib.awsDashSdkLibStrings.DISABLED | java.lang.String
    type Double = scala.Double
    type DynamoDbSet = awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.StringSet | awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.NumberSet | awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BinarySet
    type Endpoints = js.Array[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.Endpoint]
    type ExpressionAttributeNameVariable = java.lang.String
    type ExpressionAttributeValueVariable = java.lang.String
    type GlobalSecondaryIndexDescriptionList = js.Array[
        awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.GlobalSecondaryIndexDescription
      ]
    type GlobalSecondaryIndexList = js.Array[
        awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.GlobalSecondaryIndex
      ]
    type GlobalSecondaryIndexUpdateList = js.Array[
        awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.GlobalSecondaryIndexUpdate
      ]
    type GlobalSecondaryIndexes = js.Array[
        awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.GlobalSecondaryIndexInfo
      ]
    type GlobalTableArnString = java.lang.String
    type GlobalTableGlobalSecondaryIndexSettingsUpdateList = js.Array[
        awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.GlobalTableGlobalSecondaryIndexSettingsUpdate
      ]
    type GlobalTableList = js.Array[
        awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.GlobalTable
      ]
    type GlobalTableStatus = awsDashSdkLib.awsDashSdkLibStrings.CREATING | awsDashSdkLib.awsDashSdkLibStrings.ACTIVE | awsDashSdkLib.awsDashSdkLibStrings.DELETING | awsDashSdkLib.awsDashSdkLibStrings.UPDATING | java.lang.String
    type IndexName = java.lang.String
    type IndexStatus = awsDashSdkLib.awsDashSdkLibStrings.CREATING | awsDashSdkLib.awsDashSdkLibStrings.UPDATING | awsDashSdkLib.awsDashSdkLibStrings.DELETING | awsDashSdkLib.awsDashSdkLibStrings.ACTIVE | java.lang.String
    type Integer = scala.Double
    type IntegerObject = scala.Double
    type ItemCollectionMetricsMultiple = js.Array[
        awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ItemCollectionMetrics
      ]
    type ItemCollectionSizeEstimateBound = scala.Double
    type ItemCollectionSizeEstimateRange = js.Array[
        awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ItemCollectionSizeEstimateBound
      ]
    type ItemCount = scala.Double
    type ItemList = js.Array[
        awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.AttributeMap
      ]
    type ItemResponseList = js.Array[
        awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ItemResponse
      ]
    type KMSMasterKeyArn = java.lang.String
    type KMSMasterKeyId = java.lang.String
    type KeyExpression = java.lang.String
    type KeyList = js.Array[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.Key]
    type KeySchema = js.Array[
        awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.KeySchemaElement
      ]
    type KeySchemaAttributeName = java.lang.String
    type KeyType = awsDashSdkLib.awsDashSdkLibStrings.HASH | awsDashSdkLib.awsDashSdkLibStrings.RANGE | java.lang.String
    type ListAttributeValue = js.Array[
        awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.AttributeValue
      ]
    type ListTablesInputLimit = scala.Double
    type LocalSecondaryIndexDescriptionList = js.Array[
        awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.LocalSecondaryIndexDescription
      ]
    type LocalSecondaryIndexList = js.Array[
        awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.LocalSecondaryIndex
      ]
    type LocalSecondaryIndexes = js.Array[
        awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.LocalSecondaryIndexInfo
      ]
    type Long = scala.Double
    type NextTokenString = java.lang.String
    type NonKeyAttributeName = java.lang.String
    type NonKeyAttributeNameList = js.Array[
        awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.NonKeyAttributeName
      ]
    type NonNegativeLongObject = scala.Double
    type NullAttributeValue = scala.Boolean
    type NumberAttributeValue = java.lang.String
    type NumberSetAttributeValue = js.Array[
        awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.NumberAttributeValue
      ]
    type PointInTimeRecoveryStatus = awsDashSdkLib.awsDashSdkLibStrings.ENABLED | awsDashSdkLib.awsDashSdkLibStrings.DISABLED | java.lang.String
    type PositiveIntegerObject = scala.Double
    type PositiveLongObject = scala.Double
    type ProjectionExpression = java.lang.String
    type ProjectionType = awsDashSdkLib.awsDashSdkLibStrings.ALL | awsDashSdkLib.awsDashSdkLibStrings.KEYS_ONLY | awsDashSdkLib.awsDashSdkLibStrings.INCLUDE | java.lang.String
    type RegionName = java.lang.String
    type ReplicaDescriptionList = js.Array[
        awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ReplicaDescription
      ]
    type ReplicaGlobalSecondaryIndexSettingsDescriptionList = js.Array[
        awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ReplicaGlobalSecondaryIndexSettingsDescription
      ]
    type ReplicaGlobalSecondaryIndexSettingsUpdateList = js.Array[
        awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ReplicaGlobalSecondaryIndexSettingsUpdate
      ]
    type ReplicaList = js.Array[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.Replica]
    type ReplicaSettingsDescriptionList = js.Array[
        awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ReplicaSettingsDescription
      ]
    type ReplicaSettingsUpdateList = js.Array[
        awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ReplicaSettingsUpdate
      ]
    type ReplicaStatus = awsDashSdkLib.awsDashSdkLibStrings.CREATING | awsDashSdkLib.awsDashSdkLibStrings.UPDATING | awsDashSdkLib.awsDashSdkLibStrings.DELETING | awsDashSdkLib.awsDashSdkLibStrings.ACTIVE | java.lang.String
    type ReplicaUpdateList = js.Array[
        awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ReplicaUpdate
      ]
    type ResourceArnString = java.lang.String
    type RestoreInProgress = scala.Boolean
    type ReturnConsumedCapacity = awsDashSdkLib.awsDashSdkLibStrings.INDEXES | awsDashSdkLib.awsDashSdkLibStrings.TOTAL | awsDashSdkLib.awsDashSdkLibStrings.NONE | java.lang.String
    type ReturnItemCollectionMetrics = awsDashSdkLib.awsDashSdkLibStrings.SIZE | awsDashSdkLib.awsDashSdkLibStrings.NONE | java.lang.String
    type ReturnValue = awsDashSdkLib.awsDashSdkLibStrings.NONE | awsDashSdkLib.awsDashSdkLibStrings.ALL_OLD | awsDashSdkLib.awsDashSdkLibStrings.UPDATED_OLD | awsDashSdkLib.awsDashSdkLibStrings.ALL_NEW | awsDashSdkLib.awsDashSdkLibStrings.UPDATED_NEW | java.lang.String
    type ReturnValuesOnConditionCheckFailure = awsDashSdkLib.awsDashSdkLibStrings.ALL_OLD | awsDashSdkLib.awsDashSdkLibStrings.NONE | java.lang.String
    type SSEEnabled = scala.Boolean
    type SSEStatus = awsDashSdkLib.awsDashSdkLibStrings.ENABLING | awsDashSdkLib.awsDashSdkLibStrings.ENABLED | awsDashSdkLib.awsDashSdkLibStrings.DISABLING | awsDashSdkLib.awsDashSdkLibStrings.DISABLED | awsDashSdkLib.awsDashSdkLibStrings.UPDATING | java.lang.String
    type SSEType = awsDashSdkLib.awsDashSdkLibStrings.AES256 | awsDashSdkLib.awsDashSdkLibStrings.KMS | java.lang.String
    type ScalarAttributeType = awsDashSdkLib.awsDashSdkLibStrings.S | awsDashSdkLib.awsDashSdkLibStrings.N | awsDashSdkLib.awsDashSdkLibStrings.B | java.lang.String
    type ScanSegment = scala.Double
    type ScanTotalSegments = scala.Double
    type Select = awsDashSdkLib.awsDashSdkLibStrings.ALL_ATTRIBUTES | awsDashSdkLib.awsDashSdkLibStrings.ALL_PROJECTED_ATTRIBUTES | awsDashSdkLib.awsDashSdkLibStrings.SPECIFIC_ATTRIBUTES | awsDashSdkLib.awsDashSdkLibStrings.COUNT | java.lang.String
    type StreamArn = java.lang.String
    type StreamEnabled = scala.Boolean
    type StreamViewType = awsDashSdkLib.awsDashSdkLibStrings.NEW_IMAGE | awsDashSdkLib.awsDashSdkLibStrings.OLD_IMAGE | awsDashSdkLib.awsDashSdkLibStrings.NEW_AND_OLD_IMAGES | awsDashSdkLib.awsDashSdkLibStrings.KEYS_ONLY | java.lang.String
    type String = java.lang.String
    type StringAttributeValue = java.lang.String
    type StringSetAttributeValue = js.Array[
        awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.StringAttributeValue
      ]
    type TableArn = java.lang.String
    type TableCreationDateTime = stdLib.Date
    type TableId = java.lang.String
    type TableName = java.lang.String
    type TableNameList = js.Array[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableName]
    type TableStatus = awsDashSdkLib.awsDashSdkLibStrings.CREATING | awsDashSdkLib.awsDashSdkLibStrings.UPDATING | awsDashSdkLib.awsDashSdkLibStrings.DELETING | awsDashSdkLib.awsDashSdkLibStrings.ACTIVE | java.lang.String
    type TagKeyList = js.Array[
        awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TagKeyString
      ]
    type TagKeyString = java.lang.String
    type TagList = js.Array[awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.Tag]
    type TagValueString = java.lang.String
    type TimeRangeLowerBound = stdLib.Date
    type TimeRangeUpperBound = stdLib.Date
    type TimeToLiveAttributeName = java.lang.String
    type TimeToLiveEnabled = scala.Boolean
    type TimeToLiveStatus = awsDashSdkLib.awsDashSdkLibStrings.ENABLING | awsDashSdkLib.awsDashSdkLibStrings.DISABLING | awsDashSdkLib.awsDashSdkLibStrings.ENABLED | awsDashSdkLib.awsDashSdkLibStrings.DISABLED | java.lang.String
    type TransactGetItemList = js.Array[
        awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TransactGetItem
      ]
    type TransactWriteItemList = js.Array[
        awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TransactWriteItem
      ]
    type UpdateExpression = java.lang.String
    type WriteRequests = js.Array[
        awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.WriteRequest
      ]
    type _Date = stdLib.Date
    type binaryType = nodeLib.Buffer | awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.File | awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.Blob | stdLib.ArrayBuffer | stdLib.DataView | stdLib.Int8Array | stdLib.Uint8Array | stdLib.Uint8ClampedArray | stdLib.Int16Array | stdLib.Uint16Array | stdLib.Int32Array | stdLib.Uint32Array | stdLib.Float32Array | stdLib.Float64Array | nodeLib.streamMod.Stream
  }
  
  type AttributeAction = awsDashSdkLib.awsDashSdkLibStrings.ADD | awsDashSdkLib.awsDashSdkLibStrings.PUT | awsDashSdkLib.awsDashSdkLibStrings.DELETE | java.lang.String
  type AttributeDefinitions = js.Array[AttributeDefinition]
  type AttributeName = java.lang.String
  type AttributeNameList = js.Array[AttributeName]
  type AttributeValueList = js.Array[AttributeValue]
  type AutoScalingPolicyDescriptionList = js.Array[AutoScalingPolicyDescription]
  type AutoScalingPolicyName = java.lang.String
  type AutoScalingRoleArn = java.lang.String
  type Backfilling = scala.Boolean
  type BackupArn = java.lang.String
  type BackupCreationDateTime = stdLib.Date
  type BackupName = java.lang.String
  type BackupSizeBytes = scala.Double
  type BackupStatus = awsDashSdkLib.awsDashSdkLibStrings.CREATING | awsDashSdkLib.awsDashSdkLibStrings.DELETED | awsDashSdkLib.awsDashSdkLibStrings.AVAILABLE | java.lang.String
  type BackupSummaries = js.Array[BackupSummary]
  type BackupType = awsDashSdkLib.awsDashSdkLibStrings.USER | awsDashSdkLib.awsDashSdkLibStrings.SYSTEM | java.lang.String
  type BackupTypeFilter = awsDashSdkLib.awsDashSdkLibStrings.USER | awsDashSdkLib.awsDashSdkLibStrings.SYSTEM | awsDashSdkLib.awsDashSdkLibStrings.ALL | java.lang.String
  type BackupsInputLimit = scala.Double
  type BillingMode = awsDashSdkLib.awsDashSdkLibStrings.PROVISIONED | awsDashSdkLib.awsDashSdkLibStrings.PAY_PER_REQUEST | java.lang.String
  type BinaryAttributeValue = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsDynamodbMod.Blob | java.lang.String
  type BinarySetAttributeValue = js.Array[BinaryAttributeValue]
  type BooleanAttributeValue = scala.Boolean
  type BooleanObject = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClientRequestToken = java.lang.String
  type ComparisonOperator = awsDashSdkLib.awsDashSdkLibStrings.EQ | awsDashSdkLib.awsDashSdkLibStrings.NE | awsDashSdkLib.awsDashSdkLibStrings.IN | awsDashSdkLib.awsDashSdkLibStrings.LE | awsDashSdkLib.awsDashSdkLibStrings.LT | awsDashSdkLib.awsDashSdkLibStrings.GE | awsDashSdkLib.awsDashSdkLibStrings.GT | awsDashSdkLib.awsDashSdkLibStrings.BETWEEN | awsDashSdkLib.awsDashSdkLibStrings.NOT_NULL | awsDashSdkLib.awsDashSdkLibStrings.NULL | awsDashSdkLib.awsDashSdkLibStrings.CONTAINS | awsDashSdkLib.awsDashSdkLibStrings.NOT_CONTAINS | awsDashSdkLib.awsDashSdkLibStrings.BEGINS_WITH | java.lang.String
  type ConditionExpression = java.lang.String
  type ConditionalOperator = awsDashSdkLib.awsDashSdkLibStrings.AND | awsDashSdkLib.awsDashSdkLibStrings.OR | java.lang.String
  type ConsistentRead = scala.Boolean
  type ConsumedCapacityMultiple = js.Array[ConsumedCapacity]
  type ConsumedCapacityUnits = scala.Double
  type ContinuousBackupsStatus = awsDashSdkLib.awsDashSdkLibStrings.ENABLED | awsDashSdkLib.awsDashSdkLibStrings.DISABLED | java.lang.String
  type Double = scala.Double
  type Endpoints = js.Array[Endpoint]
  type ExpressionAttributeNameVariable = java.lang.String
  type ExpressionAttributeValueVariable = java.lang.String
  type GlobalSecondaryIndexDescriptionList = js.Array[GlobalSecondaryIndexDescription]
  type GlobalSecondaryIndexList = js.Array[GlobalSecondaryIndex]
  type GlobalSecondaryIndexUpdateList = js.Array[GlobalSecondaryIndexUpdate]
  type GlobalSecondaryIndexes = js.Array[GlobalSecondaryIndexInfo]
  type GlobalTableArnString = java.lang.String
  type GlobalTableGlobalSecondaryIndexSettingsUpdateList = js.Array[GlobalTableGlobalSecondaryIndexSettingsUpdate]
  type GlobalTableList = js.Array[GlobalTable]
  type GlobalTableStatus = awsDashSdkLib.awsDashSdkLibStrings.CREATING | awsDashSdkLib.awsDashSdkLibStrings.ACTIVE | awsDashSdkLib.awsDashSdkLibStrings.DELETING | awsDashSdkLib.awsDashSdkLibStrings.UPDATING | java.lang.String
  type IndexName = java.lang.String
  type IndexStatus = awsDashSdkLib.awsDashSdkLibStrings.CREATING | awsDashSdkLib.awsDashSdkLibStrings.UPDATING | awsDashSdkLib.awsDashSdkLibStrings.DELETING | awsDashSdkLib.awsDashSdkLibStrings.ACTIVE | java.lang.String
  type Integer = scala.Double
  type IntegerObject = scala.Double
  type ItemCollectionMetricsMultiple = js.Array[ItemCollectionMetrics]
  type ItemCollectionSizeEstimateBound = scala.Double
  type ItemCollectionSizeEstimateRange = js.Array[ItemCollectionSizeEstimateBound]
  type ItemCount = scala.Double
  type ItemList = js.Array[AttributeMap]
  type ItemResponseList = js.Array[ItemResponse]
  type KMSMasterKeyArn = java.lang.String
  type KMSMasterKeyId = java.lang.String
  type KeyExpression = java.lang.String
  type KeyList = js.Array[Key]
  type KeySchema = js.Array[KeySchemaElement]
  type KeySchemaAttributeName = java.lang.String
  type KeyType = awsDashSdkLib.awsDashSdkLibStrings.HASH | awsDashSdkLib.awsDashSdkLibStrings.RANGE | java.lang.String
  type ListAttributeValue = js.Array[AttributeValue]
  type ListTablesInputLimit = scala.Double
  type LocalSecondaryIndexDescriptionList = js.Array[LocalSecondaryIndexDescription]
  type LocalSecondaryIndexList = js.Array[LocalSecondaryIndex]
  type LocalSecondaryIndexes = js.Array[LocalSecondaryIndexInfo]
  type Long = scala.Double
  type NextTokenString = java.lang.String
  type NonKeyAttributeName = java.lang.String
  type NonKeyAttributeNameList = js.Array[NonKeyAttributeName]
  type NonNegativeLongObject = scala.Double
  type NullAttributeValue = scala.Boolean
  type NumberAttributeValue = java.lang.String
  type NumberSetAttributeValue = js.Array[NumberAttributeValue]
  type PointInTimeRecoveryStatus = awsDashSdkLib.awsDashSdkLibStrings.ENABLED | awsDashSdkLib.awsDashSdkLibStrings.DISABLED | java.lang.String
  type PositiveIntegerObject = scala.Double
  type PositiveLongObject = scala.Double
  type ProjectionExpression = java.lang.String
  type ProjectionType = awsDashSdkLib.awsDashSdkLibStrings.ALL | awsDashSdkLib.awsDashSdkLibStrings.KEYS_ONLY | awsDashSdkLib.awsDashSdkLibStrings.INCLUDE | java.lang.String
  type RegionName = java.lang.String
  type ReplicaDescriptionList = js.Array[ReplicaDescription]
  type ReplicaGlobalSecondaryIndexSettingsDescriptionList = js.Array[ReplicaGlobalSecondaryIndexSettingsDescription]
  type ReplicaGlobalSecondaryIndexSettingsUpdateList = js.Array[ReplicaGlobalSecondaryIndexSettingsUpdate]
  type ReplicaList = js.Array[Replica]
  type ReplicaSettingsDescriptionList = js.Array[ReplicaSettingsDescription]
  type ReplicaSettingsUpdateList = js.Array[ReplicaSettingsUpdate]
  type ReplicaStatus = awsDashSdkLib.awsDashSdkLibStrings.CREATING | awsDashSdkLib.awsDashSdkLibStrings.UPDATING | awsDashSdkLib.awsDashSdkLibStrings.DELETING | awsDashSdkLib.awsDashSdkLibStrings.ACTIVE | java.lang.String
  type ReplicaUpdateList = js.Array[ReplicaUpdate]
  type ResourceArnString = java.lang.String
  type RestoreInProgress = scala.Boolean
  type ReturnConsumedCapacity = awsDashSdkLib.awsDashSdkLibStrings.INDEXES | awsDashSdkLib.awsDashSdkLibStrings.TOTAL | awsDashSdkLib.awsDashSdkLibStrings.NONE | java.lang.String
  type ReturnItemCollectionMetrics = awsDashSdkLib.awsDashSdkLibStrings.SIZE | awsDashSdkLib.awsDashSdkLibStrings.NONE | java.lang.String
  type ReturnValue = awsDashSdkLib.awsDashSdkLibStrings.NONE | awsDashSdkLib.awsDashSdkLibStrings.ALL_OLD | awsDashSdkLib.awsDashSdkLibStrings.UPDATED_OLD | awsDashSdkLib.awsDashSdkLibStrings.ALL_NEW | awsDashSdkLib.awsDashSdkLibStrings.UPDATED_NEW | java.lang.String
  type ReturnValuesOnConditionCheckFailure = awsDashSdkLib.awsDashSdkLibStrings.ALL_OLD | awsDashSdkLib.awsDashSdkLibStrings.NONE | java.lang.String
  type SSEEnabled = scala.Boolean
  type SSEStatus = awsDashSdkLib.awsDashSdkLibStrings.ENABLING | awsDashSdkLib.awsDashSdkLibStrings.ENABLED | awsDashSdkLib.awsDashSdkLibStrings.DISABLING | awsDashSdkLib.awsDashSdkLibStrings.DISABLED | awsDashSdkLib.awsDashSdkLibStrings.UPDATING | java.lang.String
  type SSEType = awsDashSdkLib.awsDashSdkLibStrings.AES256 | awsDashSdkLib.awsDashSdkLibStrings.KMS | java.lang.String
  type ScalarAttributeType = awsDashSdkLib.awsDashSdkLibStrings.S | awsDashSdkLib.awsDashSdkLibStrings.N | awsDashSdkLib.awsDashSdkLibStrings.B | java.lang.String
  type ScanSegment = scala.Double
  type ScanTotalSegments = scala.Double
  type Select = awsDashSdkLib.awsDashSdkLibStrings.ALL_ATTRIBUTES | awsDashSdkLib.awsDashSdkLibStrings.ALL_PROJECTED_ATTRIBUTES | awsDashSdkLib.awsDashSdkLibStrings.SPECIFIC_ATTRIBUTES | awsDashSdkLib.awsDashSdkLibStrings.COUNT | java.lang.String
  type StreamArn = java.lang.String
  type StreamEnabled = scala.Boolean
  type StreamViewType = awsDashSdkLib.awsDashSdkLibStrings.NEW_IMAGE | awsDashSdkLib.awsDashSdkLibStrings.OLD_IMAGE | awsDashSdkLib.awsDashSdkLibStrings.NEW_AND_OLD_IMAGES | awsDashSdkLib.awsDashSdkLibStrings.KEYS_ONLY | java.lang.String
  type String = java.lang.String
  type StringAttributeValue = java.lang.String
  type StringSetAttributeValue = js.Array[StringAttributeValue]
  type TableArn = java.lang.String
  type TableCreationDateTime = stdLib.Date
  type TableId = java.lang.String
  type TableName = java.lang.String
  type TableNameList = js.Array[TableName]
  type TableStatus = awsDashSdkLib.awsDashSdkLibStrings.CREATING | awsDashSdkLib.awsDashSdkLibStrings.UPDATING | awsDashSdkLib.awsDashSdkLibStrings.DELETING | awsDashSdkLib.awsDashSdkLibStrings.ACTIVE | java.lang.String
  type TagKeyList = js.Array[TagKeyString]
  type TagKeyString = java.lang.String
  type TagList = js.Array[Tag]
  type TagValueString = java.lang.String
  type TimeRangeLowerBound = stdLib.Date
  type TimeRangeUpperBound = stdLib.Date
  type TimeToLiveAttributeName = java.lang.String
  type TimeToLiveEnabled = scala.Boolean
  type TimeToLiveStatus = awsDashSdkLib.awsDashSdkLibStrings.ENABLING | awsDashSdkLib.awsDashSdkLibStrings.DISABLING | awsDashSdkLib.awsDashSdkLibStrings.ENABLED | awsDashSdkLib.awsDashSdkLibStrings.DISABLED | java.lang.String
  type TransactGetItemList = js.Array[TransactGetItem]
  type TransactWriteItemList = js.Array[TransactWriteItem]
  type UpdateExpression = java.lang.String
  type WriteRequests = js.Array[WriteRequest]
  type _Date = stdLib.Date
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2011-12-05` | awsDashSdkLib.awsDashSdkLibStrings.`2012-08-10` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

