package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTableReplicaAutoScalingInput extends StObject {
  
  /**
    * The name of the table.
    */
  var TableName: typings.awsSdk.clientsDynamodbMod.TableName
}
object DescribeTableReplicaAutoScalingInput {
  
  inline def apply(TableName: TableName): DescribeTableReplicaAutoScalingInput = {
    val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTableReplicaAutoScalingInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeTableReplicaAutoScalingInput] (val x: Self) extends AnyVal {
    
    inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
