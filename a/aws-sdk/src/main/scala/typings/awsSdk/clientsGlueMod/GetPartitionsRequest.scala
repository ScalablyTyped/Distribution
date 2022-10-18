package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPartitionsRequest extends StObject {
  
  /**
    * The ID of the Data Catalog where the partitions in question reside. If none is provided, the Amazon Web Services account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  
  /**
    * The name of the catalog database where the partitions reside.
    */
  var DatabaseName: NameString
  
  /**
    * When true, specifies not returning the partition column schema. Useful when you are interested only in other partition attributes such as partition values or location. This approach avoids the problem of a large response by not returning duplicate data.
    */
  var ExcludeColumnSchema: js.UndefOr[BooleanNullable] = js.undefined
  
  /**
    * An expression that filters the partitions to be returned. The expression uses SQL syntax similar to the SQL WHERE filter clause. The SQL statement parser JSQLParser parses the expression.   Operators: The following are the operators that you can use in the Expression API call:  =  Checks whether the values of the two operands are equal; if yes, then the condition becomes true. Example: Assume 'variable a' holds 10 and 'variable b' holds 20.  (a = b) is not true.  &lt; &gt;  Checks whether the values of two operands are equal; if the values are not equal, then the condition becomes true. Example: (a &lt; &gt; b) is true.  &gt;  Checks whether the value of the left operand is greater than the value of the right operand; if yes, then the condition becomes true. Example: (a &gt; b) is not true.  &lt;  Checks whether the value of the left operand is less than the value of the right operand; if yes, then the condition becomes true. Example: (a &lt; b) is true.  &gt;=  Checks whether the value of the left operand is greater than or equal to the value of the right operand; if yes, then the condition becomes true. Example: (a &gt;= b) is not true.  &lt;=  Checks whether the value of the left operand is less than or equal to the value of the right operand; if yes, then the condition becomes true. Example: (a &lt;= b) is true.  AND, OR, IN, BETWEEN, LIKE, NOT, IS NULL  Logical operators.    Supported Partition Key Types: The following are the supported partition keys.    string     date     timestamp     int     bigint     long     tinyint     smallint     decimal    If an type is encountered that is not valid, an exception is thrown.  The following list shows the valid operators on each type. When you define a crawler, the partitionKey type is created as a STRING, to be compatible with the catalog partitions.   Sample API Call: 
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
    * The time as of when to read the partition contents. If not set, the most recent transaction commit time will be used. Cannot be specified along with TransactionId.
    */
  var QueryAsOfTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The segment of the table's partitions to scan in this request.
    */
  var Segment: js.UndefOr[typings.awsSdk.clientsGlueMod.Segment] = js.undefined
  
  /**
    * The name of the partitions' table.
    */
  var TableName: NameString
  
  /**
    * The transaction ID at which to read the partition contents.
    */
  var TransactionId: js.UndefOr[TransactionIdString] = js.undefined
}
object GetPartitionsRequest {
  
  inline def apply(DatabaseName: NameString, TableName: NameString): GetPartitionsRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPartitionsRequest]
  }
  
  extension [Self <: GetPartitionsRequest](x: Self) {
    
    inline def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    inline def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setExcludeColumnSchema(value: BooleanNullable): Self = StObject.set(x, "ExcludeColumnSchema", value.asInstanceOf[js.Any])
    
    inline def setExcludeColumnSchemaUndefined: Self = StObject.set(x, "ExcludeColumnSchema", js.undefined)
    
    inline def setExpression(value: PredicateString): Self = StObject.set(x, "Expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "Expression", js.undefined)
    
    inline def setMaxResults(value: PageSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setQueryAsOfTime(value: js.Date): Self = StObject.set(x, "QueryAsOfTime", value.asInstanceOf[js.Any])
    
    inline def setQueryAsOfTimeUndefined: Self = StObject.set(x, "QueryAsOfTime", js.undefined)
    
    inline def setSegment(value: Segment): Self = StObject.set(x, "Segment", value.asInstanceOf[js.Any])
    
    inline def setSegmentUndefined: Self = StObject.set(x, "Segment", js.undefined)
    
    inline def setTableName(value: NameString): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTransactionId(value: TransactionIdString): Self = StObject.set(x, "TransactionId", value.asInstanceOf[js.Any])
    
    inline def setTransactionIdUndefined: Self = StObject.set(x, "TransactionId", js.undefined)
  }
}
