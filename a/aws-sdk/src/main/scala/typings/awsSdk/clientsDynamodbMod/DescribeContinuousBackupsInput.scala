package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeContinuousBackupsInput extends StObject {
  
  /**
    * Name of the table for which the customer wants to check the continuous backups and point in time recovery settings.
    */
  var TableName: typings.awsSdk.clientsDynamodbMod.TableName
}
object DescribeContinuousBackupsInput {
  
  inline def apply(TableName: TableName): DescribeContinuousBackupsInput = {
    val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeContinuousBackupsInput]
  }
  
  extension [Self <: DescribeContinuousBackupsInput](x: Self) {
    
    inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
