package typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Get extends js.Object {
  /**
    * One or more substitution tokens for attribute names in the ProjectionExpression parameter.
    */
  var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined
  /**
    * A map of attribute names to AttributeValue objects that specifies the primary key of the item to retrieve.
    */
  var Key: typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.Key
  /**
    * A string that identifies one or more attributes of the specified item to retrieve from the table. The attributes in the expression must be separated by commas. If no attribute names are specified, then all attributes of the specified item are returned. If any of the requested attributes are not found, they do not appear in the result.
    */
  var ProjectionExpression: js.UndefOr[
    typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.ProjectionExpression
  ] = js.undefined
  /**
    * The name of the table from which to retrieve the specified item.
    */
  var TableName: typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableName
}

object Get {
  @scala.inline
  def apply(
    Key: Key,
    TableName: TableName,
    ExpressionAttributeNames: ExpressionAttributeNameMap = null,
    ProjectionExpression: ProjectionExpression = null
  ): Get = {
    val __obj = js.Dynamic.literal(Key = Key, TableName = TableName)
    if (ExpressionAttributeNames != null) __obj.updateDynamic("ExpressionAttributeNames")(ExpressionAttributeNames)
    if (ProjectionExpression != null) __obj.updateDynamic("ProjectionExpression")(ProjectionExpression)
    __obj.asInstanceOf[Get]
  }
}

