package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetItemInput extends StObject {
  
  /**
    * A map of one or more table names and, for each table, a map that describes one or more items to retrieve from that table. Each table name can be used only once per BatchGetItem request. Each element in the map of items to retrieve consists of the following:    ConsistentRead - If true, a strongly consistent read is used; if false (the default), an eventually consistent read is used.    ExpressionAttributeNames - One or more substitution tokens for attribute names in the ProjectionExpression parameter. The following are some use cases for using ExpressionAttributeNames:   To access an attribute whose name conflicts with a DynamoDB reserved word.   To create a placeholder for repeating occurrences of an attribute name in an expression.   To prevent special characters in an attribute name from being misinterpreted in an expression.   Use the # character in an expression to dereference an attribute name. For example, consider the following attribute name:    Percentile    The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression. (For the complete list of reserved words, see Reserved Words in the Amazon DynamoDB Developer Guide). To work around this, you could specify the following for ExpressionAttributeNames:    {"#P":"Percentile"}    You could then use this substitution in an expression, as in this example:    #P = :val     Tokens that begin with the : character are expression attribute values, which are placeholders for the actual value at runtime.  For more information about expression attribute names, see Accessing Item Attributes in the Amazon DynamoDB Developer Guide.    Keys - An array of primary key attribute values that define specific items in the table. For each primary key, you must provide all of the key attributes. For example, with a simple primary key, you only need to provide the partition key value. For a composite key, you must provide both the partition key value and the sort key value.    ProjectionExpression - A string that identifies one or more attributes to retrieve from the table. These attributes can include scalars, sets, or elements of a JSON document. The attributes in the expression must be separated by commas. If no attribute names are specified, then all attributes are returned. If any of the requested attributes are not found, they do not appear in the result. For more information, see Accessing Item Attributes in the Amazon DynamoDB Developer Guide.    AttributesToGet - This is a legacy parameter. Use ProjectionExpression instead. For more information, see AttributesToGet in the Amazon DynamoDB Developer Guide.   
    */
  var RequestItems: BatchGetRequestMap
  
  var ReturnConsumedCapacity: js.UndefOr[typings.awsSdk.clientsDynamodbMod.ReturnConsumedCapacity] = js.undefined
}
object BatchGetItemInput {
  
  inline def apply(RequestItems: BatchGetRequestMap): BatchGetItemInput = {
    val __obj = js.Dynamic.literal(RequestItems = RequestItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetItemInput]
  }
  
  extension [Self <: BatchGetItemInput](x: Self) {
    
    inline def setRequestItems(value: BatchGetRequestMap): Self = StObject.set(x, "RequestItems", value.asInstanceOf[js.Any])
    
    inline def setReturnConsumedCapacity(value: ReturnConsumedCapacity): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
    
    inline def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
  }
}
