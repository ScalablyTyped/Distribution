package typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeysAndAttributes extends js.Object {
  /**
    * This is a legacy parameter. Use ProjectionExpression instead. For more information, see Legacy Conditional Parameters in the Amazon DynamoDB Developer Guide.
    */
  var AttributesToGet: js.UndefOr[AttributeNameList] = js.undefined
  /**
    * The consistency of a read operation. If set to true, then a strongly consistent read is used; otherwise, an eventually consistent read is used.
    */
  var ConsistentRead: js.UndefOr[
    typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient.ConsistentRead
  ] = js.undefined
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
  var ProjectionExpression: js.UndefOr[
    typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient.ProjectionExpression
  ] = js.undefined
}

object KeysAndAttributes {
  @scala.inline
  def apply(
    Keys: KeyList,
    AttributesToGet: AttributeNameList = null,
    ConsistentRead: js.UndefOr[Boolean] = js.undefined,
    ExpressionAttributeNames: ExpressionAttributeNameMap = null,
    ProjectionExpression: ProjectionExpression = null
  ): KeysAndAttributes = {
    val __obj = js.Dynamic.literal(Keys = Keys)
    if (AttributesToGet != null) __obj.updateDynamic("AttributesToGet")(AttributesToGet)
    if (!js.isUndefined(ConsistentRead)) __obj.updateDynamic("ConsistentRead")(ConsistentRead)
    if (ExpressionAttributeNames != null) __obj.updateDynamic("ExpressionAttributeNames")(ExpressionAttributeNames)
    if (ProjectionExpression != null) __obj.updateDynamic("ProjectionExpression")(ProjectionExpression)
    __obj.asInstanceOf[KeysAndAttributes]
  }
}

