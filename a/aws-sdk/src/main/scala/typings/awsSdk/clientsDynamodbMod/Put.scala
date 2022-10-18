package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Put extends StObject {
  
  /**
    * A condition that must be satisfied in order for a conditional update to succeed.
    */
  var ConditionExpression: js.UndefOr[typings.awsSdk.clientsDynamodbMod.ConditionExpression] = js.undefined
  
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
  var ReturnValuesOnConditionCheckFailure: js.UndefOr[typings.awsSdk.clientsDynamodbMod.ReturnValuesOnConditionCheckFailure] = js.undefined
  
  /**
    * Name of the table in which to write the item.
    */
  var TableName: typings.awsSdk.clientsDynamodbMod.TableName
}
object Put {
  
  inline def apply(Item: PutItemInputAttributeMap, TableName: TableName): Put = {
    val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Put]
  }
  
  extension [Self <: Put](x: Self) {
    
    inline def setConditionExpression(value: ConditionExpression): Self = StObject.set(x, "ConditionExpression", value.asInstanceOf[js.Any])
    
    inline def setConditionExpressionUndefined: Self = StObject.set(x, "ConditionExpression", js.undefined)
    
    inline def setExpressionAttributeNames(value: ExpressionAttributeNameMap): Self = StObject.set(x, "ExpressionAttributeNames", value.asInstanceOf[js.Any])
    
    inline def setExpressionAttributeNamesUndefined: Self = StObject.set(x, "ExpressionAttributeNames", js.undefined)
    
    inline def setExpressionAttributeValues(value: ExpressionAttributeValueMap): Self = StObject.set(x, "ExpressionAttributeValues", value.asInstanceOf[js.Any])
    
    inline def setExpressionAttributeValuesUndefined: Self = StObject.set(x, "ExpressionAttributeValues", js.undefined)
    
    inline def setItem(value: PutItemInputAttributeMap): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    inline def setReturnValuesOnConditionCheckFailure(value: ReturnValuesOnConditionCheckFailure): Self = StObject.set(x, "ReturnValuesOnConditionCheckFailure", value.asInstanceOf[js.Any])
    
    inline def setReturnValuesOnConditionCheckFailureUndefined: Self = StObject.set(x, "ReturnValuesOnConditionCheckFailure", js.undefined)
    
    inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
