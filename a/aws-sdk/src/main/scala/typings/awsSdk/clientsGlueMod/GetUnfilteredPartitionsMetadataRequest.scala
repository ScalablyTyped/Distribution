package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUnfilteredPartitionsMetadataRequest extends StObject {
  
  /**
    * A structure containing Lake Formation audit context information.
    */
  var AuditContext: js.UndefOr[typings.awsSdk.clientsGlueMod.AuditContext] = js.undefined
  
  /**
    * The ID of the Data Catalog where the partitions in question reside. If none is provided, the AWS account ID is used by default. 
    */
  var CatalogId: CatalogIdString
  
  /**
    * The name of the catalog database where the partitions reside.
    */
  var DatabaseName: NameString
  
  /**
    * An expression that filters the partitions to be returned. The expression uses SQL syntax similar to the SQL WHERE filter clause. The SQL statement parser JSQLParser parses the expression.   Operators: The following are the operators that you can use in the Expression API call:  =  Checks whether the values of the two operands are equal; if yes, then the condition becomes true. Example: Assume 'variable a' holds 10 and 'variable b' holds 20.  (a = b) is not true.  &lt; &gt;  Checks whether the values of two operands are equal; if the values are not equal, then the condition becomes true. Example: (a &lt; &gt; b) is true.  &gt;  Checks whether the value of the left operand is greater than the value of the right operand; if yes, then the condition becomes true. Example: (a &gt; b) is not true.  &lt;  Checks whether the value of the left operand is less than the value of the right operand; if yes, then the condition becomes true. Example: (a &lt; b) is true.  &gt;=  Checks whether the value of the left operand is greater than or equal to the value of the right operand; if yes, then the condition becomes true. Example: (a &gt;= b) is not true.  &lt;=  Checks whether the value of the left operand is less than or equal to the value of the right operand; if yes, then the condition becomes true. Example: (a &lt;= b) is true.  AND, OR, IN, BETWEEN, LIKE, NOT, IS NULL  Logical operators.    Supported Partition Key Types: The following are the supported partition keys.    string     date     timestamp     int     bigint     long     tinyint     smallint     decimal    If an type is encountered that is not valid, an exception is thrown. 
    */
  var Expression: js.UndefOr[PredicateString] = js.undefined
  
  /**
    * The maximum number of partitions to return in a single response.
    */
  var MaxResults: js.UndefOr[PageSize] = js.undefined
  
  /**
    * A continuation token, if this is not the first call to retrieve these partitions.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * The segment of the table's partitions to scan in this request.
    */
  var Segment: js.UndefOr[typings.awsSdk.clientsGlueMod.Segment] = js.undefined
  
  /**
    * A list of supported permission types. 
    */
  var SupportedPermissionTypes: PermissionTypeList
  
  /**
    * The name of the table that contains the partition.
    */
  var TableName: NameString
}
object GetUnfilteredPartitionsMetadataRequest {
  
  inline def apply(
    CatalogId: CatalogIdString,
    DatabaseName: NameString,
    SupportedPermissionTypes: PermissionTypeList,
    TableName: NameString
  ): GetUnfilteredPartitionsMetadataRequest = {
    val __obj = js.Dynamic.literal(CatalogId = CatalogId.asInstanceOf[js.Any], DatabaseName = DatabaseName.asInstanceOf[js.Any], SupportedPermissionTypes = SupportedPermissionTypes.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUnfilteredPartitionsMetadataRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetUnfilteredPartitionsMetadataRequest] (val x: Self) extends AnyVal {
    
    inline def setAuditContext(value: AuditContext): Self = StObject.set(x, "AuditContext", value.asInstanceOf[js.Any])
    
    inline def setAuditContextUndefined: Self = StObject.set(x, "AuditContext", js.undefined)
    
    inline def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setExpression(value: PredicateString): Self = StObject.set(x, "Expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "Expression", js.undefined)
    
    inline def setMaxResults(value: PageSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSegment(value: Segment): Self = StObject.set(x, "Segment", value.asInstanceOf[js.Any])
    
    inline def setSegmentUndefined: Self = StObject.set(x, "Segment", js.undefined)
    
    inline def setSupportedPermissionTypes(value: PermissionTypeList): Self = StObject.set(x, "SupportedPermissionTypes", value.asInstanceOf[js.Any])
    
    inline def setSupportedPermissionTypesVarargs(value: PermissionType*): Self = StObject.set(x, "SupportedPermissionTypes", js.Array(value*))
    
    inline def setTableName(value: NameString): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
