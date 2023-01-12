package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTableInput extends StObject {
  
  /**
    * The name of the table to describe.
    */
  var TableName: typings.awsSdk.clientsDynamodbMod.TableName
}
object DescribeTableInput {
  
  inline def apply(TableName: TableName): DescribeTableInput = {
    val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTableInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeTableInput] (val x: Self) extends AnyVal {
    
    inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
