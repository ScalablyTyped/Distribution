package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeKinesisStreamingDestinationInput extends StObject {
  
  /**
    * The name of the table being described.
    */
  var TableName: typings.awsSdk.clientsDynamodbMod.TableName
}
object DescribeKinesisStreamingDestinationInput {
  
  inline def apply(TableName: TableName): DescribeKinesisStreamingDestinationInput = {
    val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeKinesisStreamingDestinationInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeKinesisStreamingDestinationInput] (val x: Self) extends AnyVal {
    
    inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
