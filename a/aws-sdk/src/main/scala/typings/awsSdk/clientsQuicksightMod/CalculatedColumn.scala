package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalculatedColumn extends StObject {
  
  /**
    * A unique ID to identify a calculated column. During a dataset update, if the column ID of a calculated column matches that of an existing calculated column, Amazon QuickSight preserves the existing calculated column.
    */
  var ColumnId: typings.awsSdk.clientsQuicksightMod.ColumnId
  
  /**
    * Column name.
    */
  var ColumnName: typings.awsSdk.clientsQuicksightMod.ColumnName
  
  /**
    * An expression that defines the calculated column.
    */
  var Expression: typings.awsSdk.clientsQuicksightMod.Expression
}
object CalculatedColumn {
  
  inline def apply(ColumnId: ColumnId, ColumnName: ColumnName, Expression: Expression): CalculatedColumn = {
    val __obj = js.Dynamic.literal(ColumnId = ColumnId.asInstanceOf[js.Any], ColumnName = ColumnName.asInstanceOf[js.Any], Expression = Expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalculatedColumn]
  }
  
  extension [Self <: CalculatedColumn](x: Self) {
    
    inline def setColumnId(value: ColumnId): Self = StObject.set(x, "ColumnId", value.asInstanceOf[js.Any])
    
    inline def setColumnName(value: ColumnName): Self = StObject.set(x, "ColumnName", value.asInstanceOf[js.Any])
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "Expression", value.asInstanceOf[js.Any])
  }
}
