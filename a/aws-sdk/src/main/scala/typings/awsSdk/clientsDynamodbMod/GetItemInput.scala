package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetItemInput extends StObject {
  
  /**
    * This is a legacy parameter. Use ProjectionExpression instead. For more information, see AttributesToGet in the Amazon DynamoDB Developer Guide.
    */
  var AttributesToGet: js.UndefOr[AttributeNameList] = js.undefined
  
  /**
    * Determines the read consistency model: If set to true, then the operation uses strongly consistent reads; otherwise, the operation uses eventually consistent reads.
    */
  var ConsistentRead: js.UndefOr[typings.awsSdk.clientsDynamodbMod.ConsistentRead] = js.undefined
  
  /**
    * One or more substitution tokens for attribute names in an expression. The following are some use cases for using ExpressionAttributeNames:   To access an attribute whose name conflicts with a DynamoDB reserved word.   To create a placeholder for repeating occurrences of an attribute name in an expression.   To prevent special characters in an attribute name from being misinterpreted in an expression.   Use the # character in an expression to dereference an attribute name. For example, consider the following attribute name:    Percentile    The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression. (For the complete list of reserved words, see Reserved Words in the Amazon DynamoDB Developer Guide). To work around this, you could specify the following for ExpressionAttributeNames:    {"#P":"Percentile"}    You could then use this substitution in an expression, as in this example:    #P = :val     Tokens that begin with the : character are expression attribute values, which are placeholders for the actual value at runtime.  For more information on expression attribute names, see Specifying Item Attributes in the Amazon DynamoDB Developer Guide.
    */
  var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined
  
  /**
    * A map of attribute names to AttributeValue objects, representing the primary key of the item to retrieve. For the primary key, you must provide all of the attributes. For example, with a simple primary key, you only need to provide a value for the partition key. For a composite primary key, you must provide values for both the partition key and the sort key.
    */
  var Key: typings.awsSdk.clientsDynamodbMod.Key
  
  /**
    * A string that identifies one or more attributes to retrieve from the table. These attributes can include scalars, sets, or elements of a JSON document. The attributes in the expression must be separated by commas. If no attribute names are specified, then all attributes are returned. If any of the requested attributes are not found, they do not appear in the result. For more information, see Specifying Item Attributes in the Amazon DynamoDB Developer Guide.
    */
  var ProjectionExpression: js.UndefOr[typings.awsSdk.clientsDynamodbMod.ProjectionExpression] = js.undefined
  
  var ReturnConsumedCapacity: js.UndefOr[typings.awsSdk.clientsDynamodbMod.ReturnConsumedCapacity] = js.undefined
  
  /**
    * The name of the table containing the requested item.
    */
  var TableName: typings.awsSdk.clientsDynamodbMod.TableName
}
object GetItemInput {
  
  inline def apply(Key: Key, TableName: TableName): GetItemInput = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetItemInput]
  }
  
  extension [Self <: GetItemInput](x: Self) {
    
    inline def setAttributesToGet(value: AttributeNameList): Self = StObject.set(x, "AttributesToGet", value.asInstanceOf[js.Any])
    
    inline def setAttributesToGetUndefined: Self = StObject.set(x, "AttributesToGet", js.undefined)
    
    inline def setAttributesToGetVarargs(value: AttributeName*): Self = StObject.set(x, "AttributesToGet", js.Array(value*))
    
    inline def setConsistentRead(value: ConsistentRead): Self = StObject.set(x, "ConsistentRead", value.asInstanceOf[js.Any])
    
    inline def setConsistentReadUndefined: Self = StObject.set(x, "ConsistentRead", js.undefined)
    
    inline def setExpressionAttributeNames(value: ExpressionAttributeNameMap): Self = StObject.set(x, "ExpressionAttributeNames", value.asInstanceOf[js.Any])
    
    inline def setExpressionAttributeNamesUndefined: Self = StObject.set(x, "ExpressionAttributeNames", js.undefined)
    
    inline def setKey(value: Key): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setProjectionExpression(value: ProjectionExpression): Self = StObject.set(x, "ProjectionExpression", value.asInstanceOf[js.Any])
    
    inline def setProjectionExpressionUndefined: Self = StObject.set(x, "ProjectionExpression", js.undefined)
    
    inline def setReturnConsumedCapacity(value: ReturnConsumedCapacity): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
    
    inline def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
    
    inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
